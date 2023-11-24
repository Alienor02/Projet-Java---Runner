import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {
    protected Pane pane;
    protected static Camera cam ;
    private StaticThing stRight;
    private StaticThing stLeft;
    private StaticThing numberOfLives;

    public GameScene(Parent parent, double v, double v1) {
        super(parent, v, v1);
    }
}

