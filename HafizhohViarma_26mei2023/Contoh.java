/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HafizhohViarma_26mei2023;

/**
 *
 * @author HP 840 G3
 */
public class Contoh extends StudentRecord{
    private String programmingLanguage;
    private int programmingExperience;

    public Contoh() {
        super();
    }

    public Contoh(String name, String address, int age, String programmingLanguage, int programmingExperience) {
        super(name, address, age); 
        this.programmingLanguage = programmingLanguage;
        this.programmingExperience = programmingExperience;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getProgrammingExperience() {
        return programmingExperience;
    }

    public void setProgrammingExperience(int programmingExperience) {
        this.programmingExperience = programmingExperience;
    }

    @Override
    public void print(String temp) {
        super.print(temp);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Programming Experience: " + programmingExperience + " years"); 
    }
}
