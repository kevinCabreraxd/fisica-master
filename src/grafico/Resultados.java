/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author Administrador
 */
public class Resultados extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
     int Q1;
        int Q2;
        int Q3;
    
        double DistanciaQ1Q2;
        double DistanciaQ1Q3;

    public int getQ1() {
        return Q1;
    }

    public void setQ1(int Q1) {
        this.Q1 = Q1;
    }

    public int getQ2() {
        return Q2;
    }

    public void setQ2(int Q2) {
        this.Q2 = Q2;
    }

    public int getQ3() {
        return Q3;
    }

    public void setQ3(int Q3) {
        this.Q3 = Q3;
    }

    public double getDistanciaQ1Q2() {
        return DistanciaQ1Q2;
    }

    public void setDistanciaQ1Q2(double DistanciaQ1Q2) {
        this.DistanciaQ1Q2 = DistanciaQ1Q2;
    }

    public double getDistanciaQ1Q3() {
        return DistanciaQ1Q3;
    }

    public void setDistanciaQ1Q3(double DistanciaQ1Q3) {
        this.DistanciaQ1Q3 = DistanciaQ1Q3;
    }

    public double getDistanciaQ2Q3() {
        return DistanciaQ2Q3;
    }

    public void setDistanciaQ2Q3(double DistanciaQ2Q3) {
        this.DistanciaQ2Q3 = DistanciaQ2Q3;
    }

    public double getDistanciaPtoQ1() {
        return DistanciaPtoQ1;
    }

    public void setDistanciaPtoQ1(double DistanciaPtoQ1) {
        this.DistanciaPtoQ1 = DistanciaPtoQ1;
    }

    public double getDistanciaPtoQ2() {
        return DistanciaPtoQ2;
    }

    public void setDistanciaPtoQ2(double DistanciaPtoQ2) {
        this.DistanciaPtoQ2 = DistanciaPtoQ2;
    }

    public double getDistanciaPtoQ3() {
        return DistanciaPtoQ3;
    }

    public void setDistanciaPtoQ3(double DistanciaPtoQ3) {
        this.DistanciaPtoQ3 = DistanciaPtoQ3;
    }
        double DistanciaQ2Q3;
    
        double DistanciaPtoQ1;
        double DistanciaPtoQ2;
        double DistanciaPtoQ3;
        

    /**
     * Creates new form Resultados
     */
    public Resultados() {
        
         this.setContentPane(fondo);
        initComponents();
        
        IntermedioResultado.setCampoElectricoSigno(true);
        
       
        
       
        
        String carga1 = String.valueOf(Q1);
        System.out.println(Q1);
        
        Potencialtxt.setText(carga1);
        
       
        
        
    }

  
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoElectxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Potencialtxt = new javax.swing.JTextField();
        VectorImg = new javax.swing.JLabel();
        btnVolverMenu = new javax.swing.JToggleButton();
        exponenteCampoElectrico = new javax.swing.JTextField();
        exponentePotencialElectrico = new javax.swing.JTextField();
        CargaImagen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("X10 ^");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 76)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Resultados:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Campo el??ctrico:");

        campoElectxt.setEditable(false);
        campoElectxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Potencial El??ctrico:");

        Potencialtxt.setEditable(false);
        Potencialtxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnVolverMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVolverMenu.setText("Volver al men??");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        exponenteCampoElectrico.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        exponentePotencialElectrico.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("X10 ^");

        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("X10 ^");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel1)
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CargaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoElectxt, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(Potencialtxt))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exponenteCampoElectrico, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(exponentePotencialElectrico)))
                    .addComponent(VectorImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoElectxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exponenteCampoElectrico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Potencialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exponentePotencialElectrico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(VectorImg, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(CargaImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
 
        mainScreen pagmainScreen = new mainScreen();
        pagmainScreen.setVisible(true); 
        
        
        dispose();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultados().setVisible(true);
            }
        });
    }

    public javax.swing.JLabel CargaImagen;
    public javax.swing.JTextField Potencialtxt;
    public javax.swing.JLabel VectorImg;
    private javax.swing.JToggleButton btnVolverMenu;
    public javax.swing.JTextField campoElectxt;
    public javax.swing.JTextField exponenteCampoElectrico;
    public javax.swing.JTextField exponentePotencialElectrico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
}
class FondoPanel extends JPanel
{
    private Image imagen;
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/imagen/img21-scaled.jpg")).getImage();
       g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
       setOpaque(false);
       
       super.paint(g);
    }
            
}