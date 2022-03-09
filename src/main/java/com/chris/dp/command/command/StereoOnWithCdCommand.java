package com.chris.dp.command.command;

import com.chris.dp.command.receiver.Stereo;

/**
 * 打开音响命令
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class StereoOnWithCdCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
