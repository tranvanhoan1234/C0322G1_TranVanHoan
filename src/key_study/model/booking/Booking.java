package key_study.model.booking;

import key_study.model.facility.Facility;
import key_study.model.person.Customer;

import java.util.Objects;

public class Booking {
    private int bookingId;
    private String dateStart;
    private String dateEnd;
    private int customerID;
    private String serviceName;
    private String typeOfService;//loại hình dịch vụ


    public Booking() {

    }

    public Booking(int bookingId, String dateStart, String dateEnd, int customerID, String serviceName, String typeOfService) {
        this.bookingId = bookingId;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.customerID = customerID;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public Booking(int id, String starDate, String endDate, Customer customer, Facility facility) {

    }


    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
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

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }


    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", customerID=" + customerID +
                ", serviceName='" + serviceName + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}

