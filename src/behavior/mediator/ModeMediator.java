package behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class ModeMediator {
    private final List<ModeListener> listeners = new ArrayList<>();

    public void addListener(ModeListener modeListener) {
        listeners.add(modeListener);
    }

    public void onModeChange(Mode mode) {
        for (ModeListener listener : listeners) {
            listener.onModeChange(mode);
        }
    }
}
