/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Annee;
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
public class AnneeController {
    private final Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public AnneeController(){
        this.connection = main.Gespay.getConnection();
    }
    /**
     * @param connection
     */
    public AnneeController(Connection connection){
        this.connection = connection;
    }
    
    public void addAnnee(String libelle){
        try {
            String req = "INSERT INTO annee(libelle) VALUES (?) ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, libelle);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnneeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateAnnee(int id_annee, String libelle){
        try {
            String req = "UPDATE annee SET libelle = ? WHERE id_annee = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, libelle);
            preparedStatement.setInt(1, id_annee);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnneeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void removeAnnee(int id_annee){
        try {
            String req = "DELETE FROM annee WHERE id_annee = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_annee);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnneeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_annee
     * @return
     */
    public Annee getAnnee(int id_annee){
        try {
            String req = "SELECT * FROM annee WHERE id_annee = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_annee);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new Annee(resultSet.getInt("id_annee"), resultSet.getString("libelle"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnneeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Annee getAnnee(String libelle){
        try {
            String req = "SELECT * FROM annee WHERE libelle = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, libelle);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new Annee(resultSet.getInt("id_annee"), resultSet.getString("libelle"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnneeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<Annee> getAnnees(){
        try {
            ArrayList<Annee> list = new ArrayList<>();
            String req = "SELECT * FROM annee ORDER BY id_annee ASC";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while(resultSet.next()){
                list.add(new Annee(resultSet.getInt("id_annee"), resultSet.getString("libelle")));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AnneeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
