/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HafizhohViarma_05Mei2023;

/**
 *
 * @author HP 840 G3
 */
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String nomor;
    private String email;
    
    private static int bukuAlamatTambah;
    
    public BukuAlamat(){
    bukuAlamatTambah++;
    }
    
//    cara 2
//    public bukuAlamat(String nama, String alamat, String nomor, String email){
//        this.nama = nama;
//        this.alamat = alamat;
//        this.nomor = nomor;
//        this.email = email;
//        bukuAlamatTambah++;
//    }
    
//    public bukuAlamat(String nama, String alamat, String nomor, String email){
//        this.nama = nama; 
//        this.alamat = alamat; 
//        this.nomor = nomor;
//        this.email = email;
//        bukuAlamatTambah++;
//    }
    
    //cara 3
//    public void print(String temp){
//        System.out.println("nama :"+nama);
//        System.out.println("alamat : "+alamat);
//        System.out.println("nomor telepon : "+nomor);
//        System.out.println("email : "+email);
//        bukuAlamatTambah++;
//    }
//    
    
    
    //cara 1
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNomor(){
        return nomor;
    }
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    
}