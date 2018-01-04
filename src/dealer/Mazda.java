package dealer;

public class Mazda extends Car {

    private String carModel;
    private boolean hasRadio;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public boolean isHasRadio() {
        return hasRadio;
    }

    public void setHasRadio(boolean hasRadio) {
        this.hasRadio = hasRadio;
    }

    public Mazda(String color, String bodyworkType, String engineType, double engineCapacity, Integer yearOfProduction,
                 Integer odometer, Integer yearOfFirstRegistration, double price, String carModel, boolean hasRadio) {
        super(color, bodyworkType, engineType, engineCapacity, yearOfProduction, odometer, yearOfFirstRegistration, price);
        setCarModel(carModel);
        setHasRadio(hasRadio);
    }

    @Override
    public String additionalEquipment() {
        String additionalEquipment="";

        if (isHasRadio()){
            additionalEquipment = "radio";

        } else {
            additionalEquipment = "no radio";
        }

        return "Additional equipment: " + additionalEquipment ;
    }
}
