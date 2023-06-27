package polimorfizm;

class Nurse extends Person {
    private double overtime;

    public Nurse(String name, String surname, double payment, double overtime) {
        super(name, surname, payment);
        this.overtime = overtime;
    }

    public String getInfo() {
        return super.getInfo() + ", overtime: " + getOvertime();
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
