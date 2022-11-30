package cazatalentos;

import javax.swing.JOptionPane;


public class VUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form VUsuarios1
     */
    public VUsuarios() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void limpiar() {
        userField.setText("");
        active.setSelected(false);
        inactive.setSelected(false);
        nameField.setText("");
        surnameField.setText("");

    }
    
    public boolean consultar() {
        boolean existe = false;
        for (Usuarios u: Main.usuarios) {
            if (u.getUsername().equals(searchField.getText())) {
                limpiar();
                userField.setText(u.getUsername());
                active.setSelected(u.isEstado());
                inactive.setSelected(!u.isEstado());
                nameField.setText(u.getNombre());
                surnameField.setText(u.getApellidos());

            }
        }
                    
        return existe;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        userField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        modify = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        active = new javax.swing.JCheckBox();
        inactive = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        searchField.setToolTipText("Ingrese el usuario o id");

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        searchBtn.setToolTipText("Consultar usuario");
        searchBtn.setBorder(null);
        searchBtn.setBorderPainted(false);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar usuario");

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trash-can.png"))); // NOI18N
        delete.setToolTipText("Borrar usuario");
        delete.setBorder(null);
        delete.setBorderPainted(false);
        delete.setContentAreaFilled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        add.setToolTipText("Agregar usuario");
        add.setBorder(null);
        add.setBorderPainted(false);
        add.setContentAreaFilled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        userField.setEditable(false);

        modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lapiz.png"))); // NOI18N
        modify.setToolTipText("Modificar usuario");
        modify.setBorder(null);
        modify.setBorderPainted(false);
        modify.setContentAreaFilled(false);
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Estado:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Apellidos:");

        nameField.setEditable(false);

        surnameField.setEditable(false);

        active.setText("Activo");
        active.setEnabled(false);

        inactive.setText("Inactivo");
        inactive.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)
                                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(66, 66, 66)
                                .addComponent(active)
                                .addGap(34, 34, 34)
                                .addComponent(inactive)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(modify, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modify, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(active)
                                .addComponent(inactive)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel6))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        if (searchField.getText().isEmpty()) {
            limpiar();
            JOptionPane.showMessageDialog(null, "Por favor ingrese una identificacion o nombre usuario");
        } else {
            limpiar();
            consultar();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        //        if (searchField.getText().isEmpty()) {
            //            limpiar();
            //            JOptionPane.showMessageDialog(null, "Por favor ingrese una identificacion o nombre usuario");
            //        } else if (!consultar()) {
            //            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            //        } else if (!Auth.admin) {
            //            JOptionPane.showMessageDialog(null, "Solo un administrador puede borrar");
            //        } else {
            //            int r = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar este usuario", "Eliminando usuario...", JOptionPane.YES_NO_OPTION);
            //            if (r == 0) {
                //                System.out.print("Yes");
                //                borrar();
                //            }
            //        }
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if (Auth.admin == true) {
            new RegistrarUsuario().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Solo un administrador puede agregar nuevos usuarios, por favor inicie sesion");
            new Auth().setVisible(true);
        }

    }//GEN-LAST:event_addActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_modifyActionPerformed

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
            java.util.logging.Logger.getLogger(VUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox active;
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JCheckBox inactive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton modify;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField surnameField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
