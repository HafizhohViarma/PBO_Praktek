/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HafizhohViarma_26mei2023;

/**
 *
 * @author HP 840 G3
 */
public class ContohExample {
    public static void main(String[] args) {
        // Membuat objek ComputerScienceStudent
        Contoh student = new Contoh("Hafizhoh Viarma", "Selayo-Solok", 18, "Java", 2);

        // Mengatur nilai-nilai lainnya
        student.setMathGrade(90);
        student.setEnglishGrade(90);
        student.setScienceGrade(89);

        // Menampilkan informasi siswa
        student.print("Additional Information");

        // Menampilkan rata-rata nilai
        System.out.println("Average Grade:      " + student.getAverage());

        // Menampilkan jumlah total siswa
        System.out.println("Student Count:      " + StudentRecord.getStudentCount());
    }
}
