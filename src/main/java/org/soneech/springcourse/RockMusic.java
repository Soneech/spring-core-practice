package org.soneech.springcourse;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    public void doInit() {
        System.out.println("Doing rock music bean initialization...");
    }

    public void doDestroy() {
        System.out.println("Doing rock music bean destruction...");
    }
}
