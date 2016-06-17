package kwadratopia.game.environment.objects;

import kwadratopia.game.environment.WorldObject;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

import static kwadratopia.game.engine.Library.addRectangleToGroup;

/**
 * Created by chwal on 15/09/15.
 */

public class World {

    public World() {

        Grass g = new Grass(0,0);
        Wall w = new Wall(0,0);
        Water h = new Water(0,0);
        Way r = new Way(0,0);
        Fire f = new Fire(0, 0);

        // 32 x
        // 18 y
        map_level_3 = new WorldObject[][]{
                {g, g, g, g, g, g, g, g, g, g, g, g, g, r, g, g, g, g},
                {r, g, g, g, g, g, g, g, g, g, g, g, g, g, g, r, g, g},
                {r, r, r, g, g, g, g, g, g, g, g, g, g, g, r, r, g, g},
                {g, r, r, g, g, g, g, g, g, g, g, g, g, g, r, g, g, g},
                {g, g, r, r, g, g, g, g, g, g, g, g, g, r, g, g, g, g},
                {g, g, g, r, r, g, g, g, g, g, g, g, r, g, g, g, g, g},
                {g, g, g, g, r, r, r, r, g, g, g, r, g, g, g, g, g, g},
                {g, g, g, w, r, w, g, r, r, r, r, g, g, g, g, g, g, g},
                {g, g, w, w, r, w, g, r, g, r, r, g, g, g, g, g, g, g},
                {g, g, g, w, w, w, g, g, g, r, g, g, g, g, g, g, g, g},
                {g, g, g, w, g, g, g, g, g, r, g, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, r, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, r, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, w, w, g, g, r, g, w, g, g, g, g, g, g},
                {g, g, g, g, g, w, w, w, w, r, w, w, w, g, g, g, g, g},
                {g, g, g, g, g, g, w, g, g, r, g, w, g, g, g, g, g, g},
                {g, g, g, g, g, g, w, g, r, r, g, w, g, g, g, g, g, g},
                {g, g, g, h, g, g, w, g, r, r, r, w, g, g, g, g, g, g},
                {g, g, g, g, h, g, w, g, r, f, r, w, g, g, g, g, g, g},
                {g, g, h, h, h, h, w, g, r, r, r, w, g, g, g, g, g, g},
                {g, h, g, h, h, g, w, g, r, r, r, w, g, g, g, g, g, g},
                {g, g, h, h, g, g, w, g, g, r, g, w, g, g, g, g, g, g},
                {g, g, h, h, r, w, w, w, w, r, w, w, w, g, g, g, g, g},
                {g, g, g, h, r, w, w, g, g, r, g, g, g, g, g, g, g, g},
                {g, g, g, h, r, r, r, r, r, r, g, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, r, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, r, r, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, g, r, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, g, r, r, g, g, g, g, g}};

        map_level_2 = new WorldObject[][]{
                {g, g, g, g, g, g, g, g, g, g, g, g, g, r, g, g, g, g},
                {r, g, g, g, g, g, g, g, g, g, g, g, g, g, g, r, g, g},
                {r, r, r, g, g, g, g, g, g, g, g, g, g, g, r, r, g, g},
                {g, r, r, g, g, g, g, g, g, g, g, g, g, g, r, g, g, g},
                {g, g, r, r, g, g, g, g, g, g, g, g, g, r, g, g, g, g},
                {g, g, g, r, r, g, g, g, g, g, g, g, r, g, g, g, g, g},
                {g, g, g, g, r, r, r, r, g, g, g, r, g, g, g, g, g, g},
                {g, g, g, g, r, g, g, r, r, r, r, g, g, g, g, g, g, g},
                {g, g, g, g, r, g, g, r, g, r, r, g, g, g, g, g, g, g},
                {g, g, g, g, w, w, g, g, g, r, g, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, r, g, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, r, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, r, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, w, w, g, g, r, g, w, g, g, g, g, g, g},
                {g, g, g, g, g, w, w, w, w, r, w, w, w, g, g, g, g, g},
                {g, g, g, g, g, g, w, g, g, r, g, w, g, g, g, g, g, g},
                {g, g, g, g, g, g, w, g, r, r, g, w, g, g, g, g, g, g},
                {g, g, g, h, g, g, w, g, r, r, r, w, g, g, g, g, g, g},
                {g, g, g, g, h, g, w, g, r, f, r, w, g, g, g, g, g, g},
                {g, g, h, h, h, h, w, g, r, r, r, w, g, g, g, g, g, g},
                {g, h, g, h, h, g, w, g, r, r, r, w, g, g, g, g, g, g},
                {g, g, h, h, g, g, w, g, g, r, g, w, g, g, g, g, g, g},
                {g, g, h, h, r, w, w, w, w, r, w, w, w, g, g, g, g, g},
                {g, g, g, h, r, w, w, g, g, r, g, g, g, g, g, g, g, g},
                {g, g, g, h, r, r, r, r, r, r, g, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, r, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, r, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, r, r, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, g, r, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, g, r, r, g, g, g, g, g}};

        map_level_1 = new WorldObject[][]{
                {r, r, g, g, g, g, g, g, g, g, g, g, g, g, g, g, g, r},
                {g, r, g, g, g, g, g, g, g, g, g, g, g, g, g, g, r, g},
                {g, r, r, g, g, g, g, g, g, g, g, g, g, g, g, r, g, g},
                {g, g, r, g, g, g, g, g, g, g, g, g, g, g, g, g, g, g},
                {g, g, g, r, g, g, g, g, g, g, g, g, g, g, r, r, g, g},
                {g, g, r, r, g, g, g, g, g, g, g, g, g, g, r, g, g, g},
                {g, g, g, r, g, g, g, g, g, g, g, g, g, g, r, g, g, g},
                {g, g, r, g, g, g, g, g, g, g, g, g, g, r, g, g, g, g},
                {g, g, r, r, g, g, g, g, g, g, g, g, g, r, g, g, g, g},
                {g, g, g, r, g, g, g, g, g, g, g, g, g, r, g, g, g, g},
                {g, g, g, r, g, g, g, g, g, g, g, g, r, r, g, g, g, g},
                {g, g, g, r, r, g, g, g, g, g, r, r, r, g, r, r, g, g},
                {g, g, g, g, r, g, g, g, g, g, g, r, g, r, r, g, g, g},
                {g, g, g, g, r, g, r, r, r, g, r, g, r, g, r, r, g, g},
                {g, g, g, g, g, r, r, r, g, r, g, g, g, w, r, r, w, g},
                {g, g, g, g, g, g, g, r, g, g, g, g, g, g, r, r, g, g},
                {g, g, g, g, g, g, g, r, g, g, g, g, g, w, r, r, w, g},
                {g, g, g, g, g, g, r, g, g, g, g, g, g, g, r, r, g, g},
                {g, g, g, g, g, g, r, g, g, g, g, g, g, w, r, r, w, g},
                {g, g, g, g, g, g, g, r, g, g, g, g, g, g, r, r, g, g},
                {g, g, g, g, g, g, g, r, g, f, g, g, w, w, r, r, w, g},
                {g, g, g, g, g, g, g, g, r, g, g, w, w, g, r, r, w, w},
                {g, g, g, g, g, g, g, g, r, g, g, w, g, r, r, r, g, w},
                {g, g, g, g, g, g, g, g, r, g, g, w, g, r, r, r, g, w},
                {g, g, g, g, g, g, g, r, r, g, g, w, g, r, r, g, g, w},
                {g, g, g, g, g, g, g, r, r, g, g, w, g, g, r, g, g, w},
                {g, g, g, g, g, w, w, r, w, g, g, w, g, f, r, f, g, w},
                {g, g, g, g, g, w, r, r, w, g, g, w, g, g, f, g, g, w},
                {g, g, g, g, g, w, r, r, w, g, g, w, w, g, g, g, w, g},
                {g, g, g, g, g, w, w, w, w, g, g, g, w, w, w, w, w, g},
                {g, g, g, g, g, g, g, g, g, g, g, g, g, g, g, g, g, g},
                {g, g, g, g, g, g, g, g, g, g, g, g, g, g, g, g, g, g}};
    }



