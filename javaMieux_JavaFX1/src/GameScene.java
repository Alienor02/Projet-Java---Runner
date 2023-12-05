import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {
    protected Pane pane;
    protected static Camera cam ;
    private StaticThing stRight;
    private StaticThing stLeft;
    private StaticThing numberOfLives;

    Group fond;
    StaticThing left;
    StaticThing right;
    Hero hero;

    public GameScene(Group root) {
        super(root);
        fond = root;

        left = new StaticThing(800,400, 0,0, "file:img/desert.png",0);
        right = new StaticThing(800,400, 800,0,"file:img/desert.png" ,0);
        hero = new Hero("file:img/heros.png", 100,200,0);
        numberOfLives = new StaticThing(911, 259, 0, 0,"file:img/lives3.png",3);

        root.getChildren().add(left.getBackground());
        root.getChildren().add(right.getBackground());
        root.getChildren().add(hero.getSprite());
        root.getChildren().add(numberOfLives.getBackground());

        numberOfLives.getBackground().setFitHeight(40);
        numberOfLives.getBackground().setFitWidth(200);

        cam = new Camera(0,50,600,350);

        if (numberOfLives.value == 3) {
            numberOfLives.updateImage("file:img/lives3.png", 3);
        } else if (numberOfLives.value == 2) {
            numberOfLives.updateImage("file:img/lives2.png", 2);
        } else if (numberOfLives.value == 1) {
            numberOfLives.updateImage("file:img/lives1.png", 1);
        } else {
            numberOfLives.updateImage("file:img/lives0.png", 0);
        }

        //mettre à jour la taille de l'image (après le changement d'image)
        numberOfLives.getBackground().setFitHeight(40);
        numberOfLives.getBackground().setFitWidth(200);
        numberOfLives.getBackground().setX(0);
        numberOfLives.getBackground().setY(0);

        /*
        //premier code changement d'image
        if (numberOfLives.value==3){
            //numberOfLives.getBackground().setViewport(new Rectangle2D(0, 0,911,259));
            numberOfLives = new StaticThing(0, 0,911,259, "file:img/lives2.png",3);
            numberOfLives.getBackground().setFitHeight(40);
            numberOfLives.getBackground().setFitWidth(200);
            numberOfLives.getBackground().setX(0);
            numberOfLives.getBackground().setY(0);
        }
        else if (numberOfLives.value==2){
            numberOfLives = new StaticThing(0, 0,913,257, "file:img/lives2.png",2);
            numberOfLives.getBackground().setFitHeight(40);
            numberOfLives.getBackground().setFitWidth(200);
            numberOfLives.getBackground().setX(0);
            numberOfLives.getBackground().setY(0);
        }
        else if (numberOfLives.value==1){
            numberOfLives = new StaticThing(0, 0,911,255,"file:img/lives1.png",1);
            numberOfLives.getBackground().setFitHeight(40);
            numberOfLives.getBackground().setFitWidth(200);
            numberOfLives.getBackground().setX(0);
            numberOfLives.getBackground().setY(0);
        }
        else {
            numberOfLives = new StaticThing(0, 0,910,263,"file:img/lives0.png",0);
            numberOfLives.getBackground().setFitHeight(40);
            numberOfLives.getBackground().setFitWidth(200);
            numberOfLives.getBackground().setX(0);
            numberOfLives.getBackground().setY(0);
        }*/
    }

}