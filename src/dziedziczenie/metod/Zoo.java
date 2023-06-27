package dziedziczenie.metod;

class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor("black");
        Bird bird = new Bird();
        bird.setColor("blue");

        cat.makeSound();
        bird.makeSound();


    }
}
