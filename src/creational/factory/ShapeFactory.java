package creational.factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType) {
            case "CIRCLE" :
                return new Circle();
            case "SQUARE" :
                return new Square();
            case "RECTANGLE" :
                return new Rectangle();
            default:
                return null;
        }
    }
}
