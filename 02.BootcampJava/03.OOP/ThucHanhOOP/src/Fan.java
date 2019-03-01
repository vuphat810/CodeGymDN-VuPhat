public class Fan {
    private int speed = 1;
    boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return this.speed;
    }
    public boolean isOn() {
        return this.isOn;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
    Fan() {
    }
    public String toString() {
        if (isOn) {
            return ("status: " + this.isOn + " radius: " + this.getRadius() + " fan is on");
        } else {
            return ("fan is off");
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setRadius(10);
        fan1.setColor("yelow");
        fan1.setSpeed(2);
        fan1.turnOn();
        System.out.println(fan1.toString());
        fan1.turnOff();
        System.out.println(fan1.toString());
    }

}
