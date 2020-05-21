/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.io.connect;

import java.util.Observable;
import java.util.Observer;



/**
 *
 * @author alsorc
 */
public class LightView extends javax.swing.JInternalFrame implements Observer{
    
    private final String iPSensorLuz = "25.33.135.9";
    
    private static Servidor myServer;

    /**
     * Creates new form LightView
     */
    public LightView() {
        initComponents();
        loadStates();
        Servidor serverLight = getServidor();
        serverLight.addObserver(this);
        Thread t = new Thread(serverLight);
        t.start();
        
    }
    
      public static Servidor getServidor(){
        if(myServer == null)
            myServer = new Servidor(5000);
        return myServer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEncenderLuz = new javax.swing.JButton();
        btnApagarLuz = new javax.swing.JButton();
        iconFoco = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/light32.png"))); // NOI18N
        jLabel1.setText("Módulo de Luz");

        btnEncenderLuz.setForeground(new java.awt.Color(0, 204, 0));
        btnEncenderLuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/on.png"))); // NOI18N
        btnEncenderLuz.setText("Encender");
        btnEncenderLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncenderLuzActionPerformed(evt);
            }
        });

        btnApagarLuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/off.png"))); // NOI18N
        btnApagarLuz.setText("Apagar");
        btnApagarLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarLuzActionPerformed(evt);
            }
        });

        iconFoco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/light128.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEncenderLuz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApagarLuz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(iconFoco)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnEncenderLuz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApagarLuz))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(iconFoco, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApagarLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarLuzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApagarLuzActionPerformed

    private void btnEncenderLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncenderLuzActionPerformed
        this.iconFoco.setEnabled(true);
        this.btnApagarLuz.setEnabled(true);
        String mensaje = "ON";
        System.out.println("----Conectando a cliente---");
        Cliente c = new Cliente( 5000, mensaje.toUpperCase(), iPSensorLuz);
        Thread t = new Thread(c);
        t.start();
    }//GEN-LAST:event_btnEncenderLuzActionPerformed

       public void loadStates(){
        this.iconFoco.setEnabled(false);
        this.btnApagarLuz.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarLuz;
    private javax.swing.JButton btnEncenderLuz;
    private javax.swing.JLabel iconFoco;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        switch((String)o1){
            case "ENCENDIDO":
                  this.iconFoco.setEnabled(true);
                  System.out.println("ENCENDIDO");
                  break;
            default:
                System.err.println("Respuesta no válida " + (String)o1);
        }
    
    }
}
