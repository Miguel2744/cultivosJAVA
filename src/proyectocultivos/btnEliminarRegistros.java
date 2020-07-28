/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocultivos;

import org.json.simple.JSONObject;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class btnEliminarRegistros extends javax.swing.JFrame {

    /**
     * Creates new form btnEliminarRegistros
     */
    public btnEliminarRegistros() {
        initComponents();
         this.setLocationRelativeTo(this);
        this.setResizable(false);
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
        jPanel2 = new javax.swing.JPanel();
        jCPanel1 = new com.bolivia.panel.JCPanel();
        idplantaeliminar = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        eliminar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        EliminarBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarcultivos.jpg"))); // NOI18N
        jCPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idplantaeliminar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        idplantaeliminar.setForeground(new java.awt.Color(255, 255, 255));
        idplantaeliminar.setText("ESCRIBE EL ID DE ");
        jCPanel1.add(idplantaeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jCPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 260, 60));
        jCPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 154, 70, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LA PLANTA :");
        jCPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        EliminarBTN.setText("Eliminar");
        EliminarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBTNActionPerformed(evt);
            }
        });
        jCPanel1.add(EliminarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 110, 40));

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jCPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        jPanel2.add(jCPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         MenuEliminar q = new MenuEliminar();
            q.setVisible(true);
            dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void EliminarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBTNActionPerformed
        // TODO add your handling code here:
         String a=eliminar.getText();
           this.eliminar.setText("");
           
String solicitud_url = "http://127.0.0.1/esp32/public/api/cultivos";
        curl api = new curl(solicitud_url, "DELETE");
        
        JSONObject sembradio = new JSONObject();
        sembradio.put("idPlanta", a);
        
        JSONObject obj = api.apicall(sembradio); 
        System.out.println(obj.get("mensaje"));
        String m=obj.toString();
        this.jTextField1.setText(m);
    }//GEN-LAST:event_EliminarBTNActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(btnEliminarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(btnEliminarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(btnEliminarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(btnEliminarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new btnEliminarRegistros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarBTN;
    private javax.swing.JTextField eliminar;
    private javax.swing.JLabel idplantaeliminar;
    private javax.swing.JButton jButton1;
    private com.bolivia.panel.JCPanel jCPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
