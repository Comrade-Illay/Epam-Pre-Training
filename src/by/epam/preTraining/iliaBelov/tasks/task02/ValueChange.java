package by.epam.preTraining.iliaBelov.tasks.task04;

public class ValueChange {
    public static  void change(int a, int b){
        a += b;
        b = a - b;
        a = a - b;
    }
}
