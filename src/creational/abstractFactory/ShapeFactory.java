package creational.abstractFactory;

public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType) {
            case "SQUARE" :
                return new Square();
            case "RECTANGLE" :
                return new Rectangle();
            default:
                return null;
        }
    }
}
