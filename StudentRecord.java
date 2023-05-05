/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 840 G3
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private char grade;
    
    private static int studentCount;
        public StudentRecord(){
        //area penulisan kode;
            studentCount++;
        }
        public StudentRecord(String temp){
        this.name = temp;
        studentCount++;
        }
        public StudentRecord(String name, String address){
        this.name = name;
        this.address = address;
        studentCount++;
        }
        public StudentRecord(double mGrade, double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
        }
    //name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //address
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    //age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    //mathgrade
    public double getMathGrade(){
        return mathGrade;
    }
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    //englisgrade
    public double getEnglishGrade(){
        return englishGrade;
    }
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    //scienecegrade
    public double getScienceGrade(){
        return scienceGrade;
    }
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    //average
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    public static int getStudentCount (){
        return studentCount;
    }  
    public void print( String temp ){
    System.out.println("Name:" + name);
    System.out.println("Address:" + address);
    System.out.println("Age:" + age);
    }
    public void print(double eGrade, double mGrade, double sGrade){
    System.out.println("Name:" + name);
    System.out.println("MathGrade:" + mGrade);
    System.out.println("EnglishGrade:" + eGrade);
    System.out.println("ScienceGrade:" + sGrade);
    }
    public char getGrade (){
        if(average > 80){
            grade = 'A';
        }
        else if(average > 65){
            grade = 'B';
        }
        else if(average > 55){
            grade = 'C';
        }
        else if(average > 40){
            grade = 'D';
        }
        else if(average >= 0){
            grade = 'E';
        }
        return grade;
    }

    void println(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void println(double englishGrade, double mathGrade, double scienceGrade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }  
}
