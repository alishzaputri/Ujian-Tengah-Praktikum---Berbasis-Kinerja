//NAMA : ALISHZA PUTRI RAHMADINA
//NIM  : 215150700111013

import java.util.ArrayList;

public class CarData {
    static ArrayList<Car> carList = new ArrayList<Car>();

    public void addCar(String carType, String polNum, String Merk){
        Car car = new Car(carType, polNum, Merk, true);
        carList.add(car);

    }

    public void listOfCar(){
        System.out.println("-------------------------------------");
        System.out.println("DAFTAR MOBIL");
        for (Car mobil : carList) {
            System.out.println("-------------------------------------");
            System.out.println("TIPE MOBIL : " +mobil.getCarType());
            System.out.println("NO. POLISI : " +mobil.getPolNum());
            System.out.println("MERK MOBIL : " +mobil.getMerk());
            System.out.println("-------------------------------------");

        }
    }
}


