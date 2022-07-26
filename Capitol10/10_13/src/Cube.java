public class Cube extends ThreeDimensionalShape{
    private double side;

    public Cube(String name, double side)
    {
        super(name);
        if(side<=0.0)
            throw new IllegalArgumentException("Side must be > 0");
        this.side = side;
    }

    public void setSide(double side) {
        if(side<=0.0)
            throw new IllegalArgumentException("Side must be > 0");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return getSide()*getSide()*6;
    }

    @Override
    public double getVolume() {
        return getSide()*getSide()*getSide();
    }
}
