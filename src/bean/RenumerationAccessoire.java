/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author ATH
 */
public class RenumerationAccessoire {
    private int id, id_personnel, id_type, montant;
    private String description;
    private int id_mois, id_annee;
    private boolean est_permanante, est_imposable;

    public RenumerationAccessoire() {
    }

    public RenumerationAccessoire(int id_personnel, int id_type, int montant, String description, int id_mois, int id_annee, boolean est_permanante, boolean est_imposable) {
        this.id_personnel = id_personnel;
        this.id_type = id_type;
        this.montant = montant;
        this.description = description;
        this.id_mois = id_mois;
        this.id_annee = id_annee;
        this.est_permanante = est_permanante;
        this.est_imposable = est_imposable;
    }

    public RenumerationAccessoire(int id, int id_personnel, int id_type, int montant, String description, int id_mois, int id_annee, boolean est_permanante, boolean est_imposable) {
        this.id = id;
        this.id_personnel = id_personnel;
        this.id_type = id_type;
        this.montant = montant;
        this.description = description;
        this.id_mois = id_mois;
        this.id_annee = id_annee;
        this.est_permanante = est_permanante;
        this.est_imposable = est_imposable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_personnel() {
        return id_personnel;
    }

    public void setId_personnel(int id_personnel) {
        this.id_personnel = id_personnel;
    }

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_mois() {
        return id_mois;
    }

    public void setId_mois(int id_mois) {
        this.id_mois = id_mois;
    }

    public int getId_annee() {
        return id_annee;
    }

    public void setId_annee(int id_annee) {
        this.id_annee = id_annee;
    }

    public boolean isEst_permanante() {
        return est_permanante;
    }

    public void setEst_permanante(boolean est_permanante) {
        this.est_permanante = est_permanante;
    }

    public boolean isEst_imposable() {
        return est_imposable;
    }

    public void setEst_imposable(boolean est_imposable) {
        this.est_imposable = est_imposable;
    }
    
}
