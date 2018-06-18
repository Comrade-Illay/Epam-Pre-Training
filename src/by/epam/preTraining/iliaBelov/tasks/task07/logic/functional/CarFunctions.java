package by.epam.preTraining.iliaBelov.tasks.task07.logic.functional;

import by.epam.preTraining.iliaBelov.tasks.task07.logic.objects.TaxiCar;
import by.epam.preTraining.iliaBelov.tasks.task07.logic.storage.TaxiPark;

public class CarFunctions {

    public TaxiCar findCheapestTaxi(TaxiPark carList){
        double min = 999999999;
        TaxiCar minPrice = null;
        for (int i = 0; i < carList.getSize(); i++) {
           if(carList.get(i).getPricePerKilometer() < min){
               min = carList.get(i).getPricePerKilometer();
               minPrice = carList.get(i);
           }
        }
        return minPrice;
    }

    public TaxiCar findExpenciveTaxi(TaxiPark carList){
        double max = 0;
        TaxiCar maxPrice = null;
        for (int i = 0; i < carList.getSize(); i++) {
            if(carList.get(i).getPricePerKilometer() > max){
                max = carList.get(i).getPricePerKilometer();
                maxPrice = carList.get(i);
            }
        }
        return maxPrice;
    }

    public TaxiCar findLongestRunning(TaxiPark carList) {
        int max = 0;
        TaxiCar maxRunningCar = null;
        for (int i = 0; i < carList.getSize(); i++) {
            if (carList.get(i).getMileage() > max) {
                max = carList.get(i).getMileage();
                maxRunningCar = carList.get(i);
            }
        }
        return maxRunningCar;
    }

    public TaxiCar findTheMostCapaciousTaxi(TaxiPark carList) {
        int max = 0;
        TaxiCar maxNumberOfSeats = null;
        for (int i = 0; i < carList.getSize(); i++) {
            if (carList.get(i).getNumSeats() > max) {
                max = carList.get(i).getNumSeats();
                maxNumberOfSeats = carList.get(i);
            }
        }
        return maxNumberOfSeats;
    }

}
