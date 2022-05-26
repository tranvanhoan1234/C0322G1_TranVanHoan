package ss7_abstraction.thuc_hanh.class_animal;

public class AbstractAndInterfaceTests  {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Chicken) {
               Chicken edible =(Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruit =new Fruit [2];
           fruit[0] =new Oranger();
           fruit[1]=new Apple();
        for (Fruit f: fruit) {
            System.out.println(f.howToEat());
        }
    }

}


