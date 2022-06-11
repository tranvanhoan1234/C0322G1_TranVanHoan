package key_study.uitl.reader_writer;

import key_study.model.booking.Booking;
import key_study.model.booking.Contract;
import key_study.model.facility.Facility;
import key_study.model.facility.House;
import key_study.model.facility.Room;
import key_study.model.facility.Villa;
import key_study.model.person.Customer;
import key_study.model.person.Employee;
import key_study.severis.bookingService.BookingComparator;

import java.io.*;
import java.util.*;

public class ReaderWriter {
    private final static String PATH_CUSTOMER = "src/key_study/uitl/data/customer.csv";
    private final static String PATH_EMPLOYEE = "src/key_study/uitl/data/employee.csv";
    private final static String PATH_VILLA = "src/key_study/uitl/data/villa.csv";
    private final static String PATH_HOUSE = "src/key_study/uitl/data/house.csv";
    private final static String PATH_ROOM = "src/key_study/uitl/data/room.csv";
    private final static String PATH_BOOKING = "src/key_study/uitl/data/booking.csv";
    private final static String PATH_CONTRACT = "src/key_study/uitl/data/contract.csv";

//    private final static String COMMA = ",";


    public static void writeCustumer(List<Customer> list) {
        File file = new File(PATH_CUSTOMER);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer custumer : list) {
                bufferedWriter.write(custumer.writerPerson());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeEmployee(List<Employee> list) {
        File file = new File(PATH_EMPLOYEE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : list) {
                bufferedWriter.write(employee.writerPerson());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void writeVilla(List<Villa> list) {
//        File file = new File(PATH_VILLA);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file, true);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (Villa villa : list) {
//                bufferedWriter.write(villa.readEndWriterFacility());
//                bufferedWriter.newLine();
//
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void writeHouse(List<House> list) {
//        File file = new File(PATH_HOUSE);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file, true);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (House house : list) {
//                bufferedWriter.write(house.readEndWriterFacility());
//                bufferedWriter.newLine();
//
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void writeRoom(List<Room> list) {
//        File file = new File(PATH_ROOM);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file, false);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (Room room : list) {
//                bufferedWriter.write(room.readEndWriterFacility());
//                bufferedWriter.newLine();
//
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void writeBooking(Set<Booking> list) {
        File file = new File(PATH_BOOKING);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking booking : list) {
                bufferedWriter.write(booking.bookingToString());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeContract(Set<Contract> list) {
        File file = new File(PATH_CONTRACT);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Contract contract : list) {
                bufferedWriter.write(contract.toStringContract());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(List<String> list, String path) {
        try (FileWriter fileWriter = new FileWriter(path);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void writeFileFacility(Map<Facility, Integer> lists) {
        List<String> listHouse = new ArrayList<>();
        List<String> listVilla = new ArrayList<>();
        List<String> listRoom = new ArrayList<>();
        for (Map.Entry<Facility, Integer> entry : lists.entrySet()) {
            if (entry.getKey() instanceof House) {
                listHouse.add((entry.getKey()).readEndWriterFacility() + "," + entry.getValue());
            } else if (entry.getKey() instanceof Room) {
                listRoom.add((entry.getKey()).readEndWriterFacility() + "," + entry.getValue());
            } else {
                listVilla.add((entry.getKey()).readEndWriterFacility()+","+entry.getValue());
            }

        }
      write (listHouse,"src/key_study/uitl/data/house.csv");
      write (listVilla,"src/key_study/uitl/data/villa.csv");
      write (listRoom,"src/key_study/uitl/data/room.csv");
    }


    public static List<String> readFileCsvToListStrinng(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Customer> readFileCustumer() {
        List<String> stringList = readFileCsvToListStrinng(PATH_CUSTOMER);
        List<Customer> customerList = new ArrayList<>();
        String[] array = null;
        Customer customer = null;
        for (String str : stringList) {
            array = str.split(",");
            customer = new Customer(Integer.parseInt(array[0]), array[1], array[2], Integer.parseInt(array[3]), Long.parseLong(array[4]), array[5], array[6], array[7], array[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    public static List<Employee> readFileEmployee() {
        List<String> stringList = readFileCsvToListStrinng(PATH_EMPLOYEE);
        List<Employee> employees = new ArrayList<>();
        String[] array = null;
        Employee employee = null;
        for (String str : stringList) {
            array = str.split(",");
            employee = new Employee(array[0], array[1], array[2], Integer.parseInt(array[3]), Long.parseLong(array[4]), array[5], Integer.parseInt(array[6]), array[7], array[8], array[9]);
            employees.add(employee);
        }
        return employees;
    }

    public static List<Villa> readFileVilla() {
        List<String> stringList = readFileCsvToListStrinng(PATH_VILLA);
        List<Villa> villas = new ArrayList<>();
        String[] array = null;
        Villa villas1 = null;
        for (String str : stringList) {
            array = str.split(",");
            villas1 = new Villa(array[0], array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]), Integer.parseInt(array[5]), array[6], Double.parseDouble(array[7]));
            villas.add(villas1);
        }
        return villas;
    }

//    public static List<House> readFilHouse() {
//        List<String> stringList = readFileCsvToListStrinng(PATH_HOUSE);
//        List<House> houses = new ArrayList<>();
//        String[] array = null;
//        House house = null;
//        for (String str : stringList) {
//            array = str.split(",");
//            house = new House(array[0], array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]), Integer.parseInt(array[5]), array[6], array[7]);
//            houses.add(house);
//        }
//        return houses;
//    }
//
//    public static List<Room> readFilRoom() {
//        List<String> stringList = readFileCsvToListStrinng(PATH_ROOM);
//        List<Room> rooms = new ArrayList<>();
//        String[] array = null;
//        Room room = null;
//        for (String str : stringList) {
//            array = str.split(",");
//            room = new Room(array[0], array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]), Integer.parseInt(array[5]), array[6]);
//            rooms.add(room);
//        }
//        return rooms;
//    }

    public static Set<Booking> readListBooking(String pathFile) {
        Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

        String[] lines = null;
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                lines = line.split(",");
                bookingSet.add(new Booking(Integer.parseInt(lines[0]), lines[1], lines[2], Integer.parseInt(lines[3]), lines[4], lines[5]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingSet;
    }

    public static Set<Contract> readListContract(String pathFile) {
        Set<Contract> contracts = new LinkedHashSet<>();
        String temp = null;
        String[] lines = null;
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;

                }
                lines = line.split(",");
                contracts.add(new Contract(lines[0], Integer.parseInt(lines[1]), lines[2], lines[3]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contracts;
    }

    public static void readFileFacility(Map<Facility, Integer> list) {
        try {
            FileReader fileReader = new FileReader("src/key_study/uitl/data/villa.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                Villa villa = new Villa(temp[0], temp[1], Double.parseDouble(temp[2]), Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), temp[6], Double.parseDouble(temp[7]));
                list.put(villa, Integer.parseInt(temp[8]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader("src/key_study/uitl/data/room.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                Room room = new Room(temp[0], temp[1], Double.parseDouble(temp[2]), Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), temp[6]);
                list.put(room, Integer.parseInt(temp[7]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader("src/key_study/uitl/data/house.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                House house = new House(temp[0], temp[1], Double.parseDouble(temp[2]), Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), temp[6], temp[7]);
                list.put(house, Integer.parseInt(temp[8]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}