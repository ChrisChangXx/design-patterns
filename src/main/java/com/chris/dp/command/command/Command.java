package com.chris.dp.command.command;

/**
 * 命令
 *
 * @author zhangh
 * @date 2022/03/09
 */
public interface Command {
    /**
     * 执行
     */
    void execute();

    /**
     * 撤销
     */
    void undo();
}
