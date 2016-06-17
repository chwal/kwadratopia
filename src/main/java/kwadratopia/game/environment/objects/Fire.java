package kwadratopia.game.environment.objects;

import kwadratopia.game.environment.WorldObject;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

/**
 * Created by chwal on 15/09/15.
 */
public class Fire extends WorldObject {

    public Fire(int x, int y){

        super(40, 40, true);
        setLayoutX(x * 40);
        setLayoutY(y * 40);

        //texture
        Image img0 = new Image("sprites/structures/fireplace_1.png");
        this.setFill(new ImagePattern(img0));
    }

}
