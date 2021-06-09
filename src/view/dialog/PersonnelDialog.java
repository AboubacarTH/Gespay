/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.dialog;

import bean.Personnel;
import controller.PersonnelController;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ATH
 */
public class PersonnelDialog extends javax.swing.JDialog {

    /** Creates new form Ajout Personnel
     * @param parent
     * @param modal */
    public PersonnelDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        personnelController = new PersonnelController();
        initComponents();
    }
    
    /** Creates new form Update Personnel
     * @param parent
     * @param modal
     * @param personnel */
    public PersonnelDialog(java.awt.Frame parent, boolean modal, Personnel personnel) {
        super(parent, modal);
        personnelController = new PersonnelController();
        this.personnel = personnel;
        initComponents();
        rSMTextFull_matricule.setText(personnel.getMatricule() == null? "": personnel.getMatricule());
        rSMTextFull_fonction.setText(personnel.getFonction() == null? "": personnel.getFonction());
        rSMTextFull_nom_prenom.setText(personnel.getNom_prenom() == null? "": personnel.getNom_prenom());
        rSMTextFull_adresse.setText(personnel.getAdresse() == null? "": personnel.getAdresse());
        rSMTextFull_telephone.setText(personnel.getTelephone() == null? "": personnel.getTelephone());
        rSMTextFull_salaire.setText("" + personnel.getSalaire());
        jSpinner_charge.setValue(personnel.getCharge());
        rSComboMetro_status.setSelectedItem("A");
        rSComboMetro_status.setSelectedItem(personnel.getStatus() == null ? personnel.getStatus(): "A");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSMTextFull_matricule = new rojeru_san.RSMTextFull();
        jLabel1 = new javax.swing.JLabel();
        rSMTextFull_nom_prenom = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        rSMTextFull_telephone = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        rSMTextFull_adresse = new rojeru_san.RSMTextFull();
        jLabel4 = new javax.swing.JLabel();
        rSMTextFull_salaire = new rojeru_san.RSMTextFull();
        jLabel5 = new javax.swing.JLabel();
        jSpinner_charge = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rSMTextFull_fonction = new rojeru_san.RSMTextFull();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        rSButtonRiple_enregistrer = new rojeru_san.RSButtonRiple();
        jLabel8 = new javax.swing.JLabel();
        rSComboMetro_status = new rojerusan.RSComboMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Boite de gestion de personnel");
        setModal(true);
        setResizable(false);

        rSMTextFull_matricule.setPlaceholder("");

        jLabel1.setText("Matricule");

        rSMTextFull_nom_prenom.setPlaceholder("");

        jLabel2.setText("Nom et Prénom");

        rSMTextFull_telephone.setPlaceholder("");

        jLabel3.setText("N° Tél");

        rSMTextFull_adresse.setPlaceholder("");

        jLabel4.setText("Adresse");

        rSMTextFull_salaire.setPlaceholder("");

        jLabel5.setText("Salaire");

        jSpinner_charge.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel6.setText("Charge");

        jLabel7.setText("Fonction");

        rSMTextFull_fonction.setPlaceholder("");

        rSButtonRiple_enregistrer.setText("Enrégistrer");
        rSButtonRiple_enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple_enregistrerActionPerformed(evt);
            }
        });

        jLabel8.setText("Status");

        rSComboMetro_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "I" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rSButtonRiple_enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rSMTextFull_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSMTextFull_telephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rSMTextFull_matricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rSMTextFull_fonction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rSMTextFull_salaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rSMTextFull_nom_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSComboMetro_status, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMTextFull_matricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(rSMTextFull_fonction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMTextFull_nom_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(rSComboMetro_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMTextFull_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(rSMTextFull_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMTextFull_salaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner_charge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRiple_enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRiple_enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple_enregistrerActionPerformed
        // si personnel est non null on le met a jour si non on cree un personnel
        if(rSMTextFull_nom_prenom.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Veuillez saisir le champ ", "Nom et Prénom incorrect !", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int salaire;
        try {
            salaire = Integer.parseInt(rSMTextFull_salaire.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Veuillez saisir un bon format ", "Salaire incorrect !", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(personnel != null){
            personnelController.updatePersonnel(rSMTextFull_nom_prenom.getText(), rSMTextFull_matricule.getText(), rSMTextFull_telephone.getText(), rSMTextFull_adresse.getText(), rSMTextFull_fonction.getText(), salaire, (int)jSpinner_charge.getValue(), rSComboMetro_status.getSelectedItem().toString(), personnel.getId());
        }else{
            personnelController.addPersonnel(rSMTextFull_nom_prenom.getText(), rSMTextFull_matricule.getText(), rSMTextFull_telephone.getText(), rSMTextFull_adresse.getText(), rSMTextFull_fonction.getText(), salaire, (int)jSpinner_charge.getValue(), rSComboMetro_status.getSelectedItem().toString());
            ArrayList<Integer> list = new ArrayList<>();
            list.add(personnelController.getDernierPersonnelEnregistrer());
            AbattementDialog abattementDialog = new AbattementDialog(null, true, list);
            abattementDialog.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_rSButtonRiple_enregistrerActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            PersonnelDialog dialog = new PersonnelDialog(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    private Personnel personnel;
    private final PersonnelController personnelController;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner_charge;
    private rojeru_san.RSButtonRiple rSButtonRiple_enregistrer;
    private rojerusan.RSComboMetro rSComboMetro_status;
    private rojeru_san.RSMTextFull rSMTextFull_adresse;
    private rojeru_san.RSMTextFull rSMTextFull_fonction;
    private rojeru_san.RSMTextFull rSMTextFull_matricule;
    private rojeru_san.RSMTextFull rSMTextFull_nom_prenom;
    private rojeru_san.RSMTextFull rSMTextFull_salaire;
    private rojeru_san.RSMTextFull rSMTextFull_telephone;
    // End of variables declaration//GEN-END:variables

}