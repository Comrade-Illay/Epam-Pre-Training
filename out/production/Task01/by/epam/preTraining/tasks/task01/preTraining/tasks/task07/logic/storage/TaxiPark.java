package by.epam.preTraining.tasks.task07.logic.storage;

import java.util.Arrays;

import by.epam.preTraining.tasks.task07.logic.objects.TaxiCar;

public class TaxiPark {
    private TaxiCar[] cars;
    private int quantity;

    public TaxiPark(){
        this.cars = new TaxiCar[quantity];
    }

    public TaxiPark(TaxiPark carList ){
        cars = carList.cars;
    }

    public int getSize(){
        return quantity;
    }

    public void addCar(TaxiCar... newCars){
        int previousQuantity = quantity;
        quantity += newCars.length;
        cars = Arrays.copyOf(cars, quantity);

        for (int i = 0; i < newCars.length ; i++) {
          cars[i + previousQuantity] = newCars[i];
        }

    }

    public void removeCar(int taxiId) {
        if (taxiId < quantity) {
            int removedElement = quantity - taxiId - 1;
            if (removedElement > 0)
                System.arraycopy(cars, taxiId + 1, cars, taxiId, removedElement);
            cars[--quantity]=null;
        }
    }

    public TaxiCar get(int id){
        if(id<quantity)
            return cars[id];
        return null;
    }

}
