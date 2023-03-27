package org.soneech.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MetalMusic extends Music {
    public MetalMusic() {
        songs.addAll(Arrays.asList(
                "Samael: Red Planet", "Dimmu Borgir: Gateways", "Abbath: To War!"
        ));
    }
}
