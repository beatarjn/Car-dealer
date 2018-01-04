package dealer;

import java.util.Date;

public class Opel extends Car {

    private String carModel;
    private boolean hasABS;
    private Date insuranceDate;
    private Date dateOfLastService;
    private Integer trunkCapacity;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public boolean isHasABS() {
        return hasABS;
    }

    public void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }

    public Date getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(Date insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

    public Date getDateOfLastService() {
        return dateOfLastService;
    }

    public void setDateOfLastService(Date dateOfLastService) {
        this.dateOfLastService = dateOfLastService;
    }

    public Integer getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(Integer trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    public Opel(String color, String bodyworkType, String engineType,
                double engineCapacity, Integer yearOfProduction, Integer odometer, Integer yearOfFirstRegistration,
                double price, String carModel, boolean hasABS, Date insuranceDate, Date dateOfLastService, Integer trunkCapacity) {
        super(color, bodyworkType, engineType, engineCapacity, yearOfProduction, odometer, yearOfFirstRegistration, price);
        setCarModel(carModel);
        setHasABS(hasABS);
        setInsuranceDate(insuranceDate);
        setDateOfLastService(dateOfLastService);
        setTrunkCapacity(trunkCapacity);
    }

    @Override
    public String additionalEquipment() {
        String additionalEquipment="";

        if (isHasABS()){
            additionalEquipment = "ABS";

        } else {
            additionalEquipment = "no ABS";
        }

        return "Additional equipment: " + additionalEquipment + ", " + getTrunkCapacity();
    }
}
