package behavior.template_method;

public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("서킷 경기 준비");
    }

    @Override
    void startPlay() {
        System.out.println("서킷 경기 시작");
    }

    @Override
    void endPlay() {
        System.out.println("서킷 경기 종료");
    }
}
