import javafx.geometry.Rectangle2D;

public class Hero extends AnimatedThing{
    public Hero(double x, double y, int attitude, String fileName) {
        super(x, y, attitude, fileName);
    }

    public void runShootHero(int index){
        this.getspriteSheetImageView().setViewport(new Rectangle2D(5 + index * 47.2,168,47.2,50 ));
    }

    public void updateHero(long time){
        int index = animatedThingUpdate(time);
        runShootHero(index);
    }
}