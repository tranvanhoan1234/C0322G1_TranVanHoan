package key_study.model.booking;

import key_study.model.facility.Facility;
import key_study.model.person.Customer;

public class Booking {
    private Integer bookingId;
    private String dateStart;
    private String dateEnd;
    private Integer customerID;
    private String facility;
    private String typeOfService;//loại hình dịch vụ

    public Booking() {
    }

    public Booking(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Booking(Integer bookingId, String dateStart, String dateEnd, Integer customerID, String facility, String typeOfService) {
        this.bookingId = bookingId;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.customerID = customerID;
        this.facility = facility;
        this.typeOfService = typeOfService;
    }
    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public String bookingToString(){
        return getBookingId()+","+getDateStart()+","+getDateEnd()+","+getCustomerID()+","+getFacility()+","+getTypeOfService();
    }

    @Override
    public String toString() {
        return "Booking=" +
                "bookingId : " + bookingId +
                ", dateStart :'" + dateStart + '\'' +
                ", dateEnd : " + dateEnd + '\'' +
                ", customerID : " + customerID +
                ", facility : " + facility +
                ", typeOfService='" + typeOfService + '\'';
    }
}

