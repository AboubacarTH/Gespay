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
public class Paiement {
    private int id, 
            id_personnel, 
            id_annee, 
            id_mois, 
            prime_non_impo, 
            prime_impo, 
            rbg, 
            rbgi, 
            caisse_employer, 
            caisse_employeur, 
            anpe, 
            abattement_pro, 
            base_calcul_iuts, 
            base_arondi, 
            abattement_famil, 
            allocation_famille, 
            iuts, 
            net_a_payer;

    public Paiement() {
    }

    public Paiement(int id, int id_personnel, int id_annee, int id_mois, int prime_non_impo, int prime_impo, int rbg, int rbgi, int caisse_employer, int caisse_employeur, int anpe, int abattement_pro, int base_calcul_iuts, int base_arondi, int abattement_famil, int allocation_famille, int iuts, int net_a_payer) {
        this.id = id;
        this.id_personnel = id_personnel;
        this.id_annee = id_annee;
        this.id_mois = id_mois;
        this.prime_non_impo = prime_non_impo;
        this.prime_impo = prime_impo;
        this.rbg = rbg;
        this.rbgi = rbgi;
        this.caisse_employer = caisse_employer;
        this.caisse_employeur = caisse_employeur;
        this.anpe = anpe;
        this.abattement_pro = abattement_pro;
        this.base_calcul_iuts = base_calcul_iuts;
        this.base_arondi = base_arondi;
        this.abattement_famil = abattement_famil;
        this.allocation_famille = allocation_famille;
        this.iuts = iuts;
        this.net_a_payer = net_a_payer;
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

    public int getId_annee() {
        return id_annee;
    }

    public void setId_annee(int id_annee) {
        this.id_annee = id_annee;
    }

    public int getId_mois() {
        return id_mois;
    }

    public void setId_mois(int id_mois) {
        this.id_mois = id_mois;
    }

    public int getPrime_non_impo() {
        return prime_non_impo;
    }

    public void setPrime_non_impo(int prime_non_impo) {
        this.prime_non_impo = prime_non_impo;
    }

    public int getPrime_impo() {
        return prime_impo;
    }

    public void setPrime_impo(int prime_impo) {
        this.prime_impo = prime_impo;
    }

    public int getRbg() {
        return rbg;
    }

    public void setRbg(int rbg) {
        this.rbg = rbg;
    }

    public int getRbgi() {
        return rbgi;
    }

    public void setRbgi(int rbgi) {
        this.rbgi = rbgi;
    }

    public int getCaisse_employer() {
        return caisse_employer;
    }

    public void setCaisse_employer(int caisse_employer) {
        this.caisse_employer = caisse_employer;
    }

    public int getCaisse_employeur() {
        return caisse_employeur;
    }

    public void setCaisse_employeur(int caisse_employeur) {
        this.caisse_employeur = caisse_employeur;
    }

    public int getAnpe() {
        return anpe;
    }

    public void setAnpe(int anpe) {
        this.anpe = anpe;
    }

    public int getAbattement_pro() {
        return abattement_pro;
    }

    public void setAbattement_pro(int abattement_pro) {
        this.abattement_pro = abattement_pro;
    }

    public int getBase_calcul_iuts() {
        return base_calcul_iuts;
    }

    public void setBase_calcul_iuts(int base_calcul_iuts) {
        this.base_calcul_iuts = base_calcul_iuts;
    }

    public int getBase_arondi() {
        return base_arondi;
    }

    public void setBase_arondi(int base_arondi) {
        this.base_arondi = base_arondi;
    }

    public int getAbattement_famil() {
        return abattement_famil;
    }

    public void setAbattement_famil(int abattement_famil) {
        this.abattement_famil = abattement_famil;
    }

    public int getAllocation_famille() {
        return allocation_famille;
    }

    public void setAllocation_famille(int allocation_famille) {
        this.allocation_famille = allocation_famille;
    }

    public int getIuts() {
        return iuts;
    }

    public void setIuts(int iuts) {
        this.iuts = iuts;
    }

    public int getNet_a_payer() {
        return net_a_payer;
    }

    public void setNet_a_payer(int net_a_payer) {
        this.net_a_payer = net_a_payer;
    }
    
    
}
