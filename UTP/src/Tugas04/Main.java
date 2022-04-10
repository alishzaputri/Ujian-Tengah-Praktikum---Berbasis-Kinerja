package Tugas04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Alishza Putri Rahmadina" +
                           "\nNIM     : 215150700111013" +
                           "\nKelas   : Teknologi Informasi - A");
        System.out.println("");

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid","Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.input.nextLine(), DataMerchant.input.nextLine(), DataMerchant.input.nextDouble()));
        DataMerchant.tampilData();
    }
}
