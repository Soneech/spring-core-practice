package org.soneech.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MetalMusic extends Music {
    public MetalMusic() {
        songs.addAll(Arrays.asList(
                "Samael: Red Planet", "Dimmu Borgir: Gateways", "Abbath: To War!"
        ));
    }
}
