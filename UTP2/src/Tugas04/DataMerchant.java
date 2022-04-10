package Tugas04;

import java.util.Scanner;

public class DataMerchant {
    static Scanner input = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant) {
        Merchant[] merchants = new Merchant[DataMerchant.merc.length + 1];
        int i = 0;
        while (i < DataMerchant.merc.length) {
            merchants[i] = DataMerchant.merc[i];
            i++;
        } merchants[DataMerchant.merc.length] = merchant;
        return merchants;
    }

    public static void tampilData() {
        for (Merchant mch1 : merc) {
            System.out.println("------ TAMPILAN DATA MERCHANT UBFOOD ------");
            System.out.println("Nama Merchant   : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk     : " + mch1.getNamaProduk());
            System.out.println("Harga           : " + (int) mch1.getHargaMakanan());

        }
    }

    public static Merchant cariMerchant(String nama) {
        for (Merchant i : merc) {
            if (i.getNamaMerchant().equalsIgnoreCase(nama)) {
                return i;
            }
        }  return null;
    }

    public static void tampilMerchant(Merchant merchant){
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + merchant.getHargaMakanan());
    }

    public static void updateMerchant(Merchant merchant){

    }
}
