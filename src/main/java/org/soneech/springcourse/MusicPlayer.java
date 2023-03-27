package org.soneech.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;
    private MetalMusic metalMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, MetalMusic metalMusic) {
        this.rockMusic = rockMusic;
        this.metalMusic = metalMusic;
    }

    public String playMusic() {
        return "Playing: " + rockMusic.getSong() + "; " + metalMusic.getSong();
    }

    public void doInit() {
        System.out.println("Doing music player initialization...");
    }
}