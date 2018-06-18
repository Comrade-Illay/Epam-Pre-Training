package by.epam.preTraining.iliaBelov.tasks.task04;

public class Sequence {
   public static boolean increasingSequence(int a){
       return ((a / 1000) % 10) < ((a / 100) % 10) && ((a / 10) % 10) < a % 10;
   }
    public static boolean decreasingSequence(int a){
        return ((a / 1000) % 10) > ((a / 100) % 10) && ((a / 10) % 10) > a % 10;
    }
}
