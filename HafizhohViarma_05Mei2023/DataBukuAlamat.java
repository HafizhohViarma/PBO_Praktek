/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HafizhohViarma_05Mei2023;

/**
 *
 * @author HP 840 G3
 */
public class DataBukuAlamat {
    private BukuAlamat[] data = new BukuAlamat[100];
    private int index;
    
    public void update(int index, BukuAlamat buku){
        data[index] = buku;
    }
    
    public void insert(BukuAlamat buku){
        data[index] = buku;
        index++;
    }
    
    public BukuAlamat[] getAll(){
        BukuAlamat[] temp = new BukuAlamat[index];
        for(int i=0;i<index;i++){
            temp[i]=data[i];
        }
        return data;
    }
    
    public void delete(int index){
        data[index].setNama("");
        data[index].setAlamat("");
        data[index].setNomor("");
        data[index].setEmail("");
    }
    public static void main(String[] args){
        DataBukuAlamat data = new DataBukuAlamat();
        BukuAlamat temp = new BukuAlamat();
        temp.setNama("ali");
        temp.setAlamat("pasar");
        temp.setNomor("0812345678");
        temp.setEmail("daging99@gamil.com");
        data.insert(temp);
        
        BukuAlamat temp2 = new BukuAlamat();
        temp2.setNama("ani");
        temp2.setAlamat("padang");
        temp2.setNomor("0898765432");
        temp2.setEmail("rahamnilai765@gmail.com");
        data.insert(temp2);
        
        //tampil
        BukuAlamat[] list = data.getAll();
        for(int i=0;i<list.length;i++){
            System.out.println("buku alamat ke---> "+(i+1));
            System.out.println("nama            :"+list[i].getNama());
            System.out.println("alamat          :"+list[i].getAlamat());
            System.out.println("nomor telepon   :"+list[i].getNomor());
            System.out.println("email         : "+list[i].getEmail());
                    
        }
    }
}
