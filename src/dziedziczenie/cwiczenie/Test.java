package dziedziczenie.cwiczenie;

public class Test {
    public static void main(String[] args) {
        Tire tire = new Tire();
        tire.setSerialNumber("ABC123");
        tire.setProducer("Michellin");
        tire.setModel("Pilot Sport 4S");
        tire.setSize(20);
        tire.setWidth(305);
        tire.setProductSeries("Sport tires");

        System.out.println(tire.getSerialNumber() + " " + tire.getProducer() + " " + tire.getModel() + " " + tire.getSize() + " " + tire.getWidth() + " " + tire.getProductSeries());
    }
}
