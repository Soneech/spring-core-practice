package org.soneech.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Smartphone {
    private String name;
    private MusicPlayer musicPlayer;

    @Autowired
    public Smartphone(MusicPlayer musicPlayer) {
        this.name = "Soneech";
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Smartphone " + name + "; music: " + musicPlayer.playMusic();
    }
}
