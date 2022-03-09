package com.chris.dp.command;

import com.chris.dp.command.command.GarageDoorUpCommand;
import com.chris.dp.command.command.LightOnCommand;
import com.chris.dp.command.invoker.SimpleRemoteControl;
import com.chris.dp.command.receiver.GarageDoor;
import com.chris.dp.command.receiver.Light;

/**
 * 远程控制测试
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(garageDoorUpCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
