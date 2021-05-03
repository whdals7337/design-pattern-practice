package structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("vic file 실행");
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
