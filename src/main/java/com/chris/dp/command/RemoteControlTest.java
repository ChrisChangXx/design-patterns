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
public class RemoteControlTest {
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

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorUpCommand, garageDoorDownCommand);
        remoteControl.setCommand(2, stereoOnWithCdCommand, stereoOffCommand);
        remoteControl.setCommand(3, ceilingFanHighCommand, new NoCommand());
        System.out.println(remoteControl);

        remoteControl.onButtonWasPublished(0);
        remoteControl.offButtonWasPublished(0);
        remoteControl.undoButtonWasPublished();
        remoteControl.onButtonWasPublished(1);
        remoteControl.offButtonWasPublished(1);
        remoteControl.undoButtonWasPublished();
        remoteControl.onButtonWasPublished(2);
        remoteControl.offButtonWasPublished(2);
        remoteControl.undoButtonWasPublished();
        remoteControl.onButtonWasPublished(3);
        remoteControl.undoButtonWasPublished();
    }
}
