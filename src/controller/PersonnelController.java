/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Personnel;
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
public class PersonnelController {
    private final Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public PersonnelController(){
        this.connection = main.Gespay.getConnection();

    }
    /**
     * @param connection
     */
    public PersonnelController(Connection connection){
        this.connection = connection;
    }
    //method d'ajout, listage, modification et suppression
    
    public void addPersonnel(String nom_prenom, String matricule, String telephone, String adresse, String fonction, int salaire, int charge, String status){
        try {
            String req = "INSERT INTO personnel(nom_prenom, matricule, telephone, adresse, fonction, salaire, charge, status) "
                    + "VALUES (?,?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, nom_prenom);
            preparedStatement.setString(2, matricule);
            preparedStatement.setString(3, telephone);
            preparedStatement.setString(4, adresse);
            preparedStatement.setString(5, fonction);
            preparedStatement.setInt(6, salaire);
            preparedStatement.setInt(7, charge);
            preparedStatement.setString(8, status);
            preparedStatement.executeUpdate();
            success_information();
        } catch (SQLException ex) {
            error_information();
            Logger.getLogger(PersonnelController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatePersonnel(String nom_prenom, String matricule, String telephone, String adresse, String fonction, int salaire, int charge,String status, int id_personnel){
        try {
            String req = "UPDATE personnel SET nom_prenom = ?, matricule = ?, telephone = ?, adresse = ?, fonction = ?, salaire = ?, charge = ?, status = ? "
                    + "WHERE id_personnel = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, nom_prenom);
            preparedStatement.setString(2, matricule);
            preparedStatement.setString(3, telephone);
            preparedStatement.setString(4, adresse);
            preparedStatement.setString(5, fonction);
            preparedStatement.setInt(6, salaire);
            preparedStatement.setInt(7, charge);
            preparedStatement.setString(8, status);
            preparedStatement.setInt(9, id_personnel);
            preparedStatement.executeUpdate();
            success_information();
        } catch (SQLException ex) {
            error_information();
            Logger.getLogger(PersonnelController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void removePersonnel(int id_personnel){
        try {
            String req = "DELETE FROM personnel WHERE id_personnel = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_personnel);
            preparedStatement.executeUpdate();
            success_information();
        } catch (SQLException ex) {
            error_information();
            Logger.getLogger(PersonnelController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Personnel getPersonnel(int id_personnel){
        try {
            String req = "SELECT * FROM personnel WHERE id_personnel = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_personnel);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new Personnel(resultSet.getInt("id_personnel"), resultSet.getString("nom_prenom"), resultSet.getString("matricule"), resultSet.getString("telephone"), resultSet.getString("adresse"), resultSet.getString("fonction"), resultSet.getInt("salaire"), resultSet.getInt("charge"), resultSet.getString("status"));
            }
        } catch (SQLException ex) {
            error_information();
            Logger.getLogger(PersonnelController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public int getDernierPersonnelEnregistrer(){
        try {
            String req = "SELECT MAX(id_personnel) AS id FROM personnel";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return resultSet.getInt("id");
            }
        } catch (SQLException ex) {
            error_information();
            Logger.getLogger(PersonnelController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public ArrayList<Personnel> getPersonnels(){
        try {
            ArrayList<Personnel> list = new ArrayList<>();
            String req = "SELECT * FROM personnel";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while(resultSet.next()){
                list.add(new Personnel(resultSet.getInt("id_personnel"), resultSet.getString("nom_prenom"), resultSet.getString("matricule"), resultSet.getString("telephone"), resultSet.getString("adresse"), resultSet.getString("fonction"), resultSet.getInt("salaire"), resultSet.getInt("charge"), resultSet.getString("status")));
            }
            return list;
        } catch (SQLException ex) {
            error_information();
            Logger.getLogger(PersonnelController.class.getName()).log(Level.SEVERE, null, ex);
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
