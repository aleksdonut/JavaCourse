package polimorfizm;

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("I'm a cat and my name is " + getName());
    }

    public void meow() {
        System.out.println("Meow meow");
    }
}
