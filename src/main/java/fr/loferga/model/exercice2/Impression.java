/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.loferga.model.exercice2;

import java.io.File;

/**
 *
 * @author loferga
 */
public class Impression {
    
    private File file;
    private int nbCopies;
    private Format format;
    private boolean rectoVerso;
    private Couleur couleur;
    private Qualite qualite;
    
    public Impression(File file, int nbCopies, Format format, boolean rectoVerso, Couleur couleur, Qualite qualite) {
        this.file = file;
        this.nbCopies = nbCopies;
        this.format = format;
        this.rectoVerso = rectoVerso;
        this.couleur = couleur;
        this.qualite = qualite;
    }

    public int getNbCopies() {
        return nbCopies;
    }

    public Format getFormat() {
        return format;
    }

    public boolean isRectoVerso() {
        return rectoVerso;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public Qualite getQualite() {
        return qualite;
    }
    
}
