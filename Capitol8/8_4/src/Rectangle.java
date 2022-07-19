public class Rectangle {
    private float length;
    private float width;

    Rectangle()
    {
        length = 1;
        width = 1;
    }

    public void setLength(float length) {
        if (length <= 0 || length >= 20)
            throw new IllegalArgumentException("length must be 1-19");
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        if(width<=0 || width >=20)
            throw new IllegalArgumentException("width must be 1-19");
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public float calculatePerimeter()
    {
        return (length+width)*2;
    }

    public float calculateArea()
    {
        return length*width;
    }


}
