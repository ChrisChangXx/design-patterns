package com.chris.dp.command;

import com.chris.dp.command.command.*;
import com.chris.dp.command.invoker.RemoteControl;
import com.chris.dp.command.receiver.CeilingFan;
import com.chris.dp.command.receiver.GarageDoor;
import com.chris.dp.command.receiver.Light;
import com.chris.dp.command.receiver.Stereo;

/**
 * 远程控制测试
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class MacroRemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command[] onCommands = new Command[4];
        onCommands[0] = lightOnCommand;
        onCommands[1] = garageDoorUpCommand;
        onCommands[2] = stereoOnWithCdCommand;
        onCommands[3] = ceilingFanHighCommand;
        MacroCommand onMacroCommand = new MacroCommand(onCommands);
        Command[] offCommands = new Command[4];
        offCommands[0] = lightOffCommand;
        offCommands[1] = garageDoorDownCommand;
        offCommands[2] = stereoOffCommand;
        offCommands[3] = new NoCommand();
        MacroCommand offMacroCommand = new MacroCommand(offCommands);

        remoteControl.setCommand(0, onMacroCommand, offMacroCommand);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPublished(0);
        remoteControl.undoButtonWasPublished();
    }
}
