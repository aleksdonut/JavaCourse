package typ.generyczny;

public class StringContainer {
    private String[] array;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void printArray() {
        for (String s : array) {
            System.out.println(s);
        }
    }
}
