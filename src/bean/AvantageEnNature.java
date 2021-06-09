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
public class AvantageEnNature {
    private int id, logement, ameublement, electricite, eau, telephone, vehicule, id_personnel;

    public AvantageEnNature() {
    }

    public AvantageEnNature(int logement, int ameublement, int electricite, int eau, int telephone, int vehicule, int id_personnel) {
        this.logement = logement;
        this.ameublement = ameublement;
        this.electricite = electricite;
        this.eau = eau;
        this.telephone = telephone;
        this.vehicule = vehicule;
        this.id_personnel = id_personnel;
    }
    
    public AvantageEnNature(int id_avantage_en_nature, int logement, int ameublement, int electricite, int eau, int telephone, int vehicule, int id_personnel) {
        this.id = id_avantage_en_nature;
        this.logement = logement;
        this.ameublement = ameublement;
        this.electricite = electricite;
        this.eau = eau;
        this.telephone = telephone;
        this.vehicule = vehicule;
        this.id_personnel = id_personnel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLogement() {
        return logement;
    }

    public void setLogement(int logement) {
        this.logement = logement;
    }

    public int getAmeublement() {
        return ameublement;
    }

    public void setAmeublement(int ameublement) {
        this.ameublement = ameublement;
    }

    public int getElectricite() {
        return electricite;
    }

    public void setElectricite(int electricite) {
        this.electricite = electricite;
    }

    public int getEau() {
        return eau;
    }

    public void setEau(int eau) {
        this.eau = eau;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getVehicule() {
        return vehicule;
    }

    public void setVehicule(int vehicule) {
        this.vehicule = vehicule;
    }

    public int getId_personnel() {
        return id_personnel;
    }

    public void setId_personnel(int id_personnel) {
        this.id_personnel = id_personnel;
    }
    
}
