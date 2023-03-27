package org.soneech.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic1 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic);
        System.out.println(rockMusic1);
        context.close();
    }
}
