package key_study.uitl.reader_writer;

import key_study.model.booking.Booking;
import key_study.model.facility.House;
import key_study.model.facility.Room;
import key_study.model.facility.Villa;
import key_study.model.person.Customer;
import key_study.model.person.Employee;

import java.io.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;
import java.util.zip.DataFormatException;

public class ReaderWriter {
    private final static String PATH_CUSTOMER = "src/key_study/uitl/data/customer.csv";
    private final static String PATH_EMPLOYEE = "src/key_study/uitl/data/employee.csv";
    private final static String PATH_VILLA = "src/key_study/uitl/data/villa.csv";
    private final static String PATH_HOUSE = "src/key_study/uitl/data/house.csv";
    private final static String PATH_ROOM = "src/key_study/uitl/data/room.csv";
    private final static String PATH_BOOKING = "src/key_study/uitl/data/booking.csv";

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
    public static void writeVilla(List<Villa> list) {
        File file = new File(PATH_VILLA);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villa : list) {
                bufferedWriter.write(villa.readEndWriterFacility());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } public static void writeHouse(List<House> list) {
        File file = new File(PATH_HOUSE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (House house : list) {
                bufferedWriter.write(house.readEndWriterFacility());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeRoom(List<Room> list) {
        File file = new File(PATH_ROOM);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room room : list) {
                bufferedWriter.write(room.readEndWriterFacility());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   private static void writeToFile(String pathFile, List<String> list) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = null;
            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void writeBooking(String pathFile, Set<Booking> bookings) {
        List<String> list = new ArrayList<>();

        for (Booking b : bookings) {
            list.add(b.convertLine());
        }

        writeToFile(pathFile, list);
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
            customer = new Customer(Integer.parseInt(array[0]), array[1], 2, array[2], Integer.parseInt(array[3]), Long.parseLong(array[4]), array[5], array[6], array[7], array[8]);
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
            villas1 = new Villa(array[0],array[1],Double.parseDouble(array[2]),Integer.parseInt(array[3]),Integer.parseInt(array[4]),Integer.parseInt(array[5]),array[6],Double.parseDouble(array[7]));
            villas.add(villas1);
        }
        return villas;
    }
    public static List<House> readFilHouse() {
        List<String> stringList = readFileCsvToListStrinng(PATH_HOUSE);
        List<House> houses = new ArrayList<>();
        String[] array = null;
        House house = null;
        for (String str : stringList) {
            array = str.split(",");
            house = new House(array[0],array[1],Double.parseDouble(array[2]),Integer.parseInt(array[3]),Integer.parseInt(array[4]),Integer.parseInt(array[5]),array[6],array[7]);
            houses.add(house);
        }
        return houses;
    }
    public static List<Room> readFilRoom() {
        List<String> stringList = readFileCsvToListStrinng(PATH_ROOM);
        List<Room> rooms = new ArrayList<>();
        String[] array = null;
        Room room = null;
        for (String str : stringList) {
            array = str.split(",");
            room = new Room(array[0],array[1],Double.parseDouble(array[2]),Integer.parseInt(array[3]),Integer.parseInt(array[4]),Integer.parseInt(array[5]),array[6] );
            rooms.add(room);
        }
        return rooms;
    }    public static Set<Booking> readListBooking(String pathFile) {
        Set<Booking> bookingSet = new TreeSet<>();
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

                LocalDate dateStart = null;
                LocalDate dateEnd = null;
                dateStart = LocalDate.parse(lines[1]);
                dateEnd = LocalDate.parse(lines[2]);
                bookingSet.add(new Booking(lines[0], dateStart, dateEnd, lines[3], lines[4], lines[5]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingSet;
    }
}
