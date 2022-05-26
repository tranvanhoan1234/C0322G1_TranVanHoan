package key_study.severis.implement_method.facilityServiceImpl;

import key_study.severis.facility.Facility;
import key_study.severis.facility.House;
import key_study.severis.facility.Room;
import key_study.severis.facility.Villa;

import java.util.*;

public class FacilityServiceImpl implements IFacilityManagement {
    private static final List<Facility> facilityList = new ArrayList<>();
    private static final List<House> houseList = new LinkedList<>();
    private static final List<Villa> villaList = new LinkedList<>();
    private static final List<Room> roomList = new LinkedList<>();

    static {

        House houseList1 = new House("hs123", "hose", 100.4, 19, 123, 123, "vip", "324");
        Villa villa1 = new Villa("VILA1232", "VILA", 123.2, 123, 122, 121, "PRO", 2.3);
        Room room = new Room("room123", "room", 1212.2, 22, 122, 12, "có chục em chân dài phục vụ");
        houseList.add(houseList1);
        villaList.add(villa1);
        roomList.add(room);
    }

    private final Map<Facility, Integer> facilityMap = new LinkedHashMap();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void displayFacility() {

        for (House house : houseList) {
            System.out.println(house);
        }
        for (Villa villa : villaList) {
            System.out.println(villa);
        }
        for (Room room : roomList) {
            System.out.println(room);
        }
    }


    @Override
    public void displayMaintenance() {

        if (!facilityList.isEmpty()) {
            for (Facility f : facilityList) {
                System.out.println(f);
            }
        } else {
            System.out.println("danh sach rong");
        }

    }
//    public void facilityMaintenance(Facility facility) {
//        if (facilityIntegerMap.get(facility) >= 4) {
//            System.out.println("Service is under maintenance!");
//            facilityList.add(facility);
//            facilityIntegerMap.put(facility, 1);
//        }
//    }

//    @Override
//    public void addMaintenance(Facility facility) {
//        Set<Facility> facilityKey = facilityIntegerMap.keySet();
//
//        if (facilityIntegerMap.isEmpty()) {
//            facilityIntegerMap.put(facility, 1);
//        } else {
//            boolean flag = true;
//            for (Facility key : facilityKey) {
//                if (facility.equals(key)) {
//                    facilityMaintenance(facility);
//                    facilityIntegerMap.put(key, facilityIntegerMap.get(key) + 1);
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                facilityIntegerMap.put(facility, 1);
//            }
//        }
//    }


    @Override
    public void addHose() {
        System.out.println("thêm mã dịch vụ : ");
        String serviceCode = scanner.nextLine();
        System.out.println("thêm tên dich vụ : ");
        String serviceName = scanner.nextLine();
        System.out.println("thêm diện tích sử dung :");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("thêm chi phí thuê : ");
        Integer rentalCosts = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm số người tối đa : ");
        Integer maximumNumberOfPeople = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm loại cho thuê : ");
        Integer rentalType = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm tiêu chuẩn phòng : ");
        String roomStandard = scanner.nextLine();
        System.out.println("thêm số tầng : ");
        String numberOfFloors = scanner.nextLine();
        House hose = new House(serviceCode, serviceName, usableArea, rentalCosts,
                maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);
        houseList.add(hose);
    }
//    public Villa(String serviceCode, String serviceName, double usableArea, Integer rentalCosts, Integer maximumNumberOfPeople, Integer rentalType, String roomStandard, Double poolArea) {

    @Override
    public void addVilla() {
        System.out.println("Thêm mã mã dịch vụ : ");
        String serviceCode = scanner.nextLine();
        System.out.println("Thêm tên dịch vụ : ");
        String serviceName = scanner.nextLine();
        System.out.println("Thêm diện tích sử dung : ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Thêm chi phí thuê : ");
        Integer rentalCosts = Integer.valueOf(scanner.nextLine());
        System.out.println("Thêm số người tối đa : ");
        Integer maximumNumberOfPeople = Integer.valueOf(scanner.nextLine());
        System.out.println("Thêm loại cho thuê : ");
        Integer rentalType = Integer.valueOf(scanner.nextLine());
        System.out.println("Thêm số tầng : ");
        String roomStandard = scanner.nextLine();
        System.out.println("Thêm khu vữ hồ bơi : ");
        Double poolArea = Double.valueOf(scanner.nextLine());
        Villa villa = new Villa(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, poolArea);
        villaList.add(villa);

    }
//    public Room(String serviceCode, String serviceName, double usableArea, Integer rentalCosts, Integer maximumNumberOfPeople, Integer rentalType, String freeServiceIncluded) {

    @Override
    public void addRoom() {
        System.out.println("Thêm mã mã dịch vụ : ");
        String serviceCode = scanner.nextLine();
        System.out.println("Thêm tên dịch vụ : ");
        String serviceName = scanner.nextLine();
        System.out.println("Thêm diện tích sử dung : ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Thêm chi phí thuê : ");
        Integer rentalCosts = Integer.valueOf(scanner.nextLine());
        System.out.println("Thêm số người tối đa : ");
        Integer maximumNumberOfPeople = Integer.valueOf(scanner.nextLine());
        System.out.println("Thêm loại cho thuê : ");
        Integer rentalType = Integer.valueOf(scanner.nextLine());
        System.out.println("Thêm vâu chờ : ");
        String freeServiceIncluded = scanner.nextLine();
        Room room = new Room(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, freeServiceIncluded);
        roomList.add(room);
    }
}