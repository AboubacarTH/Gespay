/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.RetenueCnss;
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
public class RetenueCnssController {
    private final Connection connection;
    private  PreparedStatement preparedStatement;
    private  ResultSet resultSet;

    /**
     *class cree par defaut
     */
    public RetenueCnssController(){
        this.connection = main.Gespay.getConnection();
    }
    /**
     * @param connection
     */
    public RetenueCnssController(Connection connection){
        this.connection = connection;
    }
    
    /**
     *
     * @param taux
     * @param id_personnel
     */
    public void addRetenue(double taux, int id_personnel){
        try {
            String req = "INSERT INTO retenue_cnss(taux, id_personnel) VALUES (?,?)";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setDouble(1, taux);
            preparedStatement.setInt(2, id_personnel);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RetenueCnssController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_retenue_cnss
     * @param taux
     * @param id_personnel
     */
    public void updateRetenue(int id_retenue_cnss, double taux, int id_personnel){
        try {
            String req = "UPDATE retenue_cnss SET = taux, id_personnel = ? WHERE id_retenue_cnss = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setDouble(1, taux);
            preparedStatement.setInt(2, id_personnel);
            preparedStatement.setInt(3, id_retenue_cnss);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RetenueCnssController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_retenue_cnss
     */
    public void removeRetenue(int id_retenue_cnss){
        try {
            String req = "DELETE FROM retenue_cnss WHERE id_retenue_cnss = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_retenue_cnss);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RetenueCnssController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_retenue_cnss
     * @return null
     */
    public RetenueCnss getRetenue(int id_retenue_cnss){
        try {
            String req = "SELECT * FROM retenue_cnss WHERE id_retenue_cnss = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_retenue_cnss);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new RetenueCnss(resultSet.getInt("id_retenue_cnss"), resultSet.getDouble("taux"), resultSet.getInt("id_personnel"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RetenueCnssController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<RetenueCnss> getRetenues(){
        try {
            ArrayList<RetenueCnss> list = new ArrayList<>();
            String req = "SELECT * FROM retenue_cnss ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while(resultSet.next()){
                list.add(new RetenueCnss(resultSet.getInt("id_retenue_cnss"), resultSet.getDouble("taux"), resultSet.getInt("id_personnel")));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(RetenueCnssController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
