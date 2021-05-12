package behavior.command;

public class Client {
    public static void main(String[] args) {
        // 리시버 객체 생성
        MusicPlayer musicPlayer = new MusicPlayer();
        Curtain curtain = new Curtain();
        Light light = new Light();

        //인보커 객체인 리모컨 생성
        RemoteController remoteController = new RemoteController();

        // 인보커 객체인 리모컨은 커맨드 배열에 커맨드 저장
        remoteController.registerCommand(0, new MusicPlayerOnCommand(musicPlayer));
        remoteController.registerCommand(1, new MusicPlayerOffCommand(musicPlayer));
        remoteController.registerCommand(2, new MusicPlayerNextCommand(musicPlayer));
        remoteController.registerCommand(3, new MusicPlayerPreCommand(musicPlayer));

        remoteController.registerCommand(4, new CurtainOpenCommand(curtain));
        remoteController.registerCommand(5, new CurtainCloseCommand(curtain));

        remoteController.registerCommand(6, new LightOnCommand(light));
        remoteController.registerCommand(7, new LightOffCommand(light));

        // 인보커 객체인 리모컨 사용
        remoteController.buttonPress(0);
        remoteController.buttonPress(1);
        remoteController.buttonPress(2);
        remoteController.buttonPress(3);
        remoteController.buttonPress(4);
        remoteController.buttonPress(5);
        remoteController.buttonPress(6);
        remoteController.buttonPress(7);
    }
}
