package behavior.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10, 5)); // 15

        context = new Context(new OperationSubtract());
        System.out.println(context.executeStrategy(10, 5)); // 5

        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(10, 5)); // 50
    }
}
