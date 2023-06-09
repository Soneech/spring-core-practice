package org.soneech.springcourse.genres;

import org.soneech.springcourse.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

public class RockMusic extends Music {
    @PostConstruct
    public void doInit() {
        System.out.println("Doing rock music bean initialization...");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Doing rock music bean destruction...");
    }

    public RockMusic() {
        songs.addAll(Arrays.asList(
                "Pain, Follow me",
                "The Offspring, Future is now",
                "Billy Talent, Dead silence"
        ));
    }
}