    WorldObject[][] map_level_1;
    WorldObject[][] map_level_2;
    WorldObject[][] map_level_3;
    Wall wall;


    public WorldObject[][] getMap_level_1() {
        return map_level_1;
    }

    public void loadWorldObjectsOnGroup(Group group) {
        Random random = new Random();
        for (int x = 0; x <= map_level_1.length - 1; x++) {
            for (int y = 0; y <= map_level_1[0].length - 1; y++) {
                if (map_level_1[x][y] instanceof Grass) {
                    createRectangleOnGroup(group, x, y, "0x6F9923");
                } else if (map_level_1[x][y] instanceof Fire) {
                    Fire firePlace = new Fire(x, y);
                    map_level_1[x][y] = firePlace;
                    group.getChildren().add(firePlace);
                } else if (this.map_level_1[x][y] instanceof Wall) {
                    Wall wall = new Wall(x, y);
                    map_level_1[x][y] = wall;
                    group.getChildren().add(wall);
                } else if (map_level_1[x][y] instanceof Water) {
                    createRectangleOnGroup(group, x, y, "0x6081B1");
                } else if (map_level_1[x][y] instanceof Way) {
                    createRectangleOnGroup(group, x, y, "0x89834d");
                }
            }
        }
    }

    public void generateForestOnGroup(Group group, int trees) {
        Random random = new Random();
        for (int i = 0; i < trees; i++) {
            int x = random.nextInt(32);
            int y = random.nextInt(18);

            if (map_level_1[x][y] instanceof Grass) {
                Tree tree = new Tree(x, y);
                map_level_1[x][y] = tree;
                group.getChildren().add(tree);
            }
        }
    }

    private void createRectangleOnGroup(Group g, int x, int y, String... color){

        Rectangle rectangle = new Rectangle(40, 40);
        rectangle.setLayoutX(x * 40);
        rectangle.setLayoutY(y * 40);

        if(color != null){
            for (String s : color) {
                Random random = new Random();
                if (random.nextInt(10) % 2 == 0) {
                    addRectangleToGroup(g, rectangle, Color.web(s, 1.0));
                } else {
                    addRectangleToGroup(g, rectangle, Color.web(s, 1.0));
                }
            }
        }
    }
}
