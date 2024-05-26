/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.bio.dao;

import id.bio.database;
import id.bio.model.Jurusan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andia
 */
public class JurusanDAOImpl {
    public boolean insert(Jurusan j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean update(Jurusan j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean delete(Jurusan j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Jurusan> getAllJurusan() {
        List<Jurusan> jurusan = new ArrayList<Jurusan>();
        String sql = "SELECT * FROM jurusan";
        try {
            if (database.getConnection() == null) {
                return null;
            } else {
                PreparedStatement statement = database.getConnection().prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    Jurusan j = new Jurusan(
                        rs.getString(1),
                        rs.getString(2)
                    );
                    jurusan.add(j);
                }
                statement.close();
            }
        } catch (Exception ex) {
           
        }
        return jurusan;
    }

    public Jurusan getByID(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Jurusan> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
