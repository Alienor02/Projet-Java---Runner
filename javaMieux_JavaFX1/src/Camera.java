public class Camera {
    private double x;
    private double y;

    public Camera(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return this.x + "," + this.y;
    }

    /*public void updateCamera(long time){
    }*/
}