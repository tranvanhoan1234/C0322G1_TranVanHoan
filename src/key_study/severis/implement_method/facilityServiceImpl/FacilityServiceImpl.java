package key_study.severis.implement_method.facilityServiceImpl;

import key_study.model.facility.Facility;
import key_study.model.facility.House;
import key_study.model.facility.Room;
import key_study.model.facility.Villa;
import key_study.uitl.check_exception.CheckException;
import key_study.uitl.reader_writer.ReaderWriter;
import key_study.uitl.regex.Regex;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap();
    private static List<Facility> facilityList = new ArrayList<>();
    private static List<Villa> villaList = new LinkedList<>();
    private static List<House> houseList = new LinkedList<>();
    private static List<Room> roomList = new LinkedList<>();

    //
//    static {
//        Villa villa1 = new Villa("vila", "VILA", 123.2, 123, 122, 121, "PRO", 2.3);
//        House houseList1 = new House("hose", "hose", 100.4, 19, 123, 123, "vip", "324");
//        Room room = new Room("room", "room", 1212.2, 22, 122, 12, "có chục em chân dài phục vụ");
//        facilityIntegerMap.put(houseList1, 1);
//        facilityIntegerMap.put(villa1,3);
//        facilityIntegerMap.put(room, 1);
//    }
    public Set<Facility> senFacility() {
        return (Set<Facility>) facilityIntegerMap;
    }

    @Override
    public void displayFacility() {
        houseList = ReaderWriter.readFilHouse();
        villaList = ReaderWriter.readFileVilla();
        roomList = ReaderWriter.readFilRoom();
        for (House house : houseList) {
            addMaintenance(house);
        }
        for (Villa villa : villaList) {
            addMaintenance(villa);
        }
        for (Room room : roomList) {
            addMaintenance(room);
        }
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println("tên dịch vụ: " + entry.getKey());
            System.out.println("số lần: " + entry.getValue());
        }
    }
    @Override
    public void addMaintenance(Facility facility) {
        if (facilityIntegerMap.isEmpty()) {
            facilityIntegerMap.put(facility, 1);
        } else {
            boolean flag = false;
            for (Facility key : facilityIntegerMap.keySet()) {
                if (facility.equals(key)) {
                    checkMaintenance(key);
                    facilityIntegerMap.put(key, facilityIntegerMap.get(key) + 1);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                facilityIntegerMap.put(facility, 1);
            }
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

    @Override
    public void checkMaintenance(Facility facility) {
        if (facilityIntegerMap.get(facility) >= 2) {
            System.out.println("Service is under maintenance!");
            facilityList.add(facility);
            facilityIntegerMap.put(facility, 0);
        }
    }

    @Override
    public void addHose() {
        System.out.println("thêm mã dịch vụ định dạng SVHO-yy : ");
        String serviceCode = scanner.nextLine();
        while (!Regex.villaRegex(serviceCode)) {
            System.out.print("nhập không đúng xin nhập lại định dạng SVHO-YYYY: ");
            serviceCode = scanner.nextLine();
        }
        System.out.println("thêm tên dich vụ : ");
        String serviceName = scanner.nextLine();
        while (!Regex.nameRegex(serviceName)) {
            System.out.print("nhập không đúng xin nhập lại Viết hoa chữ cái đầu : ");
            serviceName = scanner.nextLine();
        }
        System.out.println("thêm diện tích sử dung số thực >30.0 :");
        double usableArea = CheckException.checkExForParseDouble();
        while (!Regex.usableAreaRegex(String.valueOf(usableArea))) {
            System.out.print("nhập không đúng xin nhập lại định dạng số thực (.) : ");
            usableArea = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("thêm chi phí thuê : ");
        Integer rentalCosts = CheckException.checkExForParseInteger();
        while (!Regex.numberOfFoloorsRegex(String.valueOf(rentalCosts))) {
            System.out.print("nhập không đúng xin nhập lại  : ");
            rentalCosts = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("thêm số người tối đa <20 : ");
        Integer maximumNumberOfPeople = CheckException.checkExForParseInteger();
        while (!Regex.maxImumNumberOfPeopleRegex(String.valueOf(maximumNumberOfPeople))) {
            System.out.print("nhập không đúng xin nhập lại định dạng <20 : ");
            maximumNumberOfPeople = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("thêm loại cho thuê : ");
        Integer rentalType = CheckException.checkExForParseInteger();
        while (!Regex.numberOfFoloorsRegex(String.valueOf(rentalType))) {
            System.out.print("nhập không đúng xin nhập lại : ");
            rentalType = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("thêm tiêu chuẩn phòng viết hoa chữ cái đầu : ");
        String roomStandard = scanner.nextLine();
        while (!Regex.nameRegex(roomStandard)) {
            System.out.print("nhập không đúng xin nhập lại Viết hoa chữ cái đầu : ");
            roomStandard = scanner.nextLine();
        }
        System.out.println("thêm số tầng : ");
        String numberOfFloors = scanner.nextLine();
        while (!Regex.maxImumNumberOfPeopleRegex(String.valueOf(numberOfFloors))) {
            System.out.print("nhập không đúng xin nhập lại  : ");
            numberOfFloors = scanner.nextLine();
        }
        House hose = new House(serviceCode, serviceName, usableArea, rentalCosts,
                maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);
        houseList.add(hose);
        ReaderWriter.writeHouse(houseList);
    }
//    public Villa(String serviceCode, String serviceName, double usableArea, Integer rentalCosts, Integer maximumNumberOfPeople, Integer rentalType, String roomStandard, Double poolArea) {

    @Override
    public void addVilla() {
        System.out.println("Thêm mã mã dịch vụ theo định dạng SVVL-YYYY : ");
        String serviceCode = scanner.nextLine();
        while (!Regex.villaRegex(serviceCode)) {
            System.out.print("nhập không đúng xin nhập lại định dạng SVVL-YYYY: ");
            serviceCode = scanner.nextLine();
        }
        System.out.println("Thêm tên dịch vụ Viết hoa chữ cái đầu : ");
        String serviceName = scanner.nextLine();
        while (!Regex.nameRegex(serviceName)) {
            System.out.print("nhập không đúng xin nhập lại Viết hoa chữ cái đầu : ");
            serviceName = scanner.nextLine();
        }
        System.out.println("Thêm diện tích sử dung số thực  > 30.1: ");
        double usableArea = CheckException.checkExForParseDouble();
        while (!Regex.usableAreaRegex(String.valueOf(usableArea))) {
            System.out.print("nhập không đúng xin nhập lại định dạng số thực (.) : ");
            usableArea = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Thêm chi phí thuê : ");
        Integer rentalCosts = CheckException.checkExForParseInteger();
        while (!Regex.numberOfFoloorsRegex(String.valueOf(rentalCosts))) {
            System.out.print("nhập không đúng xin nhập lại : ");
            rentalCosts = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Thêm số người tối đa <20 : ");
        Integer maximumNumberOfPeople = CheckException.checkExForParseInteger();
        while (!Regex.maxImumNumberOfPeopleRegex(String.valueOf(maximumNumberOfPeople))) {
            System.out.print("nhập không đúng xin nhập lại : ");
            maximumNumberOfPeople = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Thêm loại cho thuê  viết hoa chữ cái đầu: ");
        Integer rentalType = CheckException.checkExForParseInteger();
        while (!Regex.numberOfFoloorsRegex(String.valueOf(rentalType))) {
            System.out.print("nhập không đúng xin nhập lại Viết hoa chữ cái đầu : ");
            rentalType = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Thêm số tầng : ");
        String roomStandard = scanner.nextLine();
        while (!Regex.numberOfFoloorsRegex(roomStandard)) {
            System.out.print("nhập không đúng xin nhập lại : ");
            roomStandard = scanner.nextLine();
        }
        System.out.println("Thêm khu vực hồ bơi : ");
        Double poolArea = Double.valueOf(scanner.nextLine());
        while (!Regex.usableAreaRegex(String.valueOf(poolArea))) {
            System.out.print("nhập không đúng xin nhập lại định dạng số thực (.)>30.0 : ");
            poolArea = Double.parseDouble(scanner.nextLine());
        }
        Villa villa = new Villa(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, poolArea);
        villaList.add(villa);
        ReaderWriter.writeVilla(villaList);

    }
//    public Room(String serviceCode, String serviceName, double usableArea, Integer rentalCosts, Integer maximumNumberOfPeople, Integer rentalType, String freeServiceIncluded) {

    @Override
    public void addRoom() {
        System.out.println("Thêm mã mã dịch vụ : ");
        String serviceCode = scanner.nextLine();
        while (!Regex.villaRegex(serviceCode)) {
            System.out.print("nhập không đúng xin nhập lại định dạng SVVL-YYYY: ");
            serviceCode = scanner.nextLine();
        }
        System.out.println("Thêm tên dịch vụ : ");
        String serviceName = scanner.nextLine();
        while (!Regex.nameRegex(serviceName)) {
            System.out.print("nhập không đúng xin nhập lại Viết hoa chữ cái đầu : ");
            serviceName = scanner.nextLine();
        }
        System.out.println("Thêm diện tích sử dung : ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        while (!Regex.usableAreaRegex(String.valueOf(usableArea))) {
            System.out.print("nhập không đúng xin nhập lại định dạng số thực (.) : ");
            usableArea = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Thêm chi phí thuê : ");
        Integer rentalCosts = Integer.valueOf(scanner.nextLine());
        while (!Regex.numberOfFoloorsRegex(String.valueOf(rentalCosts))) {
            System.out.print("nhập không đúng xin nhập lại định dạng số thực (.) : ");
            rentalCosts = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Thêm số người tối đa : ");
        Integer maximumNumberOfPeople = Integer.valueOf(scanner.nextLine());
        while (!Regex.maxImumNumberOfPeopleRegex(String.valueOf(maximumNumberOfPeople))) {
            System.out.print("nhập không đúng xin nhập lại định dạng số thực (.) : ");
            maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Thêm loại cho thuê : ");
        Integer rentalType = Integer.valueOf(scanner.nextLine());
        while (!Regex.numberOfFoloorsRegex(String.valueOf(rentalType))) {
            System.out.print("nhập không đúng xin nhập lại Viết hoa chữ cái đầu : ");
            rentalType = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Thêm vâu chờ : ");
        String freeServiceIncluded = scanner.nextLine();
        Room room = new Room(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, freeServiceIncluded);
        roomList.add(room);
        ReaderWriter.writeRoom(roomList);
    }
}
