package Tugas01;

import java.util.Scanner;

public class Selde {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        if (Selde(angka) == angka){
            System.out.printf("%d adalah selde.", angka);
        } else {
            System.out.printf("%d bukan selde.", angka);
        }
    }
    static int Selde(int data) {
        String result = "";
        String num = String.valueOf(data);
        int jumlah = num.length();
        int jumlahData = jumlah - 1;

        for (int i = 0; i < jumlah; i++) {
            result = result + num.charAt(jumlahData);
            jumlahData--;
        }
        return Integer.parseInt(result);
    }
}





