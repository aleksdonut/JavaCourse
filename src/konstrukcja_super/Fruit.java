package konstrukcja_super;

class Fruit {
    private int weight;
    private String fruitType;

    public Fruit(int weight, String fruitType) {
        this.weight = weight;
        this.fruitType = fruitType;
    }

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    String getInfo() {
        return "Weight: " + getWeight() + ", fruit type: " + getFruitType();
    }
}
