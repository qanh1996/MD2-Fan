public class Fan {
    final int slow = 1 ;
    final int medium =2;
    final int fast =3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "Blue";

    public Fan() {
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on){
        return "Fan is on{" +
                ", speed=" + this.getSpeed() +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
        }else {
            return "Fan is off{" +
                    "speed=" + this.getSpeed() +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
