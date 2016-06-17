package game.player;

import game.environment.WorldObject;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

/**
 * Created by chwal on 15/09/15.
 */
public class Player extends WorldObject {

    public Player(int x, int y){
        super(40, 40, true);
        setLayoutX(x * 40);
        setLayoutY(y * 40);

        //texture
        Image img = new Image("img/hero_r.png");
        this.setFill(new ImagePattern(img));
    }
}
