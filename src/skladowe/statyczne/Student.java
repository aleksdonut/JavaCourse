package skladowe.statyczne;

class Student {
    private String name;
    private String surname;
    private String indexNumber;
    private static int STUDENT_COUNTER = 0;

    public Student(String name, String surname, String indexNumber) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
    }

    public Student () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public static int getStudentCounter() {
        return STUDENT_COUNTER;
    }

    public static void setStudentCounter(int studentCounter) {
        STUDENT_COUNTER = studentCounter;
    }
}
