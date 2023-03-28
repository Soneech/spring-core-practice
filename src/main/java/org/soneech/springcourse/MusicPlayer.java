package org.soneech.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;
    List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> music) {
        this.musicList.addAll(music);
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();

        List<String> songs = musicList.get(random.nextInt(musicList.size())).getSongs();
        String song = songs.get(random.nextInt(songs.size()));

        return "Playing: '" + song + "', with volume " + this.volume;
    }
}