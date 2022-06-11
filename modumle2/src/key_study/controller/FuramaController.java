package key_study.controller;

import key_study.severis.bookingService.BookingServiceImpl;
import key_study.severis.contactService.ContractServiceImpl;
import key_study.severis.implement_method.facilityServiceImpl.FacilityServiceImpl;
import key_study.severis.implement_method.personImpl.CustomerServiceImpl;
import key_study.severis.implement_method.personImpl.EmployeeServiceImpl;
import key_study.uitl.check_exception.CheckException;

import java.util.Scanner;

public class FuramaController {
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBookingServiceImpl Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit");
            Integer choice = CheckException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("nhập không đúng xin nhập lại: ");
                case 7:
            }
        } while (true);
    }

    public void employeeManagement() {
        EmployeeServiceImpl employeeManagement = new EmployeeServiceImpl();
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu");
            Integer choice = CheckException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    employeeManagement.display();
                    break;
                case 2:
                    employeeManagement.add();
                    break;
                case 3:
                    employeeManagement.editEmployee();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("nhập không đúng xin nhập lại : ");
                case 5:
            }
        } while (true);

    }

    public void customerManagement() {
        CustomerServiceImpl customerManagement = new CustomerServiceImpl();
        do {
            System.out.print("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu \n" +
                    " \tchon : ");
            Integer choice = CheckException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    customerManagement.display();
                    break;
                case 2:
                    customerManagement.add();
                    break;
                case 3:
                    customerManagement.editCustomer();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("nhập không đúng xin mời nhập lại : ");
            }
        } while (true);
    }

    public void facilityManagement() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        do {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu");
            Integer choice = CheckException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    menu();
                    break;
                case 3:
                    facilityService.displayMaintenance();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("nhập không đúng xin nhập lại: ");
            }
        } while (true);

    }

    public void menu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu");
            Integer choice = CheckException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    facilityService.addVilla();
                    break;
                case 2:
                    facilityService.addHose();
                    break;
                case 3:
                    facilityService.addRoom();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("không đúng xin nhập lại: ");
            }
        } while (true);

    }

    public void bookingManagement() {
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        do {
            System.out.print("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n" +
                    "\tChon : ");
            Integer choice = CheckException.checkExForParseInteger();

            switch (choice) {
                case 1:
                    bookingServiceImpl.add();
                    break;
                case 2:
                    bookingServiceImpl.display();
                    break;
                case 3:
                    contractService.createNewContract();
                    break;
                case 4:
                    contractService.display();
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("nhập không đúng xin nhập lại : ");
            }
        } while (true);
    }

    public void promotionManagement() {

        do {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            Integer choice = CheckException.checkExForParseInteger();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("nhập không đúng xin nhập lại: ");
            }

        } while (true);
    }
}
