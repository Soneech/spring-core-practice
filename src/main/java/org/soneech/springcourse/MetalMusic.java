package org.soneech.springcourse;

public class MetalMusic implements Music {
    @Override
    public String getSong() {
        return "Black Anvil";
    }

    public void doInit() {
        System.out.println("Doing metal music bean initialization...");
    }

    public void doDestroy() {
        System.out.println("Doing metal music bean destruction...");
    }
}
