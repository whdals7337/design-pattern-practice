package behavior.command;

public class MusicPlayerPreCommand implements Command{
    private MusicPlayer musicPlayer;

    public MusicPlayerPreCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.pre();
    }
}
