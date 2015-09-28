package game;

import game.engine.Movement;
import game.engine.GameLoop;
import game.environment.objects.World;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import game.player.Player;

import static game.engine.Library.*;

public class Main extends Application {

    private Player player;
    private GameLoop gameLoop;
    private Group group;
    private Scene scene;
    private World world;
    private Rectangle rectangle;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Kwadratopia 0.01");
        primaryStage.setResizable(false);
        group = new Group();
        scene = new Scene(group, 1280, 720);
        Movement movement = new Movement(this);
        scene.setOnKeyPressed(movement);
        
        world = new World();
        world.loadWorldObjectsOnGroup(group);
        world.paintMapOnGroup(group);

        world.generateForestOnGroup(group);
        rectangle =  new Rectangle();
        player = new Player(2,2);
        createRectangeOn(group, player, null);

        gameLoop = new GameLoop(this);
        gameLoop.start();

        //drawGridOnGroup(group);


        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Player getPlayer()
    {
        return player;
    }

    public World getWorld(){ return world; }

    public static void main(String[] args) {
        launch(args);
    }

}
