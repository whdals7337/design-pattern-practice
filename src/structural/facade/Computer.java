package structural.facade;

public class Computer {
    public void boot() {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        cpu.freeze();
        hardDrive.read();
        memory.load();
        cpu.jump();
        cpu.execute();
    }
}
