// NAMA : ALISHZA PUTRI RAHMADINA
// NIM  : 215150700111013

public class CarRent {
    private int rentDur;
    private CarRider rider;
    private Car car;

    CarRent(CarRider rider, Car car, int rentDur){
        this.rentDur = rentDur;
        this.rider = rider;
        this.car = car;

    }

    public CarRider getRider() {
        return rider;
    }

    public Car getCar() {
        return car;
    }

    public int getRentDur() {
        return rentDur;
    }
}
