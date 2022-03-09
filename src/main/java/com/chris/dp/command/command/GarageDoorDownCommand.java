package com.chris.dp.command.command;

import com.chris.dp.command.receiver.GarageDoor;

/**
 * 关闭车库门命令
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
