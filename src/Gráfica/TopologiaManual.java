package Gráfica;

import Clases.*;
import Gráfica.Topologias.TablaEnrutamientoRouter;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Nyo
 */
public class TopologiaManual extends javax.swing.JFrame {
    
    public int cantR;
    public Grafo grafo;
    
    public TopologiaManual() {
        initComponents();
        Iniciar();
        this.setLocationRelativeTo(null);
        cantR = Integer.parseInt(cantRouter.getText()); 
        grafo = new Grafo(cantR);
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/logo.png"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(icono);
    }
    
    public void Iniciar(){
          try{
            while(true){
                String nt = JOptionPane.showInputDialog(null,"Ingrese número de routers: ");  
                if (nt.isEmpty()){
                    System.out.println("No ha ingresado n° de routers");
                    JOptionPane.showMessageDialog(null, "Número máximo de routers: 9");
                }else{
                    int n = Integer.parseInt(nt);                   
                    if (n>=2 && n<10) {
                        System.out.println("Ingreso exitoso de n° routers");
                        cantRouter.setText(nt);
                        break;
                    }else if (n<2){
                        System.out.println("Ingreso fallido de n° routers");
                        JOptionPane.showMessageDialog(null, "Debe ingresar un número mayor a 1");
                    }
                    else if (n>=10){
                        System.out.println("Ingreso fallido de n° routers");
                        JOptionPane.showMessageDialog(null, "Número máximo de routers: 9");
                    }
                        
                }
            }
        }catch(Exception ex){
            System.out.println("Ingreso cancelado de n° routers");
            JOptionPane.showMessageDialog(null, "Adiós");
            System.exit(0);
        }
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Button_TManual = new javax.swing.JButton();
        Button_TPrecargada = new javax.swing.JButton();
        Button_Añadir = new javax.swing.JButton();
        Button_Ejecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextIntegrantes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cantRouter = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        jLabel_Univ = new javax.swing.JLabel();
        jLabel_Profesor = new javax.swing.JLabel();
        jLabel_Seccion = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Subtitulo = new javax.swing.JLabel();
        Button_Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Topología Manual");
        setLocation(new java.awt.Point(600, 200));
        setResizable(false);

        Button_TManual.setText("Topología Manual");
        Button_TManual.setEnabled(false);
        Button_TManual.setSelected(true);
        Button_TManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TManualActionPerformed(evt);
            }
        });

        Button_TPrecargada.setText("Topología Precargada");
        Button_TPrecargada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TPrecargadaActionPerformed(evt);
            }
        });

        Button_Añadir.setBackground(new java.awt.Color(0, 153, 255));
        Button_Añadir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button_Añadir.setText("Añadir enlace");
        Button_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AñadirActionPerformed(evt);
            }
        });
        Button_Añadir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Button_AñadirKeyTyped(evt);
            }
        });

        Button_Ejecutar.setBackground(new java.awt.Color(0, 153, 255));
        Button_Ejecutar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button_Ejecutar.setText("Ejecutar");
        Button_Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EjecutarActionPerformed(evt);
            }
        });

        TextIntegrantes.setEditable(false);
        TextIntegrantes.setBackground(new java.awt.Color(204, 204, 255));
        TextIntegrantes.setColumns(12);
        TextIntegrantes.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        TextIntegrantes.setRows(5);
        TextIntegrantes.setText("Integrantes:\n- Claudia Barrera\n- Gabriel Carmelo\n- Andy Lazo\n- Roger Vega");
        TextIntegrantes.setToolTipText("");
        TextIntegrantes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(TextIntegrantes);

        jLabel1.setText("N° Routers");

        cantRouter.setEditable(false);
        cantRouter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cantRouter.setFocusable(false);
        cantRouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantRouterActionPerformed(evt);
            }
        });
        cantRouter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantRouterKeyTyped(evt);
            }
        });

        jLabel_Univ.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Univ.setForeground(new java.awt.Color(255, 118, 19));
        jLabel_Univ.setText("Universidad de Lima ");

        jLabel_Profesor.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel_Profesor.setForeground(new java.awt.Color(0, 126, 74));
        jLabel_Profesor.setText("Profesor : Sotelo Monge, Marco Antonio");

        jLabel_Seccion.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel_Seccion.setForeground(new java.awt.Color(0, 126, 74));
        jLabel_Seccion.setText("Sección : 602");

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Titulo.setText("Redes de Computadoras 2020-1  ");

        jLabel_Subtitulo.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_Subtitulo.setText("Vector Distancia");

        Button_Limpiar.setBackground(new java.awt.Color(0, 153, 255));
        Button_Limpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button_Limpiar.setText("Limpiar");
        Button_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Button_Añadir)
                .addGap(20, 20, 20)
                .addComponent(Button_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(Button_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel_Univ))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantRouter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Button_TManual)
                        .addGap(0, 0, 0)
                        .addComponent(Button_TPrecargada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_Profesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Seccion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_TManual)
                    .addComponent(Button_TPrecargada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_Subtitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cantRouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Univ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Profesor)
                    .addComponent(jLabel_Seccion))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Button_TManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TManualActionPerformed

    }//GEN-LAST:event_Button_TManualActionPerformed

    private void Button_TPrecargadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TPrecargadaActionPerformed
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
        TopologiasPrecargadas TP = new TopologiasPrecargadas();
        TP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_TPrecargadaActionPerformed

    private void Button_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AñadirActionPerformed

        JTextField r1t = new JTextField();
        JTextField r2t = new JTextField();
        JTextField pesot = new JTextField();
        Object[] message = {
            "Ingrese los siguientes valores:\n\n",
            "",
            "Desde router: ", r1t,
            "Hacia router: ", r2t,
            "Peso: ", pesot,
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Añadiendo conexión... ", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try{
                int r1 = Integer.parseInt(r1t.getText());
                int r2 = Integer.parseInt(r2t.getText());
                int peso = Integer.parseInt(pesot.getText());
                if ((r1>=0 && r1<=cantR-1) && (r2>=0 && r2<=cantR-1) && (peso>0 && peso<=999)) {
                    if(grafo.existeLado(r1, r2)==false && grafo.existeLado(r2, r1)==false){
                        grafo.agregarLado(r1, r2, peso);
                        System.out.println("Ingreso exitoso: ("+r1+" -"+peso+"- "+r2+")");
                    }else{
                        JOptionPane.showMessageDialog(null, "Enlace ya existente ");
                        System.out.println("Enlace ya existente ("+r1+" -"+peso+"- "+r2+")");
                    }
                } else {
                    System.out.println("Ingreso fallido");
                    JOptionPane.showMessageDialog(null, "Número máximo de router "+cantR);
                    Button_AñadirActionPerformed(evt);
                }
            }catch(Exception ex){
                System.out.println("Ingreso fallido\nBy :"+ex);
                JOptionPane.showMessageDialog(null, "Llenar los campos correctamente con solo números");
                Button_AñadirActionPerformed(evt);
            }
        } else {
            System.out.println("Ingreso cancelado");
        }
    }//GEN-LAST:event_Button_AñadirActionPerformed

    private void Button_AñadirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button_AñadirKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_AñadirKeyTyped

    private void Button_EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EjecutarActionPerformed
        System.out.println("-------------------------");
        System.out.println("Enlace Peso");
        grafo.mostrarLados();
        VectorDistancia vd = new VectorDistancia(grafo);
        vd.inicializarMatrices();
        vd.ejecutarVector();
        System.out.println("-------------------------");
        TablaEnrutamientoRouter ventanaTabla = new TablaEnrutamientoRouter(vd.getMatrizDistancia(),vd.getMatrizSgteSalto());
        ventanaTabla.setVisible(true);
    }//GEN-LAST:event_Button_EjecutarActionPerformed

    private void cantRouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantRouterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantRouterActionPerformed

    private void cantRouterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantRouterKeyTyped
        if (cantRouter.getText().length() == 1) {
            evt.consume();
        }
        if (evt.getKeyChar() != '1'&& evt.getKeyChar() != '2' && evt.getKeyChar() != '3'
            && evt.getKeyChar() != '4' && evt.getKeyChar() != '4' && evt.getKeyChar() != '6'
            && evt.getKeyChar() != '5' && evt.getKeyChar() != '8' && evt.getKeyChar() != '9'){
            evt.consume();
        }
    }//GEN-LAST:event_cantRouterKeyTyped

    private void Button_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LimpiarActionPerformed
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
    }//GEN-LAST:event_Button_LimpiarActionPerformed
   
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
                new TopologiaManual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Añadir;
    private javax.swing.JButton Button_Ejecutar;
    private javax.swing.JButton Button_Limpiar;
    private javax.swing.JButton Button_TManual;
    private javax.swing.JButton Button_TPrecargada;
    private javax.swing.JTextArea TextIntegrantes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cantRouter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Profesor;
    private javax.swing.JLabel jLabel_Seccion;
    private javax.swing.JLabel jLabel_Subtitulo;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Univ;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
