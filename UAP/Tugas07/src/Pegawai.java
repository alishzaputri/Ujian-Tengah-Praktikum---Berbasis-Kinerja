// Nama : ALISHZA PUTRI RAHMADINA
// NIM : 215150700111013

public class Pegawai {
    private String nama;
    private String noKTP;

    Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public double gaji(){
        double gaji = 0;
        return gaji;
    }

    @Override
    public String toString() {
        return "Nama            : " + getNama() +
                "\nNo. KTP         : " + getNoKTP();
    }
}
