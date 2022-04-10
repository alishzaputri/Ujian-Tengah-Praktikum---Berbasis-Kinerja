package Tugas03;

public class Baju {
// ---------------------------------------------------------------------------------------------------------------------
// Nama: Alishza Putri Rahmadina
// NIM: 215150700111013
// Kelas: Praktikum Pemlan TI-A
//----------------------------------------------------------------------------------------------------------------------
    String tipe;
    int harga;
    int total;

    public Baju(String tipe, int total) {
        this.tipe = tipe;
        this.total = total;
    }

    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    void hargaA() {
        if (total > 100) {
            harga = 95000;
        } else {
            harga = bajuA;
        }
    }

    void hargaB() {
        if (total > 100) {
            harga = 120000;
        } else {
            harga = bajuB;
        }
    }

    void hargaC() {
        if (total > 100) {
            harga = 160000;
        } else {
            harga = bajuC;
        }
    }

    void tampilkanData() {
        if (tipe.equalsIgnoreCase("a")) {
            hargaA();
        } else if (tipe.equalsIgnoreCase("b")) {
            hargaB();
        } else if (tipe.equalsIgnoreCase("c")) {
            hargaC();
        }
        System.out.println("Jenis yang anda beli  : " + tipe);
        System.out.println("Harga per buah        : " + harga);
        System.out.println("Total harga           : " + harga * total);
    }
}



