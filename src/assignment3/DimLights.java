package assignment3;

public class DimLights implements Command {
    private Light light;
    private int level;

    public DimLights(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public void execute() {
        light.dim(level);
    }

    @Override
    public void undo() {
        light.on();
    }
}