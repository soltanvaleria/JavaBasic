public class Circle extends TwoDimensionalShape{
    private double radius;

    public Circle(String name, double radius)
    {
        super(name);
        if(radius<=0.0)
            throw new IllegalArgumentException("Radius must be >0.0");
        this.radius = radius;

    }

    public void setRadius(double radius) {
        if(radius<=0.0)
            throw new IllegalArgumentException("Radius must be >0.0");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return getRadius()*getRadius()*Math.PI;
    }
}
