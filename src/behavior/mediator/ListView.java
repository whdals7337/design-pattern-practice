package behavior.mediator;

public class ListView implements ModeListener{
    @Override
    public void onModeChange(Mode mode) {
        System.out.println("리스트 뷰" + (mode == Mode.LIST ? "보여줌" : "감춤"));
    }
}
