package klasy.wewnetrzne;

import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] inputTable = {4, 1, 6, 13, 8, 7, 9, 11};
        Sortable sortable = new Sortable() {
            @Override
            public int[] sort(int[] tab) {
                int n = tab.length;
                do {
                    for (int i = 0; i < n - 1; i++) {
                        if (tab[i] > tab[i + 1]) {
                            int tmp = tab[i];
                            tab[i] = tab[i + 1];
                            tab[i + 1] = tmp;
                        }
                    }
                    n--;
                } while (n > 1);
                return tab;
            }
        };
        System.out.println(Arrays.toString(sortable.sort(inputTable)));
    }
}
