/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.panel;

import bean.AvantageEnNature;
import controller.AvantageEnNatureController;
import controller.PersonnelController;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.NumberRenderer;
import view.dialog.AvantageEnNatureDialog;

/**
 *
 * @author ATH
 */
public class AvantageEnNaturePanel extends javax.swing.JPanel {

    /**
     * Creates new form AvantageEnNaturePanel
     */
    public AvantageEnNaturePanel() {
        avantageEnNatureController = new AvantageEnNatureController();
        personnelController = new PersonnelController();
        initComponents();
        initTable();
        initNew();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        menu_item_update_avantage = new javax.swing.JMenuItem();
        menu_item_remove_avantage = new javax.swing.JMenuItem();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_avantage = new javax.swing.JTable();
        rSButtonRiple_ajouter = new rojeru_san.RSButtonRiple();
        rSButtonRiple_modifier_supprimer = new rojeru_san.RSButtonRiple();
        rSMTextFull_rechercher = new rojeru_san.RSMTextFull();

        menu_item_update_avantage.setText("Mettre à jour ces avantages");
        menu_item_update_avantage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_update_avantageActionPerformed(evt);
            }
        });
        popup.add(menu_item_update_avantage);

        menu_item_remove_avantage.setText("Retirer les avantages");
        menu_item_remove_avantage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_remove_avantageActionPerformed(evt);
            }
        });
        popup.add(menu_item_remove_avantage);

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/ressources/bo.jpg"))); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des avantages en nature par personnel"));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseReleased(evt);
            }
        });

        jTable_avantage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "NOM ET PRENOM", "LOGEMENT", "AMEUBLEMENT", "ELECTRICITE", "EAU", "TELEPHONE", "VEHICULE", "ID"
            }
        ));
        jTable_avantage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable_avantageMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_avantage);
        if (jTable_avantage.getColumnModel().getColumnCount() > 0) {
            jTable_avantage.getColumnModel().getColumn(0).setMinWidth(35);
            jTable_avantage.getColumnModel().getColumn(0).setPreferredWidth(35);
            jTable_avantage.getColumnModel().getColumn(0).setMaxWidth(35);
            jTable_avantage.getColumnModel().getColumn(2).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(2).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(2).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(3).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(3).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(3).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(4).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(4).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(4).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(5).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(5).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(5).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(6).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(6).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(6).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(7).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(7).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(7).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(8).setMinWidth(5);
            jTable_avantage.getColumnModel().getColumn(8).setPreferredWidth(5);
            jTable_avantage.getColumnModel().getColumn(8).setMaxWidth(5);
        }

        rSButtonRiple_ajouter.setText("Mettre à jour");
        rSButtonRiple_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple_ajouterActionPerformed(evt);
            }
        });

        rSButtonRiple_modifier_supprimer.setText("Supprimer");
        rSButtonRiple_modifier_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple_modifier_supprimerActionPerformed(evt);
            }
        });

        rSMTextFull_rechercher.setPlaceholder("Rechercher");

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(rSMTextFull_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(rSButtonRiple_modifier_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonRiple_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonRiple_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple_modifier_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMTextFull_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menu_item_update_avantageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_update_avantageActionPerformed
        updateAvantage();
    }//GEN-LAST:event_menu_item_update_avantageActionPerformed

    private void menu_item_remove_avantageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_remove_avantageActionPerformed
        removeAvantage();
    }//GEN-LAST:event_menu_item_remove_avantageActionPerformed

    private void jScrollPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseReleased
        popupAction(evt);
        if(evt.isPopupTrigger() && evt.getComponent() instanceof JScrollPane){
            popup.show(evt.getComponent(), evt.getX(), evt.getY());
            popup.setVisible(true);
        }
    }//GEN-LAST:event_jScrollPane1MouseReleased

    private void jTable_avantageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_avantageMouseReleased
        popupAction(evt);
        if(evt.isPopupTrigger() && evt.getComponent() instanceof JTable){
            popup.show(evt.getComponent(), evt.getX(), evt.getY());
            popup.setVisible(true);
        }
    }//GEN-LAST:event_jTable_avantageMouseReleased

    private void rSButtonRiple_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple_ajouterActionPerformed
        if(rSButtonRiple_ajouter.getText().equals("Ajouter")){
            //
        }else{
            updateAvantage();
        }
    }//GEN-LAST:event_rSButtonRiple_ajouterActionPerformed

    private void rSButtonRiple_modifier_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple_modifier_supprimerActionPerformed
        removeAvantage();
    }//GEN-LAST:event_rSButtonRiple_modifier_supprimerActionPerformed

    private final AvantageEnNatureController avantageEnNatureController;
    private final PersonnelController personnelController;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_avantage;
    private javax.swing.JMenuItem menu_item_remove_avantage;
    private javax.swing.JMenuItem menu_item_update_avantage;
    private javax.swing.JPopupMenu popup;
    private rojeru_san.RSButtonRiple rSButtonRiple_ajouter;
    private rojeru_san.RSButtonRiple rSButtonRiple_modifier_supprimer;
    private rojeru_san.RSMTextFull rSMTextFull_rechercher;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables

    private void popupAction(java.awt.event.MouseEvent evt) {
        int r = jTable_avantage.rowAtPoint(evt.getPoint());
        if(r >=0 && r < jTable_avantage.getRowCount()){
            jTable_avantage.setRowSelectionInterval(r, r);

        }else{
            jTable_avantage.clearSelection();
        }
        int index = jTable_avantage.getSelectedRow();
        if(index < 0){
            menu_item_remove_avantage.setEnabled(false);
            menu_item_update_avantage.setEnabled(false);
            initNew();
        }else{
            menu_item_remove_avantage.setEnabled(true);
            menu_item_update_avantage.setEnabled(true);
            initUpdate();
        }
    }
    private void updateAvantage() {
        int row = jTable_avantage.getSelectedRow();
        if(row < 0){
            return;
        }
        int id_avantage = Integer.parseInt(jTable_avantage.getValueAt(row, 8).toString());
        AvantageEnNatureDialog av = new AvantageEnNatureDialog(null, true, id_avantage);
        av.setVisible(true);
        initTable();
    }
    private void removeAvantage() {
        int choice = JOptionPane.showConfirmDialog(this, "Etes vous sure de vouloir supprimer ces avantages de " + jTable_avantage.getValueAt(jTable_avantage.getSelectedRow(), 1) + " ?", "Action irréversible", JOptionPane.YES_NO_OPTION);
        if(choice == 0){
            avantageEnNatureController.removeAvantageEnNature(Integer.parseInt(jTable_avantage.getValueAt(jTable_avantage.getSelectedRow(), 8).toString()));
        }
        initTable();
    }
    private void initNew() {
        rSButtonRiple_ajouter.setText("");
        rSButtonRiple_ajouter.setBackground(Color.green);
        rSButtonRiple_ajouter.setColorHover(new Color(0,200,0));
        rSButtonRiple_ajouter.setVisible(false);
        
        rSButtonRiple_modifier_supprimer.setText("");
        rSButtonRiple_modifier_supprimer.setBackground(new Color(0,112,192));
        rSButtonRiple_modifier_supprimer.setVisible(false);
    }
    
    private void initUpdate() {
        rSButtonRiple_ajouter.setText("Mettre à jour");
        rSButtonRiple_ajouter.setBackground(Color.orange);
        rSButtonRiple_ajouter.setColorHover(new Color(200,200,0));
        rSButtonRiple_ajouter.setVisible(true);
        
        rSButtonRiple_modifier_supprimer.setText("Suprimer");
        rSButtonRiple_modifier_supprimer.setBackground(Color.red);
        rSButtonRiple_modifier_supprimer.setColorHover(new Color(153,102,0));
        rSButtonRiple_modifier_supprimer.setVisible(true);
    }

    private void initTable() {
        initNew();
        String entete[] = {"N°", "NOM ET PRENOM", "LOGEMENT", "AMEUBLEMENT", "ELECTRICITE", "EAU", "TELEPHONE", "VEHICULE", "ID"};
        DefaultTableModel dt = new DefaultTableModel(null,entete);
        dt.setRowCount(0);
        
//        String annee = null, cycle = null, classe = null, rechercher = null, nationalite = null, sexe = null;
//        if(rSComboMetro_annee.getSelectedIndex() > -1){
//            annee = rSComboMetro_annee.getSelectedItem().toString();
//        }
//        if(rSComboMetro_cycle.getSelectedIndex() > -1){
//            cycle = rSComboMetro_cycle.getSelectedItem().toString();
//        }
//        if(rSComboMetro_classe.getSelectedIndex() > -1){
//            classe = rSComboMetro_classe.getSelectedItem().toString();
//        }
//        if(rSMTextFull_recherche.getText().length() > 0){
//            rechercher = rSMTextFull_recherche.getText();
//        }
//        if(rSComboMetro_nationalite.getSelectedIndex() > -1){
//            nationalite = rSComboMetro_nationalite.getSelectedItem().toString();
//        }
//        if(rSComboMetro_sexe.getSelectedIndex() > -1){
//            sexe = rSComboMetro_sexe.getSelectedItem().toString();
//        }
        ArrayList<AvantageEnNature> list_avantage = avantageEnNatureController.getAvantages();
        
        for(int i = 0; i< list_avantage.size(); i++){
            Object colonne[] = new Object[9];
            colonne[0] = i + 1;
            colonne[1] = personnelController.getPersonnel(list_avantage.get(i).getId_personnel()).getNom_prenom();
            colonne[2] = list_avantage.get(i).getLogement();
            colonne[3] = list_avantage.get(i).getAmeublement();
            colonne[4] = list_avantage.get(i).getElectricite();
            colonne[5] = list_avantage.get(i).getEau();
            colonne[6] = list_avantage.get(i).getTelephone();
            colonne[7] = list_avantage.get(i).getVehicule();
            colonne[8] = list_avantage.get(i).getId();
            System.out.println(list_avantage.get(i).getId());
            dt.addRow(colonne);
        }
        
        this.jTable_avantage.setModel(dt);
        if (jTable_avantage.getColumnModel().getColumnCount() > 0) {
            jTable_avantage.getColumnModel().getColumn(0).setMinWidth(35);
            jTable_avantage.getColumnModel().getColumn(0).setPreferredWidth(35);
            jTable_avantage.getColumnModel().getColumn(0).setMaxWidth(35);
            jTable_avantage.getColumnModel().getColumn(2).setCellRenderer(NumberRenderer.get_FCFA_render());
            jTable_avantage.getColumnModel().getColumn(2).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(2).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(2).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(3).setCellRenderer(NumberRenderer.get_FCFA_render());
            jTable_avantage.getColumnModel().getColumn(3).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(3).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(3).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(4).setCellRenderer(NumberRenderer.get_FCFA_render());
            jTable_avantage.getColumnModel().getColumn(4).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(4).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(4).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(5).setCellRenderer(NumberRenderer.get_FCFA_render());
            jTable_avantage.getColumnModel().getColumn(5).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(5).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(5).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(6).setCellRenderer(NumberRenderer.get_FCFA_render());
            jTable_avantage.getColumnModel().getColumn(6).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(6).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(6).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(7).setCellRenderer(NumberRenderer.get_FCFA_render());
            jTable_avantage.getColumnModel().getColumn(7).setMinWidth(120);
            jTable_avantage.getColumnModel().getColumn(7).setPreferredWidth(130);
            jTable_avantage.getColumnModel().getColumn(7).setMaxWidth(160);
            jTable_avantage.getColumnModel().getColumn(8).setMinWidth(5);
            jTable_avantage.getColumnModel().getColumn(8).setPreferredWidth(5);
            jTable_avantage.getColumnModel().getColumn(8).setMaxWidth(5);
            jTable_avantage.setRowHeight(30);
            jTable_avantage.getTableHeader().setBackground(new Color(0,112,192));
            jTable_avantage.getTableHeader().setForeground(Color.white);
            jTable_avantage.getTableHeader().setFont(new Font("Cambria Math", Font.BOLD, 13));
            jTable_avantage.setFont(new Font("Cambria Math", Font.BOLD, 12));
        }
    }
}
