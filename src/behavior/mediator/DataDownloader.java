package behavior.mediator;

public class DataDownloader implements ModeListener{
    @Override
    public void onModeChange(Mode mode) {
        System.out.println((mode == Mode.LIST ? "리스트 뷰" : "갤러리 뷰") + " 다운로드");
    }
}
