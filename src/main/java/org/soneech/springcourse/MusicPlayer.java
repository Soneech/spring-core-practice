package org.soneech.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Scope("prototype")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;
    private RockMusic rockMusic;
    private MetalMusic metalMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, MetalMusic metalMusic) {
        this.rockMusic = rockMusic;
        this.metalMusic = metalMusic;
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
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