package org.soneech.springcourse.configuration;

import org.soneech.springcourse.MusicPlayer;
import org.soneech.springcourse.genres.ElectronicMusic;
import org.soneech.springcourse.genres.MetalMusic;
import org.soneech.springcourse.Music;
import org.soneech.springcourse.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfiguration {
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MetalMusic metalMusic() {
        return new MetalMusic();
    }

    @Bean
    public ElectronicMusic electronicMusic() {
        return new ElectronicMusic();
    }

    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(rockMusic(), metalMusic(), electronicMusic());
    }
}
