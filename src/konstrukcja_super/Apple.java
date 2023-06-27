package konstrukcja_super;

class Apple extends Fruit{
    private String variety;
    public static final String TYPE = "apple";

    public Apple(int weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    String getInfo() {
        return super.getInfo() + " , variety of fruit: " + getVariety();
    }
}
