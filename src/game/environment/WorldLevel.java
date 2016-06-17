package game.environment;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import game.environment.objects.*;

import java.util.Random;

import static game.engine.Library.createRectangeOn;

/**
 * Created by chwal on 26/09/15.
 */
public abstract class WorldLevel {

    public void paintMapOnGroup(Group group, WorldObject[][] worldObjects){
        Random random = new Random();
        for (int x = 0; x <= worldObjects.length-1; x++){
            for(int y = 0; y <= worldObjects[0].length-1; y++){
                if(worldObjects[x][y] instanceof Grass) {
                    Rectangle floor = new Rectangle(40, 40);
                    floor.setLayoutX(x * 40);
                    floor.setLayoutY(y * 40);
                    if(random.nextInt(10)%2 ==0){
                        createRectangeOn(group, floor, Color.web("0x6F9923"));
                    }else if(random.nextInt(10)%3 == 1){
                        createRectangeOn(group, floor, Color.web("0x758E2C"));
                    }else{
                        createRectangeOn(group, floor, Color.web("0x6E8933"));
                    }
                }
            }
        }
    }

    public void loadWorldObjectsOnGroup(Group group, WorldObject[][] worldObjects){
        Random random = new Random();
        for (int x = 0; x <= worldObjects.length-1; x++){
            for(int y = 0; y <= worldObjects[0].length-1; y++){
                if(worldObjects[x][y] instanceof Wall) {
                    Rectangle wall = new Rectangle(40, 40);
                    wall.setLayoutX(x * 40);
                    wall.setLayoutY(y * 40);
                    if (random.nextInt(10) % 2 == 0) {
                        createRectangeOn(group, wall, Color.web("0x56584E", 1.0));
                    } else{
                        createRectangeOn(group, wall, Color.web("0x5B5D53", 1.0));
                    }
                }else if(worldObjects[x][y] instanceof Water){
                    Rectangle water = new Rectangle(40, 40);
                    water.setLayoutX(x * 40);
                    water.setLayoutY(y * 40);
                    if (random.nextInt(10) % 3 == 0) {
                        createRectangeOn(group, water, Color.web("0x6081B1", 1.0));
                    } else{
                        createRectangeOn(group, water, Color.web("0x5D7DAB", 1.0));
                    }
                }else if(worldObjects[x][y] instanceof Way){
                    Rectangle water = new Rectangle(40, 40);
                    water.setLayoutX(x * 40);
                    water.setLayoutY(y * 40);
                    if (random.nextInt(10) % 3 == 0) {
                        createRectangeOn(group, water, Color.web("0x938A30", 1.0));
                    } else{
                        createRectangeOn(group, water, Color.web("0x8B832D", 1.0));
                    }
                }
            }
        }
    }

    public void generateForestOnGroup(Group group, WorldObject[][] worldObjects){
        Random random = new Random();

        for(int i = 0; i < 500; i++){
            int x = random.nextInt(32);
            int y = random.nextInt(18);

            if(worldObjects[x][y] instanceof Grass){
                Tree tree = new Tree(x, y);
                worldObjects[x][y] = tree;
                group.getChildren().add(tree);
            }
        }
    }
}
