package model;

public class LoadingHistory {
    private Integer historyId;
    private Integer workerId;
    private Integer truckId;
    private Integer packageId;

    public LoadingHistory(Integer historyId, Integer workerId, Integer truckId, Integer packageId) {
        this.historyId = historyId;
        this.workerId = workerId;
        this.truckId = truckId;
        this.packageId = packageId;
    }

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }
}
