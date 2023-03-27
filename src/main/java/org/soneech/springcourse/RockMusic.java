package org.soneech.springcourse;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic extends Music {
    public RockMusic() {
        songs.addAll(Arrays.asList(
                "Pain: Follow me", "The Offspring: Future is now", "Billy Talent: Dead silence"
        ));
    }
}
