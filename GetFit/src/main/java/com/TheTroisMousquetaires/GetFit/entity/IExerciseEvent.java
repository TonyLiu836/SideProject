package com.TheTroisMousquetaires.GetFit.entity;
import java.time.Duration;

public interface IExerciseEvent {
    Duration getDuration();
    void setDuration(Duration duration);
    
    String getAdditionalNotes();
    void setAdditionalNotes(String additionalNotes);
    String toString();
}