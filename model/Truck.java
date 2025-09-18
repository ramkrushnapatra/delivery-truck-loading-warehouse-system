package model;

import enums.TruckStatus;

public class Truck {
    private Integer truckId;
    private String truckName;
    private Double maximumLoadWeight;
    private TruckStatus truckStatus;

    public Truck(Integer truckId, String truckName, Double maximumLoadWeight, TruckStatus truckStatus) {
        this.truckId = truckId;
        this.truckName = truckName;
        this.maximumLoadWeight = maximumLoadWeight;
        this.truckStatus = truckStatus;
    }

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public Double getMaximumLoadWeight() {
        return maximumLoadWeight;
    }

    public void setMaximumLoadWeight(Double maximumLoadWeight) {
        this.maximumLoadWeight = maximumLoadWeight;
    }

    public TruckStatus getTruckStatus() {
        return truckStatus;
    }

    public void setTruckStatus(TruckStatus truckStatus) {
        this.truckStatus = truckStatus;
    }
}
