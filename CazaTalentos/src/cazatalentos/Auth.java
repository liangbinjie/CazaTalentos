package cazatalentos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Auth extends javax.swing.JFrame {
    ImageIcon img = new ImageIcon("src\\icons\\logo.png");
    public static boolean admin; // booleano para verificar si el usuario entrante es un administrador
    public static boolean padre, entrenador; // o padre o entrenador
    public static String nombre, apellido;
    public static int id;
    public static String edad, identificacion, phone, city, address, email;
    

    public Auth() {
        initComponents();
        setResizable(false);
        setTitle("Login Sistema Caza Talentos");
        setLocationRelativeTo(null);
        setIconImage(img.getImage());
        admin = false;
        padre = false;
        entrenador = false;
    }
    
    
    // Funcion para autenticar el usuario
    public boolean autenticar() {
        boolean autenticado = false;
        for (Usuarios u: Main.usuarios) {
            if (u.getUsername().equals(userField.getText()) && u.getPassword().equals(pass.getText()) && u.isEstado() == true) {
                switch (u.getRole()) {
                    case "Administrador" : admin = true;
                    case "Padre/Madre" : padre = true;
                    case "Entrenador" : entrenador = true;
                }
                nombre = u.getNombre();
                apellido = u.getApellidos();
                id = u.getId();
                autenticado = true;
                rellenar();
            } else if (userField.getText().isEmpty() || pass.getText().isEmpty()) {
                authMsg.setText("Ingrese un usuario o contrasena");
            } else if (u.isEstado() == false) {
                JOptionPane.showMessageDialog(null, "Usuario inactivo");
            } else {
                authMsg.setText("Credenciales incorrectas");
            }
        }
        return autenticado;
    }
        
    public static void rellenar() {
        if (padre) {
            for (Padres p: Main.padres) { // cambiar esto 
                if (Auth.id == p.getId()) {
                    edad = String.valueOf(p.getEdad());
                    identificacion = String.valueOf(p.getIdentificacion());
                    phone = String.valueOf(p.getTelefono());
                    city = p.getCiudad();
                    address = p.getDireccion();
                    email = p.getEmail();       
                }
            }
        } else if (entrenador) {
            for (Persona e: Main.entrenadores) {
                if (Auth.id == e.getId()) {
                    edad = String.valueOf(e.getEdad());
                    identificacion = String.valueOf(e.getIdentificacion());
                    phone = String.valueOf(e.getTelefono());
                    city = e.getCiudad();
                    address = e.getDireccion();
                    email = e.getEmail();       
                }
            }
        } else if (admin) {
            nombre = "";
            apellido = "";
            id = 0;
        }

    }
    
    public static void limpiar() {
        edad = "";
        identificacion = "";
        phone = "";
        city = "";
        address = "";
        email = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        authMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login Caza Talentos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel3)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31))
        );

        userField.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        userField.setToolTipText("Ingrese nombre de usuario");
        userField.setAlignmentY(0.0F);
        userField.setMinimumSize(new java.awt.Dimension(65, 20));
        userField.setPreferredSize(new java.awt.Dimension(65, 20));

        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        pass.setToolTipText("Ingrese la contrasena");
        pass.setMinimumSize(new java.awt.Dimension(65, 20));
        pass.setPreferredSize(new java.awt.Dimension(65, 20));

        authMsg.setForeground(new java.awt.Color(204, 0, 0));
        authMsg.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginBtn)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        if (autenticar()) {
            this.dispose();
        }
    }//GEN-LAST:event_LoginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel authMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
