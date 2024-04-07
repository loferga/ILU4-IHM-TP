/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.loferga.controler;

import fr.loferga.model.exercice2.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author loferga
 */
public class ImpressionControler {
    
    public interface SimpleImpression {
        int getNbCopies();
        String getFormat();
        boolean isRectoVerso();
        String getCouleur();
        String getQualite();
    }
    
    private Impression toImpression(File file, SimpleImpression sImpr) {
        return new Impression(file, sImpr.getNbCopies(), Format.valueOf(sImpr.getFormat()), sImpr.isRectoVerso(), Couleur.valueOf(sImpr.getCouleur()), Qualite.valueOf(sImpr.getQualite()));
    }
    
    private final List<Impression> impressions = new ArrayList<>();
    
    public void addImpression(File file, SimpleImpression simpleImpression) {
        impressions.add(toImpression(file, simpleImpression));
        System.out.println(impressions);
    }
    
    public void setImpression(int numeroImpression, File file, SimpleImpression simpleImpression) {
        impressions.set(numeroImpression, toImpression(file, simpleImpression));
        System.out.println(impressions);
    }
    
    public void removeImpression(int numeroImpression) {
        impressions.remove(numeroImpression);
        System.out.println(impressions);
    }
    
    public SimpleImpression getImpression(int numeroImpression) {
        return new SimpleImpression() {
            private Impression getImpr() {
                return impressions.get(numeroImpression);
            }
            @Override
            public int getNbCopies() {return getImpr().getNbCopies();}
            @Override
            public String getFormat() {return getImpr().getFormat().toString();}
            @Override
            public boolean isRectoVerso(){return getImpr().isRectoVerso();}
            @Override
            public String getCouleur() {return getImpr().getCouleur().toString();}
            @Override
            public String getQualite() {return getImpr().getQualite().toString();}
        };
    }
    
}
