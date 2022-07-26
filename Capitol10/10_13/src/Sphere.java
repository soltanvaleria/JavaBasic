public class Sphere extends ThreeDimensionalShape{

    private double radius;
    public Sphere(String name, double radius)
    {
        super(name);
        if(radius<=0.0)
            throw new IllegalArgumentException("Radius must be > 0");
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if(radius<=0.0)
            throw new IllegalArgumentException("Radius must be > 0");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*getRadius()*getRadius();
    }

    @Override
    public double getVolume() {
        return 4/3*Math.PI*getRadius()*getRadius()*getRadius();
    }
}
