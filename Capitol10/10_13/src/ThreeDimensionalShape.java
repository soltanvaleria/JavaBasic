public abstract class ThreeDimensionalShape extends Shape{

    public ThreeDimensionalShape(String name)
    {
        super(name);
    }

    public abstract double getArea();
    public abstract double getVolume();
}
