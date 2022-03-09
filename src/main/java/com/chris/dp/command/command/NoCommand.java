package com.chris.dp.command.command;

/**
 * 无命令
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("什么也不用干");
    }

    @Override
    public void undo() {
        System.out.println("什么也不用干");
    }
}
