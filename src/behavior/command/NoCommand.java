package behavior.command;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("리모컨 슬롯에 명령이 설정되어 있지 않습니다.");
    }
}
