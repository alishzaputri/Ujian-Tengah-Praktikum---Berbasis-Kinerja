// Nama : ALISHZA PUTRI RAHMADINA
// NIM : 215150700111013

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("OUTPUT PRAKTIKUM");
        System.out.println("---------------------------------------");
        Pegawai tetap = new PegawaiTetap("Bayu", "350728490327424892342", 2000000);
        System.out.println(tetap.toString());

        Pegawai harian = new PegawaiHarian("Edo", "350728490327424892343", 8500, 40);
        System.out.println(harian.toString());

        Pegawai sales = new Sales("Tika", "350728490327424892344", 50, 50000);
        System.out.println(sales.toString());

        System.out.println("----------------------------------------");
        System.out.println("OUTPUT SOAL");
        System.out.println("----------------------------------------");
        System.out.println("             PEGAWAI TETAP              ");
        Pegawai tetap1 = new PegawaiTetap("Niamh", "313127790327564892336", 3000000);
        System.out.println(tetap1);
        Pegawai tetap2 = new PegawaiTetap("Ansel", "313127790327564892340", 2500000);
        System.out.println(tetap2);
        Pegawai tetap3 = new PegawaiTetap("Jeffery", "313127790327564892336", 2000000);
        System.out.println(tetap3);
        System.out.println("========================================");

        System.out.println("             PEGAWAI HARIAN             ");
        Pegawai harian1 = new PegawaiHarian("Chris", "190728490327424892332", 8500, 35);
        System.out.println(harian1.toString());
        Pegawai harian2 = new PegawaiHarian("Bella", "190728490327424892355", 8500, 100);
        System.out.println(harian2.toString());
        Pegawai harian3 = new PegawaiHarian("Kim", "190728490327424892390", 8500, 80);
        System.out.println(harian3.toString());
        System.out.println("========================================");

        System.out.println("                 SALES                  ");
        Pegawai sales1 = new Sales("Mika", "280728490327424892345", 5500, 70);
        System.out.println(sales1.toString());
        Pegawai sales2 = new Sales("Chanel", "280728490327424892322", 6000, 150);
        System.out.println(sales2.toString());
        Pegawai sales3 = new Sales("Frank", "280728490327424892378", 9900, 90);
        System.out.println(sales3.toString());
        System.out.println("========================================");
    }
}
