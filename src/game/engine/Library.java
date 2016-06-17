package game.engine;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

/**
 * Created by chwal on 15/09/15.
 */
public class Library {
    public static void drawGridOnGroup(Group group){
        for (int i = 0; i <1280; i+=40)
        {
            Line line1 = new Line(i, 0, i, 720);
            line1.setStroke(Color.LIGHTGRAY);
            Line line2 = new Line(0, i, 1280, i);
            line2.setStroke(Color.LIGHTGRAY);
            group.getChildren().addAll(line1, line2);
        }
    }

    public static void createRectangeOn(Group group, Rectangle rec, Color color){
        if(color != null){
            rec.setFill(color);
        }
        group.getChildren().add(rec);
    }
}
