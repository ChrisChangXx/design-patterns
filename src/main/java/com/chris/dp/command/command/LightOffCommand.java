package com.chris.dp.command.command;

import com.chris.dp.command.receiver.Light;

/**
 * 关灯命令
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
