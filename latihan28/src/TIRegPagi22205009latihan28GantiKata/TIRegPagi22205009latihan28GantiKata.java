/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIRegPagi22205009latihan28GantiKata;
import java.util.Scanner;
/**
 *
 * @author Axioo
 * NAMA     : Asmalik Hudri
 * Prodi    : Teknik Informatika
 * NIM      : 22205009
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * mengganti kata dalam sebuah kalimat dimana user menginputkan sendiri kalimatnya
 * 
 */
public class TIRegPagi22205009latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Mengganti Kata=====");
        System.out.print("\nMasukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        
        System.out.print("Ganti kata : ");
        String kataLama = scanner.nextLine();
        System.out.print("Menjadi kata : ");
        String kataBaru = scanner.nextLine();
        
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);
        
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Kalimat Awal : "+kalimat);
        System.out.println("Kalimat Baru : "+kalimatBaru);
    }
    
}
