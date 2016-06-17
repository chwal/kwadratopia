package kwadratopia.game.environment;

import javafx.scene.shape.Rectangle;

/**
 * Created by chwal on 16/09/15.
 */
public class WorldObject extends Rectangle{

    protected Boolean collision = false;

    public WorldObject(int x, int y, Boolean collision){
        super(x,y);
        this.collision = collision;
    }

    public Boolean getColision() {
        return collision;
    }
}
