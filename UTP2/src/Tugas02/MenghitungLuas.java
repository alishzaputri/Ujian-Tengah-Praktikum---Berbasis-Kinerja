package Tugas02;

import java.util.Scanner;

public class MenghitungLuas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = in.nextInt();
        persegi luas = new persegi();
        segitiga luas2 = new segitiga();
        lingkaran luas3 = new lingkaran();
        if (menu == 1) {
            luas.sisi = in.nextInt();
            System.out.print(luas.luasPersegi(luas.sisi));
        } else if (menu == 2) {
            luas2.alas = in.nextInt();
            luas2.tinggi = in.nextInt();
            System.out.print(luas2.luasSegitiga(luas2.alas, luas2.tinggi));
        } else if (menu == 3) {
            luas3.ruas = in.nextInt();
            System.out.print((double)luas3.luasLingkaran(luas3.ruas, luas3.luas));
        } else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

class persegi {
    int sisi;
    int luasPersegi(int sisi) {
        return this.sisi * this.sisi;
    }
}

class segitiga {
    int alas, tinggi;
    int luasSegitiga(int alas, int tinggi) {
        return this.alas * this.tinggi / 2;
    }
}

class lingkaran {
    int ruas, luas;
    int luasLingkaran(int ruas, int luas) {
        if (this.ruas % 7 == 0) {
            this.luas = 22/7 * this.ruas * this.ruas;
        } else {
            this.luas = (int) (3.14 * this.ruas * this.ruas);
        }
        return this.luas;
    }
}
