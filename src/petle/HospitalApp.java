package petle;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        boolean programFlag = true;

        while (programFlag) {
            System.out.println("Choose one option");
            System.out.println("0 - End of program");
            System.out.println("1 - Add a patient");
            System.out.println("2 - Print list of patients in queue");
            System.out.println("Enter your option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "0":
                    programFlag = false;
                    break;
                case "1":
                    hospital.addPatient();
                    break;
                case "2":
                    hospital.printPatients();
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        }
    }
}
