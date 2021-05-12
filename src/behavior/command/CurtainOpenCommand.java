package behavior.command;

public class CurtainOpenCommand implements Command{
    private Curtain curtain;

    public CurtainOpenCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.open();
    }
}
