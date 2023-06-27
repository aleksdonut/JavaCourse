package kolejki;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

class ClientService {
      public static void main(String[] args) {
        Queue<Client> clients = new PriorityQueue<>(new Comparator<Client>() {
            @Override
            public int compare(Client c1, Client c2) {
                return Integer.compare(c1.getOrdersNumber(), c2.getOrdersNumber());
            }
        });
        clients.add(new Client("Karol",2));
        clients.add(new Client("Patrycja",1));
        clients.add(new Client("Andrzej",4));
        clients.add(new Client("Karolina",3));
        //peek() - pobranie obiektu
        //poll() - pobranie obiektu i usunięcie go
        //offer() - dodawanie elementów do LinkedList, dokładnie to samo co add()
        ///add() przy przekroczeniu rozmiaru kolejki ArrayBlockingQueue rzuca wyjątkiem "Queue full", w przypadku użycia offer elementy ponad rozmiar ABQ są pomijane
        System.out.println(clients);

        while (!clients.isEmpty()) {
            System.out.println(clients.poll());
        }

        System.out.println(clients);
    }
}
