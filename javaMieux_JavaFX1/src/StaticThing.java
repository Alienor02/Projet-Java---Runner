import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class StaticThing {
    private double sizeX;
    private double sizeY;
    private ImageView imageView;

    public StaticThing(double sizeX, double sizeY, String fileName) {
        Image backgroundImage = new Image(fileName);
        this.imageView = new ImageView(backgroundImage);

        imageView.setFitWidth(sizeX);
        imageView.setFitHeight(sizeY);
    }

    public ImageView getImageView() {
        return imageView;
    }
}