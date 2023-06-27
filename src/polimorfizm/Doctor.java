package polimorfizm;

class Doctor extends Person {
    private double bonus;

    public Doctor(String name, String surname, double payment, double bonus) {
        super(name, surname, payment);
        this.bonus = bonus;
    }

    public String getInfo() {
        return super.getInfo() + ", bonus: " + getBonus();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
