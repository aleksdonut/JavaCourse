package polimorfizm;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

//        Animal[] animals = new Animal[3];
//        animals[0] = new Animal("Kotopies");
//        animals[1] = new Cat("Kot");
//        animals[2] = new Dog("Pies");
//
//        changeAnimalName(animals[0], "Pieseł");
//
//        animals[0].giveSound();
//        animals[1].giveSound();
//        animals[2].giveSound();

//        Animal cat = new Cat("Kot");
//        Animal dog = new Dog("Pies");
//
//        if (dog instanceof Dog) {
//            Dog specificDog = (Dog)dog;
//            specificDog.bark();
//        }
//
//        if (cat instanceof Cat) {
//            ((Cat)cat).meow();
//        }

        Animal animal = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cat - 1, Dog - 2");
        int option = scanner.nextInt();
        if (option == 1) {
            animal = new Cat("Teodor");
        } else if (option == 2) {
            animal = new Dog("Tiga");
        }

        if (animal instanceof Dog) {
            ((Dog)animal).bark();
        } else if (animal instanceof Cat) {
            ((Cat)animal).meow();
        }

    }

//    private static void changeAnimalName(Animal animal, String newName) {
//        animal.setName(newName);
//    }
}
