public class Camera {
    protected double x,widthX;
    protected double y,widthY;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getWidthX() {
        return widthX;
    }
    public double getWidthY() {
        return widthY;
    }

    public Camera(double x, double y, double widthX, double widthY){
        this.x = x;
        this.y = y;
        this.widthX = widthX;
        this.widthY = widthY;
    }

    @Override
    public String toString() {
        return "x : "+x+" y : "+y;
    }
}