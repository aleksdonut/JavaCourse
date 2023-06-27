package skladowe.statyczne;

import java.util.Scanner;

public class University {
    private static boolean FLAG = true;
    private static int EXIT = 0;
    private static int ADD_STUDENT = 1;
    private static int PRINT_STUDENTS = 2;
    private static int MAX_STUDENTS = 10;
    static Student[] students = new Student[MAX_STUDENTS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (FLAG) {
            System.out.println("Choose one option");
            System.out.println(EXIT + " - End of program");
            System.out.println(ADD_STUDENT + " - Add a student");
            System.out.println(PRINT_STUDENTS + " - Print enrolment students");
            System.out.println("Enter your option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 0:
                    FLAG = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    printStudents();
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        }
    }

    public static void printStudents() {
        for (int i = 0; i<Student.getStudentCounter(); i++) {
            System.out.println(i+1 + " " + students[i].getName()+ " " + students[i].getSurname() + " " + students[i].getIndexNumber());
        }
    }

    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        if (Student.getStudentCounter() == MAX_STUDENTS) {
            System.out.println("Enrolment is over!");
        } else {
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("Enter your surname");
            String surname = scanner.nextLine();
            System.out.println("Enter your index number");
            String indexNumber = scanner.nextLine();
            Student student = new Student(name, surname, indexNumber);
            int counter = Student.getStudentCounter();
            students[counter] = student;
            Student.setStudentCounter(Student.getStudentCounter()+1);
        }
    }
}
