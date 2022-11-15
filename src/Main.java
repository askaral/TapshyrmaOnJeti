
public class Main {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape rhombus = new Rhombus(8);
        Shape triangle = new Triangle(9, 6);
        Shape rectangle = new Rectangle(10,7);
        Shape circle = new Circle(22);
        Shape [] shapes = new Shape[]{square,rhombus,triangle,rectangle,circle};
        for (Shape shape:shapes) {
            System.out.println(shape.getName()+shape.getPerimeter());

        }


    }
}