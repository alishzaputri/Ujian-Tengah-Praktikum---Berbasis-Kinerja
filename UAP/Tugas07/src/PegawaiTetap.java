// Nama : ALISHZA PUTRI RAHMADINA
// NIM : 215150700111013

public class PegawaiTetap extends Pegawai{
    private double upah;

    PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public String toString() {
        return super.toString() + "\nUpah            : " + getUpah() +
                                  "\nPendapatan      : Rp " + getUpah() + "\n";
    }
}
