/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.panel;

import bean.Annee;
import bean.Mois;
import bean.RenumerationAccessoire;
import controller.AnneeController;
import controller.MoisController;
import controller.PersonnelController;
import controller.RenumerationAccessoireController;
import controller.TypeRenumerationController;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.NumberRenderer;
import view.dialog.RenumerationDialog;

/**
 *
 * @author ATH
 */
public class RenumerationPanel extends javax.swing.JPanel {

    /**
     * Creates new form AvantageEnNaturePanel
     */
    public RenumerationPanel() {
        personnelController = new PersonnelController();
        anneeController = new AnneeController();
        moisController = new MoisController();
        typeRenumerationController = new TypeRenumerationController();
        renumerationAccessoireController = new RenumerationAccessoireController();
        initComponents();
        initCBAnee();
        initCBMois();
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
        menu_item_update_renumeration = new javax.swing.JMenuItem();
        menu_item_remove_renumeration = new javax.swing.JMenuItem();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        rSButtonRiple_ajouter = new rojeru_san.RSButtonRiple();
        rSButtonRiple_modifier_supprimer = new rojeru_san.RSButtonRiple();
        rSMTextFull_rechercher = new rojeru_san.RSMTextFull();
        jLabel1 = new javax.swing.JLabel();
        rSComboMetro_annee = new rojerusan.RSComboMetro();
        jLabel2 = new javax.swing.JLabel();
        rSComboMetro_mois = new rojerusan.RSComboMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_renumeration = new javax.swing.JTable();

        menu_item_update_renumeration.setText("Mettre à jour cette rénumeration");
        menu_item_update_renumeration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_update_renumerationActionPerformed(evt);
            }
        });
        popup.add(menu_item_update_renumeration);

        menu_item_remove_renumeration.setText("Retirer cette rénumeration");
        menu_item_remove_renumeration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_remove_renumerationActionPerformed(evt);
            }
        });
        popup.add(menu_item_remove_renumeration);

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/ressources/bo.jpg"))); // NOI18N

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
        rSMTextFull_rechercher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rSMTextFull_rechercherKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Année");

        rSComboMetro_annee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSComboMetro_anneeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mois");

        rSComboMetro_mois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSComboMetro_moisActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des rénumerations accessoires par personnel"));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseReleased(evt);
            }
        });

        jTable_renumeration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "NOM ET PRENOM", "TYPE RENUMERATION", "MONTANT", "DESCRIPTION", "ANNEE", "MOIS", "PERMANANTE", "IMPOSABLE", "ID"
            }
        ));
        jTable_renumeration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable_renumerationMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_renumeration);
        if (jTable_renumeration.getColumnModel().getColumnCount() > 0) {
            jTable_renumeration.getColumnModel().getColumn(0).setMinWidth(35);
            jTable_renumeration.getColumnModel().getColumn(0).setPreferredWidth(35);
            jTable_renumeration.getColumnModel().getColumn(0).setMaxWidth(35);
            jTable_renumeration.getColumnModel().getColumn(2).setMinWidth(120);
            jTable_renumeration.getColumnModel().getColumn(2).setPreferredWidth(130);
            jTable_renumeration.getColumnModel().getColumn(2).setMaxWidth(160);
            jTable_renumeration.getColumnModel().getColumn(3).setMinWidth(120);
            jTable_renumeration.getColumnModel().getColumn(3).setPreferredWidth(130);
            jTable_renumeration.getColumnModel().getColumn(3).setMaxWidth(160);
            jTable_renumeration.getColumnModel().getColumn(5).setMinWidth(120);
            jTable_renumeration.getColumnModel().getColumn(5).setPreferredWidth(130);
            jTable_renumeration.getColumnModel().getColumn(5).setMaxWidth(160);
            jTable_renumeration.getColumnModel().getColumn(6).setMinWidth(120);
            jTable_renumeration.getColumnModel().getColumn(6).setPreferredWidth(130);
            jTable_renumeration.getColumnModel().getColumn(6).setMaxWidth(160);
            jTable_renumeration.getColumnModel().getColumn(7).setMinWidth(120);
            jTable_renumeration.getColumnModel().getColumn(7).setPreferredWidth(130);
            jTable_renumeration.getColumnModel().getColumn(7).setMaxWidth(160);
            jTable_renumeration.getColumnModel().getColumn(8).setMinWidth(120);
            jTable_renumeration.getColumnModel().getColumn(8).setPreferredWidth(130);
            jTable_renumeration.getColumnModel().getColumn(8).setMaxWidth(160);
            jTable_renumeration.getColumnModel().getColumn(9).setMinWidth(10);
            jTable_renumeration.getColumnModel().getColumn(9).setPreferredWidth(10);
            jTable_renumeration.getColumnModel().getColumn(9).setMaxWidth(10);
        }

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(rSMTextFull_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(rSButtonRiple_modifier_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonRiple_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSComboMetro_annee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSComboMetro_mois, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSComboMetro_annee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(rSComboMetro_mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menu_item_update_renumerationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_update_renumerationActionPerformed
        updateRenumeration();
    }//GEN-LAST:event_menu_item_update_renumerationActionPerformed

    private void menu_item_remove_renumerationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_remove_renumerationActionPerformed
        removeRenumeration();
    }//GEN-LAST:event_menu_item_remove_renumerationActionPerformed

    private void jScrollPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseReleased
        popupAction(evt);
        if(evt.isPopupTrigger() && evt.getComponent() instanceof JScrollPane){
            popup.show(evt.getComponent(), evt.getX(), evt.getY());
            popup.setVisible(true);
        }
    }//GEN-LAST:event_jScrollPane1MouseReleased

    private void jTable_renumerationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_renumerationMouseReleased
        popupAction(evt);
        if(evt.isPopupTrigger() && evt.getComponent() instanceof JTable){
            popup.show(evt.getComponent(), evt.getX(), evt.getY());
            popup.setVisible(true);
        }
    }//GEN-LAST:event_jTable_renumerationMouseReleased

    private void rSButtonRiple_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple_ajouterActionPerformed
        if(rSButtonRiple_ajouter.getText().equals("Ajouter")){
            //
        }else{
            updateRenumeration();
        }
    }//GEN-LAST:event_rSButtonRiple_ajouterActionPerformed

    private void rSButtonRiple_modifier_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple_modifier_supprimerActionPerformed
        removeRenumeration();
    }//GEN-LAST:event_rSButtonRiple_modifier_supprimerActionPerformed

    private void rSComboMetro_anneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSComboMetro_anneeActionPerformed
        initTable();
    }//GEN-LAST:event_rSComboMetro_anneeActionPerformed

    private void rSComboMetro_moisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSComboMetro_moisActionPerformed
        initTable();
    }//GEN-LAST:event_rSComboMetro_moisActionPerformed

    private void rSMTextFull_rechercherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rSMTextFull_rechercherKeyReleased
        initTable();
    }//GEN-LAST:event_rSMTextFull_rechercherKeyReleased

    private final PersonnelController personnelController;
    private final AnneeController anneeController;
    private final MoisController moisController;
    private final TypeRenumerationController typeRenumerationController;
    private final RenumerationAccessoireController renumerationAccessoireController;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_renumeration;
    private javax.swing.JMenuItem menu_item_remove_renumeration;
    private javax.swing.JMenuItem menu_item_update_renumeration;
    private javax.swing.JPopupMenu popup;
    private rojeru_san.RSButtonRiple rSButtonRiple_ajouter;
    private rojeru_san.RSButtonRiple rSButtonRiple_modifier_supprimer;
    private rojerusan.RSComboMetro rSComboMetro_annee;
    private rojerusan.RSComboMetro rSComboMetro_mois;
    private rojeru_san.RSMTextFull rSMTextFull_rechercher;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables

    private void popupAction(java.awt.event.MouseEvent evt) {
        int r = jTable_renumeration.rowAtPoint(evt.getPoint());
        if(r >=0 && r < jTable_renumeration.getRowCount()){
            jTable_renumeration.setRowSelectionInterval(r, r);

        }else{
            jTable_renumeration.clearSelection();
        }
        int index = jTable_renumeration.getSelectedRow();
        if(index < 0){
            menu_item_remove_renumeration.setEnabled(false);
            menu_item_update_renumeration.setEnabled(false);
            initNew();
        }else{
            menu_item_remove_renumeration.setEnabled(true);
            menu_item_update_renumeration.setEnabled(true);
            initUpdate();
        }
    }
    private void updateRenumeration() {
        int row = jTable_renumeration.getSelectedRow();
        if(row < 0){
            return;
        }
        int id_renumeration = Integer.parseInt(jTable_renumeration.getValueAt(row, 9).toString());
        RenumerationDialog renumerationDialog = new RenumerationDialog(null, true, id_renumeration);
        renumerationDialog.setVisible(true);
        initTable();
    }
    private void removeRenumeration() {
        int choice = JOptionPane.showConfirmDialog(this, "Etes vous sure de vouloir supprimer cette rénumeration de " + jTable_renumeration.getValueAt(jTable_renumeration.getSelectedRow(), 1) + " ?", "Action irréversible", JOptionPane.YES_NO_OPTION);
        if(choice == 0){
            renumerationAccessoireController.removeRenumeration(Integer.parseInt(jTable_renumeration.getValueAt(jTable_renumeration.getSelectedRow(), 9).toString()));
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
        String entete[] = {"N°", "NOM ET PRENOM", "TYPE RENUMERATION", "MONTANT", "DESCRIPTION", "ANNEE", "MOIS", "PERMANANTE", "IMPOSABLE", "ID"};
        DefaultTableModel dt = new DefaultTableModel(null,entete);
        dt.setRowCount(0);
        
        String annee = null, mois = null, rechercher = null;
        if(rSComboMetro_annee.getSelectedIndex() > -1){
            annee = rSComboMetro_annee.getSelectedItem().toString();
        }
        if(rSComboMetro_mois.getSelectedIndex() > -1){
            mois = rSComboMetro_mois.getSelectedItem().toString();
        }
        
        if(rSMTextFull_rechercher.getText().length() > 0){
            rechercher = rSMTextFull_rechercher.getText();
        }
        int id_annee = 0, id_mois = 0;
        Annee an = anneeController.getAnnee(annee); 
        if(an != null){
            id_annee = an.getId();
        }
        Mois m = moisController.getMois(mois);
        if(m != null){
            id_mois = m.getId();
        }
        ArrayList<RenumerationAccessoire> list_renumeration = renumerationAccessoireController.getRenumerations(id_annee, id_mois, rechercher, 0);
        
        for(int i = 0; i< list_renumeration.size(); i++){
            Object colonne[] = new Object[10];
            colonne[0] = i + 1;
            colonne[1] = personnelController.getPersonnel(list_renumeration.get(i).getId_personnel()).getNom_prenom();
            colonne[2] = typeRenumerationController.getType(list_renumeration.get(i).getId_type()).getLibelle();
            colonne[3] = list_renumeration.get(i).getMontant();
            colonne[4] = list_renumeration.get(i).getDescription();
            colonne[5] = anneeController.getAnnee(list_renumeration.get(i).getId_annee()).getLibelle();
            colonne[6] = moisController.getMois(list_renumeration.get(i).getId_mois()).getLibelle();
            colonne[7] = list_renumeration.get(i).isEst_permanante() ? "Oui" : "Non";
            colonne[8] = list_renumeration.get(i).isEst_imposable() ? "Oui" : "Non";
            colonne[9] = list_renumeration.get(i).getId();
            //System.out.println(list_renumeration.get(i).getId());
            dt.addRow(colonne);
        }
        
        this.jTable_renumeration.setModel(dt);
        if (jTable_renumeration.getColumnModel().getColumnCount() > 0) {
            jTable_renumeration.getColumnModel().getColumn(0).setMinWidth(35);
            jTable_renumeration.getColumnModel().getColumn(0).setPreferredWidth(35);
            jTable_renumeration.getColumnModel().getColumn(0).setMaxWidth(35);
            jTable_renumeration.getColumnModel().getColumn(1).setMinWidth(230);
            jTable_renumeration.getColumnModel().getColumn(1).setPreferredWidth(230);
            jTable_renumeration.getColumnModel().getColumn(1).setMaxWidth(230);
            
            jTable_renumeration.getColumnModel().getColumn(2).setMinWidth(150);
            jTable_renumeration.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable_renumeration.getColumnModel().getColumn(2).setMaxWidth(150);
            
            jTable_renumeration.getColumnModel().getColumn(3).setCellRenderer(NumberRenderer.get_FCFA_render());
            jTable_renumeration.getColumnModel().getColumn(3).setMinWidth(120);
            jTable_renumeration.getColumnModel().getColumn(3).setPreferredWidth(130);
            jTable_renumeration.getColumnModel().getColumn(3).setMaxWidth(160);
            
            jTable_renumeration.getColumnModel().getColumn(4).setMinWidth(250);
            jTable_renumeration.getColumnModel().getColumn(4).setPreferredWidth(250);
            jTable_renumeration.getColumnModel().getColumn(4).setMaxWidth(250);
            
            jTable_renumeration.getColumnModel().getColumn(5).setMinWidth(90);
            jTable_renumeration.getColumnModel().getColumn(5).setPreferredWidth(90);
            jTable_renumeration.getColumnModel().getColumn(5).setMaxWidth(90);
            
            jTable_renumeration.getColumnModel().getColumn(6).setMinWidth(90);
            jTable_renumeration.getColumnModel().getColumn(6).setPreferredWidth(90);
            jTable_renumeration.getColumnModel().getColumn(6).setMaxWidth(90);
            
            jTable_renumeration.getColumnModel().getColumn(7).setMinWidth(100);
            jTable_renumeration.getColumnModel().getColumn(7).setPreferredWidth(130);
            jTable_renumeration.getColumnModel().getColumn(7).setMaxWidth(130);
            jTable_renumeration.getColumnModel().getColumn(8).setMinWidth(100);
            jTable_renumeration.getColumnModel().getColumn(8).setPreferredWidth(130);
            jTable_renumeration.getColumnModel().getColumn(8).setMaxWidth(130);
            
            jTable_renumeration.getColumnModel().getColumn(9).setMinWidth(5);
            jTable_renumeration.getColumnModel().getColumn(9).setPreferredWidth(5);
            jTable_renumeration.getColumnModel().getColumn(9).setMaxWidth(5);
            jTable_renumeration.setRowHeight(30);
            jTable_renumeration.getTableHeader().setBackground(new Color(0,112,192));
            jTable_renumeration.getTableHeader().setForeground(Color.white);
            jTable_renumeration.getTableHeader().setFont(new Font("Cambria Math", Font.BOLD, 13));
            jTable_renumeration.setFont(new Font("Cambria Math", Font.BOLD, 12));
            //jTable_renumeration.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        }
    }

    private void initCBAnee() {
        rSComboMetro_annee.removeAllItems();
        rSComboMetro_annee.addItem("Toutes");
        anneeController.getAnnees().forEach((a) -> {
            rSComboMetro_annee.addItem(a.getLibelle());
        });
    }

    private void initCBMois() {
        rSComboMetro_mois.removeAllItems();
        rSComboMetro_mois.addItem("Tous");
        moisController.getMois().forEach((m) -> {
            rSComboMetro_mois.addItem(m.getLibelle());
        });
    }
}
