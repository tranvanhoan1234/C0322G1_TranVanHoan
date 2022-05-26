package key_study.controller;

import key_study.severis.implement_method.facilityServiceImpl.FacilityServiceImpl;
import key_study.severis.implement_method.personImpl.CustomerManagementImpl;
import key_study.severis.implement_method.personImpl.EmployeeManagementImpl;

import java.util.Scanner;

public class FuramaController {
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit");
            Integer choice = Integer.valueOf(scanner.nextLine());
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
                    bookingManagerment();
                    break;
                case 5:
                    promotionManagemen();
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
        EmployeeManagementImpl employeeManagement = new EmployeeManagementImpl();
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu");
            Integer choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeManagement.displayEmployee();
                    break;
                case 2:
                    employeeManagement.addEmployee();
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
        CustomerManagementImpl customerManagement = new CustomerManagementImpl();
        do {
            System.out.print("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu \n" +
                    " \tchon : ");
            Integer choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerManagement.displayCustomer();
                    break;
                case 2:
                    customerManagement.addCustomer();
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
            Integer choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    menu();
                    break;
                case 3:
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
            Integer choice = Integer.valueOf(scanner.nextLine());
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

    public void bookingManagerment() {
        do {
            System.out.print("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n" +
                    "\tChon : ");
            Integer choice = Integer.valueOf(scanner.nextLine());

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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

    public void promotionManagemen() {

        do {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            Integer choice = Integer.valueOf(scanner.nextLine());

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
