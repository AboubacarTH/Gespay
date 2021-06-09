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
public class Personnel {
    private int id;
    private String nom_prenom, matricule, telephone, adresse, fonction, status;
    private int salaire, charge;

    public Personnel() {
    }

    public Personnel(String nom_prenom, String matricule, String telephone, String adresse, String fonction, int salaire, int charge, String status) {
        this.nom_prenom = nom_prenom;
        this.matricule = matricule;
        this.telephone = telephone;
        this.adresse = adresse;
        this.fonction = fonction;
        this.salaire = salaire;
        this.charge = charge;
        this.status = status;
    }

    public Personnel(int id_personnel, String nom_prenom, String matricule, String telephone, String adresse, String fonction, int salaire, int charge, String status) {
        this.id = id_personnel;
        this.nom_prenom = nom_prenom;
        this.matricule = matricule;
        this.telephone = telephone;
        this.adresse = adresse;
        this.fonction = fonction;
        this.salaire = salaire;
        this.charge = charge;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_prenom() {
        return nom_prenom;
    }

    public void setNom_prenom(String nom_prenom) {
        this.nom_prenom = nom_prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
