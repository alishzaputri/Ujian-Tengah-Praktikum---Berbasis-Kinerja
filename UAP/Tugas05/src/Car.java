//NAMA : ALISHZA PUTRI RAHMADINA
//NIM  : 215150700111013

public class Car {
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;

    Car(String carType, String polNum, String merk, boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }
    public String getCarType() {
        return carType;
    }

    public String getPolNum() {
        return polNum;
    }

    public String getMerk() {
        return merk;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
