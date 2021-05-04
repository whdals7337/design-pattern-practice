package structural.decorator;

public class Flowers extends TreeDecorator{

    public Flowers(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorateFlowers() {
        return " with flowers";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateFlowers();
    }
}
