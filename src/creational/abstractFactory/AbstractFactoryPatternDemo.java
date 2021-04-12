package creational.abstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        print(shape1);
        Shape shape2 = shapeFactory.getShape("SQUARE");
        print(shape2);
        Shape shape3 = shapeFactory.getShape("abc");
        print(shape3);
        Shape shape4 = shapeFactory.getShape(null);
        print(shape4);

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        Shape shape5 = shapeFactory1.getShape("RECTANGLE");
        print(shape5);
        Shape shape6 = shapeFactory1.getShape("SQUARE");
        print(shape6);
        Shape shape7 = shapeFactory1.getShape("abc");
        print(shape7);
        Shape shape8 = shapeFactory1.getShape(null);
        print(shape8);
    }

    public static void print(Shape shape) {
        if (shape != null) {
            shape.draw();
        }else {
            System.out.println("올바르지않은 모형");
        }
    }
}
