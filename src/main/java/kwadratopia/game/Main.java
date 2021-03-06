package kwadratopia.game;

import static kwadratopia.game.engine.Library.*;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;
import kwadratopia.game.engine.UserInteraction;
import kwadratopia.game.engine.GameLoop;
import kwadratopia.game.environment.objects.World;
import kwadratopia.game.player.Player;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


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


        group2 = FXMLLoader.load(getClass().getResource("/fxml/MenuUI.fxml"));
        menuScene = new Scene(group2, 1280, 720);
        userInteraction = new UserInteraction(this);
        gameScene.setOnKeyPressed(userInteraction);
        menuScene.setOnKeyPressed(userInteraction);

        world = new World();
        world.loadWorldObjectsOnGroup(group);

        world.generateForestOnGroup(group, 350);
        rectangle =  new Rectangle();
        player = new Player(2,2);
        addRectangleToGroup(group, player, null);

        gameLoop = new GameLoop(this);
        gameLoop.start();

        /*TimelineBuilder.create().cycleCount(Animation.INDEFINITE).keyFrames(new KeyFrame(Duration.millis(1000 / 30), event -> {

            hier dann die bewegung

        })).build().play();*/

        //drawGridOnGroup(group);

        primaryStage.setScene(menuScene);
        //Library.drawGridOnGroup(group);
        primaryStage.show();


        //Close current application with Window [x]
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {

            public void handle(WindowEvent event) {
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
