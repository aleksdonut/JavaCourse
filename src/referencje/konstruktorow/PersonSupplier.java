package referencje.konstruktorow;

@FunctionalInterface
interface PersonSupplier {
    Person get(String[] fn, String[] ln, int[] a);
}
