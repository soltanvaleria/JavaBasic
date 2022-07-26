public class Square extends TwoDimensionalShape{

    private double side;

    public Square(String name, double side)
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
        return getSide()*getSide();
    }
}
