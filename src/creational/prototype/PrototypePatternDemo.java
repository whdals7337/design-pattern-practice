package creational.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getCloneShape("1");
        Shape noClonedShape = ShapeCache.getNoCloneShape("1");
        System.out.println("Shape : " + clonedShape.getType());
        System.out.println("Shape : " + noClonedShape.getType());
        System.out.println(clonedShape.equals(noClonedShape));
        System.out.println(clonedShape.hashCode());
        System.out.println(noClonedShape.hashCode());
        System.out.println();

        Shape clonedShape2 = ShapeCache.getCloneShape("2");
        Shape noClonedShape2 = ShapeCache.getNoCloneShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        System.out.println("Shape : " + noClonedShape2.getType());
        System.out.println(clonedShape2.equals(noClonedShape2));
        System.out.println(clonedShape2.hashCode());
        System.out.println(noClonedShape2.hashCode());
        System.out.println();

        Shape clonedShape3 = ShapeCache.getCloneShape("3");
        Shape noClonedShape3 = ShapeCache.getNoCloneShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
        System.out.println("Shape : " + noClonedShape3.getType());
        System.out.println(clonedShape3.equals(noClonedShape3));
        System.out.println(clonedShape3.hashCode());
        System.out.println(noClonedShape3.hashCode());
    }
}