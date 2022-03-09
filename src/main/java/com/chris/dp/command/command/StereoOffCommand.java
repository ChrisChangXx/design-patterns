package com.chris.dp.command.command;

import com.chris.dp.command.receiver.Stereo;

/**
 * 音响关闭命令
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
