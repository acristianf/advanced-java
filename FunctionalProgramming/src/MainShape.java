public class MainShape {
    public static void main(String[] args) {
        Square s = new Square(4);
        Shapes shapes = Square::calculateArea;
        System.out.println("Area: " + shapes.getArea(s));
    }
}
