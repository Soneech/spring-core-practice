package org.soneech.springcourse.genres;


import org.soneech.springcourse.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;


public class MetalMusic extends Music {
    @PostConstruct
    public void doInit() {
        System.out.println("Doing metal music bean initialization...");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Doing metal music bean destruction...");
    }
    public MetalMusic() {
        songs.addAll(Arrays.asList(
                "Samael, Red Planet",
                "Dimmu Borgir, Gateways",
                "Abbath, To War!"
        ));
    }
}
