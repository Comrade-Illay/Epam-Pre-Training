package by.epam.preTraining.iliaBelov.tasks.task07.logic.objects;

public class PassCar extends Car {

    final static String CAR_TYPE = "PassCar";
    private int numSeats;

    public PassCar(){
        super();
    }

    public PassCar(String carCode, String model, String type, int mileage, int modelYear, int maxPassengers, double carPrice, int numSeats) {
        super(carCode, model, type, mileage, modelYear, maxPassengers, carPrice);
        super.setType(CAR_TYPE);
        this.numSeats = numSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassCar passCar = (PassCar) o;

        return numSeats == passCar.numSeats;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numSeats;
        return result;
    }

    @Override
    public String toString() {
        return "PassCar{" +
                "numSeats = " + numSeats +
                "carCode = '" + carCode + '\'' +
                ", model = '" + model + '\'' +
                ", type = '" + type + '\'' +
                ", running = " + mileage+
                ", modelYear = " + modelYear +
                ", vehPrice = " + carPrice +
                ", maxPassengers = " + maxPassengers +
                '}';
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
}
