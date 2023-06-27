package rekurencja;

class NumbersAdderRecursion {
    public static void main(String[] args) {
        int number = sum(3);
        System.out.println(number);
    }

    static int sum (int n) {
//        if (n > 1) {
//            return n + sum(n - 1);
//        } else {
//            return 1;
//        }
        return n > 1 ? n + sum(n-1) : 1;
    }

}