package key_study.model.booking;

import key_study.model.facility.Facility;
import key_study.model.person.Customer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
    private final static String COMMA = ",";
    private final static String PATTERN = "dd-MM-yyyy";
    private static SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN);
    private String bookingId;
    private Date dateStart;
    private Date dateEnd;
    private String customerID;
    private String serviceName;
    private String serviceId;

    public Booking(int id, Customer customer, Facility facility, String starDate, String endDate) {
    }

    public Booking(String bookingId, Date dateStart, Date dateEnd, String customerID, String serviceName, String serviceId) {
        this.bookingId = bookingId;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.customerID = customerID;
        this.serviceName = serviceName;
        this.serviceId = serviceId;
    }

    public static SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public static void setDateFormat(SimpleDateFormat dateFormat) {
        Booking.dateFormat = dateFormat;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", customerID='" + customerID + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceId='" + serviceId + '\'' +
                '}';
    }
}
