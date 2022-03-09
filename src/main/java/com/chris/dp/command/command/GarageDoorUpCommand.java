package com.chris.dp.command.command;

import com.chris.dp.command.receiver.GarageDoor;

/**
 * 开车库门命令
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
