public class RemoteController {
//  执行开关命令
  Command[] onCommands;
  Command[] offCommands;

//  撤销命令
  Command undoCommand;

//初始化遥控器
  public RemoteController() {
    onCommands = new Command[5];
    offCommands = new Command[5];

    for (int i = 0 ;i < 5; i++) {
      onCommands[i] = new NoCommand();
      offCommands[i] = new NoCommand();
    }
  }

//  设置遥控器命令
  public void setCommand(int no,Command onCommand,Command offCommand) {
    onCommands[no] = onCommand;
    offCommands[no] = offCommand;
  }

//  按下开按钮
  public void pushOnButton(int no) {
    onCommands[no].excute();
    undoCommand = onCommands[no];
  }

  //  按下关按钮
  public void pushOffButton(int no) {
    offCommands[no].excute();
    undoCommand = offCommands[no];
  }

  //  按下撤销按钮
  public void pushUndoButton() {
    undoCommand.undo();
  }
}
