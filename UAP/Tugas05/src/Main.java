
public class Main {
    public static void main(String[] args) {
        System.out.println("NAMA : ALISHZA PUTRI RAHMADINA");
        System.out.println("NIM  : 215150700111013");
        System.out.println("");

        CarRider luke = new CarRider("LUKE HEMMINGS", 25, "+61 2 5568 4569");
        CarRider calum = new CarRider("CALUM HOOD", 26, "+61 2 4953 2345");
        CarRider ashton = new CarRider("ASHTON IRWIM", 27, "+61 2 5789 7557");
        CarRider michael = new CarRider("MICHAEL CLIFFORD", 26, "+61 2 7679 6423");

        CarData data = new CarData();
        data.addCar("CONVERTIBLE", "YPD 640", "BMW");
        data.addCar("SPORT", "XFB 065", "FERRARI");
        data.addCar("HATCHBACK", "SKD 837", "FORD");
        data.addCar("COUPE", "TFS 676","MERCEDES" );

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(luke, data.carList.get(3), 8);
        arsip.Rent(calum, data.carList.get(3), 5);
        arsip.Rent(ashton, data.carList.get(2), 9);
        arsip.Rent(michael, data.carList.get(0), 7);

        System.out.println("");
        arsip.info();
    }
}
