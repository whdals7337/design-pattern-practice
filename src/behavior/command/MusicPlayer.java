package behavior.command;

public class MusicPlayer {
    public void on() {
        System.out.println("음악 재생");
    }

    public void off() {
        System.out.println("음악 정지");
    }

    public void next() {
        System.out.println("다음 곡 재생");
    }

    public void pre() {
        System.out.println("이전 곡 재생");
    }
}
