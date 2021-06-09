/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.RenumerationAccessoire;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ATH
 */
public class RenumerationAccessoireController {
    private final Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public RenumerationAccessoireController(){
        this.connection = main.Gespay.getConnection();
    }
    /**
     * @param connection
     */
    public RenumerationAccessoireController(Connection connection){
        this.connection = connection;
    }

    /**
     *
     * @param id_personnel
     * @param id_type_renumeration
     * @param montant
     * @param description
     * @param id_annee
     * @param id_mois
     * @param est_permanante
     */
    public void addRenumeration(int id_personnel, int id_type_renumeration, int montant, String description, int id_annee, int id_mois, boolean est_permanante, boolean est_imposable){
        try {
            String req = "INSERT INTO renumeration_accessoire(id_personnel, id_type_renumeration, montant, description, id_annee, id_mois, est_permanante, imposable) VALUES (?,?,?,?,?,?,?,?) ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_personnel);
            preparedStatement.setInt(2, id_type_renumeration);
            preparedStatement.setInt(3, montant);
            preparedStatement.setString(4, description);
            preparedStatement.setInt(5, id_annee);
            preparedStatement.setInt(6, id_mois);
            preparedStatement.setBoolean(7, est_permanante);
            preparedStatement.setBoolean(8, est_imposable);
            preparedStatement.executeUpdate();
            //success_information();
        } catch (SQLException ex) {
            //error_information();
            Logger.getLogger(RenumerationAccessoireController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_renumeration_accessoire
     * @param id_personnel
     * @param id_type_renumeration
     * @param montant
     * @param description
     * @param id_annee
     * @param id_mois
     * @param est_permanante
     */
    public void updateRenumeration(int id_renumeration_accessoire, int id_personnel, int id_type_renumeration, int montant, String description, int id_annee, int id_mois, boolean est_permanante, boolean est_imposable){
        try {
            String req = "UPDATE renumeration_accessoire SET id_personnel = ?, id_type_renumeration = ?, montant = ?, description = ?, id_annee = ?, id_mois = ?, est_permanante = ?, imposable = ? WHERE id_renumeration_accessoire = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_personnel);
            preparedStatement.setInt(2, id_type_renumeration);
            preparedStatement.setInt(3, montant);
            preparedStatement.setString(4, description);
            preparedStatement.setInt(5, id_annee);
            preparedStatement.setInt(6, id_mois);
            preparedStatement.setBoolean(7, est_permanante);
            preparedStatement.setBoolean(8, est_imposable);
            preparedStatement.setInt(9, id_renumeration_accessoire);
            preparedStatement.executeUpdate();
            //success_information();
        } catch (SQLException ex) {
            //error_information();
            Logger.getLogger(RenumerationAccessoireController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_renumeration_accessoire
     */
    public void removeRenumeration(int id_renumeration_accessoire){
        try {
            String req = "DELETE FROM renumeration_accessoire WHERE id_renumeration_accessoire = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_renumeration_accessoire);
            preparedStatement.executeUpdate();
            success_information();
        } catch (SQLException ex) {
            error_information();
            Logger.getLogger(RenumerationAccessoireController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_renumeration_accessoire
     * @return
     */
    public RenumerationAccessoire getRenumeration(int id_renumeration_accessoire){
        try {
            String req = "SELECT * FROM renumeration_accessoire WHERE id_renumeration_accessoire = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_renumeration_accessoire);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new RenumerationAccessoire(resultSet.getInt("id_renumeration_accessoire"), resultSet.getInt("id_personnel"), resultSet.getInt("id_type_renumeration"), resultSet.getInt("montant"), resultSet.getString("description"), resultSet.getInt("id_mois"), resultSet.getInt("id_annee"), resultSet.getBoolean("est_permanante"), resultSet.getBoolean("imposable"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RenumerationAccessoireController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param id_annee
     * @param id_mois
     * @param rechercher
     * @return
     */
    public ArrayList<RenumerationAccessoire> getRenumerations(int id_annee, int id_mois, String rechercher, int id_personnel){
        try {
            ArrayList<RenumerationAccessoire> list = new ArrayList<>();
            String req = "SELECT * FROM renumeration_accessoire JOIN personnel ON "
                    + "renumeration_accessoire.id_personnel = personnel.id_personnel WHERE id_renumeration_accessoire > '0' ";
            if(id_annee != 0){
                req += "AND id_annee = '" + id_annee + "' ";
                
            }
            if(id_mois != 0){
                req += "AND id_mois = '" + id_mois + "' ";
            }
            if(rechercher != null){
                req += "AND (personnel.nom_prenom LIKE '%" + rechercher + "%' OR  personnel.matricule LIKE '%" + rechercher + "%') ";
            }
            if(id_personnel != 0){
                req += "AND renumeration_accessoire.id_personnel = '" + id_personnel + "' ";
            }
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while(resultSet.next()){
                list.add(new RenumerationAccessoire(resultSet.getInt("id_renumeration_accessoire"), resultSet.getInt("id_personnel"), resultSet.getInt("id_type_renumeration"), resultSet.getInt("montant"), resultSet.getString("description"), resultSet.getInt("id_mois"), resultSet.getInt("id_annee"), resultSet.getBoolean("est_permanante"), resultSet.getBoolean("imposable")));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(RenumerationAccessoireController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    private void success_information() {
        JOptionPane.showMessageDialog(null, "Opération effectuée avec succes ", "Réussie !", JOptionPane.INFORMATION_MESSAGE);
    }
    private void error_information(){
        JOptionPane.showMessageDialog(null, "Opération echouée ", "Echec !", JOptionPane.WARNING_MESSAGE);
    }
}
