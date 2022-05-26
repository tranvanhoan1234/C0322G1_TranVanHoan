package ss7_abstraction.thuc_hanh.class_animal;

public class Chicken extends Animal implements Idible {
    @Override
    public String makeSound() {
        return "tran van hoàn";
    }

    @Override
    public String howToEat() {
        return "tran van hoan";
    }
}
