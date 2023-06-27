package metody.klasyobject;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        Computer computer1 = new Computer("Lenovo", 16);
        Computer computer2 = new Computer("Lenovo", 16);
        Computer computer3 = new Computer("Huawei", 14);
        Computer computer4 = new Computer("Dell", 13);
        Computer computer5 = new Computer("Asus", 15);
        Computer computer6 = new Computer("Lenovo", 16);

        dataStore.add(computer1);
        dataStore.add(computer2);
        dataStore.add(computer3);
        dataStore.add(computer4);
        dataStore.add(computer5);
        dataStore.add(computer6);

        System.out.println(dataStore.checkAvailability(computer2));
        dataStore.getInfo();
    }
}
