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

        root.getChildren().add(left.getBackground());
        root.getChildren().add(right.getBackground());
        root.getChildren().add(hero.getSprite());

        cam = new Camera(0,50,600,350);

        int nbOfLives = 0;
        if (nbOfLives.value==3){
            numberOfLives = new Hero("file:img/lives3.png", 100,200,0);
        }
        else if (nbOfLives.value==2){
            numberOfLives = new Hero("file:img/lives2.png", 100,200,0);
        }
        else if (nbOfLives.value==1){
            numberOfLives = new Hero("file:img/lives1.png", 100,200,0);
        }
        else {
            numberOfLives = new Hero("file:img/lives0.png", 100,200,0);
        }
    }

}