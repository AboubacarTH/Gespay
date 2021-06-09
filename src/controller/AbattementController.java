/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Abattement;
import bean.Personnel;
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
public class AbattementController {
    private final Connection connection;
    private  PreparedStatement preparedStatement;
    private  ResultSet resultSet;

    /**
     *class cree par defaut
     */
    public AbattementController(){
        this.connection = main.Gespay.getConnection();
    }
    /**
     * @param connection
     */
    public AbattementController(Connection connection){
        this.connection = connection;
    }
    //method d'ajout, listage, modification et suppression
    
    /**
     * @param taux_charge_prof en pourcentage
     * @param taux_charge_famil en pourcentage
     * @param charge_depaysement
     * @param retenue_cnss
     * @param charge_patronale
     * @param id_personnel
     */
    public void addAbattement(double taux_charge_prof, double taux_charge_famil, double charge_depaysement, double retenue_cnss, double charge_patronale, double charge_anpe, int id_personnel){
        try {
            String req = "INSERT INTO abattement(charge_professionnelle, charge_familiale, charge_depaysement, retenue_cnss, charge_patronale, charge_anpe, id_personnel) VALUES (?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setDouble(1, taux_charge_prof);
            preparedStatement.setDouble(2, taux_charge_famil);
            preparedStatement.setDouble(3, charge_depaysement);
            preparedStatement.setDouble(4, retenue_cnss);
            preparedStatement.setDouble(5, charge_patronale);
            preparedStatement.setDouble(6, charge_anpe);
            preparedStatement.setInt(7, id_personnel);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AbattementController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * @param id_abattement id correspondant dans la table abattement
     * @param taux_charge_prof en pourcentage
     * @param taux_charge_famil en pourcentage
     * @param charge_depaysement
     * @param retenue_cnss
     * @param charge_patronale
     * @param charge_anpe
     * @param id_personnel
     */
    public void updateAbattement(int id_abattement, double taux_charge_prof, double taux_charge_famil, double charge_depaysement, double retenue_cnss, double charge_patronale, double charge_anpe, int id_personnel){
        try {
            String req = "UPDATE abattement SET charge_professionnelle = ?, charge_familiale = ?, charge_depaysement = ?, retenue_cnss = ?, charge_patronale = ?, id_personnel = ? WHERE id_abattement = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setDouble(1, taux_charge_prof);
            preparedStatement.setDouble(2, taux_charge_famil);
            preparedStatement.setDouble(3, charge_depaysement);
            preparedStatement.setDouble(4, retenue_cnss);
            preparedStatement.setDouble(5, charge_patronale);
            preparedStatement.setDouble(6, charge_anpe);
            preparedStatement.setInt(7, id_personnel);
            preparedStatement.setInt(8, id_abattement);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AbattementController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * @param id_abattement id correspondant dans la table abattement
     */
    public void removeAbattement(int id_abattement){
        try {
            String req = "DELETE FROM abattement WHERE id_abattement = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(3, id_abattement);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AbattementController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * @param id_abattement id correspondant dans la table abattement
     * @return bean.Abattement
     */
    public bean.Abattement getAbattement(int id_abattement){
        try {
            String req = "SELECT * FROM abattement WHERE id_abattement = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_abattement);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new bean.Abattement(resultSet.getInt("id_abattement"),resultSet.getDouble("charge_professionnelle"), resultSet.getDouble("charge_familiale"), resultSet.getDouble("charge_depaysement"), resultSet.getDouble("retenue_cnss"), resultSet.getDouble("charge_anpe"), resultSet.getInt("id_personnel"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AbattementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public bean.Abattement getAbattement(Personnel p){
        if(p == null){
            return null;
        }
        try {
            String req = "SELECT * FROM abattement WHERE id_personnel = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, p.getId());
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new bean.Abattement(resultSet.getInt("id_abattement"),resultSet.getDouble("charge_professionnelle"), resultSet.getDouble("charge_familiale"), resultSet.getDouble("charge_depaysement"), resultSet.getDouble("retenue_cnss"), resultSet.getDouble("charge_patronale"), resultSet.getDouble("charge_anpe"), resultSet.getInt("id_personnel"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AbattementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void update(int id_abattement, String libelle, double taux) {
        try {
            String req = "UPDATE abattement SET "+ libelle +" = '" + taux + "' WHERE id_abattement = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_abattement);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AbattementController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Abattement> getAbattements() {
        try {
            ArrayList<Abattement> list = new ArrayList<>();
            String req = "SELECT * FROM abattement ";
//            if(id_abattement != 0){
//                req += "WHERE id_abattement = '" + id_abattement + "' ";
//            }
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while(resultSet.next()){
                list.add(new bean.Abattement(resultSet.getInt("id_abattement"),resultSet.getDouble("charge_professionnelle"), resultSet.getDouble("charge_familiale"), resultSet.getDouble("charge_depaysement"), resultSet.getDouble("retenue_cnss"), resultSet.getDouble("charge_patronale"), resultSet.getDouble("charge_anpe"), resultSet.getInt("id_personnel")));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AbattementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
