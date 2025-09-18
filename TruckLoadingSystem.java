import enums.TruckStatus;
import model.LoadingHistory;
import model.Package;
import model.Truck;
import model.WareHouse;

import java.util.*;

public class TruckLoadingSystem {
    private static TruckLoadingSystem instance;
    private Map<Integer, List<Package>> truckPackageInfo;
    private Map<Integer,List<LoadingHistory>>truckLoadingHistoryInfo;
    private WareHouse wareHouse;

    public static TruckLoadingSystem getInstance(WareHouse wareHouse){
        if(instance ==null){
            instance = new TruckLoadingSystem(wareHouse);
        }
        return instance;
    }

    public TruckLoadingSystem(WareHouse wareHouse){
        this.truckPackageInfo = new HashMap<>();
        this.truckLoadingHistoryInfo = new HashMap<>();
        this.wareHouse = wareHouse;
    }


    public void addPackageToWareHouse(Package packages){
        this.wareHouse.addPackageToWareHouse(packages);
        System.out.println("Packages added sucessfully in WareHouse");
    }

    public synchronized void addPackageToTruck(Integer workerId, Package packages, Truck truck){
        if(Objects.equals(truck.getTruckStatus(), TruckStatus.LOADED)){
            System.out.println("truck is already loaded");
            return;
        }

        boolean canLoadToTruck = checkWeight(truck,packages);
        List<Package>packageList = new ArrayList<>();
        if(canLoadToTruck){
            truck.setTruckStatus(TruckStatus.LOADING);
            if(!this.truckPackageInfo.containsKey(truck.getTruckId())){
                packageList.add(packages);
                this.truckPackageInfo.put(truck.getTruckId() ,packageList);
                System.out.println("loading in truckV2");
                // here tomorrow add loading history
                return;
            }

            packageList = this.truckPackageInfo.get(truck.getTruckId());
            packageList.add(packages);
            this.truckPackageInfo.put(truck.getTruckId(), packageList);
            System.out.println("loading in truckV1");

        }
        else {
            truck.setTruckStatus(TruckStatus.LOADED);
            System.out.println("truck is loaded");
        }


    }

    public boolean checkWeight(Truck truck,Package packages){
        int totalWeight = 0;
        List<Package>packageList = new ArrayList<>();
        if(!this.truckPackageInfo.containsKey(truck.getTruckId())){
            if(packages.getPackageWeight() > truck.getMaximumLoadWeight()){
                return false;
            }
            return true;
        }
        packageList = this.truckPackageInfo.get(truck.getTruckId());
        for(Package pa:packageList){
            totalWeight = (int) (totalWeight + pa.getPackageWeight());
        }
        if(totalWeight + packages.getPackageWeight() > truck.getMaximumLoadWeight()){
            return false;
        }
        return true;

    }


}
