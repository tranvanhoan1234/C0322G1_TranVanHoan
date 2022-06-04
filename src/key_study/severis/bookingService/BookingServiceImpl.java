package key_study.severis.bookingService;

import key_study.model.booking.Booking;
import key_study.model.facility.Facility;
import key_study.model.person.Customer;
import key_study.uitl.reader_writer.ReaderWriter;
import key_study.uitl.regex.Regex;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static List<Customer> listCustomer = new LinkedList<>();

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
        listCustomer = ReaderWriter.readFileCustumer();
        System.out.println("-------------Danh sách khách hàng-------------");
        for (Customer customer : listCustomer) {
            System.out.println(customer);
        }
        System.out.print("Nhập id khách hàng: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        while (flag) {
            for (Customer customer : listCustomer) {
                if (id == customer.getCustomerCode()) {
                    return customer;
                }
            }
            if (flag) {
                System.out.println("Nhập sai, vui lòng nhập lại");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }
    public static Facility choiceFacility() {
        facilityIntegerMap.clear();
        ReaderWriter.readFileFacility(facilityIntegerMap);
        System.out.println("-------------Danh sách dịch vụ-------------");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.print("Nhập id dịch vụ: ");
        String id = scanner.nextLine();
        boolean flag = true;
        while (flag) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getServiceCode())) {
                    flag = false;
                    return entry.getKey();
                }
            }
            if (flag) {
                System.out.println("Nhập sai, vui lòng nhập lại");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    @Override
    public void display() {
        Set<Booking> bookingSet = ReaderWriter.readListBooking("src/key_study/uitl/data/booking.csv");
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }

    public Set<Booking> senBooking() {
        return bookingSet;
    }

    @Override
    public void add() {
        ReaderWriter.readFileFacility(facilityIntegerMap);
        bookingSet = ReaderWriter.readListBooking("src/key_study/uitl/data/booking.csv");
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size()+1;
        }
        Customer customer = choiceCustomer();
        Facility facility = choiceFacility();

        System.out.println("nhập ngày bắt đầu thuê: ");
        String starDate = scanner.nextLine();
        while (!Regex.yearRegex(String.valueOf(starDate))) {
            System.err.print("nhập không đúng xin nhập lại : ");
            starDate = scanner.nextLine();
        }

        System.out.println("ngày trả phòng : ");
        String endDate = scanner.nextLine();
        while (!Regex.yearRegex(String.valueOf(endDate))) {
            System.err.print("nhập không đúng xin nhập lại : ");
            endDate = scanner.nextLine();
        }
        System.out.println("tên dịch vụ :");
        String serviceName = scanner.nextLine();
        facilityIntegerMap.put(facility, facilityIntegerMap.get(facility) + 1);
        Booking booking = new Booking(id, starDate, endDate, customer.getCustomerCode(), facility.getServiceCode(), serviceName);
        bookingSet.add(booking);
        System.out.println("thêm vào thành công : ");
        ReaderWriter.writeBooking(bookingSet);
        ReaderWriter.writeFileFacility(facilityIntegerMap);

    }
}
