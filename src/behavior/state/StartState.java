package behavior.state;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("start");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StartState";
    }
}
