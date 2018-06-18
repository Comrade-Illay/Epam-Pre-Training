package by.epam.preTraining.tasks.task04;

import java.util.Random;

public class HeadsOrTails {

    public static String tossTheCoin(int numOfFlips){

        int heads = 0;
        Random res = new Random();
        for(int i = 0; i <numOfFlips; i++){
            if(res.nextInt(2) == 1)
                heads++;
          }
        return " " + heads + " " + (numOfFlips - heads);
    }
}
