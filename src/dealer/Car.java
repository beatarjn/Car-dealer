package dealer;

import java.time.Year;

public abstract class Car {

    private String color;
    private String bodyworkType;
    private String engineType;
    private double engineCapacity;
    private Integer yearOfProduction;
    private Integer odometer;
    private Integer yearOfFirstRegistration;
    private double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyworkType() {
        return bodyworkType;
    }

    public void setBodyworkType(String bodyworkType) {
        this.bodyworkType = bodyworkType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Integer getOdometer() {
        return odometer;
    }

    public void setOdometer(Integer odometer) {
        this.odometer = odometer;
    }

    public Integer getYearOfFirstRegistration() {
        return yearOfFirstRegistration;
    }

    public void setYearOfFirstRegistration(Integer yearOfFirstRegistration) {
        this.yearOfFirstRegistration = yearOfFirstRegistration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public Car(String color, String bodyworkType, String engineType, double engineCapacity, Integer yearOfProduction,
               Integer odometer, Integer yearOfFirstRegistration, double price) {
        setColor(color);
        setBodyworkType(bodyworkType);
        setEngineType(engineType);
        setEngineCapacity(engineCapacity);
        setYearOfProduction(yearOfProduction);
        setOdometer(odometer);
        setYearOfFirstRegistration(yearOfFirstRegistration);
        setPrice(price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract String additionalEquipment();

    public double averageNumberOfKmPerYear(){

        double averageKm =0;
        int year = Year.now().getValue();
        averageKm = odometer/ (year-yearOfProduction);
        return averageKm;

    }
}


