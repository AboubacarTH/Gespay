/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.AvantageEnNature;
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
public class AvantageEnNatureController {
    private final Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public AvantageEnNatureController(){
        this.connection = main.Gespay.getConnection();
    }
    /**
     * @param connection
     */
    public AvantageEnNatureController(Connection connection){
        this.connection = connection;
    }
    //method d'ajout, listage, modification et suppression
    
    /**
     *
     * @param logement
     * @param ameublement
     * @param electricite
     * @param eau
     * @param telephone
     * @param vehicule
     * @param id_personnel
     */
    public void addAvantageEnNature(int logement, int ameublement, int electricite, int eau, int telephone, int vehicule, int id_personnel){
        try {
            String req = "INSERT INTO avantage_en_nature(logement, ameublement, electricite, eau, telephone, vehicule, id_personnel) "
                    + "VALUES (?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, logement);
            preparedStatement.setInt(2, ameublement);
            preparedStatement.setInt(3, electricite);
            preparedStatement.setInt(4, eau);
            preparedStatement.setInt(5, telephone);
            preparedStatement.setInt(6, vehicule);
            preparedStatement.setInt(7, id_personnel);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AvantageEnNatureController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param id_avantage_en_nature
     * @param logement
     * @param ameublement
     * @param electricite
     * @param eau
     * @param telephone
     * @param vehicule
     */
    public void updateAvantageEnNature(int id_avantage_en_nature, int logement, int ameublement, int electricite, int eau, int telephone, int vehicule, int id_personnel){
        try {
            String req = "UPDATE avantage_en_nature SET logement = ?, ameublement = ?, electricite = ?, eau = ?, telephone = ?, vehicule = ?, id_personnel = ? "
                    + "WHERE id_avantage_en_nature = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, logement);
            preparedStatement.setInt(2, ameublement);
            preparedStatement.setInt(3, electricite);
            preparedStatement.setInt(4, eau);
            preparedStatement.setInt(5, telephone);
            preparedStatement.setInt(6, vehicule);
            preparedStatement.setInt(7, id_personnel);
            preparedStatement.setInt(8, id_avantage_en_nature);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AvantageEnNatureController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param id_avantage_en_nature
     */
    public void removeAvantageEnNature(int id_avantage_en_nature){
        try {
            String req = "DELETE FROM avantage_en_nature WHERE id_avantage_en_nature = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_avantage_en_nature);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AvantageEnNatureController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param id_avantage_en_nature
     * @return bean.AvantageEnNature
     */
    public AvantageEnNature getAvantageEnNature(int id_avantage_en_nature){
        try {
            String req = "SELECT * FROM avantage_en_nature WHERE id_avantage_en_nature = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_avantage_en_nature);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new bean.AvantageEnNature(resultSet.getInt("id_avantage_en_nature"),resultSet.getInt("logement"), resultSet.getInt("ameublement"), resultSet.getInt("electricite"),resultSet.getInt("eau"), resultSet.getInt("telephone"), resultSet.getInt("vehicule"), resultSet.getInt("id_personnel"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AvantageEnNatureController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public AvantageEnNature getAvantageEnNature(Personnel p){
        if(p == null){
            return null;
        }
        try {
            String req = "SELECT * FROM avantage_en_nature WHERE id_personnel = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, p.getId());
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new bean.AvantageEnNature(resultSet.getInt("id_avantage_en_nature"),resultSet.getInt("logement"), resultSet.getInt("ameublement"), resultSet.getInt("electricite"),resultSet.getInt("eau"), resultSet.getInt("telephone"), resultSet.getInt("vehicule"), resultSet.getInt("id_personnel"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AvantageEnNatureController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<AvantageEnNature> getAvantages(){
        try {
            ArrayList<AvantageEnNature> list = new ArrayList<>();
            String req = "SELECT * FROM avantage_en_nature ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while(resultSet.next()){
                list.add(new bean.AvantageEnNature(resultSet.getInt("id_avantage_en_nature"),resultSet.getInt("logement"), resultSet.getInt("ameublement"), resultSet.getInt("electricite"),resultSet.getInt("eau"), resultSet.getInt("telephone"), resultSet.getInt("vehicule"), resultSet.getInt("id_personnel")));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AvantageEnNatureController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void update(int id_avantage, String libelle, int montant) {
        try {
            String req = "UPDATE avantage_en_nature SET "+ libelle +" = '" + montant + "' WHERE id_avantage_en_nature = ?";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_avantage);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AvantageEnNatureController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
