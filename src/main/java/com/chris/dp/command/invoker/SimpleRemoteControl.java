package com.chris.dp.command.invoker;

import com.chris.dp.command.command.Command;

/**
 * 简单远程控制
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
