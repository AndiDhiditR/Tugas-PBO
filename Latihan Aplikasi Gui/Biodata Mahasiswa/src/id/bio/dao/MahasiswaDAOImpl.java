/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.bio.dao;

import id.bio.database;
import id.bio.model.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andia
 */
public class MahasiswaDAOImpl {
     @Override
    public boolean insert(Mahasiswa m) {
        String sql = "INSERT INTO mahasiswa values (?, ?, ?)";
        try (PreparedStatement statement = database.getConnection().prepareStatement(sql)) {
            statement.setString(1, m.getStambuk());
            statement.setString(2, m.getNama());
            statement.setInt(3, Integer.parseInt(m.getProdi().getId()));
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
   
@Override
public boolean update(Mahasiswa m) {
    String sql = "UPDATE mahasiswa set nama = ?, prodi = ? where nim = ?";
    try {
        PreparedStatement statement = database.getConnection().prepareStatement(sql);
        statement.setString(1, m.getNama());
        statement.setInt(2, Integer.parseInt(m.getProdi().getId()));
        statement.setString(3, m.getStambuk());
        int row = statement.executeUpdate();
        if (row > 0) {
            return true;
        }
        statement.close();
    } catch (Exception ex) {
        Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}


@Override
public boolean delete(Mahasiswa m) {
    String sql = "DELETE FROM mahasiswa WHERE nim = ?";
    try {
        PreparedStatement statement = database.getConnection().prepareStatement(sql);
        statement.setString(1, m.getStambuk());
        int row = statement.executeUpdate();
        if (row > 0) {
            return true;
        }
        statement.close();
    } catch (Exception ex) {
        Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}

@Override
public List<Mahasiswa> getAllMahasiswa() {
    List<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
    String sql = "SELECT * FROM mahasiswa INNER JOIN jurusan ON jurusan.id = mahasiswa.prodi";
    try {
        if (database.getConnection() == null) {
            return null;
        } else {
            PreparedStatement statement = database.getConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa(
                    rs.getString("stambuk"),
                    rs.getString("nama"),
                    new Jurusan(rs.getString("id"), rs.getString("nama"))
                );
                mahasiswa.add(m);
            }
            statement.close();
        }
    } catch (Exception ex) {
        Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    }
    return mahasiswa;
}


@Override
public Mahasiswa getByID(String nim) {
    throw new UnsupportedOperationException("Not supported yet."); 
}

public List<Mahasiswa> getByName(String name) {
    throw new UnsupportedOperationException("Not supported yet."); 
}
}