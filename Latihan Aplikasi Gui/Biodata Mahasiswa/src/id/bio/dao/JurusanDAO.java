/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package id.bio.dao;

import java.util.List;
import id.bio.model.Jurusan;

/**
 *
 * @author andia
 */
public interface JurusanDAO {
    public boolean insert(Jurusan j);
    public boolean update(Jurusan j);
    public boolean delete(Jurusan j);
    public List<Jurusan> getAllJurusan();
    public Jurusan getByID(String id);
    public List<Jurusan> getByName(String name);
}
