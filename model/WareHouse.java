package model;

import java.util.ArrayList;
import java.util.List;

public class WareHouse {
    private Integer wareHouseId;
    private String wareHouseName;
    private List<Package> packageList;

    public WareHouse(Integer wareHouseId, String wareHouseName) {
        this.wareHouseId = wareHouseId;
        this.wareHouseName = wareHouseName;
        this.packageList = new ArrayList<>();
    }

    public void addPackageToWareHouse(Package package1){
        this.packageList.add(package1);
    }

    public void removePackage(Package package1){
        this.packageList.remove(package1);
    }

    public Integer getWareHouseId() {
        return wareHouseId;
    }

    public void setWareHouseId(Integer wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public String getWareHouseName() {
        return wareHouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.wareHouseName = wareHouseName;
    }

    public List<Package> getPackageList() {
        return packageList;
    }

}
