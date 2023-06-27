package polimorfizm;

public class HospitalApp {
    public static void main(String[] args) {
        Person doctor = new Doctor("Jan", "Kowalski", 10000.0, 1000.0);
        Person nurseOne = new Nurse("Anna", "Kowalska", 5000.0, 24.0);
        Person nurseTwo = new Nurse("Hanna", "Nowak", 7500.0, 12.0);

        Hospital hospital = new Hospital();
        hospital.addPerson(doctor);
        hospital.addPerson(nurseOne);
        hospital.addPerson(nurseTwo);

        hospital.getInfo();
    }
}
