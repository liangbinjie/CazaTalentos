package cazatalentos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class VFacturacionM extends javax.swing.JFrame {

    public VFacturacionM() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        mostrar();
    }
    
    public static ArrayList<Facturacion> facturas = new ArrayList<>();

    public void mostrar() {
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream("Facturas.dat"));
            
            try {
                while (true) {
                    Facturacion f = new Facturacion();
                    f.setFecha(entrada.readUTF());
                    f.setHora(entrada.readUTF());
                    f.setIdCliente(entrada.readLong());
                    f.setNombre(entrada.readUTF());
                    f.setApellidos(entrada.readUTF());
                    f.setPagoMensual(entrada.readInt());
                    f.setDescripcionR(entrada.readUTF());
                    
                    facturas.add(f);
                    addRow();
                    facturas.clear();  
                }

            } catch (EOFException ex02) {
                entrada.close();
            }
            
        //addRow();
        //facturas.clear();

        } catch (FileNotFoundException ex01) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",
            JOptionPane.ERROR_MESSAGE);
            
        } catch (IOException ex04) {
           // JOptionPane.showMessageDialog(null, "Error al cargar la informacion", "Error",
           // JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void addRow() {
        DefaultTableModel tbl = (DefaultTableModel) factTable.getModel();
        Object dataRow[] = new Object[7];
        for (int i = 0; i < facturas.size(); i++) {
            
            dataRow[0] = facturas.get(i).getFecha();
            dataRow[1] = facturas.get(i).getHora();
            dataRow[2] = facturas.get(i).getIdCliente();
            dataRow[3] = facturas.get(i).getNombre();
            dataRow[4] = facturas.get(i).getApellidos();
            dataRow[5] = facturas.get(i).getPagoMensual();
            dataRow[6] = facturas.get(i).getDescripcionR();
            

            tbl.addRow(dataRow);

        }
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        factTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        factTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "ID Cliente", "Nombre", "Apellido", "Pago", "Desc. Rutina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(factTable);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VFacturacionM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VFacturacionM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VFacturacionM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VFacturacionM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VFacturacionM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable factTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
