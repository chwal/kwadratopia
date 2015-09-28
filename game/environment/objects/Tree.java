package game.environment.objects;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import game.environment.WorldObject;

import java.util.Random;

/**
 * Created by chwal on 15/09/15.
 */
public class Tree extends Rectangle implements WorldObject {

    public Tree(int x, int y){
        super(40, 40);
        setLayoutX(x * 40);
        setLayoutY(y * 40);

        Random random = new Random();

        //texture
        if(random.nextInt(3)%2 == 0){
            Image img0 = new Image("img/tree_0.png");
            this.setFill(new ImagePattern(img0));
        }else if(random.nextInt(3)%3 == 0){
            Image img1 = new Image("img/tree_1.png");
            this.setFill(new ImagePattern(img1));
        }else{
            Image img2 = new Image("img/tree_2.png");
            this.setFill(new ImagePattern(img2));
        }
    }

}
