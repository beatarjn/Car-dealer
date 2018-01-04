package dealer;


import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static javafx.application.Platform.exit;

public class CarDealership implements Management {

    private Car[] carList;
    private Integer numberOfSpots;
    Scanner scanner = new Scanner(System.in);

    /*
     * Main loop, that allows to choose option and interaction
     */

    public void controlLoop(Option option) {
        printOptions();
        try {
            option = Option.createFromInt(scanner.nextInt());
            switch (option) {
                case ADD_CAR:
                    addCar();
                    break;
                case SHOW_CARS:
                    showCars();
                    break;
                case SEARCH_CAR:
                    searchCar();
                    break;
                case REMOVE_CAR:
                    removeCar();
                    break;
                case EXIT:
                    exit();
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect data, car was not added");
        } catch (NumberFormatException | NoSuchElementException e) {
            System.out.println("There is no option like this, please try again: ");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (option == Option.EXIT) {
            scanner.close();
        } else {
            controlLoop(option);
        }
    }

    private void searchCar() {


    }

    private void printOptions() {
        System.out.println("Choose option: ");
        for (Option o : Option.values()) {
            System.out.println(o);
        }
    }

    @Override
    public void addCar() throws ParseException {
        CreateCar newCar = new CreateCar();
        newCar.createCar();

    //wykorzystać createCar() z CreateCar
    }


    @Override
    public void showCars() {

        try {
            for (int i = 0; i < carList.length; i++) {
                System.out.println(carList[i]);

            }
        } catch (NullPointerException e) {
            System.out.println("No cars available");

        }

    }

    @Override
    public Car removeCar() {
        return null;
    }

    @Override
    public Car printCarDetails() {
        return null;
    }
}
