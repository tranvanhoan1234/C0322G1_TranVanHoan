package key_study.uitl.data.reader_writer;

import key_study.severis.person.Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReaderWriter {
    private final static String PATH_CUSTOMER = "src/key_study/uitl/data/customer.csv";
    private final static String PATH_EMPLOYEE = "";
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
               bufferedWriter.write(custumer.getCitizenId());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
