package creational.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        print(shape1);

        Shape shape2 = shapeFactory.getShape("SQUARE");
        print(shape2);

        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        print(shape3);

        Shape shape4 = shapeFactory.getShape(null);
        print(shape4);

        Shape shape5 = shapeFactory.getShape("abc");
        print(shape5);
    }

    public static void print(Shape shape) {
        if (shape != null) {
            shape.draw();
        }else {
            System.out.println("올바르지않은 모형");
        }
    }
}
