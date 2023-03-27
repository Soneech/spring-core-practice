package org.soneech.springcourse;

import java.util.ArrayList;
import java.util.List;

public abstract class Music {
    List<String> songs = new ArrayList<>();
    final List<String> getSongs() {
        return songs;
    }
}