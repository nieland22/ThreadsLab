package edu.up.cs301threadslab;

import java.util.Random;

public class NumberStars extends Thread {

    private StarAnimation starAnimation;

    public NumberStars(StarAnimation starAnimation){
        this.starAnimation=starAnimation;
    }

    @Override
    public void run(){
        Random rand = new Random();
        while(true) {
            //try {
                //sleep(2);
                if (rand.nextInt(2) == 1) {
                    starAnimation.removeStar();
                } else {
                    starAnimation.addStar();
                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
    }
}
