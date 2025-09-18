import enums.TruckStatus;
import model.Package;
import model.Truck;
import model.WareHouse;
import model.Worker;

public class TruckApp {
    public static void main(String[]args){
        Package pa1 = new Package(1,"pa1",10.0);
        Package pa2 = new Package(2,"pa2",10.0);
        WareHouse wareHouse = new WareHouse(1,"wa");

        Worker worker = new Worker(1,"wa","wa@yopmail.com");
        Truck truck = new Truck(1,"ta",12.0, TruckStatus.EMPTY);

        TruckLoadingSystem truckLoadingSystem = TruckLoadingSystem.getInstance(wareHouse);
        truckLoadingSystem.addPackageToWareHouse(pa1);
        truckLoadingSystem.addPackageToWareHouse(pa2);

        truckLoadingSystem.addPackageToTruck(worker.getWorkerId(),pa1,truck);
        truckLoadingSystem.addPackageToTruck(worker.getWorkerId(),pa2,truck);
        System.out.println(truck.getTruckStatus());

    }
}
