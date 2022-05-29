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
        customerList.add(new Customer(1,"name",1232,"nam",12,023123l,"@qưe","@ưqeqw","qqqw","123"));
        customerList.add(new Customer(2,"name",1232,"nam",12,0121312l,"@qưe","@ưqeqw","qqqw","123"));
        facilityIntegerMap.put(new Villa("vila1", "VILA", 123.2, 123, 122, 121, "PRO", 2.3), 0);
        facilityIntegerMap.put(new Villa("vila2", "VILA", 123.2, 123, 122, 121, "PRO", 2.3), 0);
    }

    @Override
    public void addNewBooking() {

        int id =1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = choiceCustomer();
        Facility facility = choiceFacility();
        System.out.println("nhập ngày bắt đầu thuê: ");
        String starDate = scanner.nextLine();
        System.out.println("ngày trả phòng : ");
        String endDate = scanner.nextLine();
       Booking booking=new Booking(id,starDate,endDate,customer,facility);
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
