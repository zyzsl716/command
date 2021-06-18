public class Client {
  public static void main(String[] args) {
    LightReceiver light = new LightReceiver();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);
    RemoteController remoteController = new RemoteController();
    remoteController.setCommand(0,lightOnCommand,lightOffCommand);
    System.out.println("-----遥控器打开电灯-----");
    remoteController.pushOnButton(0);
    System.out.println("-----遥控器关闭电灯-----");
    remoteController.pushOffButton(0);
    System.out.println("-----遥控器按下撤销按钮-----");
    remoteController.pushUndoButton();
  }
}
