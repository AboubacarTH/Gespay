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
public class ImpotDu {
    private int id, tranche_valeur_maximale, montant;
    private double taux;
    private int iuts;

    public ImpotDu() {
    }

    public ImpotDu(int id, int tranche_valeur_maximale, int montant, double taux, int iuts) {
        this.id = id;
        this.tranche_valeur_maximale = tranche_valeur_maximale;
        this.montant = montant;
        this.taux = taux;
        this.iuts = iuts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTranche_valeur_maximale() {
        return tranche_valeur_maximale;
    }

    public void setTranche_valeur_maximale(int tranche_valeur_maximale) {
        this.tranche_valeur_maximale = tranche_valeur_maximale;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public int getIuts() {
        return iuts;
    }

    public void setIuts(int iuts) {
        this.iuts = iuts;
    }
    
    
}
