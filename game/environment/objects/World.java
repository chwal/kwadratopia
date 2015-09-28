package game.environment.objects;

import game.environment.WorldObject;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

import static game.engine.Library.createRectangeOn;

/**
 * Created by chwal on 15/09/15.
 */

public class World {

    public World(){
        Grass grass = new Grass();
        Wall wall = new Wall();
        Water water = new Water();
        Way way = new Way();
        // 32 x
        // 18 y
        map_level_1 = new WorldObject[][]   {{grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, way, grass, grass, grass, grass},
                                    {way, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, way, grass,  grass},
                                    {way, way, way, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, way, way, grass,  grass},
                                    {grass, way, way, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, way, grass, grass,  grass},
                                    {grass, grass, way, way, grass, grass, grass, grass, grass, grass, grass, grass, grass, way, grass, grass, grass,  grass},
                                    {grass, grass, grass, way, way, grass, grass, grass, grass, grass, grass, grass, way, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, way, way, way, way, grass, grass, grass, way, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, wall, way, wall, grass, way, way, way, way, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, wall, wall, way, wall, grass, way, grass, way, way, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, wall, wall, wall, grass, grass, grass, way, grass, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, wall, grass, grass, grass, grass, grass, way, grass, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, grass, grass, grass, grass, way, way, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, way, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, way, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, grass, grass, grass, grass, way, way, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, wall, wall, grass, grass, way, grass, wall, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, wall, wall, wall, wall, way, wall, wall, wall, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, grass, wall, grass, grass, way, grass, wall, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, grass, wall, grass, way, way, grass, wall, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, water, grass, grass, wall, grass, way, way, grass, wall, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, water, grass, wall, grass, way, way, way, wall, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, water, water, water, water, wall, grass, way, way, grass, wall, grass, grass, grass, grass, grass,  grass},
                                    {grass, water, grass, water, water, grass, wall, grass, way, way, way, wall, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, water, water, grass, grass, wall, grass, grass, way, grass, wall, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, water, water, grass, wall, wall, wall, wall, way, wall, wall, wall, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, water, grass, wall, wall, grass, grass, way, grass, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, water, grass, grass, grass, grass, grass, way, grass, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, grass, grass, grass, grass, way, way, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, way, grass, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, way, way, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, way, grass, grass, grass, grass, grass,  grass},
                                    {grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, grass, way, way, grass, grass, grass, grass, grass}};
    }


    WorldObject[][] map_level_1;
    Wall wall;


    public WorldObject[][] getMap_level_1(){
        return map_level_1;
    }

    public void paintMapOnGroup(Group group){
        Random random = new Random();
        for (int x = 0; x <= this.map_level_1.length-1; x++){
            for(int y = 0; y <= this.map_level_1[0].length-1; y++){
                if(this.map_level_1[x][y] instanceof Grass) {
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

    public void loadWorldObjectsOnGroup(Group group){
        Random random = new Random();
        for (int x = 0; x <= this.map_level_1.length-1; x++){
            for(int y = 0; y <= this.map_level_1[0].length-1; y++){
                if(this.map_level_1[x][y] instanceof Wall) {
                    Rectangle wall = new Rectangle(40, 40);
                    wall.setLayoutX(x * 40);
                    wall.setLayoutY(y * 40);
                    if (random.nextInt(10) % 2 == 0) {
                        createRectangeOn(group, wall, Color.web("0x56584E", 1.0));
                    } else{
                        createRectangeOn(group, wall, Color.web("0x5B5D53", 1.0));
                    }
                }else if(this.map_level_1[x][y] instanceof Water){
                    Rectangle water = new Rectangle(40, 40);
                    water.setLayoutX(x * 40);
                    water.setLayoutY(y * 40);
                    if (random.nextInt(10) % 3 == 0) {
                        createRectangeOn(group, water, Color.web("0x6081B1", 1.0));
                    } else{
                        createRectangeOn(group, water, Color.web("0x5D7DAB", 1.0));
                    }
                }else if(this.map_level_1[x][y] instanceof Way){
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

    public void generateForestOnGroup(Group group){
        Random random = new Random();

        for(int i = 0; i < 500; i++){
            int x = random.nextInt(32);
            int y = random.nextInt(18);

            if(map_level_1[x][y] instanceof Grass){
                Tree tree = new Tree(x, y);
                map_level_1[x][y] = tree;
                group.getChildren().add(tree);
            }
        }
    }

}
