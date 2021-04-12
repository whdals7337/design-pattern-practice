package creational.abstractFactory;

public class RoundedShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType) {
            case "SQUARE" :
                return new RoundedSquare();
            case "RECTANGLE" :
                return new RoundedRectangle();
            default:
                return null;
        }
    }
}
