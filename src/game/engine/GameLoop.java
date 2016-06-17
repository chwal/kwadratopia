package game.engine;

import game.Main;
import game.environment.WorldObject;
import game.environment.objects.Wall;
import game.environment.objects.World;

/**
 * Created by chwal on 16/09/15.
 */
public class GameLoop extends Thread {
    private int remainingSteps = 0;

    private Main mainApplication;

    public GameLoop(Main mainApplication) {
        this.mainApplication = mainApplication;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // TODO: Implement movement into own thread
            // TODO: Implement some clock method for later purposes

        }
    }
}