package org.soneech.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("volume: " + musicPlayer.getVolume());
        musicPlayer.playMusic();

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.hashCode());
        System.out.println(musicPlayer1.hashCode());

        context.close();
    }
}
