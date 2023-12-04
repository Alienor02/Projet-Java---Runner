import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static jdk.jfr.EventType.getEventType;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello world");
        Group root = new Group();

        GameScene theScene = new GameScene(root);
        //stage.setScene(theScene);
        primaryStage.setScene(theScene);

        primaryStage.setWidth(600); // favourite width
        primaryStage.setHeight(400); // favourite height

        /*Label bonjour = new Label("Que viva ENSEA");
        Button button = new Button("Pfffft");
        root.getChildren().addAll(bonjour,button);
        bonjour.setLayoutX(scene.getWidth()/2);
        bonjour.setLayoutY(100);
        button.setOnAction((e)->{
            //System.out.println(e,getEventType.getName());
            bonjour.setLayoutY(bonjour.getLayoutY()+10);
        });*/

        /*Image spriteSheet = new Image("file:img/heros.png");
        ImageView sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(20,0,65,100));
        sprite.setX(200);
        sprite.setY(300);
        root.getChildren().add(sprite);*/

        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}