package klasy.wewnetrzne;

public class CompareNumbers {
    public static void main(String[] args) {
        int[] tab = {5, 10, -8, -23, 1009, 2938, 153, 24};
        
        BiggestNumber biggestNumber = new BiggestNumber() {
            @Override
            public int takeBiggest(int[] tab) {
                if (tab == null)
                    throw new NullPointerException("Argument can't be null");
                if (tab.length == 0)
                    throw new IllegalArgumentException("Array has to have at least 1 value");
                int biggestNumber = tab[0];
                for (int i = 0; i < tab.length; i++) {
                    if (biggestNumber < tab[i])
                        biggestNumber = tab[i];
                }
                return biggestNumber;
            }
        };

        System.out.println("Biggest number is " + biggestNumber.takeBiggest(tab));
    }
}
