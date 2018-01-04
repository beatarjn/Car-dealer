package dealer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateCar {

    Scanner scanner = new Scanner(System.in);

    private final int EXIT =0;
    private final int MAZDA = 1;
    private final int FORD = 2;
    private final int OPEL = 3;



    public void createCar() throws ParseException {
        System.out.println("Choose car type you would like to add: ");
        int option = scanner.nextInt();

        switch (option) {
            case MAZDA:
                System.out.println("Chosen car: MAZDA");
                createMazda();
                break;
            case FORD:
                System.out.println("Chosen car: FORD");
                createFord();
                break;
            case OPEL:
                System.out.println("Chosen car: OPEL");
                createOpel();
                break;
            default:
                System.out.println("Incorrect car type");
        }

        if (option == EXIT) {
            scanner.close();
        } else {
            createCar();
        }


    }

    private void createMazda() {
        System.out.println("Please provide color: ");
        String color = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Please provide bodywork type: ");
        String bodyworkType = scanner.nextLine();

        System.out.println("Please provide engine type: ");
        String engineType = scanner.nextLine();

        System.out.println("Please provide engine capacity: ");
        Double engineCapacity = scanner.nextDouble();

        System.out.println("Please provide year of production: ");
        Integer yearOfProd = scanner.nextInt();

        System.out.println("Please provide current odometer reading: ");
        Integer odometer = scanner.nextInt();

        System.out.println("Please provide year of first registration: ");
        Integer yearOfReg = scanner.nextInt();

        System.out.println("Please provide price: ");
        Double price = scanner.nextDouble();

        System.out.println("Please provide car model: ");
        String carModel = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Is radio available: ");
        boolean radio = scanner.nextBoolean();

        Mazda mazda = new Mazda(color, bodyworkType, engineType, engineCapacity, yearOfProd, odometer, yearOfReg,
                price, carModel, radio);

    }

    private void createFord() {

        System.out.println("Please provide color: ");
        String color = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Please provide bodywork type: ");
        String bodyworkType = scanner.nextLine();

        System.out.println("Please provide engine type: ");
        String engineType = scanner.nextLine();

        System.out.println("Please provide engine capacity: ");
        Double engineCapacity = scanner.nextDouble();

        System.out.println("Please provide year of production: ");
        Integer yearOfProd = scanner.nextInt();

        System.out.println("Please provide current odometer reading: ");
        Integer odometer = scanner.nextInt();

        System.out.println("Please provide year of first registration: ");
        Integer yearOfReg = scanner.nextInt();

        System.out.println("Please provide price: ");
        Double price = scanner.nextDouble();

        System.out.println("Please provide car model: ");
        String carModel = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Is air conditioning available: ");
        boolean airConditioning = scanner.nextBoolean();

        System.out.println("Please provide average fuel consumption/100km: ");
        Double fuelConsumption = scanner.nextDouble();

        System.out.println("Please provide type of a radio: ");
        String radioType = scanner.nextLine();

        Ford ford = new Ford(color, bodyworkType, engineType, engineCapacity, yearOfProd, odometer, yearOfReg,
                price, carModel, airConditioning, fuelConsumption, radioType);

    }

    private void createOpel() throws ParseException {

        System.out.println("Please provide color: ");
        String color = scanner.nextLine();

        System.out.println("Please provide bodywork type: ");
        String bodyworkType = scanner.nextLine();

        System.out.println("Please provide engine type: ");
        String engineType = scanner.nextLine();

        System.out.println("Please provide engine capacity: ");
        Double engineCapacity = scanner.nextDouble();

        System.out.println("Please provide year of production: ");
        Integer yearOfProd = scanner.nextInt();

        System.out.println("Please provide current odometer reading: ");
        Integer odometer = scanner.nextInt();

        System.out.println("Please provide year of first registration: ");
        Integer yearOfReg = scanner.nextInt();

        System.out.println("Please provide price: ");
        Double price = scanner.nextDouble();

        System.out.println("Please provide car model: ");
        String carModel = scanner.nextLine();

        System.out.println("Is abs available: ");
        boolean abs = scanner.nextBoolean();

        System.out.println("Please provide insurance date: ");
        String dateString = scanner.next();
        DateFormat formatter = new SimpleDateFormat("EEEE dd MMM yyyy");
        Date insuranceDate = formatter.parse(dateString);


        System.out.println("Please provide date of last service: ");
        String dateStr = scanner.next();
        Date lastService = formatter.parse(dateStr);


        System.out.println("Please provide trunk capacity: ");
        Integer trunk = scanner.nextInt();

        Opel opel = new Opel(color, bodyworkType, engineType, engineCapacity, yearOfProd, odometer, yearOfReg,
                price, carModel, abs, insuranceDate, lastService, trunk);


    }


}
