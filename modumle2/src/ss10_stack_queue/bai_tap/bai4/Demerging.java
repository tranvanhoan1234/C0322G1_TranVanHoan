package ss10_stack_queue.bai_tap.bai4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        Queue<String> queueMale = new LinkedList<>();
        Queue<String> queueFemale = new LinkedList<>();
        List<Person> list = new ArrayList<>();
        Person person = new Person("hoàn1", "nữ", "22/1995");
        Person person1 = new Person("hoàn2", "nam", "1/33/1991");
        Person person2 = new Person("Hoàn3", "nam", "18/08/1996");

        list.add(person);
        list.add(person1);
        list.add(person2);

        for (Person persons : list) {
            if (persons.getGender().equals("nữ")) {
                queueFemale.add(String.valueOf(persons));
            } else {
                queueMale.add(String.valueOf(persons));
            }
        }
        System.out.println("\tMale list:");
        for (String male : queueMale) {
            System.out.println(male);
        }
        System.out.println("\tFemale list:");
        for (String female : queueFemale) {
            System.out.println(female);
        }
    }
}
