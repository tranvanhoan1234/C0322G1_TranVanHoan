package key_study.severis.contactService;

import key_study.model.booking.Booking;
import key_study.model.booking.Contract;
import key_study.model.person.Customer;
import key_study.severis.bookingService.BookingServiceImpl;

import java.util.*;

public class ContractServiceImpl implements
        IContactService {
    static Scanner scanner = new Scanner(System.in);
    static List<Contract>contractList=new ArrayList<>();

    @Override
    public void display() {
        for (Contract contract:contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().senBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomerID();

            System.out.println("đang tạo hợp đồng booking thông tin booking : " + booking);
            System.out.println("đang tạo hợp đồng cho khách hàng có thông tin : " + customer.toString());

            System.out.print("nhập id hợp đồng : ");
            String id = scanner.nextLine();

            System.out.println("nhập số tiền cọc : ");
            String advanceDepositAmount = scanner.nextLine();

            System.out.println("tổng số tiền thanh toán : ");
            String totalPaymentAmount = scanner.nextLine();

            Contract contract = new Contract(id, booking, advanceDepositAmount, totalPaymentAmount);
            contractList.add(contract);
        }
    }
}
