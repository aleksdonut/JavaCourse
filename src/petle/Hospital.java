package petle;

import java.util.Scanner;

public class Hospital {
    Scanner scanner = new Scanner(System.in);
    private final int maxPatientsNumbers = 10;
    private Patient[] patients = new Patient[maxPatientsNumbers];
    private int registeredPatiens = 0;

    public void addPatient() {
        if (registeredPatiens == maxPatientsNumbers) {
            System.out.println("Enrolment closed for today, see you tomorrow");
        } else {
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("Enter your surname");
            String surname = scanner.nextLine();
            System.out.println("Enter your PESEL");
            String pesel = scanner.nextLine();
            Patient patient = new Patient(name, surname, pesel);
            patients[registeredPatiens] = patient;
            registeredPatiens++;
        }

    }
    public void printPatients() {
        for (int i = 0; i < registeredPatiens; i++) {
            System.out.println(i+1 + ". " + patients[i].getName() + " " + patients[i].getSurname() + " PESEL:" + patients[i].getPesel());
        }
    }
}
