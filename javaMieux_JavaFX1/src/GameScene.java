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
    }
}