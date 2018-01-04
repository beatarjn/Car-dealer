package dealer;

public class Ford extends Car {

    private String carModel;
    private boolean hasAirConditioning;
    private double averageFuelConsumption100Km;
    private String radioType;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public double getAverageFuelConsumption100Km() {
        return averageFuelConsumption100Km;
    }

    public void setAverageFuelConsumption100Km(double averageFuelConsumption100Km) {
        this.averageFuelConsumption100Km = averageFuelConsumption100Km;
    }

    public String getRadioType() {
        return radioType;
    }

    public void setRadioType(String radioType) {
        this.radioType = radioType;
    }

    public Ford(String color, String bodyworkType, String engineType, double engineCapacity,
                Integer yearOfProduction, Integer odometer, Integer yearOfFirstRegistration, double price,
                String carModel, boolean hasAirConditioning, double averageFuelConsumption100Km, String radioType) {
        super(color, bodyworkType, engineType, engineCapacity, yearOfProduction, odometer, yearOfFirstRegistration, price);
        setCarModel(carModel);
        setAverageFuelConsumption100Km(averageFuelConsumption100Km);
        setHasAirConditioning(hasAirConditioning);
        setRadioType(radioType);

    }

    @Override
    public String additionalEquipment() {

        String additionalEquipment="";

        if (isHasAirConditioning()){
            additionalEquipment = "air conditioning";

        } else {
            additionalEquipment = "no air conditioning";
        }

        return "Additional equipment: " + additionalEquipment + ", " + getRadioType();
    }
}
