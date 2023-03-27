package org.soneech.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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

    public String playMusic(MusicGenres genre) {
        List<String> songs;
        switch (genre) {
            case ROCK -> {
                songs = rockMusic.getSongs();
                return songs.get((int) (Math.random() * songs.size()));
            }
            case METAL -> {
                songs = metalMusic.getSongs();
                return songs.get((int) (Math.random() * songs.size()));
            }
            default -> {
                return null;
            }
        }
    }
}