package creational.prototype;

import java.util.HashMap;

public class ShapeCache {

    private static final HashMap<String, Shape> shapeMap  = new HashMap<>();

    public static Shape getCloneShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        // 클론한 값을 리턴
        return (Shape) cachedShape.clone();
    }

    public static Shape getNoCloneShape(String shapeId) {
        return shapeMap.get(shapeId);
    }

    // Hashtable 데이터 load
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
