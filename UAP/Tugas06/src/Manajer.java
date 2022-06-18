// Nama: ALISHZA PUTRI RAHMADINA
// NIM: 215150700111013

public class Manajer extends Pekerja{
    private int lamaKerja;

    public Manajer(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP, int lamaKerja){
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + 15;
    }

    @Override
    public double getBonus() {
        return super.getBonus() + (0.3 * super.getBonus());

    }

    @Override
    public String toString() {
        return super.toString() + "Lama Kerja    : " + getLamaKerja() + "\n";
    }
}
