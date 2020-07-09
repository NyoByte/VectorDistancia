package Gráfica;

import Clases.*;
import Gráfica.Topologias.*;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TopologiasPrecargadas extends javax.swing.JFrame {
    public Grafo grafo;
    
    public TopologiasPrecargadas() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/logo.png"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(logo1.getWidth(), logo1.getHeight(), Image.SCALE_DEFAULT));
        logo1.setIcon(icono);
        this.repaint();
        ImageIcon img1 = new ImageIcon(getClass().getResource("/imagenes/topología1.JPG"));
        Icon ico1 = new ImageIcon(img1.getImage().getScaledInstance(t1.getWidth(), t1.getHeight(), Image.SCALE_DEFAULT));
        t1.setIcon(ico1);
        this.repaint();
        ImageIcon img2 = new ImageIcon(getClass().getResource("/imagenes/topología2.JPG"));
        Icon ico2 = new ImageIcon(img2.getImage().getScaledInstance(t2.getWidth(), t2.getHeight(), Image.SCALE_DEFAULT));
        t2.setIcon(ico2);
        this.repaint();
        ImageIcon img3 = new ImageIcon(getClass().getResource("/imagenes/topología3.JPG"));
        Icon ico3 = new ImageIcon(img3.getImage().getScaledInstance(t3.getWidth(), t3.getHeight(), Image.SCALE_DEFAULT));
        t3.setIcon(ico3);
        this.repaint();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        Button_TPrecargada = new javax.swing.JButton();
        Button_TManual = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        topologia1 = new javax.swing.JButton();
        topologia2 = new javax.swing.JButton();
        topologia3 = new javax.swing.JButton();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Subtitulo = new javax.swing.JLabel();
        jLabel_Univ = new javax.swing.JLabel();
        jLabel_Profesor = new javax.swing.JLabel();
        jLabel_Seccion = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Topologías Precargadas");
        setBackground(new java.awt.Color(153, 153, 255));
        setLocation(new java.awt.Point(600, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_TPrecargada.setText("Topología Precargada");
        Button_TPrecargada.setEnabled(false);
        Button_TPrecargada.setSelected(true);
        Button_TPrecargada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TPrecargadaActionPerformed(evt);
            }
        });
        getContentPane().add(Button_TPrecargada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        Button_TManual.setText("Topología Manual");
        Button_TManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TManualActionPerformed(evt);
            }
        });
        getContentPane().add(Button_TManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 114, 110));

        topologia1.setBackground(new java.awt.Color(0, 153, 255));
        topologia1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        topologia1.setText("Topologia1");
        topologia1.setMaximumSize(new java.awt.Dimension(140, 30));
        topologia1.setMinimumSize(new java.awt.Dimension(140, 30));
        topologia1.setPreferredSize(new java.awt.Dimension(140, 30));
        topologia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topologia1ActionPerformed(evt);
            }
        });
        getContentPane().add(topologia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        topologia2.setBackground(new java.awt.Color(0, 153, 255));
        topologia2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        topologia2.setText("Topologia2");
        topologia2.setMaximumSize(new java.awt.Dimension(140, 30));
        topologia2.setMinimumSize(new java.awt.Dimension(140, 30));
        topologia2.setPreferredSize(new java.awt.Dimension(140, 30));
        topologia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topologia2ActionPerformed(evt);
            }
        });
        getContentPane().add(topologia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        topologia3.setBackground(new java.awt.Color(0, 153, 255));
        topologia3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        topologia3.setText("Topologia3");
        topologia3.setMaximumSize(new java.awt.Dimension(140, 30));
        topologia3.setMinimumSize(new java.awt.Dimension(140, 30));
        topologia3.setPreferredSize(new java.awt.Dimension(140, 30));
        topologia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topologia3ActionPerformed(evt);
            }
        });
        getContentPane().add(topologia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 400, 300));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 400, 300));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 400, 300));

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Titulo.setText("Redes de Computadoras 2020-1  ");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 300, 20));

        jLabel_Subtitulo.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_Subtitulo.setText("Vector Distancia");
        getContentPane().add(jLabel_Subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 110, -1));

        jLabel_Univ.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Univ.setForeground(new java.awt.Color(255, 118, 19));
        jLabel_Univ.setText("Universidad de Lima ");
        getContentPane().add(jLabel_Univ, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 900, -1, -1));

        jLabel_Profesor.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel_Profesor.setForeground(new java.awt.Color(0, 126, 74));
        jLabel_Profesor.setText("Profesor : Sotelo Monge, Marco Antonio");
        getContentPane().add(jLabel_Profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 940, -1, -1));

        jLabel_Seccion.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel_Seccion.setForeground(new java.awt.Color(0, 126, 74));
        jLabel_Seccion.setText("Sección : 602");
        getContentPane().add(jLabel_Seccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 940, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_TPrecargadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TPrecargadaActionPerformed

    }//GEN-LAST:event_Button_TPrecargadaActionPerformed

    private void Button_TManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TManualActionPerformed
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
            java.util.logging.Logger.getLogger(TopologiaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TopologiaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TopologiaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TopologiaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        TopologiaManual TM = new TopologiaManual();
        TM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_TManualActionPerformed

    private void topologia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topologia1ActionPerformed
        //nos ayuda a ir a la ventana de, en este caso, topologiá
        Topologia1 topo1 = new Topologia1();
        topo1.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_topologia1ActionPerformed

    private void topologia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topologia2ActionPerformed
        Topologia2 topo2 = new Topologia2();
        topo2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_topologia2ActionPerformed

    private void topologia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topologia3ActionPerformed
        Topologia3 topo3 = new Topologia3();
        topo3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_topologia3ActionPerformed

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
            java.util.logging.Logger.getLogger(TopologiaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TopologiaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TopologiaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TopologiaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopologiasPrecargadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_TManual;
    private javax.swing.JButton Button_TPrecargada;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_Profesor;
    private javax.swing.JLabel jLabel_Seccion;
    private javax.swing.JLabel jLabel_Subtitulo;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Univ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JButton topologia1;
    private javax.swing.JButton topologia2;
    private javax.swing.JButton topologia3;
    // End of variables declaration//GEN-END:variables
}




