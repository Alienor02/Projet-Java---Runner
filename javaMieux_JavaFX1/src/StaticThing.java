import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;


public class StaticThing {
    protected Integer SizeX;
    protected Integer SizeY;
    protected Integer value;
    private ImageView Background;
    protected Image ImageBackground;

    public StaticThing(Integer SizeX, Integer SizeY, double X, double Y, String fileName, Integer value){
        this.SizeX = SizeX;
        this.SizeY = SizeY;
        //File imageFile = new File(fileName);

        this.ImageBackground = new Image(fileName);
        this.Background = new ImageView(ImageBackground);
        this.Background.setX(X);
        this.Background.setY(Y);
        this.value=value;
    }
    public ImageView getBackground(){
        return Background;
    }
    public Image getImageBackground() { return ImageBackground;}

    //mettre à jour l'image
    public void updateImage(String fileName, Integer newValue) {
        this.ImageBackground = new Image(fileName);
        this.Background.setImage(ImageBackground);
        this.value = newValue;
    }

}