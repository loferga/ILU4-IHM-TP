/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package fr.loferga.boundary;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

/**
 *
 * @author LFM4179A
 */
public class DrawingPanel extends javax.swing.JPanel {
    
    private record Line(Point pStart, Point pStop, Color color) {}
    
    private List<Line> lines = new ArrayList<>();
        
    private Point pStart = null, pStop = null;
    private boolean isDrawing = false;
    private Color color = null;
    
    /**
     * Creates new form DrawingPanel
     */
    public DrawingPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (isDrawing) {
            color = Color.MAGENTA;
            return;
        }
        pStart = evt.getPoint();
        isDrawing = true;
        color = SwingUtilities.isRightMouseButton(evt) ? Color.BLUE : Color.RED;
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if (!isDrawing) return;
        pStop = evt.getPoint();
        lines.add(new Line(pStart, pStop, color));
        pStart = null;
        pStop = null;
        isDrawing = false;
        color = null;
        repaint();
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        pStop = evt.getPoint();
        repaint();
    }//GEN-LAST:event_formMouseDragged
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for (Line l : lines) {
            g.setColor(l.color);
            g.drawLine(l.pStart.x, l.pStart.y, l.pStop.x, l.pStop.y);
        }
        
        if (pStart == null || pStop == null) return;
        
        g.setColor(Color.BLACK);
        g.drawLine(pStart.x, pStart.y, pStop.x, pStop.y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
