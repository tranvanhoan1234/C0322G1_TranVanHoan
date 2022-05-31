package key_study.severis.contactService;

import key_study.model.booking.Booking;
import key_study.model.booking.Contract;
import key_study.severis.bookingService.BookingServiceImpl;
import key_study.uitl.reader_writer.ReaderWriter;

import java.util.*;

public class ContractServiceImpl implements
        IContactService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Contract> contractList = new LinkedHashSet<>();

    @Override
    public void display() {
        contractList=ReaderWriter.readListContract("src/key_study/uitl/data/contract.csv");
        for (Contract contract : contractList) {
            System.out.println(contract.toStringContract());
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
            Integer customer = booking.getCustomerID();

            System.out.println("đang tạo hợp đồng booking thông tin booking : " + booking.bookingToString());
            System.out.println("đang tạo hợp đồng cho khách hàng có thông tin : " + customer.toString());

            System.out.print("nhập id hợp đồng : ");
            String id = scanner.nextLine();

            System.out.println("nhập số tiền cọc : ");
            String advanceDepositAmount = scanner.nextLine();

            System.out.println("tổng số tiền thanh toán : ");
            String totalPaymentAmount = scanner.nextLine();

            Contract contract = new Contract(id, booking.getBookingId(), advanceDepositAmount, totalPaymentAmount);
            contractList.add(contract);
            ReaderWriter.writeContract(contractList);

        }
    }
}
