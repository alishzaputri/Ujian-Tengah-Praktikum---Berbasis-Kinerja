// Nama: ALISHZA PUTRI RAHMADINA
// NIM: 215150700111013

public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    private String status;

    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        gaji = getHariKerja() * getJamKerja() * 15;
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        if (getJamKerja() < 7 && getHariKerja() > 20) {
            bonus = ((getHariKerja() - 20) * getJamKerja() * 20);
        } else bonus = 0;
        if (getJamKerja() > 7) {
            if (getHariKerja() > 20) {
                bonus = (20 * (getJamKerja() - 7) * 7) + (getHariKerja() - 20) * getJamKerja() * 20;
            } else bonus = getHariKerja() * (getJamKerja() - 7) * 7;
        }
        return bonus;
    }


    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus() {
        String kantorCabang;
        String Departmen;
        int i = Integer.parseInt(getNIP().substring(0, 1));
        int j = Integer.parseInt(getNIP().substring(2, 3));
        int k = Integer.parseInt(getNIP().substring(6, 7));
        {
            if (i == 1) {
                kantorCabang = "Mondstadt cabang ke- " + j;
            } else if (i == 2) {
                kantorCabang = "Liyue cabang ke- " + j;
            } else if (i == 3) {
                kantorCabang = "Inazuma cabang ke- " + j;
            } else if (i == 4) {
                kantorCabang = "Sumeru cabang ke- " + j;
            } else if (i == 5) {
                kantorCabang = "Fontaine cabang ke- " + j;
            } else if (i == 6) {
                kantorCabang = "Natlan cabang ke- " + j;
            } else if (i == 7) {
                kantorCabang = "Snezhnaya cabang ke- " + j;
            } else kantorCabang = "Kantor Cabang Tidak Ditemukan";

            if (k == 1) {
                Departmen = "Pemasaran, " + kantorCabang;
            } else if (k == 2) {
                Departmen = "Humas, " + kantorCabang;
            } else if (k == 3) {
                Departmen = "Riset, " + kantorCabang;
            } else if (k == 4) {
                Departmen = "Teknologi, " + kantorCabang;
            } else if (k == 5) {
                Departmen = "Personalia, " + kantorCabang;
            } else if (k == 6) {
                Departmen = "Akademik, " + kantorCabang;
            } else if (k == 7) {
                Departmen = "Administrasi, " + kantorCabang;
            } else if (k == 8) {
                Departmen = "Operasional, " + kantorCabang;
            } else if (k == 9) {
                Departmen = "Pembangunan, " + kantorCabang;
            } else Departmen = "Departemen Tidak Ditemukan";
            return Departmen;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Bonus         : " + getBonus() + "$" +
                "\nGaji          : " + getGaji() + "$" +
                "\nStatus        : " + getStatus() + "\n";
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+getGaji()+getBonus();
    }
}
