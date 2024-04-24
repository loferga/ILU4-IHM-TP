/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.loferga.boundary.exercice3;

import java.time.LocalDateTime;
import javax.swing.Timer;
import javax.swing.event.EventListenerList;

/**
 *
 * @author LFM4179A
 */
public class TimeModel {
    private EventListenerList listenerList;
    private final Timer timer;
    private LocalDateTime time;
    
    public TimeModel() {
        listenerList = new EventListenerList();
        timer = new Timer(1000, evt -> fireTimeChangedEvent());
        timer.start();
        time = LocalDateTime.now();
    }
    
    public LocalDateTime getTime() {
        return this.time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    public void addTimeModelListener(TimeModelListener listener) {
        listenerList.add(TimeModelListener.class, listener);
    }
    public void removeTimeModelListener(TimeModelListener listener) {
        listenerList.remove(TimeModelListener.class, listener);
    }
    private void fireTimeChangedEvent() {
        time = LocalDateTime.now();
        TimeModelEvent event = new TimeModelEvent(this, this.time);
        TimeModelListener[] listeners = listenerList.getListeners(TimeModelListener.class);
        for (TimeModelListener listener : listeners)
            listener.timeChanged(event);
    }
}
