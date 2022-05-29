package key_study.severis.bookingService;

import key_study.model.booking.Booking;
import key_study.model.facility.Facility;
import key_study.model.facility.House;
import key_study.model.facility.Room;
import key_study.model.facility.Villa;
import key_study.model.person.Customer;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    //    String fullName, String dateOfBirth, String gender, Integer citizenId, Long numberPhone
//    , String gmail, Integer customerCode, String typeOfGuest, String address
    static {
        customerList.add(new Customer("hoan", "11/23/1233", 2, "nam", 1, 2312312L, "@GMAIL", 1, "AAA", "2ASDASD"));
        customerList.add(new Customer("thuAN", "11/23/1233", 3, "nam", 2, 2312312L, "@GMAIL", 1, "AAA", "2ASDASD"));
        facilityIntegerMap.put(new Villa("vila", "VILA", 123.2, 123, 122, 121, "PRO", 2.3), 0);
        facilityIntegerMap.put(new House("hose", "hose", 100.4, 19, 123, 123, "vip", "324"), 1);
        facilityIntegerMap.put(new Room("room", "room", 1212.2, 22, 122, 12, "có chục em chân dài phục vụ"), 1);
    }

    @Override
    public void addNewBooking() {
        int id =0;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = choiceCustomer();
        Facility facility = choiceFacility();
        System.out.println("nhập ngày bắt đầu thuê: ");
        String starDate = scanner.nextLine();
        System.out.println("ngày trả phòng : ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, customer, facility, starDate, endDate);
        bookingSet.add(booking);
        System.out.println("thêm vào thành công : ");
    }

    @Override
    public void displayListBooking() {
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }

    }

    public static Customer choiceCustomer() {
        System.out.println("danh sách khách hàng : ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());

        }
        System.out.println("nhập id khách hàng");
        boolean flag = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (flag) {
            for (Customer customer : customerList) {
                if (id == customer.getCustomerCode()) {
                    return customer;
                }

            }
            if (flag) {
                System.out.println("không tìm thấy nhập lại id khách hàng");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility choiceFacility() {
        System.out.println("danh sách dịch vụ : ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());

        }
        System.out.println("nhập mã id dich vụ");
        boolean flag = true;
        String id = scanner.nextLine();
        while (flag) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getServiceCode())) {
                    flag = false;
                    return entry.getKey();
                }

            }
            if (flag) {
                System.out.println("không tìm thấy nhập lại ma id dịch vụ : ");
                id = scanner.nextLine();
            }
        }
        return null;
    }

}
