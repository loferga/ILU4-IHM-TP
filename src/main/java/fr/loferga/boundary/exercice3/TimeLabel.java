/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.loferga.boundary.exercice3;

import java.time.LocalDateTime;
import javax.swing.JLabel;

/**
 *
 * @author loferga
 */
public class TimeLabel extends JLabel implements TimeModelListener {
    
    public TimeLabel() {
        super();
        updateTime(LocalDateTime.now());
    }
    
    private void updateTime(LocalDateTime time) {
        super.setText(time.getHour() + "h " + time.getMinute() + "m " + time.getSecond() + "s");
    }

    @Override
    public void timeChanged(TimeModelEvent evt) {
        updateTime(evt.getTime());
    }
    
}
