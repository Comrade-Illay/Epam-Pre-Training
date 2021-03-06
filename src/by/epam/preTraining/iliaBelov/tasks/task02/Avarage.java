package by.epam.preTraining.iliaBelov.tasks.task04;

public class Avarage {
        public static double arithmeticMean(int N){
            int a = N%10;
            int b = N/10%10;
            int c = N/100%10;
            int d = N/1000%10;
            int e = N/10_000%10;
            int f = N/100_000%10;
            return (double)(a+b+c+d+e+f)/6;
        }
        public static double geometricMean(int N){
            int a = N%10;
            int b = N/10%10;
            int c = N/100%10;
            int d = N/1000%10;
            int e = N/10_000%10;
            int f = N/100_000%10;
            return Math.pow(a*b*c*d*e*f,1.0/6);
        }

}
