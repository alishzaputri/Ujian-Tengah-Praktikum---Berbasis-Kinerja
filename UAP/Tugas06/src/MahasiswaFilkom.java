// Nama: ALISHZA PUTRI RAHMADINA
// NIM: 215150700111013

public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;
    private String status;
    private double beasiswa;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, double IPK, String NIM) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus() {
        String Prodi;
        int i = Integer.parseInt(getNIM().substring(6,7));
        int j = Integer.parseInt(getNIM().substring(0,1));
        int k = Integer.parseInt(getNIM().substring(1,2));
        if (i == 2) {
            Prodi = "Teknik Meniup Gelembung, " + "20" + j + k;
        }
        else if (i == 3) {
            Prodi = "Teknik Berburu Ubur-ubur, " + "20" + j + k;
        }
        else if (i == 4) {
            Prodi = "Sistem Perhamburgeran, " + "20" + j + k;
        }
        else if (i == 6) {
            Prodi = "Pendidikan Chum Bucket, " + "20" + j + k;
        }
        else if (i == 7) {
            Prodi = "Teknologi Telepon Kerang, " + "20" + j + k;
        } else Prodi = "Prodi Tidak Ada";
        return Prodi;
    }

    public double getBeasiswa() {
        if (getIPK() >= 3.5) {
            return 75;
        } else return 50;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + "IPK           : " + getIPK() +
                                  "\nNIM           : " + getNIM() +
                                  "\nStatus        : " + getStatus() + "\n";
    }
}