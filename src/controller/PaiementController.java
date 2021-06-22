/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Paiement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ATH
 */
public class PaiementController {
    private final Connection connection;
    private  PreparedStatement preparedStatement;
    private  ResultSet resultSet;

    /**
     *class cree par defaut
     */
    public PaiementController(){
        this.connection = main.Gespay.getConnection();
    }
    /**
     * @param connection
     */
    public PaiementController(Connection connection){
        this.connection = connection;
    }
    
    /**
     *
     * @param id
     * @param id_personnel
     * @param id_annee
     * @param id_mois
     * @param prime_non_impo
     * @param prime_impo
     * @param rbg
     * @param rbgi
     * @param caisse_employer
     * @param caisse_employeur
     * @param anpe
     * @param abattement_pro
     * @param base_calcul_iuts
     * @param base_arondi
     * @param abattement_famil
     * @param allocation_famille
     * @param iuts
     * @param net_a_payer
     */
    public void addPaiement( 
            int id_personnel, 
            int id_annee, 
            int id_mois, 
            int prime_non_impo, 
            int prime_impo, 
            int rbg, 
            int rbgi, 
            int caisse_employer, 
            int caisse_employeur, 
            int anpe, 
            int abattement_pro, 
            int base_calcul_iuts, 
            int base_arondi, 
            int abattement_famil, 
            int allocation_famille, 
            int iuts, 
            int net_a_payer){
        try {
            String req = "INSERT INTO paiement(id_personnel, id_annee, id_mois, prime_non_impo, prime_impo, rbg, rbgi, caisse_employer, caisse_employeur, anpe, abattement_pro, base_calcul_iuts, base_arrondie, abattement_famil, allocation_famille, iuts, net_a_payer) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_personnel);
            preparedStatement.setInt(2, id_annee);
            preparedStatement.setInt(3, id_mois);
            preparedStatement.setInt(4, prime_non_impo);
            preparedStatement.setInt(5, prime_impo);
            preparedStatement.setInt(6, rbg);
            preparedStatement.setInt(7, rbgi);
            preparedStatement.setInt(8, caisse_employer);
            preparedStatement.setInt(9, caisse_employeur);
            preparedStatement.setInt(10, anpe);
            preparedStatement.setInt(11, abattement_pro);
            preparedStatement.setInt(12, base_calcul_iuts);
            preparedStatement.setInt(13, base_arondi);
            preparedStatement.setInt(14, abattement_famil);
            preparedStatement.setInt(15, allocation_famille);
            preparedStatement.setInt(16, iuts);
            preparedStatement.setInt(17, net_a_payer);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PaiementController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param id
     * @param id_personnel
     * @param id_annee
     * @param id_mois
     * @param prime_non_impo
     * @param prime_impo
     * @param rbg
     * @param rbgi
     * @param caisse_employer
     * @param caisse_employeur
     * @param anpe
     * @param abattement_pro
     * @param base_calcul_iuts
     * @param base_arondi
     * @param abattement_famil
     * @param allocation_famille
     * @param iuts
     * @param net_a_payer
     */
    public void updatePaiement(
            int id, 
            int id_personnel, 
            int id_annee, 
            int id_mois, 
            int prime_non_impo, 
            int prime_impo, 
            int rbg, 
            int rbgi, 
            int caisse_employer, 
            int caisse_employeur, 
            int anpe, 
            int abattement_pro, 
            int base_calcul_iuts, 
            int base_arondi, 
            int abattement_famil, 
            int allocation_famille, 
            int iuts, 
            int net_a_payer){
        try {
            String req = "UPDATE paiement SET id = ?, id_personnel = ?, id_annee = ?, id_mois = ?, prime_non_impo = ?, prime_impo = ?, rbg = ?, rbgi = ?, caisse_employer = ?, caisse_employeur = ?, anpe = ?, abattement_pro = ?, base_calcul_iuts = ?, base_arrondie = ?, abattement_famil = ?, allocation_famille = ?, iuts = ?, net_a_payer = ? WHERE id_paiement = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_personnel);
            preparedStatement.setInt(2, id_annee);
            preparedStatement.setInt(3, id_mois);
            preparedStatement.setInt(4, prime_non_impo);
            preparedStatement.setInt(5, prime_impo);
            preparedStatement.setInt(6, rbg);
            preparedStatement.setInt(7, rbgi);
            preparedStatement.setInt(8, caisse_employer);
            preparedStatement.setInt(9, caisse_employeur);
            preparedStatement.setInt(10, anpe);
            preparedStatement.setInt(11, abattement_pro);
            preparedStatement.setInt(12, base_calcul_iuts);
            preparedStatement.setInt(13, base_arondi);
            preparedStatement.setInt(14, abattement_famil);
            preparedStatement.setInt(15, allocation_famille);
            preparedStatement.setInt(16, iuts);
            preparedStatement.setInt(17, net_a_payer);
            preparedStatement.setInt(18, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PaiementController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id
     */
    public void removePaiement(int id){
        try {
            String req = "DELETE FROM paiement WHERE id_paiement = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PaiementController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Paiement getPaiement(int id){
        try {
            String req = "SELECT * FROM paiement WHERE id_paiement = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new Paiement(
                        resultSet.getInt("id_paiement"), 
                        resultSet.getInt("id_personnel"), 
                        resultSet.getInt("id_annee"), 
                        resultSet.getInt("id_mois"), 
                        resultSet.getInt("prime_non_impo"), 
                        resultSet.getInt("prime_impo"), 
                        resultSet.getInt("rbg"), 
                        resultSet.getInt("rbgi"), 
                        resultSet.getInt("caisse_employer"), 
                        resultSet.getInt("caisse_employeur"), 
                        resultSet.getInt("anpe"), 
                        resultSet.getInt("abattement_pro"), 
                        resultSet.getInt("base_calcul_iuts"), 
                        resultSet.getInt("base_arrondie"), 
                        resultSet.getInt("abattement_famil"), 
                        resultSet.getInt("allocation_famille"), 
                        resultSet.getInt("iuts"), 
                        resultSet.getInt("net_a_payer")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaiementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<Paiement> getPaiements(){
        try {
            ArrayList<Paiement> list = new ArrayList<>();
            String req = "SELECT * FROM paiement";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while(resultSet.next()){
                list.add(new Paiement(
                        resultSet.getInt("id_paiement"), 
                        resultSet.getInt("id_personnel"), 
                        resultSet.getInt("id_annee"), 
                        resultSet.getInt("id_mois"), 
                        resultSet.getInt("prime_non_impo"), 
                        resultSet.getInt("prime_impo"), 
                        resultSet.getInt("rbg"), 
                        resultSet.getInt("rbgi"), 
                        resultSet.getInt("caisse_employer"), 
                        resultSet.getInt("caisse_employeur"), 
                        resultSet.getInt("anpe"), 
                        resultSet.getInt("abattement_pro"), 
                        resultSet.getInt("base_calcul_iuts"), 
                        resultSet.getInt("base_arrondie"), 
                        resultSet.getInt("abattement_famil"), 
                        resultSet.getInt("allocation_famille"), 
                        resultSet.getInt("iuts"), 
                        resultSet.getInt("net_a_payer")
                ));
                return list;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaiementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
