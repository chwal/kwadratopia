package game.engine;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import game.Main;
import game.environment.objects.Tree;
import game.environment.objects.Wall;
import javafx.scene.paint.ImagePattern;

/**
 * Created by chwal on 25/09/15.
 */
public class UserInteraction implements EventHandler {

    Main mainApplication = new Main();

    int menuClickCounter;
    int playerAttackCounter;

    //textures
    Image hero_r = new Image("img/hero_r.png");
    Image hero_l = new Image("img/hero_l.png");
    Image hero_r_attack = new Image("img/hero_r_attack.png");

    public UserInteraction(Main mainApplication) {
        this.mainApplication = mainApplication;
    }


    @Override
    public void handle(Event event) {

        KeyEvent keyEvent = (KeyEvent) event;
        int currentPlayerPositionX = (int) mainApplication.getPlayer().getLayoutX();
        int currentPlayerPositionY = (int) mainApplication.getPlayer().getLayoutY();

        if (keyEvent.getCode().equals(KeyCode.W) || keyEvent.getCode().equals(KeyCode.UP)) {
            if (!(mainApplication.getWorld().getMap_level_1()[currentPlayerPositionX / 40][currentPlayerPositionY / 40 - 1].getColision())) {
                mainApplication.getPlayer().setLayoutY(mainApplication.getPlayer().getLayoutY() - 40);
            }
        }
        if (keyEvent.getCode().equals(KeyCode.S) || keyEvent.getCode().equals(KeyCode.DOWN)) {
            if (!(mainApplication.getWorld().getMap_level_1()[currentPlayerPositionX / 40][currentPlayerPositionY / 40 + 1].getColision())) {
                mainApplication.getPlayer().setLayoutY(mainApplication.getPlayer().getLayoutY() + 40);
            }
        }
        if (keyEvent.getCode().equals(KeyCode.A) || keyEvent.getCode().equals(KeyCode.LEFT)) {
            if (!(mainApplication.getWorld().getMap_level_1()[currentPlayerPositionX / 40 - 1][currentPlayerPositionY / 40].getColision())) {
                mainApplication.getPlayer().setFill(new ImagePattern(hero_l));
                mainApplication.getPlayer().setLayoutX(mainApplication.getPlayer().getLayoutX() - 40);
            }
        }
        if (keyEvent.getCode().equals(KeyCode.D) || keyEvent.getCode().equals(KeyCode.RIGHT)) {
            if (!(mainApplication.getWorld().getMap_level_1()[currentPlayerPositionX / 40 + 1][currentPlayerPositionY / 40].getColision())) {
                mainApplication.getPlayer().setFill(new ImagePattern(hero_r));
                mainApplication.getPlayer().setLayoutX(mainApplication.getPlayer().getLayoutX() + 40);
            }
        }

        if (keyEvent.getCode().equals(KeyCode.ESCAPE)) {
            if (menuClickCounter % 2 != 0) {
                mainApplication.showGameScene();
                menuClickCounter++;
            } else {
                mainApplication.showMenuScene();
                menuClickCounter++;
            }
        }

        if (keyEvent.getCode().equals(KeyCode.F)) {
            if (playerAttackCounter % 2 != 0) {
                mainApplication.getPlayer().setFill(new ImagePattern(hero_r));
                playerAttackCounter++;
            } else {
                mainApplication.getPlayer().setFill(new ImagePattern(hero_r_attack));
                playerAttackCounter++;
            }
        }
    }


    // TODO: Use this method somehow in code above
    public static boolean allInstanceOf(Class<?> cls, Object... objs) {
        //Utility function that uses the reflection counterpart of instanceof, Class.isInstance():
        //Usage:  allInstanceOf(String.class, "aaa", "bbb"); // => true
        for (Object o : objs) {
            if (!cls.isInstance(o)) {
                return false;
            }
        }
        return true;
    }
}
