/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.loferga.boundary;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author loferga
 */
public class MyPanel extends JPanel {
    
    private Point pStart = null, pStop = null;
    
    public MyPanel() {
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pStart = evt.getPoint();
            }
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pStop = evt.getPoint();
                repaint();
            }
        });
        this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pStop = evt.getPoint();
                repaint();
            }
        });
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (pStart == null || pStop == null) return;
        
        g.drawRect(pStart.x, pStart.y, pStop.x - pStart.x, pStop.y - pStart.y);
    }
    
}
