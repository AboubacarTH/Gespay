/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.ImpotDu;
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
public class ImpotDuController {
    private final Connection connection;
    private  PreparedStatement preparedStatement;
    private  ResultSet resultSet;

    /**
     *class cree par defaut
     */
    public ImpotDuController(){
        this.connection = main.Gespay.getConnection();
    }
    /**
     * @param connection
     */
    public ImpotDuController(Connection connection){
        this.connection = connection;
    }

    /**
     *
     * @param tranche_valeur_max
     * @param montant
     * @param taux
     * @param iuts
     */
    public void addImpot(int tranche_valeur_max, int montant, double taux, int iuts){
        try {
            String req = "INSERT INTO impot_du(tranche_valeur_max, montant, taux, iuts) VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, tranche_valeur_max);
            preparedStatement.setInt(2, montant);
            preparedStatement.setDouble(3, taux);
            preparedStatement.setInt(4, iuts);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImpotDuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_impot_du
     * @param tranche_valeur_max
     * @param montant
     * @param taux
     * @param iuts
     */
    public void updateImpot(int id_impot_du, int tranche_valeur_max, int montant, double taux, int iuts){
        try {
            String req = "UPDATE impot_du SET tranche_valeur_max = ?, montant = ?, taux = ?, iuts = ? WHERE id_impot_du = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, tranche_valeur_max);
            preparedStatement.setInt(2, montant);
            preparedStatement.setDouble(3, taux);
            preparedStatement.setInt(4, iuts);
            preparedStatement.setInt(5, id_impot_du);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImpotDuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_impot_du
     */
    public void removeImpot(int id_impot_du){
        try {
            String req = "DELETE FROM impot_du WHERE id_impot_du = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_impot_du);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImpotDuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_impot_du
     * @return impotDu
     */
    public ImpotDu getImpot(int id_impot_du){
        try {
            String req = "SELECT * FROM impot_du WHERE id_impot_du = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_impot_du);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new ImpotDu(resultSet.getInt("id_impot_du"), resultSet.getInt("tranche_valeur_max"), resultSet.getInt("montant"), resultSet.getDouble("taux"), resultSet.getInt("iuts"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpotDuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<ImpotDu> getImpots(){
        try {
            ArrayList<ImpotDu> list = new ArrayList<>();
            String req = "SELECT * FROM impot_du ORDER BY tranche_valeur_max ASC ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while(resultSet.next()){
                list.add(new ImpotDu(resultSet.getInt("id_impot_du"), resultSet.getInt("tranche_valeur_max"), resultSet.getInt("montant"), resultSet.getDouble("taux"), resultSet.getInt("iuts")));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ImpotDuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
