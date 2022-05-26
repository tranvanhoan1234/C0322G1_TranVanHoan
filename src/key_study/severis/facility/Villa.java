package key_study.severis.facility;

public class Villa extends Facility {
    private String roomStandard;
    private Double poolArea;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, double usableArea, Integer rentalCosts, Integer maximumNumberOfPeople, Integer rentalType, String roomStandard, Double poolArea) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "Villa : " + super.toString() +
                "roomStandard : '" + roomStandard + '\'' +
                ", poolArea : " + poolArea +
                '.';
    }
}
