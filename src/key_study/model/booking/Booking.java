package key_study.model.booking;

import key_study.model.facility.Facility;
import key_study.model.person.Customer;

import java.time.LocalDate;

import static com.sun.imageio.plugins.jpeg.JPEG.COM;

public class Booking {
    private int bookingId;
    private String dateStart;
    private String dateEnd;
    Customer customerID;
    Facility facility;
    private String typeOfService;//loại hình dịch vụ


    public Booking(String line, LocalDate dateStart, LocalDate dateEnd, String s, String line1, String typeOfService) {

    }

    public Booking(int bookingId, String dateStart, String dateEnd, Customer customerID, Facility facility, String typeOfService) {
        this.bookingId = bookingId;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.customerID = customerID;
        this.facility = facility;
        this.typeOfService = typeOfService;
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

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public String convertLine() {
        String line = getBookingId() + COM + dateStart.format(this.dateStart) + COM + dateEnd.format(this.dateEnd) + COM +getFacility() + COM + getCustomerID();
        return line;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", customerID=" + customerID +
                ", facility=" + facility +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}

