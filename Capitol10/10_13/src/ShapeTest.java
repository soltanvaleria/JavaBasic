public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Square("Square", 4);
        shapes[1] = new Circle("Circle", 5);
        shapes[2] = new Cube("Cube", 4);
        shapes[3] = new Sphere("Sphere", 5);

        for(Shape currentShape : shapes)
        {
            System.out.println(currentShape);

            if(currentShape instanceof TwoDimensionalShape)
            {
                System.out.printf("Area: %.2f%n%n", ((TwoDimensionalShape) currentShape).getArea());
            }

            if(currentShape instanceof  ThreeDimensionalShape)
            {
                System.out.printf("Area: %.2f%nVolume: %.2f%n%n", ((ThreeDimensionalShape) currentShape).getArea(),
                        ((ThreeDimensionalShape) currentShape).getVolume());
            }
        }
    }
}
