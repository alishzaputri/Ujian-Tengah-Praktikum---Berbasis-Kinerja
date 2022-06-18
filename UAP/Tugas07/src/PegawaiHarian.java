// Nama : ALISHZA PUTRI RAHMADINA
// NIM : 215150700111013

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public double gaji(){
        double gaji = 0;
        if (getTotalJam() <= 40){
            gaji = getUpahPerJam() * getTotalJam();
        } else if (getTotalJam() > 40){
            gaji = (getUpahPerJam() * 40) + ((getTotalJam()-40) * getUpahPerJam() * 1.5);
        }
        return gaji;
    }

    @Override
    public String toString() {
        return super.toString() + "\nUpah/jam        : Rp " + getUpahPerJam() +
                "\nTotal Jam Kerja : " + getTotalJam() +
                "\nPendapatan      : Rp " + gaji() + "\n";
    }
}
