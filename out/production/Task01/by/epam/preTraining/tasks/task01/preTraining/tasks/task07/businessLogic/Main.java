package by.epam.preTraining.tasks.task07.businessLogic;

import by.epam.preTraining.tasks.task07.logic.storage.TaxiPark;
import by.epam.preTraining.tasks.task07.logic.objects.TaxiCar;
import by.epam.preTraining.tasks.task07.logic.functional.CarFunctions;

public class Main {

    public static void main(String[] args) {
        TaxiCar taxiCar1 = new TaxiCar("car1","BMW", "Sedan", 100000, 2005, 3, 10000.0, 4, 0.55);
        TaxiCar taxiCar2 = new TaxiCar("car2", "Mercedes-Benz", "Minivan", 40000, 2003, 7, 6000.0, 8, 0.85  );
        TaxiCar taxiCar3 = new TaxiCar("car3", "Audi", "Station Wagon", 114000, 2010, 4, 13500.0, 5, 0.60 );

        TaxiCar[]cars = {taxiCar1, taxiCar2, taxiCar3};

        TaxiPark taxiPark = new TaxiPark();
        taxiPark.addCar(cars);

        System.out.println("Size is " + taxiPark.getSize());

        CarFunctions functions = new CarFunctions();
        System.out.println("Cheapest is " + functions.findCheapestTaxi(taxiPark));
        System.out.println("The most expensive car is " + functions.findExpenciveTaxi(taxiPark));
        System.out.println("Longest range is " + functions.findLongestRunning(taxiPark));
        System.out.println("The most capacious taxi is " + functions.findTheMostCapaciousTaxi(taxiPark));

        System.out.println("Remove taxi from taxi park");
        taxiPark.removeCar(2);

        System.out.println("Size is " + taxiPark.getSize());

    }
}
