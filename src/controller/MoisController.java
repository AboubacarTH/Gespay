/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Mois;
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
public class MoisController {
    private final Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public MoisController(){
        this.connection = main.Gespay.getConnection();
    }
    /**
     * @param connection
     */
    public MoisController(Connection connection){
        this.connection = connection;
    }
    
    /**
     *
     * @param libelle
     */
    public void addAmois(String libelle){
        try {
            String req = "INSERT INTO mois(libelle) VALUES (?) ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, libelle);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MoisController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_mois
     * @param libelle
     */
    public void updateMois(int id_mois, String libelle){
        try {
            String req = "UPDATE mois SET libelle = ? WHERE id_mois = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, libelle);
            preparedStatement.setInt(1, id_mois);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MoisController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_mois
     */
    public void removeMois(int id_mois){
        try {
            String req = "DELETE FROM mois WHERE id_mois = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_mois);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MoisController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_mois
     * @return
     */
    public Mois getMois(int id_mois){
        try {
            String req = "SELECT * FROM mois WHERE id_mois = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_mois);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new Mois(resultSet.getInt("id_mois"), resultSet.getString("libelle"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MoisController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param libelle
     * @return
     */
    public Mois getMois(String libelle){
        try {
            String req = "SELECT * FROM mois WHERE libelle = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, libelle);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new Mois(resultSet.getInt("id_mois"), resultSet.getString("libelle"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MoisController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @return
     */
    public ArrayList<Mois> getMois(){
        try {
            ArrayList<Mois> list = new ArrayList<>();
            String req = "SELECT * FROM mois ORDER BY id_mois ASC ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while(resultSet.next()){
                list.add(new Mois(resultSet.getInt("id_mois"), resultSet.getString("libelle")));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(MoisController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
