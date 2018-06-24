package by.epam.preTraining.iliaBelov.tasks.task10;

public class HanoiTower {

    public static void solveHanoiTower(int numOfRings, char first, char second, char temp){
        if (numOfRings >= 0 ){
            solveHanoiTower(numOfRings - 1, first, second, temp);
            System.out.println(first + " to " + second);
            solveHanoiTower(numOfRings - 1, temp, first, second);
        }
    }
}
