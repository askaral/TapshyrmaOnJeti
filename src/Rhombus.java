public class Rhombus extends Shape{

    private int a;

    public Rhombus(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public double getPerimeter() {
        return a*4;
    }

    @Override
    public String getName() {
        return "Rhombus perimeter: ";
    }
}
