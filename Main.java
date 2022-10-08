import models.Car;
import models.Client;

public class Main {
    Car toyota = new Car(1, "hatchback", "Corolla", "ice-grey");
    Car BMW = new Car(2, "sedan", "5 series", "white");

    Client first = new Client("Donald Duck", 1);

    Order ord1 = new Order(toyota, first);




}
