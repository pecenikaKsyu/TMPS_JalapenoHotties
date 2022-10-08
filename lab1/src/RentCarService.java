//S: Single Responsibility Principle

import models.Car;
import models.Client;

public class RentCarService {
    public void orderCar(Car carNo, Client client) {
        System.out.println("You can order the car!");
    }
}
/*
public class RentCarService {

    public Order orderCar(String carNo, Client client) {
        //client order car
        return order;
    }
    public models.Car findCar(String carNo) {
        //find car by number
        return car;
    }
    public void printOrder(Order order) {
        //print order
    }
    public void getCarInterestInfo(String carType) {
        if (carType.equals("sedan")) {
            //do some job
        }
        if (carType.equals("pickup")) {
            //do some job
        }
        if (carType.equals("van")) {
            //do some job
        }
    }
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            //write email
            //use JavaMailSenderAPI
        }
    }
}*/

