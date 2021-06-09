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
public class RetenueCnss {
    private int id;
    private double taux;
    private int id_personnel;

    public RetenueCnss() {
    }

    public RetenueCnss(int id, double taux, int id_personnel) {
        this.id = id;
        this.taux = taux;
        this.id_personnel = id_personnel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public int getId_personnel() {
        return id_personnel;
    }

    public void setId_personnel(int id_personnel) {
        this.id_personnel = id_personnel;
    }
    
}
