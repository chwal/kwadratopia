package kwadratopia.game.engine;

import kwadratopia.game.Main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by chwal on 16/09/15.
 */
public class GameLoop extends Thread {
    private Logger logger = Logger.getLogger(this.getClass().getName()); ;
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
                logger.log(Level.SEVERE, e.toString());

            }

            // TODO: Implement movement into own thread
            // TODO: Implement some clock method for later purposes

        }
    }
}
