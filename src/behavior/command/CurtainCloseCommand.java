package behavior.command;

public class CurtainCloseCommand implements Command{
    private Curtain curtain;

    public CurtainCloseCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.close();
    }
}
