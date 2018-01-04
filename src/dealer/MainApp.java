package dealer;

public class MainApp {

    public static void main(String[] args) {
        final String appName = "Car Dealership";
        System.out.println("**************************************");
        System.out.println("**********  " +appName + "  **********");
        System.out.println("*********       WELCOME      *********");
        System.out.println("**************************************");
        CarDealership carDealership = new CarDealership();
        carDealership.controlLoop(null);
    }


}
