package pointAndMovablePoint;

public class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    MovablePoint() {
    }
    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "x = " + (this.x+= xSpeed) + " ; y = " + (y+= ySpeed);
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        MovablePoint movablePoint1 = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint1);
    }
}
