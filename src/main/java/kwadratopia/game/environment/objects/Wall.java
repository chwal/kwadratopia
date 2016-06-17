package kwadratopia.game.environment.objects;

import kwadratopia.game.environment.WorldObject;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

import java.util.Random;

/**
 * Created by chwal on 16/09/15.
 */
public class Wall extends WorldObject {

    public Wall(int x, int y) {
        super(40, 40, true);
        setLayoutX(x * 40);
        setLayoutY(y * 40);

        Random random = new Random();

        //texture
        if(random.nextInt()%2 == 0){
            Image img0 = new Image("img/brick_0.png");
            this.setFill(new ImagePattern(img0));
        }else {
            Image img1 = new Image("img/brick_1.png");
            this.setFill(new ImagePattern(img1));
        }
    }
}
