/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.dialog;

import bean.Personnel;
import bean.RenumerationAccessoire;
import controller.AnneeController;
import controller.MoisController;
import controller.PersonnelController;
import controller.RenumerationAccessoireController;
import controller.TypeRenumerationController;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ATH
 */
public class RenumerationDialog extends javax.swing.JDialog {

    /**
     * Creates new form AvantageEnNatureDialog
     * @param parent
     * @param modal
     */
    public RenumerationDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        personnelController = new PersonnelController();
        anneeController = new AnneeController();
        moisController = new MoisController();
        typeRenumerationController = new TypeRenumerationController();
        renumerationAccessoireController = new RenumerationAccessoireController();
        initComponents();
        initCBPersonnel();
        initCBAnnee();
        initCBMois();
        initCBTypeRenumeration();
    }
    
    /**
     *
     * @param parent
     * @param modal
     * @param id_personnels
     */
    public RenumerationDialog(java.awt.Frame parent, boolean modal, ArrayList<Integer> id_personnels) {
        super(parent, modal);
        id_renumeration_accessoire = 0;
        this.id_personnels = id_personnels;
        personnelController = new PersonnelController();
        anneeController = new AnneeController();
        moisController = new MoisController();
        typeRenumerationController = new TypeRenumerationController();
        renumerationAccessoireController = new RenumerationAccessoireController();
        initComponents();
        initCBPersonnel();
        initCBAnnee();
        initCBMois();
        initCBTypeRenumeration();
    }
    
    /**
     *
     * @param parent
     *
     * @param id_renumeration @param modal
     */
    public RenumerationDialog(java.awt.Frame parent, boolean modal, int id_renumeration) {
        super(parent, modal);
        this.id_renumeration_accessoire = id_renumeration;
        id_personnels = new ArrayList<>();
        personnelController = new PersonnelController();
        anneeController = new AnneeController();
        moisController = new MoisController();
        typeRenumerationController = new TypeRenumerationController();
        renumerationAccessoireController = new RenumerationAccessoireController();
        RenumerationAccessoire renum = renumerationAccessoireController.getRenumeration(id_renumeration_accessoire);
        id_personnels.add(renum.getId_personnel());
        initComponents();
        initCBPersonnel();
        initCBAnnee();
        initCBMois();
        initCBTypeRenumeration();
        rSComboMetro_annee.setSelectedItem(anneeController.getAnnee(renum.getId_annee()).getLibelle());
        rSComboMetro_mois.setSelectedItem(moisController.getMois(renum.getId_mois()).getLibelle());
        rSComboMetro_personnels.removeAllItems();
        rSComboMetro_personnels.addItem(personnelController.getPersonnel(renum.getId_personnel()).getNom_prenom());
        rSComboMetro_type_renumeration.setSelectedItem(typeRenumerationController.getType(renum.getId_type()).getLibelle());
        rSMTextFull_montant.setText("" + renum.getMontant());
        jTextPane_description.setText(renum.getDescription());
        jCheckBox_est_permanante.setSelected(renum.isEst_permanante());
        jCheckBox_imposable.setSelected(renum.isEst_imposable());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSComboMetro_personnels = new rojerusan.RSComboMetro();
        jLabel1 = new javax.swing.JLabel();
        rSButtonRiple_valider = new rojeru_san.RSButtonRiple();
        rSComboMetro_type_renumeration = new rojerusan.RSComboMetro();
        jLabel2 = new javax.swing.JLabel();
        rSMTextFull_montant = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane_description = new javax.swing.JTextPane();
        rSComboMetro_annee = new rojerusan.RSComboMetro();
        jLabel4 = new javax.swing.JLabel();
        rSComboMetro_mois = new rojerusan.RSComboMetro();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBox_est_permanante = new javax.swing.JCheckBox();
        jCheckBox_imposable = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion des rénumerations accessoires");
        setResizable(false);

        jLabel1.setText("Personnel(s)");

        rSButtonRiple_valider.setText("Valider");
        rSButtonRiple_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple_validerActionPerformed(evt);
            }
        });

        jLabel2.setText("Type de rénumeration");

        rSMTextFull_montant.setPlaceholder("");

        jLabel3.setText("Montant");

        jTextPane_description.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Description"));
        jScrollPane2.setViewportView(jTextPane_description);

        jLabel4.setText("Année");

        jLabel5.setText("Mois");

        jCheckBox_est_permanante.setText("Cette rénumeration est elle permanante ?");

        jCheckBox_imposable.setText("Cette rénumeration est elle imposable ?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSComboMetro_type_renumeration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSMTextFull_montant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSComboMetro_personnels, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSComboMetro_annee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSComboMetro_mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_est_permanante)
                    .addComponent(jCheckBox_imposable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonRiple_valider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSComboMetro_annee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rSComboMetro_mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSComboMetro_personnels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSComboMetro_type_renumeration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMTextFull_montant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox_est_permanante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox_imposable))
                    .addComponent(rSButtonRiple_valider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRiple_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple_validerActionPerformed
        int montant;
        try {
            montant = Integer.parseInt(rSMTextFull_montant.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Saisir un montant correct ! ", "Format incorrect !", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(id_renumeration_accessoire != 0){
            id_personnels.forEach(id -> {
                renumerationAccessoireController.updateRenumeration(
                        id_renumeration_accessoire, 
                        id,
                        typeRenumerationController.getType(rSComboMetro_type_renumeration.getSelectedItem().toString()).getId(), 
                        montant, 
                        jTextPane_description.getText(), 
                        anneeController.getAnnee(rSComboMetro_annee.getSelectedItem().toString()).getId(), 
                        moisController.getMois(rSComboMetro_mois.getSelectedItem().toString()).getId(), 
                        jCheckBox_est_permanante.isSelected(),
                        jCheckBox_imposable.isSelected()
                );
            });
        }else{
            id_personnels.forEach(id -> {
                renumerationAccessoireController.addRenumeration(
                        id,
                        typeRenumerationController.getType(rSComboMetro_type_renumeration.getSelectedItem().toString()).getId(), 
                        montant, 
                        jTextPane_description.getText(), 
                        anneeController.getAnnee(rSComboMetro_annee.getSelectedItem().toString()).getId(), 
                        moisController.getMois(rSComboMetro_mois.getSelectedItem().toString()).getId(), 
                        jCheckBox_est_permanante.isSelected(),
                        jCheckBox_imposable.isSelected()
                );
            });
        }
        JOptionPane.showMessageDialog(null, "Opération effectuée avec succes ", "Réussie !", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_rSButtonRiple_validerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RenumerationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RenumerationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RenumerationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RenumerationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            RenumerationDialog dialog = new RenumerationDialog(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    private ArrayList<Integer> id_personnels;
    private final PersonnelController personnelController;
    private int id_renumeration_accessoire;
    private final AnneeController anneeController;
    private final MoisController moisController;
    private final TypeRenumerationController typeRenumerationController;
    private final RenumerationAccessoireController renumerationAccessoireController;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox_est_permanante;
    private javax.swing.JCheckBox jCheckBox_imposable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane_description;
    private rojeru_san.RSButtonRiple rSButtonRiple_valider;
    private rojerusan.RSComboMetro rSComboMetro_annee;
    private rojerusan.RSComboMetro rSComboMetro_mois;
    private rojerusan.RSComboMetro rSComboMetro_personnels;
    private rojerusan.RSComboMetro rSComboMetro_type_renumeration;
    private rojeru_san.RSMTextFull rSMTextFull_montant;
    // End of variables declaration//GEN-END:variables



    
    private void initCBPersonnel() {
        rSComboMetro_personnels.removeAllItems();
        id_personnels.forEach(id -> {
            Personnel p = personnelController.getPersonnel(id);
            System.out.println(id);
            rSComboMetro_personnels.addItem(p.getNom_prenom());
        });
    }
    private void initCBAnnee() {
        rSComboMetro_annee.removeAllItems();
        anneeController.getAnnees().forEach((a) -> {
            rSComboMetro_annee.addItem(a.getLibelle());
        });
    }
    private void initCBMois() {
        rSComboMetro_mois.removeAllItems();
        moisController.getMois().forEach((m) -> {
            rSComboMetro_mois.addItem(m.getLibelle());
        });
    }
    private void initCBTypeRenumeration() {
        rSComboMetro_type_renumeration.removeAllItems();
        typeRenumerationController.getTypes().forEach((t) -> {
            rSComboMetro_type_renumeration.addItem(t.getLibelle());
        });
    }
}
