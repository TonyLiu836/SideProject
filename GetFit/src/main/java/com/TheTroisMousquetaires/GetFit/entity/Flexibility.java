package com.TheTroisMousquetaires.GetFit.entity;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Flexibility implements IExerciseEvent {
    private String name;
    private Duration duration;
    private String additionalNotes;

    public Flexibility(String name, Duration duration) {
        this.name = name;
        this.duration = duration;
        this.additionalNotes = "";
    }

    @Override
    public Duration getDuration() {
        return this.duration;
    }

    @Override
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String getAdditionalNotes() {
        return this.additionalNotes;
    }

    @Override
    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
      return  "Exercise name: " + name + ", Duration: " + duration.toString();
    }
}