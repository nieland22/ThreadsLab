package edu.up.cs301threadslab;

public class StarThread extends Thread {

    private AnimationView animationView;




    public StarThread(AnimationView animationView){
        this.animationView=animationView;
    }


    @Override
    public void run(){
        while(true){
            animationView.postInvalidate();
            try {
                sleep(50);
            } catch (InterruptedException e) {
                //
            }
        }
    }

}
