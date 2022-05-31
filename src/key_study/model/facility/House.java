package key_study.model.facility;

import key_study.common.Com;

public class House extends Facility {

    private String roomStandard;
    private String numberOfFloors;


    public House() {
    }

    @Override
    public String readEndWriterFacility() {
        return this.getServiceCode()+ Com.COM+this.getServiceName()+Com.COM+
                this.getUsableArea()+Com.COM+this.getRentalCosts()+Com.COM+this.getMaximumNumberOfPeople()
                +Com.COM+this.getRentalType()+Com.COM+this.getRoomStandard()+Com.COM+getNumberOfFloors();
    }


    public House(String serviceCode, String serviceName, Double usableArea, Integer rentalCosts, Integer maximumNumberOfPeople,
                 Integer rentalType, String roomStandard, String numberOfFloors) {
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
