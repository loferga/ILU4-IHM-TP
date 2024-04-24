/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.loferga.boundary.exercice3;

import java.util.EventListener;

/**
 *
 * @author LFM4179A
 */
public interface TimeModelListener extends EventListener {
    public void timeChanged(TimeModelEvent evt);
}
