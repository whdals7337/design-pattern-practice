package behavior.mediator;

public class GalleryView implements ModeListener{
    @Override
    public void onModeChange(Mode mode) {
        System.out.println("갤러리 뷰" + (mode == Mode.GALLERY ? "보여줌" : "감춤"));
    }
}
