/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.loferga.boundary.exercice3;

import java.time.LocalDateTime;
import java.util.EventObject;

/**
 *
 * @author LFM4179A
 */
public class TimeModelEvent extends EventObject {
    private LocalDateTime time;
    public TimeModelEvent(TimeModel source, LocalDateTime time) {
        super(source);
        this.time = time;
    }
    public LocalDateTime getTime() {
        return this.time;
    }
}
