package game;

import game.engine.UserInteraction;
import game.engine.GameLoop;
import game.environment.objects.World;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.TimelineBuilder;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import game.player.Player;
import javafx.stage.WindowEvent;
import javafx.util.Duration;

import static game.engine.Library.*;

public class Main extends Application {

    private Player player;
    private GameLoop gameLoop;
    private Group group;
    private Scene gameScene;
    private Scene menuScene;
    private World world;
    private Rectangle rectangle;
    private UserInteraction userInteraction;
    private Parent group2;
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;

        primaryStage.setTitle("Kwadratopia 0.01");
        primaryStage.setResizable(false);
        group = new Group();
        gameScene = new Scene(group, 1280, 720);


        group2 = FXMLLoader.load(getClass().getResource("ui/MenuUI.fxml"));
        menuScene = new Scene(group2, 1280, 720);
        userInteraction = new UserInteraction(this);
        gameScene.setOnKeyPressed(userInteraction);
        menuScene.setOnKeyPressed(userInteraction);

        world = new World();
        world.loadWorldObjectsOnGroup(group);
        world.paintMapOnGroup(group);

        world.generateForestOnGroup(group);
        rectangle =  new Rectangle();
        player = new Player(2,2);
        createRectangeOn(group, player, null);

        gameLoop = new GameLoop(this);
        gameLoop.start();

        /*TimelineBuilder.create().cycleCount(Animation.INDEFINITE).keyFrames(new KeyFrame(Duration.millis(1000 / 30), event -> {

            hier dann die bewegung

        })).build().play();*/

        //drawGridOnGroup(group);

        primaryStage.setScene(gameScene);
        primaryStage.show();

        //Close current application with Window [x]
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                Platform.exit();
                System.exit(0);
            }
        });
    }

    public Player getPlayer()
    {
        return player;
    }

    public World getWorld(){
        return world;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void showMenuScene(){
        this.primaryStage.setScene(menuScene);
    }

    public void showGameScene(){
        this.primaryStage.setScene(gameScene);
    }

}
