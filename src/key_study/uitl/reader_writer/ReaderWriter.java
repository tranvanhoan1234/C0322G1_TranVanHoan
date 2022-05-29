package key_study.uitl.reader_writer;

import key_study.model.person.Customer;
import key_study.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriter {
    private final static String PATH_CUSTOMER = "src/key_study/uitl/data/customer.csv";
    private final static String PATH_EMPLOYEE = "src/key_study/uitl/data/employee.csv";
    private final static String PATH_VILLA = "";
    private final static String PATH_HOUSE = "";
    private final static String PATH_ROOM = "";

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
        File file = new File("src/key_study/uitl/data/employee.csv");
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

    public static List<String> readFileCsvToListStrinng(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
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
            customer = new Customer(array[0], array[1], 2, array[2], Integer.parseInt(array[3]), Long.parseLong(array[4]), array[5], Integer.parseInt(array[6]), array[7], array[8]);
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
}
