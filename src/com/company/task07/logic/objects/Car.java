package by.epam.preTraining.iliaBelov.tasks.task07.logic.objects;

import java.util.Objects;

public abstract class Car {

    String carCode;
    String model;
    String type;

    int mileage;
    int modelYear;
    int maxPassengers;
    double carPrice;

    public Car(String carCode, String model, String type, int mileage, int modelYear, int maxPassengers, double carPrice){
        this.carCode = carCode;
        this.model = model;
        this.type = type;
        this.mileage = mileage;
        this.modelYear = modelYear;
        this.maxPassengers = maxPassengers;
        this.carPrice = carPrice;
    }

    public Car(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (mileage != car.mileage) return false;
        if (modelYear != car.modelYear) return false;
        if (maxPassengers != car.maxPassengers) return false;
        if (Double.compare(car.carPrice, carPrice) != 0) return false;
        if (carCode != null ? !carCode.equals(car.carCode) : car.carCode != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return type != null ? type.equals(car.type) : car.type == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = carCode != null ? carCode.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + mileage;
        result = 31 * result + modelYear;
        result = 31 * result + maxPassengers;
        temp = Double.doubleToLongBits(carPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carCode='" + carCode + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", mileage=" + mileage +
                ", modelYear=" + modelYear +
                ", maxPassengers=" + maxPassengers +
                ", carPrice=" + carPrice +
                '}';
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }


}
