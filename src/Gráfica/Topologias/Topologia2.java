/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gráfica.Topologias;

import Clases.*;
import Gráfica.TopologiasPrecargadas;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Nazgul
 */
public class Topologia2 extends javax.swing.JFrame {

    /**
     * Creates new form Topologia1
     */
    
    public Grafo grafo;
    public VectorDistancia vt;
    public Topologia2() {
        initComponents();
        //está función existe con el fin de mostrar la tabla de enrutamiento
        //se crea un grao y se pone de parametro 8 ya que serán 8 routers
        grafo = new Grafo(8);

        grafo.agregarLado(0, 1, 7);
        grafo.agregarLado(0, 3, 8);
        grafo.agregarLado(1, 2, 12);
        grafo.agregarLado(2, 3, 12);
        grafo.agregarLado(2, 4, 8);
        grafo.agregarLado(2, 5, 15);
        grafo.agregarLado(2, 7, 14);
        grafo.agregarLado(4, 6, 6);
        grafo.agregarLado(5, 6, 15);
        grafo.agregarLado(6, 7, 22);
        vt= new VectorDistancia(grafo);
        vt.inicializarMatrices();
        vt.ejecutarVector();
         ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/topología2.JPG"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(this.topología2.getWidth(), 
        topología2.getHeight(), Image.SCALE_DEFAULT));
        topología2.setIcon(icono);
            transparente();
        //poner la interfaz en el centro
        this.setLocationRelativeTo(null);
    }
    
    public void transparente(){
        //esta funcion se crea con el fin de modificar el boton a invisible
        this.siguiente.setOpaque(false);
        this.siguiente.setContentAreaFilled(false);
        this.siguiente.setBorderPainted(false);
        ImageIcon imagen_siguiente = new ImageIcon(getClass().getResource("/imagenes/siguiente.png"));
        Icon icono_siguiente = new ImageIcon(imagen_siguiente.getImage().getScaledInstance(this.siguiente.getWidth(), 
        siguiente.getHeight(), Image.SCALE_DEFAULT));
        siguiente.setIcon(icono_siguiente);
        
        this.anterior.setOpaque(false);
        this.anterior.setContentAreaFilled(false);
        this.anterior.setBorderPainted(false);
        ImageIcon imagen_anterior = new ImageIcon(getClass().getResource("/imagenes/anterior.png"));
        Icon icono_anterior = new ImageIcon(imagen_anterior.getImage().getScaledInstance(this.anterior.getWidth(), 
        anterior.getHeight(), Image.SCALE_DEFAULT));
        anterior.setIcon(icono_anterior);
        
        this.router0.setContentAreaFilled(false);
        this.router1.setOpaque(false);
        this.router1.setContentAreaFilled(false);
        this.router3.setOpaque(false);
        this.router3.setContentAreaFilled(false);
        this.router4.setOpaque(false);
        this.router4.setContentAreaFilled(false);
        this.router2.setOpaque(false);
        this.router2.setContentAreaFilled(false);
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

        router1 = new javax.swing.JButton();
        router3 = new javax.swing.JButton();
        router4 = new javax.swing.JButton();
        router2 = new javax.swing.JButton();
        router5 = new javax.swing.JButton();
        router6 = new javax.swing.JButton();
        router7 = new javax.swing.JButton();
        router0 = new javax.swing.JButton();
        topología2 = new javax.swing.JLabel();
        Button_Back = new javax.swing.JButton();
        Button_Mostrar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        anterior = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Topología 2");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        router1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                router1ActionPerformed(evt);
            }
        });
        getContentPane().add(router1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 70, 70));

        router3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                router3ActionPerformed(evt);
            }
        });
        getContentPane().add(router3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 70, 70));

        router4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                router4ActionPerformed(evt);
            }
        });
        getContentPane().add(router4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 70, 70));

        router2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                router2ActionPerformed(evt);
            }
        });
        getContentPane().add(router2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 70, 70));

        router5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                router5ActionPerformed(evt);
            }
        });
        getContentPane().add(router5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 70, 70));

        router6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                router6ActionPerformed(evt);
            }
        });
        getContentPane().add(router6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 70, 70));

        router7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                router7ActionPerformed(evt);
            }
        });
        getContentPane().add(router7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 70, 70));

        router0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                router0ActionPerformed(evt);
            }
        });
        getContentPane().add(router0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 70, 70));
        getContentPane().add(topología2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, 669, 398));

        Button_Back.setText("Volver al menú principal");
        Button_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BackActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 210, -1));

        Button_Mostrar.setText("Mostrar Tabla de Enrutamiento");
        Button_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 210, 30));

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/siguiente.png"))); // NOI18N
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 60, 60));

        jLabel2.setText("Topología 3");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, -1, -1));

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anterior.png"))); // NOI18N
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        getContentPane().add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 70, 60));

        jLabel3.setText("Topología 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, -1, -1));

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Titulo.setText("Topología 2");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 110, 20));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(5);
        jTextArea2.setRows(4);
        jTextArea2.setText("Haga clic en cualquier\nrouter para mostrar\nsu tabla de enrutamiento\n");
        jTextArea2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea2.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BackActionPerformed
        TopologiasPrecargadas TP = new TopologiasPrecargadas();
        TP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_BackActionPerformed

    private void Button_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MostrarActionPerformed
        TablaEnrutamientoRouter ventana = new TablaEnrutamientoRouter(vt.getMatrizDistancia(),vt.getMatrizSgteSalto());
        ventana.setVisible(true);

    }//GEN-LAST:event_Button_MostrarActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        Topologia3 topo3 = new Topologia3();
        topo3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        Topologia1 topo1 = new Topologia1();
        topo1.setVisible(true);
        this.dispose();
                        
    }//GEN-LAST:event_anteriorActionPerformed

    private void router0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_router0ActionPerformed
        tablaRouter ventana = new tablaRouter(0,vt.getMatrizDistancia(),vt.getMatrizSgteSalto());
        ventana.setVisible(true);
    }//GEN-LAST:event_router0ActionPerformed

    private void router1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_router1ActionPerformed
        tablaRouter ventana = new tablaRouter(1,vt.getMatrizDistancia(),vt.getMatrizSgteSalto());
        ventana.setVisible(true);
    }//GEN-LAST:event_router1ActionPerformed

    private void router3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_router3ActionPerformed
        tablaRouter ventana = new tablaRouter(3,vt.getMatrizDistancia(),vt.getMatrizSgteSalto());
        ventana.setVisible(true);
    }//GEN-LAST:event_router3ActionPerformed

    private void router4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_router4ActionPerformed
        tablaRouter ventana = new tablaRouter(4,vt.getMatrizDistancia(),vt.getMatrizSgteSalto());
        ventana.setVisible(true);
    }//GEN-LAST:event_router4ActionPerformed

    private void router2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_router2ActionPerformed
        tablaRouter ventana = new tablaRouter(2,vt.getMatrizDistancia(),vt.getMatrizSgteSalto());
        ventana.setVisible(true);
    }//GEN-LAST:event_router2ActionPerformed

    private void router5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_router5ActionPerformed
        tablaRouter ventana = new tablaRouter(5,vt.getMatrizDistancia(),vt.getMatrizSgteSalto());
        ventana.setVisible(true);
    }//GEN-LAST:event_router5ActionPerformed

    private void router6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_router6ActionPerformed
        tablaRouter ventana = new tablaRouter(6,vt.getMatrizDistancia(),vt.getMatrizSgteSalto());
        ventana.setVisible(true);
    }//GEN-LAST:event_router6ActionPerformed

    private void router7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_router7ActionPerformed
        tablaRouter ventana = new tablaRouter(7,vt.getMatrizDistancia(),vt.getMatrizSgteSalto());
        ventana.setVisible(true);
    }//GEN-LAST:event_router7ActionPerformed

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
            java.util.logging.Logger.getLogger(Topologia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Topologia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Topologia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Topologia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Topologia2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Back;
    private javax.swing.JButton Button_Mostrar;
    private javax.swing.JButton anterior;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton router0;
    private javax.swing.JButton router1;
    private javax.swing.JButton router2;
    private javax.swing.JButton router3;
    private javax.swing.JButton router4;
    private javax.swing.JButton router5;
    private javax.swing.JButton router6;
    private javax.swing.JButton router7;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel topología2;
    // End of variables declaration//GEN-END:variables
}
