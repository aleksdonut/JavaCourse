package polimorfizm;

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("I'm a dog and my name is " + getName());
    }

    public void bark() {
        System.out.println("Hau hau");
    }
}
