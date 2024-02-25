package ru.anna.musicPlayer;

import org.springframework.stereotype.Component;

@Component("someClassicalMusic")
public class ClassicalMusic implements Music{
    public String getSong() {
        return "Венгерская рапсодия";
    }
}
