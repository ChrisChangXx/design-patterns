package com.chris.dp.command.command;

import com.chris.dp.command.receiver.Light;

/**
 * 开灯命令
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.on();
    }
}
