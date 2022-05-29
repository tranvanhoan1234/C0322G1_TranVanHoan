package key_study.model.facility;

import java.util.Objects;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private double usableArea;
    private Integer rentalCosts;
    private Integer maximumNumberOfPeople;
    private Integer rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName,
                    double usableArea, Integer rentalCosts, Integer maximumNumberOfPeople,
                    Integer rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public Integer getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(Integer rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public Integer getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(Integer maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public Integer getRentalType() {
        return rentalType;
    }

    public void setRentalType(Integer rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "serviceCode: '" + serviceCode + '\'' +
                ", serviceName : '" + serviceName + '\'' +
                ", usableArea : " + usableArea +
                ", rentalCosts : " + rentalCosts +
                ", maximumNumberOfPeople : " + maximumNumberOfPeople +
                ", rentalType : " + rentalType +
                ':';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(serviceCode, facility.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceCode);
    }
}
