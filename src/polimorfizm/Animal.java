package polimorfizm;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void giveSound() {
        System.out.println("I'm an animal and my name is " + name);
    }
}
