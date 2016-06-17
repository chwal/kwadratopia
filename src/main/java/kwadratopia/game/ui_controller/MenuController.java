package kwadratopia.game.ui_controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import kwadratopia.game.Main;
import kwadratopia.game.engine.UserInteraction;

public class MenuController {

    public Button button_1;
    public Button button_2;
    public Button button_3;
    public Button button_4;

    public void button_1(ActionEvent actionEvent) {
        Main mainApp = UserInteraction.getMainApplication();
        mainApp.showGameScene();
    }

    public void button_2(ActionEvent actionEvent) {

    }

    public void button_3(ActionEvent actionEvent) {

    }

    public void button_4(ActionEvent actionEvent) {

    }
}
