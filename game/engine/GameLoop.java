package game.engine;

import game.Main;
import game.environment.objects.Wall;

/**
 * Created by chwal on 16/09/15.
 */
public class GameLoop extends Thread {
    private int remainingSteps = 0;

    private Main mainApplication;

    public GameLoop(Main mainApplication)
    {
        this.mainApplication = mainApplication;
    }

    @Override
    public void run()
    {
        while(!Thread.interrupted())
        {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            Move();

        }
    }

    private void Move(){
        int x = (int) mainApplication.getPlayer().getLayoutX() / 40;
        int y = (int) mainApplication.getPlayer().getLayoutY() / 40;


        //check if one can't go anymore
        if (((mainApplication.getWorld().getMap_level_1()[x][y-1] instanceof Wall)) &&
            ((mainApplication.getWorld().getMap_level_1()[x-1][y] instanceof Wall)) &&
            ((mainApplication.getWorld().getMap_level_1()[x][y+1] instanceof Wall)) &&
            ((mainApplication.getWorld().getMap_level_1()[x+1][y] instanceof Wall)))
        {

        }


    }

}
