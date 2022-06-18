//NAMA : ALISHZA PUTRI RAHMADINA
//NIM  : 215150700111013

import java.util.ArrayList;

public class RentArchive {
    private ArrayList<CarRent> rentData = new ArrayList<CarRent>();

    public void Rent(CarRider rider, Car car, int rentDur) {
        CarRent rent = new CarRent(rider, car, rentDur);

        if (car.isStatus() == true) {
            rentData.add(rent);
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(Boolean.parseBoolean(String.valueOf(false)));
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void info(){
        System.out.println("-------------------------------------");
        System.out.println("INFORMASI PELANGGAN");
        for (CarRent sewa : rentData) {
            System.out.println("-------------------------------------");
            System.out.println("NAMA PEMINJAM : " +sewa.getRider().getName());
            System.out.println("TIPE MOBIL    : " +sewa.getCar().getCarType());
            System.out.println("NO. POLISI    : " +sewa.getCar().getPolNum());
            System.out.println("LAMA RENTAL   : " +sewa.getRentDur());
            System.out.println("-------------------------------------");
        }

    }
}
