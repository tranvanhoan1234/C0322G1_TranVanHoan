package bai_tap_nho_2.versice;

import bai_tap_nho_2.model.Experience;
import bai_tap_nho_2.uitl.read_write.ReadEndWrite;

import java.util.List;
import java.util.Scanner;

public class ExperinceImpl implements Service {
    private Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        List<Experience> experiences = ReadEndWrite.readFileEx();
        for (Experience experince:experiences) {
            System.out.println(experince);

        }
    }
//    public Experience(Integer candidateID, String fullName, String birthDay,
//    Integer phone, Integer email, String candidateType, Integer canidateCount, String expInYear, String proSkill) {

    @Override
    public void add() {
        List<Experience> experiences = ReadEndWrite.readFileEx();
        System.out.println("ádasdas");
        System.out.println("thêm");
        Integer candidateID = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm");
        String fullName = scanner.nextLine();
        System.out.println("thêm");
        String birthDay = scanner.nextLine();
        System.out.println("thêm");
        Integer phone = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm");
        String email = scanner.nextLine();
        System.out.println("thêm");
        String candidateType = scanner.nextLine();
        System.out.println("thêm");
        Integer canidateCount = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm");
        String expInYear = scanner.nextLine();
        System.out.println("thêm");
        String proSkill = scanner.nextLine();
        Experience experience = new Experience(candidateID, fullName, birthDay, phone, email, candidateType, canidateCount, expInYear, proSkill);
        experiences.add(experience);
        ReadEndWrite.writeExperience(experiences);
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}
