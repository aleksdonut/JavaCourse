package tablice.wielowymiarowe;

public class Multidimensional {
    public static void main(String[] args) {
        int[][] tab = new int[3][3];
        tab[0][0] = 5;
        tab[1][1] = 5;
        tab[2][2] = 5;

        int[][] tab1 = new int[3][];
        tab1[0] = new int[3];
        tab1[1] = new int[2];
        tab1[2] = new int[1];

        String[] firstName = {"Jan", "Kasia", "Basia"};
        String[] lastName = {"Kowalski", "Nowakowska", "Wadecka"};

        String[][] firstLast = {firstName, lastName};

        System.out.println(firstLast[0][0] + " " + firstLast[1][0]);
        System.out.println(firstLast.length);
        System.out.println(firstLast[0].length);
    }
}
