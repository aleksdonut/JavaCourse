package tablice.wielowymiarowe;

public class MultidimensionalArray {
    public static void main(String[] args) {
        double[][] table = new double[3][3];
        table[0][0] = 1.0;
        table[0][1] = 1.5;
        table[0][2] = 2.0;
        table[1][0] = 1.5;
        table[1][1] = 2.0;
        table[1][2] = 2.5;
        table[2][0] = 2.0;
        table[2][1] = 2.5;
        table[2][2] = 3.0;

        //sum of the left and right diagonals
        System.out.println((table[0][0]*table[1][1]*table[2][2])+(table[0][2]*table[1][1]*table[2][0]));
        //product of the middle row and middle column
        System.out.println((table[1][0]*table[1][1]*table[1][2])+(table[0][1]*table[1][1]*table[2][1]));
        //sum of all elements located at the edge of the array
        System.out.println(table[0][0]+table[0][1]+table[0][2]+table[1][2]+table[2][2]+table[2][1]+table[2][0]+table[1][0]);

    }
}
