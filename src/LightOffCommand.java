public class LightOffCommand implements Command{
  private LightReceiver light;

  public LightOffCommand(LightReceiver light) {
    this.light = light;
  }

  @Override
  public void excute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }
}
