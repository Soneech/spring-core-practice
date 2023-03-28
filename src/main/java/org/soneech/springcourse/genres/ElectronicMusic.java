package org.soneech.springcourse.genres;

import org.soneech.springcourse.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

public class ElectronicMusic extends Music {
    @PostConstruct
    public void doInit() {
        System.out.println("Doing electronic music bean initialization...");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Doing electronic music bean destruction...");
    }
    public ElectronicMusic() {
        songs.addAll(Arrays.asList(
                "Carpenter Brut, Imaginary Fire",
                "Carpenter Brut, Blood Machines Theme",
                "Carpenter Brut, Le prev"
        ));
    }
}
