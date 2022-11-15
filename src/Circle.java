public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return Math.floor(Math.PI*2*radius);
    }

    @Override
    public String getName() {
        return "Circle perimeter: ";
    }
}
