package behavior.mediator;

public class MediatorPatternDemo {

    public static void main(String[] args) {
        ModeMediator modeMediator = new ModeMediator();
        modeMediator.addListener(new ListView());
        modeMediator.addListener(new GalleryView());
        modeMediator.addListener(new DataDownloader());

        ModeSwitch modeSwitch = new ModeSwitch();
        modeSwitch.setModeMediator(modeMediator);

        modeSwitch.toggleMode();

        System.out.println();

        modeSwitch.toggleMode();
    }
}
