package org.soneech.springcourse;

import org.springframework.stereotype.Component;

@Component
public class MetalMusic implements Music {
    @Override
    public String getSong() {
        return "Black Anvil";
    }
}
