package key_study.model.facility;

public class Room extends Facility {
    private final static String COM = ",";
    private String freeServiceIncluded;

    public Room() {
    }

    @Override
    public String readEndWriterFacility() {
        return this.getServiceCode()+COM+this.getServiceName()+COM+
                this.getUsableArea()+COM+this.getRentalCosts()+COM+this.getMaximumNumberOfPeople()+COM+this.getRentalType()+COM+getFreeServiceIncluded();

    }

    public Room(String serviceCode, String serviceName, double usableArea, Integer rentalCosts, Integer maximumNumberOfPeople, Integer rentalType, String freeServiceIncluded) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room : " + super.toString() +
                "freeServiceIncluded : '" + freeServiceIncluded + '\'' +
                '.';
    }
}
