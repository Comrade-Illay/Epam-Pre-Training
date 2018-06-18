package by.epam.preTraining.tasks.task07.logic.objects;

public class TaxiCar extends PassCar{

    final static String CAR_TYPE = "PassCar";
    private double pricePerKilometer;

    public TaxiCar(){
        super.setType(CAR_TYPE);
    }

    @Override
    public String toString() {
        return "TaxiCar{" +
                "  carCode = '" + carCode + '\'' +
                ", model = '" + model + '\'' +
                ", type = '" + type + '\'' +
                ", running = " + mileage+
                ", modelYear = " + modelYear +
                ", vehPrice = " + carPrice +
                ", maxPassengers = " + maxPassengers +
                ", pricePerKilometer = " + pricePerKilometer +
                '}';
    }

    public TaxiCar(String carCode, String model, String type, int mileage, int modelYear, int maxPassengers, double carPrice, int numSeats, double pricePerKilometer) {
        super(carCode, model, type, mileage, modelYear, maxPassengers, carPrice, numSeats);
        super.setType(CAR_TYPE);
        this.pricePerKilometer = pricePerKilometer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TaxiCar taxiCar = (TaxiCar) o;

        return Double.compare(taxiCar.pricePerKilometer, pricePerKilometer) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(pricePerKilometer);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getPricePerKilometer() {
        return pricePerKilometer;
    }

    public void setPricePerKilometer(int pricePerKilometer) {
        this.pricePerKilometer = pricePerKilometer;
    }
}
