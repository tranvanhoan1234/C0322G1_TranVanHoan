package key_study.severis.bookingService;

import key_study.model.booking.Booking;
import key_study.model.facility.Facility;
import key_study.model.person.Customer;
import key_study.uitl.check_exception.CheckException;
import key_study.uitl.reader_writer.ReaderWriter;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    //    String fullName, String dateOfBirth, String gender, Integer citizenId, Long numberPhone
//    , String gmail, Integer customerCode, String typeOfGuest, String address
//    static {
//        customerList.add(new Customer());
//        customerList.add(new Customer(2, "name", 1232, "nam", 12, 0121312l, "@qưe", "@ưqeqw", "qqqw", "123"));
//        facilityIntegerMap.put(new Villa("vila1", "VILA", 123.2, 123, 122, 121, "PRO", 2.3), 0);
//        facilityIntegerMap.put(new House("hose1", "hose", 123.2, 123, 122, 121, "PRO", "12"), 0);
//        facilityIntegerMap.put(new Room("hose1", "hose", 123.2, 123, 122, 121, "vocher"), 0);
//    }
    // int bookingId, String dateStart, String dateEnd, int customerID, String serviceName, String typeOfService

    public static Customer choiceCustomer() {

        List<Customer> customerList = ReaderWriter.readFileCustumer();
        System.out.println("danh sách khách hàng : ");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(i + ": " + customerList.get(i));
        }
        System.out.println("nhập lựa chọn  : ");
        Integer choice = CheckException.checkExForParseInteger();
        while (choice <= 0 && choice >= customerList.size() - 1) {
            System.out.println("nhập lại choice : ");
            choice = CheckException.checkExForParseInteger();
        }
        return customerList.get(choice);
    }
    public static Facility choiceFacility() {
        List<Facility> facilities1 = new ArrayList<>();
        facilities1.addAll(ReaderWriter.readFileVilla());
        facilities1.addAll(ReaderWriter.readFilRoom());
        facilities1.addAll(ReaderWriter.readFilHouse());
        System.out.println("danh sách khách hàng : ");
        for (int i = 0; i < facilities1.size(); i++) {
            System.out.println(i + ": " + facilities1.get(i));
        }
        System.out.println("nhập lựa chọn  : ");
        Integer choice = CheckException.checkExForParseInteger();
        while (choice >= 0 && choice >= facilities1.size() - 1) {
            System.out.println("nhập lại choice : ");
            choice = CheckException.checkExForParseInteger();
        }
        return facilities1.get(choice);
    }

    @Override
    public void display() {
        Set<Booking> bookingSet = ReaderWriter.readListBooking("src/key_study/uitl/data/booking.csv");
        for (Booking booking : bookingSet) {
            System.out.println(booking.bookingToString());
        }
    }

    public Set<Booking> senBooking() {
        return bookingSet;
    }

    @Override
    public void add() {

        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = choiceCustomer();
        Facility facility = choiceFacility();

        System.out.println("nhập ngày bắt đầu thuê: ");
        String starDate = scanner.nextLine();

        System.out.println("ngày trả phòng : ");
        String endDate = scanner.nextLine();

        System.out.println("tên dịch vụ :");
        String serviceName = scanner.nextLine();

        Booking booking = new Booking(id, starDate, endDate, customer.getCustomerCode(), facility.getServiceCode(), serviceName);
        bookingSet.add(booking);
        System.out.println("thêm vào thành công : ");
        ReaderWriter.writeBooking(bookingSet);

    }
}
