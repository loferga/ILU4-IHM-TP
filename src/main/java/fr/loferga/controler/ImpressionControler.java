/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.loferga.controler;

import fr.loferga.model.exercice2.*;
import java.io.File;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author loferga
 */
public class ImpressionControler {
    
    public interface ParametresImpression {
        int getNbCopies();
        String getFormat();
        boolean isRectoVerso();
        String getCouleur();
        String getQualite();
    }
    
    private Impression toImpression(File file, ParametresImpression settings) {
        return new Impression(file,
                settings.getNbCopies(), Format.valueOf(settings.getFormat()),
                settings.isRectoVerso(), Couleur.valueOf(settings.getCouleur()),
                Qualite.valueOf(settings.getQualite())
        );
    }
    
    private final List<Impression> impressions = new ArrayList<>();
    
    public void addImpression(File file, ParametresImpression settings) {
        impressions.add(toImpression(file, settings));
        System.out.println(impressions);
    }
    
    public void modifyImpression(int numeroImpression, ParametresImpression settings) {
        Impression impression = impressions.get(numeroImpression);
        impression.setNbCopies(settings.getNbCopies());
        impression.setFormat(Format.valueOf(settings.getFormat()));
        impression.setRectoVerso(settings.isRectoVerso());
        impression.setCouleur(Couleur.valueOf(settings.getCouleur()));
        impression.setQualite(Qualite.valueOf(settings.getQualite()));
        System.out.println(impressions);
    }
    
    public void removeImpression(int numeroImpression) {
        impressions.remove(numeroImpression);
        System.out.println(impressions);
    }
    
    public ParametresImpression getImpression(int numeroImpression) {
        return new ParametresImpression() {
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
