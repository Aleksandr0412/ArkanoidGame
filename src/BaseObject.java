public abstract class BaseObject {
    protected double x;
    protected double y;
    protected double radius;
    private double distance;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract void move();

    public abstract void draw(Canvas canvas);


    public boolean isIntersec(BaseObject o) {
        distance = Math.sqrt((o.getX() - this.getX()) * (o.getX() - this.getX()) + (o.getY() - this.getY()) * (o.getY() - this.getY()));
        if (distance <= (o.getRadius() > radius ? o.getRadius() : this.getRadius())) {
            return true;
        } else return false;
    }

}