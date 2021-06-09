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
public class Abattement {
    private int id;
    private double charge_professionnelle, charge_familiale, charge_depaysement, retenue_cnss, charge_patronale, charge_anpe;
    private int id_personnel;

    public Abattement() {
        
    }
    public Abattement(int id_abattement, double charge_professionnelle, double charge_familiale, double charge_depaysement, double retenue_cnss, double charge_patronale, double charge_anpe, int id_personnel) {
        this.id = id_abattement;
        this.charge_professionnelle = charge_professionnelle;
        this.charge_familiale = charge_familiale;
        this.id_personnel = id_personnel;
        this.charge_depaysement = charge_depaysement;
        this.retenue_cnss = retenue_cnss;
        this.charge_patronale = charge_patronale;
        this.charge_anpe = charge_anpe;
    }
    public Abattement(double charge_professionnelle, double charge_familiale, double charge_depaysement, double retenue_cnss, double charge_patronale, double charge_anpe, int id_personnel) {
        this.charge_professionnelle = charge_professionnelle;
        this.charge_familiale = charge_familiale;
        this.id_personnel = id_personnel;
        this.charge_depaysement = charge_depaysement;
        this.retenue_cnss = retenue_cnss;
        this.charge_patronale = charge_patronale;
        this.charge_anpe = charge_anpe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCharge_professionnelle() {
        return charge_professionnelle;
    }

    public void setCharge_professionnelle(double charge_professionnelle) {
        this.charge_professionnelle = charge_professionnelle;
    }

    public double getCharge_familiale() {
        return charge_familiale;
    }

    public void setCharge_familiale(double charge_familiale) {
        this.charge_familiale = charge_familiale;
    }

    public int getId_personnel() {
        return id_personnel;
    }

    public void setId_personnel(int id_personnel) {
        this.id_personnel = id_personnel;
    }

    public double getCharge_depaysement() {
        return charge_depaysement;
    }

    public void setCharge_depaysement(double charge_depaysement) {
        this.charge_depaysement = charge_depaysement;
    }

    public double getRetenue_cnss() {
        return retenue_cnss;
    }

    public void setRetenue_cnss(double retenue_cnss) {
        this.retenue_cnss = retenue_cnss;
    }

    public double getCharge_patronale() {
        return charge_patronale;
    }

    public void setCharge_patronale(double charge_patronale) {
        this.charge_patronale = charge_patronale;
    }

    public double getCharge_anpe() {
        return charge_anpe;
    }

    public void setCharge_anpe(double charge_anpe) {
        this.charge_anpe = charge_anpe;
    }
    
}
