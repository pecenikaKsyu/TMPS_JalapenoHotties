public class CarInfoService {
    public void getCarInterestInfo(String carType) {
        if (carType.equals("sedan")) {
            System.out.println("You chose a sedan");
        }
        if (carType.equals("pickup")) {
            System.out.println("You chose a pickup");
        }
        if (carType.equals("hatchback")) {
            System.out.println("You chose a hatchback");
        }
    }
}