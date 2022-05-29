package key_study.model.facility;

public class House extends Facility {
    private String roomStandard;
    private String numberOfFloors;

    public House() {
    }

    public House(String serviceCode, String serviceName, Double usableArea, Integer rentalCosts, Integer maximumNumberOfPeople, Integer rentalType, String roomStandard, String numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House : " + super.toString() +
                "roomStandard : '" + roomStandard + '\'' +
                ", numberOfFloors : '" + numberOfFloors + '\'' +
                '.';
    }
}
