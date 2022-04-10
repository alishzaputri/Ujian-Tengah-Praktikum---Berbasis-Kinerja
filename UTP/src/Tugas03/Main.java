package Tugas03;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------------
// Nama: Alishza Putri Rahmadina
// NIM: 215150700111013
// Kelas: Praktikum Pemlan TI-A
//----------------------------------------------------------------------------------------------------------------------
       Scanner input = new Scanner(System.in);
       System.out.print("Baju yang tersedia :");
       System.out.print("\nBaju A dengan harga 100000");
       System.out.print("\nBaju B dengan harga 125000");
       System.out.print("\nBaju C dengan harga 175000");

       System.out.print("\nBaju yang akan anda beli bertipe : ");
       String tipe = input.nextLine();
       System.out.print("Jumlah Baju yang akan anda beli adalah : ");
       int total = input.nextInt();

       Baju erigo = new Baju(tipe, total);

       erigo.tampilkanData();
   }
}

