import models.Car;
import models.Client;

public class Order {

    Car carNr;
    Client client;

    Order(Car number, Client client){
        this.carNr = number;
        this.client = client;
    }


}

