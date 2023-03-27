package org.soneech.springcourse;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doInit() {
        System.out.println("Doing classical music bean initialization...");
    }

    public void doDestroy() {
        System.out.println("Doing classical music bean destruction...");
    }
}
