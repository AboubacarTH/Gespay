/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.TypeRenumeration;
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
public class TypeRenumerationController {
    private final Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public TypeRenumerationController(){
        this.connection = main.Gespay.getConnection();
    }
    /**
     * @param connection
     */
    public TypeRenumerationController(Connection connection){
        this.connection = connection;
    }
    
    /**
     *
     * @param libelle
     */
    public void addType(String libelle){
        try {
            String req = "INSERT INTO type_renumeration(libelle) VALUES (?) ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, libelle);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TypeRenumerationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_type_renumeration
     * @param libelle
     */
    public void updateType(int id_type_renumeration, String libelle){
        try {
            String req = "UPDATE type_renumeration SET libelle = ? WHERE id_type_renumeration = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, libelle);
            preparedStatement.setInt(2, id_type_renumeration);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TypeRenumerationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id_type_renumeration
     */
    public void removeType(int id_type_renumeration){
        try {
            String req = "DELETE FROM type_renumeration WHERE id_type_renumeration = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_type_renumeration);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TypeRenumerationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param id_type_renumeration
     * @return
     */
    public TypeRenumeration getType(int id_type_renumeration){
        try {
            String req = "SELECT * FROM type_renumeration WHERE id_type_renumeration = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id_type_renumeration);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new TypeRenumeration(resultSet.getInt("id_type_renumeration"), resultSet.getString("libelle"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TypeRenumerationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public TypeRenumeration getType(String libelle){
        try {
            String req = "SELECT * FROM type_renumeration WHERE libelle = ? ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, libelle);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                return new TypeRenumeration(resultSet.getInt("id_type_renumeration"), resultSet.getString("libelle"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TypeRenumerationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
     *
     * @return ArrayList Type_renumeration
     */
    public ArrayList<TypeRenumeration> getTypes(){
        try {
            ArrayList<TypeRenumeration> list = new ArrayList<>();
            String req = "SELECT * FROM type_renumeration ";
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while(resultSet.next()){
                list.add(new TypeRenumeration(resultSet.getInt("id_type_renumeration"), resultSet.getString("libelle")));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(TypeRenumerationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
