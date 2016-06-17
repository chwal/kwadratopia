package kwadratopia.game.player;

import kwadratopia.game.environment.WorldObject;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

/**
 * Created by chwal on 15/09/15.
 */
public class Player extends WorldObject {

    public Player(int x, int y){
        super(40, 40, true);
        setLayoutX(x * 40);
        setLayoutY(y * 40);

        //texture
        Image img = new Image("sprites/player/hero_r.png");
        this.setFill(new ImagePattern(img));
    }

    public double getPlayerPositionX(){
        return this.getLayoutX() / 40;
    }

    public double getPlayerPositionY(){
        return this.getLayoutY() / 40;
    }
}
