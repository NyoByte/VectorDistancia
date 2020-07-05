/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gráfica.Topologias;

import Clases.Grafo;
import Clases.VectorDistancia;
import Gráfica.TopologiasPrecargadas;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Nazgul
 */
public class Topologia3 extends javax.swing.JFrame {

    /**
     * Creates new form Topologia1
     */
    public Grafo grafo;
    public Topologia3() {
        initComponents();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/topología3.JPG"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(this.topología3.getWidth(), 
        topología3.getHeight(), Image.SCALE_DEFAULT));
        topología3.setIcon(icono);
              transparente();
        //poner la interfaz en el centro
        this.setLocationRelativeTo(null);
    }
    
    public void transparente(){
        //esta funcion se crea con el fin de modificar el boton de anteror       
        this.anterior.setOpaque(false);
        this.anterior.setContentAreaFilled(false);
        this.anterior.setBorderPainted(false);
        ImageIcon imagen_anterior = new ImageIcon(getClass().getResource("/imagenes/anterior.png"));
        Icon icono_anterior = new ImageIcon(imagen_anterior.getImage().getScaledInstance(this.anterior.getWidth(), 
        anterior.getHeight(), Image.SCALE_DEFAULT));
        anterior.setIcon(icono_anterior);
        
        this.router1.setContentAreaFilled(false);
        this.router2.setOpaque(false);
        this.router2.setContentAreaFilled(false);
        this.router3.setOpaque(false);
        this.router3.setContentAreaFilled(false);
        this.router4.setOpaque(false);
        this.router4.setContentAreaFilled(false);
        this.router5.setOpaque(false);
        this.router5.setContentAreaFilled(false);
        this.router6.setOpaque(false);
        this.router6.setContentAreaFilled(false);
        this.router7.setOpaque(false);
        this.router7.setContentAreaFilled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        router4 = new javax.swing.JButton();
        router1 = new javax.swing.JButton();
        router2 = new javax.swing.JButton();
        router3 = new javax.swing.JButton();
        router7 = new javax.swing.JButton();
        router6 = new javax.swing.JButton();
        router5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        topología3 = new javax.swing.JLabel();
        Button_Back = new javax.swing.JButton();
        Button_Mostrar = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        router4.setToolTipText("");
        getContentPane().add(router4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 70, 80));

        router1.setToolTipText("");
        getContentPane().add(router1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 70, 80));

        router2.setToolTipText("");
        getContentPane().add(router2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 70, 80));

        router3.setToolTipText("");
        getContentPane().add(router3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 70, 80));

        router7.setToolTipText("");
        getContentPane().add(router7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 70, 80));

        router6.setToolTipText("");
        getContentPane().add(router6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 70, 80));

        router5.setToolTipText("");
        getContentPane().add(router5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 70, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Topología3");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 0, -1, -1));
        getContentPane().add(topología3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 710, 470));

        Button_Back.setText("Volver al menu principal");
        Button_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BackActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 210, -1));

        Button_Mostrar.setText("Mostrar Tabla de Enrutamiento");
        Button_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 210, 30));

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anterior.png"))); // NOI18N
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        getContentPane().add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 70, 60));

        jLabel3.setText("Topología 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BackActionPerformed
        TopologiasPrecargadas TP = new TopologiasPrecargadas();
        TP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_BackActionPerformed

    private void Button_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MostrarActionPerformed
        //está función existe con el fin de mostrar la tabla de enrutamiento
        //se crea un grao y se pone de parametro 8 ya que serán 8 routers
        grafo = new Grafo(7);

        grafo.agregarLado(0, 1, 1);
        grafo.agregarLado(0, 3, 4);
        grafo.agregarLado(1, 2, 7);
        grafo.agregarLado(1, 4, 4);
        grafo.agregarLado(2, 4, 2);
        grafo.agregarLado(2, 6, 1);
        grafo.agregarLado(3, 4, 2);
        grafo.agregarLado(3, 5, 3);
        grafo.agregarLado(4, 5, 6);
        grafo.agregarLado(5, 6, 3);

        grafo.mostrarLados();
        grafo.obtenerLado(0, WIDTH);
        VectorDistancia vt = new VectorDistancia(grafo);

        vt.inicializarMatrices();
        vt.ejecutarVector();
          TablaEnrutamientoRouter ventana = new TablaEnrutamientoRouter(vt.getMatrizDistancia(),vt.getMatrizSgteSalto());
        ventana.setVisible(true);
    }//GEN-LAST:event_Button_MostrarActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        Topologia2 topo2 = new Topologia2();
        topo2.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_anteriorActionPerformed

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
            java.util.logging.Logger.getLogger(Topologia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Topologia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Topologia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Topologia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Topologia3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Back;
    private javax.swing.JButton Button_Mostrar;
    private javax.swing.JButton anterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton router1;
    private javax.swing.JButton router2;
    private javax.swing.JButton router3;
    private javax.swing.JButton router4;
    private javax.swing.JButton router5;
    private javax.swing.JButton router6;
    private javax.swing.JButton router7;
    private javax.swing.JLabel topología3;
    // End of variables declaration//GEN-END:variables
}
