/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hafizhoh.dao;
import java.util.List;
import java.util.ArrayList;
import Hafizhoh.model.Buku;
/**
 *
 * @author HP 840 G3
 */
public class BukuDaoImpl implements BukuDao {
    private List<Buku> data  = new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new Buku("B101","Java","Hafizhoh Viarma", "Teknologi Informasi"));
        data.add(new Buku("B102","C++","Dini Damayanti", "Politeknik Negeri Padang"));
    }
    
    public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index,buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAll(){
        return data;
    }
}
