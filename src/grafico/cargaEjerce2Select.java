
package grafico;


import java.awt.Color;
import javax.swing.JOptionPane;
import logica.calculos;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import logica.PotencialElectrico;
import logica.campoElectrico;
import logica.unidades;
public class cargaEjerce2Select extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();

    /**
     * Creates new form ola
     */
    public cargaEjerce2Select() {
        this.setContentPane(fondo);
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        potenciaCarga1 = new javax.swing.JTextField();
        potenciaCarga2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        potenciaQ1P = new javax.swing.JTextField();
        potenciaQ2P = new javax.swing.JTextField();
        potenciaq1q2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        AtrasBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Carga 2:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 102));
        jLabel8.setText("m");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Distancia entre las cargas:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 102));
        jLabel9.setText("m");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setText("Distancia entre las cargas y el punto:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Datos sobre las carga que ejercen");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Carga1");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 255, 51));
        jLabel15.setText("m");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("C");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Carga 1:");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("Carga2");

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("X10 ^");

        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("X10 ^");

        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("X10 ^");

        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("X10 ^");

        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setText("X10 ^");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 0));
        jLabel18.setText("C");

        AtrasBoton.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        AtrasBoton.setText("Atras");
        AtrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(potenciaQ1P, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(potenciaQ2P, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(potenciaq1q2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(potenciaCarga1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                    .addComponent(potenciaCarga2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(AtrasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156)
                                .addComponent(jButton1)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(potenciaCarga1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(potenciaCarga2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11)))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(potenciaq1q2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(potenciaQ1P, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(potenciaQ2P, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AtrasBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    
        
        calculos pedrito = new calculos();
        
        
        double carga1 = pedrito.Potencia(Double.parseDouble(jTextField1.getText().trim()), (0 + Double.parseDouble(potenciaCarga1.getText().trim())));
        
        double carga2 = pedrito.Potencia(Double.parseDouble(jTextField2.getText().trim()), (0 + Double.parseDouble(potenciaCarga2.getText().trim())));
        
        
        double distanciaCarga = pedrito.Potencia(Double.parseDouble(jTextField6.getText().trim()), (0 +Double.parseDouble(potenciaq1q2.getText().trim())));
        
        double distanciaCarga1Q = pedrito.Potencia(Double.parseDouble(jTextField8.getText().trim()), (0 + Double.parseDouble(potenciaQ1P.getText().trim())));
        
        double distanciaCarga2Q = pedrito.Potencia(Double.parseDouble(jTextField10.getText().trim()), (0 + Double.parseDouble(potenciaQ2P.getText().trim())));
        
        if(distanciaCarga > 0 && distanciaCarga1Q > 0 && distanciaCarga2Q > 0){
            double base = 0;
        int exponente = 0;

        
        unidades Datos = new unidades(carga1, carga2, distanciaCarga, distanciaCarga1Q, distanciaCarga2Q);
        
        //Calcula y pasa los datos a resultados Campo electrico
        campoElectrico CampoElectrico = new campoElectrico(Datos);
        double ResultadoCampoElec = CampoElectrico.CampoElectrico2Cargas(); 
        int ExponenteCampoElec = 0;
        
        
        //Calcula y pasa los datos a resultados potencial electrico
        PotencialElectrico PotencialElectrico = new PotencialElectrico(Datos);
        double ResultadoPotencialElectrico = PotencialElectrico.PotencialElectrico2Cargas();
        int ExponentePotencialElectrico = 0;
        
        //Ve los signos de carga 1 y 2
        int SignoCarga1;
        if (carga1 == 0){
            SignoCarga1 = 0;
        }else if(carga1 > 0){
           SignoCarga1 = 1;
        }else{
            SignoCarga1 = -1;
        }
        
        int SignoCarga2;
        if (carga2 == 0){
            SignoCarga2 = 0;
        }else if(carga2 > 0){
           SignoCarga2 = 1;
        }else{
            SignoCarga2 = -1;
        }
        
        //le asigna una imagen de cargas
        String ImagenCargas = "/Vectores/Carga";
        
        switch (SignoCarga1){
            case 1: ImagenCargas = ImagenCargas + "Positiva";
            break;
            case 0: ImagenCargas = ImagenCargas + "Neutra";
            break;
            case -1: ImagenCargas = ImagenCargas + "Negativa";
            break;
        }
        
        switch (SignoCarga2){
            case 1: ImagenCargas = ImagenCargas + "Positiva.png";
            break;
            case 0: ImagenCargas = ImagenCargas + "Neutra.png";
            break;
            case -1: ImagenCargas = ImagenCargas + "Negativa.png";
            break;
        }

        //le asigna una imagen de vector
        String ImagenVector = "/Vectores/Vector";
        //Comprueba de que lado del punto esta
        int SignoCampoElec = 0;
        if (ResultadoCampoElec == 0){
            SignoCampoElec = 0;
        }else if (ResultadoCampoElec > 0){
            SignoCampoElec = 1;
        }
        
        double CampoElectrico1 = CampoElectrico.CampoElectrico1Carga();
        double CampoElectrico2 = CampoElectrico.CampoElectrico1CargaQ2();
        
        //comprueba pero en negativo
        if ((CampoElectrico1 * CampoElectrico2) < 0){
            if(CampoElectrico1 < 0 && (CampoElectrico1 * -1) > CampoElectrico2){
                SignoCampoElec = -1;
            }
            if(CampoElectrico2 < 0 && (CampoElectrico2 * -1) > CampoElectrico1){
                SignoCampoElec = -1;
            }
        }
        if (carga1 < 0 && carga2 < 0){
            SignoCampoElec = -1;
        }
        
        System.out.println("\n \n \n \n"+CampoElectrico1 * CampoElectrico2+"\n\n\n");
        
        switch (SignoCampoElec){
            case 1: ImagenVector = ImagenVector + "Derecha";
            break;
            case -1: ImagenVector = ImagenVector + "Izquierda";
            break;
            case 0: ImagenVector = ImagenVector + "CargaNeutra.png";
        }
        
        
        
        switch(SignoCampoElec){
            case -1:
                if (SignoCarga1 != SignoCarga2){
                
                if (SignoCarga1 < SignoCarga2){
                    ImagenVector = ImagenVector + "Arriba.png";
                }else{
                    ImagenVector = ImagenVector + "Abajo.png";
                }
            }else{
                if (CampoElectrico1 == CampoElectrico2){
                    ImagenVector = ImagenVector + "Centro.png";
                }else if(CampoElectrico1 < CampoElectrico2){
                    ImagenVector = ImagenVector + "Arriba.png";
                }else{
                    ImagenVector = ImagenVector + "Abajo.png";
                }
            }
            break;
            
            case 1:
                if (SignoCarga1 != SignoCarga2){
                
                    if (SignoCarga1 < SignoCarga2){
                        ImagenVector = ImagenVector + "Arriba.png";
                    }else{
                        ImagenVector = ImagenVector + "Abajo.png";
                    }
                }else{
                    if (CampoElectrico1 == CampoElectrico2){
                        ImagenVector = ImagenVector + "Centro.png";
                    }else if(CampoElectrico1 < CampoElectrico2){
                        ImagenVector = ImagenVector + "Arriba.png";
                    }else{
                        ImagenVector = ImagenVector + "Abajo.png";
                    }
                }
                
            break;
                
        }
        
        if(SignoCarga1 != SignoCarga2 && SignoCarga1 != 0 && SignoCarga2 != 0){
            if(CampoElectrico1 == (-1*CampoElectrico2)){
                if(SignoCarga1 < 0){
                           ImagenVector = "/Vectores/VectorArribaArriba.png"; 
               }else{
                            ImagenVector = "/Vectores/VectorAbajoAbajo.png";
               }
            }
        }
        

        
        
       































        //Decide cu??l va a ser el valor a tratar...
        for (int i = 1; i <=2; i++){
            int tieneE;
            double carga;
            
            if (i == 1){
                double usar = ResultadoCampoElec;
                tieneE = pedrito.Everdad(usar);        
                carga = usar;
                
                base = usar;
                
            }else{
                double usar = ResultadoPotencialElectrico;
                tieneE = pedrito.Everdad(usar);        
                carga = usar;
                
                base = usar;
                
            }
            
            
            System.out.println("carga = "+carga);
        if (tieneE == 0){


                        if (carga >= 1){
                            System.out.println("carga mayor o igual a 1");
                            
                            //int vuelteitons = pedrito.tiene0(carga);
/*
                            if (vuelteitons == carga){
                                exponente = 0;
                            }else{
                                //exponente = pedrito.tiene0(carga);
                                exponente = 8;
                            }
  */                          
                            //System.out.println("");
                            //System.out.println("");
                            
                            exponente = pedrito.tiene0(carga);
                            

                            //System.out.println(pedrito.tiene0(carga));
                            //base = pedrito.tiene0(carga);
                            base = pedrito.tiene0Base(carga);
                            
                            //String etrin = String.valueOf(vuelteitons);
                            /*
                            while (etrin.length() != vuelteitons){
                System.out.println("etrin p = " +etrin);
                vuelteitons /= 10;
                etrin = String.valueOf(vuelteitons);
                System.out.println("etrin a = "+etrin);
                System.out.println("");
                System.out.println("");
                            }
                            
                            
  */                          
/*
                            
                            for (int I = vuelteitons; i >=0; i--){
                                System.out.println("Base estaba en "+base);
                                base = base/10;
                                System.out.println("Base queda "+base);}
                            
                            
                            System.out.println("Base = "+base);
*/System.out.println("mayor igual 1");
                        }else if (carga > 0 && carga < 1){// carga >0 && carga <1
                            System.out.println("carga mayor a 0 menor a 1");

                            //SI el n??mero es 0. algo
                            exponente = pedrito.RobertoGomez(carga);

                            if (exponente > 0){

                                for(int d = 0; d < exponente; d++){
                                    base = base *10;
                                    System.out.println("");
                                    System.out.println(base);
                                }
                            }else{
                                for(int d = 0; d > exponente; d--){
                                    base = base *10;
                                    System.out.println("");
                                    System.out.println(base);
                                }
                            }






                        }else if (carga <0){
                            System.out.println("Menor a 0");
                            exponente = pedrito.tiene0(carga);
                            base = pedrito.tiene0Base(carga);
                        }



                    }else{
                        System.out.println("Carga tiene E");

                        //double temporal = pedrito.hayEBase(carga, tieneE);

                        exponente = (int) pedrito.hayExponente(carga, tieneE);
                        base = pedrito.hayEBase(carga, tieneE);
                        System.out.println("");
                        System.out.println("Carga antes de entrar "+base);
                        System.out.println("");

                        //exponente = pedrito.tiene0(temporal);

                        String strBase = String.valueOf(base);
                        //base = pedrito.cifras(base);
                        base = pedrito.dosCS(base);
                        
                        
                        String strBaseResuelta = String.valueOf(base);

                        if (strBase.length() > strBaseResuelta.length()){
                                System.out.println("");
                                System.out.println("");
                                System.out.println("Base > Base Resuelta");
                           int exponenteResuelto= strBase.length() - strBaseResuelta.length();
                           exponente += exponenteResuelto;
                        }
                        
                        //exponente += pedrito.cifrasExp(pedrito.hayEBase(carga, tieneE));
                    }


                    System.out.println("base "+base);
                    System.out.println("exponente "+exponente);

                    if (i == 1){
                        ResultadoCampoElec = base;
                        ExponenteCampoElec = exponente;
                    }else{
                        ResultadoPotencialElectrico = base;
                        ExponentePotencialElectrico = exponente;
                    }
                }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Datos.setQ1(carga1);
                
                Resultados results = new Resultados();
                
                results.setQ1(1);
        
        
         
       Resultados pagResultados = new Resultados();
       pagResultados.setVisible(true);
       
       //Pasa los datos al siguiente JFrame
        pagResultados.campoElectxt.setText(String.valueOf(ResultadoCampoElec));
        pagResultados.exponenteCampoElectrico.setText(String.valueOf(ExponenteCampoElec));
        
        pagResultados.Potencialtxt.setText(String.valueOf(ResultadoPotencialElectrico));
        pagResultados.exponentePotencialElectrico.setText(String.valueOf(ExponentePotencialElectrico));
        
        //asigna las imagenes  
        Image Vector = new ImageIcon(getClass().getResource(ImagenVector)).getImage();
        pagResultados.VectorImg.setIcon(new ImageIcon(Vector));
        
        Image Carga = new ImageIcon(getClass().getResource(ImagenCargas)).getImage();
        pagResultados.CargaImagen.setIcon(new ImageIcon(Carga));
        
        
        dispose();
    
        }else{
            JOptionPane.showMessageDialog(this,"La distancia hacia el punto no puede ser negativa ni 0");
                distanciaCarga=0;
        
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handlingjLabel1.SetForeground(Color.GREEN); code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void AtrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBotonActionPerformed
         //Abre el siguiente Jframe 
        SelecCargas pagResultados = new SelecCargas();
        pagResultados.setVisible(true);
        dispose();
    }//GEN-LAST:event_AtrasBotonActionPerformed

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
            java.util.logging.Logger.getLogger(cargaEjerce2Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cargaEjerce2Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cargaEjerce2Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cargaEjerce2Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cargaEjerce2Select().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField potenciaCarga1;
    private javax.swing.JTextField potenciaCarga2;
    private javax.swing.JTextField potenciaQ1P;
    private javax.swing.JTextField potenciaQ2P;
    private javax.swing.JTextField potenciaq1q2;
    // End of variables declaration//GEN-END:variables

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
}