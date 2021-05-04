package structural.decorator;

public class Lights extends TreeDecorator{

    public Lights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorateLights() {
        return " with Lights";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateLights();
    }
}
