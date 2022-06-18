// Nama : ALISHZA PUTRI RAHMADINA
// NIM : 215150700111013

public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;


    Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double gaji(){
        double gaji = getPenjualan() * getKomisi();
        return  gaji;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Penjualan : " + getPenjualan() +
                                  "\nBesaran Komisi  : " + getKomisi() +
                                  "\nPendapatan      : Rp " + gaji() + "\n";
    }
}
