package model;

public class Package {
    private Integer packageId;
    private String packageName;
    private Double packageWeight;

    public Package(Integer packageId, String packageName, Double packageWeight) {
        this.packageId = packageId;
        this.packageName = packageName;
        this.packageWeight = packageWeight;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(Double packageWeight) {
        this.packageWeight = packageWeight;
    }
}
