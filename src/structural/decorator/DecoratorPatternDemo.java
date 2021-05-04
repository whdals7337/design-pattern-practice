package structural.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        ChristmasTree smallChristmasTree = new SmallChristmasTree();
        System.out.println(smallChristmasTree.decorate());

        ChristmasTree smallTreeWithLights = new Lights(smallChristmasTree);
        System.out.println(smallTreeWithLights.decorate());

        ChristmasTree tallChristmasTree = new TallChristmasTree();
        System.out.println(tallChristmasTree.decorate());

        ChristmasTree tallTreeWithLights = new Lights(tallChristmasTree);
        System.out.println(tallTreeWithLights.decorate());

        ChristmasTree tallTreeWithLightsAndFlowers = new Flowers(tallTreeWithLights);
        System.out.println(tallTreeWithLightsAndFlowers.decorate());
    }
}
