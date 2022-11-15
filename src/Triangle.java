public class Triangle extends Shape{

    private int a;
    private int b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public double getPerimeter() {
        return (a*2)+b;
    }

    @Override
    public String getName() {
        return "Triangle perimeter: ";
    }
}
