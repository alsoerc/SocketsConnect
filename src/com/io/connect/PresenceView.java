/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.io.connect;

/**
 *
 * @author alsorc
 */
public class PresenceView extends javax.swing.JInternalFrame {

    /**
     * Creates new form LightView
     */
    public PresenceView() {
        initComponents();
        this.iconPresencia.setEnabled(false);
        this.iconAlertPresencia.setEnabled(false);
        this.btnAnalizarPresencia.setEnabled(false);
        
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
        btnEncenderPresencia = new javax.swing.JButton();
        btnApagarPresencia = new javax.swing.JButton();
        iconPresencia = new javax.swing.JLabel();
        btnAnalizarPresencia = new javax.swing.JButton();
        iconAlertPresencia = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/presense32.png"))); // NOI18N
        jLabel1.setText("Módulo de Presencia");

        btnEncenderPresencia.setForeground(new java.awt.Color(0, 204, 0));
        btnEncenderPresencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/on.png"))); // NOI18N
        btnEncenderPresencia.setText("Encender");
        btnEncenderPresencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncenderPresenciaActionPerformed(evt);
            }
        });

        btnApagarPresencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/off.png"))); // NOI18N
        btnApagarPresencia.setText("Apagar");
        btnApagarPresencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarPresenciaActionPerformed(evt);
            }
        });

        iconPresencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPresencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/presence128.png"))); // NOI18N

        btnAnalizarPresencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnAnalizarPresencia.setText("Analizar");
        btnAnalizarPresencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarPresenciaActionPerformed(evt);
            }
        });

        iconAlertPresencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/alert128.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(iconAlertPresencia)
                    .addComponent(btnAnalizarPresencia, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEncenderPresencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApagarPresencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(iconPresencia)
                .addGap(229, 229, 229))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnApagarPresencia, btnEncenderPresencia});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(iconPresencia))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnEncenderPresencia)
                        .addGap(18, 18, 18)
                        .addComponent(btnApagarPresencia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(iconAlertPresencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnalizarPresencia)
                .addGap(27, 27, 27))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnApagarPresencia, btnEncenderPresencia});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApagarPresenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarPresenciaActionPerformed
        this.iconPresencia.setEnabled(false);
        this.iconAlertPresencia.setEnabled(false);
        this.btnAnalizarPresencia.setEnabled(false);
    }//GEN-LAST:event_btnApagarPresenciaActionPerformed

    private void btnEncenderPresenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncenderPresenciaActionPerformed
        this.iconPresencia.setEnabled(true);
        this.btnAnalizarPresencia.setEnabled(true);
    }//GEN-LAST:event_btnEncenderPresenciaActionPerformed

    private void btnAnalizarPresenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarPresenciaActionPerformed
        this.iconAlertPresencia.setEnabled(true);
    }//GEN-LAST:event_btnAnalizarPresenciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarPresencia;
    private javax.swing.JButton btnApagarPresencia;
    private javax.swing.JButton btnEncenderPresencia;
    private javax.swing.JLabel iconAlertPresencia;
    private javax.swing.JLabel iconPresencia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}