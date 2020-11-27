/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmeornn;

import java.net.ServerSocket;
import java.lang.Thread;
import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author copec
 */
public class SalmeUwU extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form SalmeUwU
     */
    String mensajee;
    Boolean zas;

    public SalmeUwU() {
        boolean yeah = false;
        boolean asd = true;
        initComponents();
        Thread uwu = new Thread(this);
        
        do {
            mensajee = JOptionPane.showInputDialog("Digita tu mensaje");
            if (mensajee == null) {
                int h = JOptionPane.showConfirmDialog(rootPane, "Seguro que desea salir?");
                if ( h == 0 || h == -1) {
                    mensajee = "-1147483648";
                } else {}
            }
            try {
                if (Integer.parseInt(mensajee) < 0 && Integer.parseInt(mensajee) != -1147483648) {
                    JOptionPane.showMessageDialog(rootPane, "No ponga números negativos", "Error", 1);
                    yeah = true;
                } else {
                    yeah = false;
                    mensaje.setText(mensajee);
                    if (mensajee.equals("-1147483648")) {
                        asd = false;
                        zas = false;
                    } else if (mensajee.length() > 7) {
                        JOptionPane.showMessageDialog(rootPane, "Digite un número más chico", "Por fis", 1);
                        yeah = true;
                    }
                }
                zas = true;
            } catch (NumberFormatException e) {
                yeah = true;
            }
        } while (yeah);
        if(mensaje.getText().equals("-1147483648")){
            this.setVisible(false);
            this.dispose();
            zas = false;
        }else{
            uwu.start();
        }
    }

    public void run() {
        boolean yeah = true;
        if (zas) {
            try {
                ServerSocket sv = new ServerSocket(9999);
                while (true) {
                    java.net.Socket so = sv.accept();
                    java.io.DataOutputStream salida = new java.io.DataOutputStream(so.getOutputStream());
                    java.io.DataInputStream entrada = new java.io.DataInputStream(so.getInputStream());

                    String mensaje = entrada.readUTF();
                    cpublica1.setText(mensaje);
                    String mensaje2 = entrada.readUTF();
                    cpublica2.setText(mensaje2);
                    cifrar(mensajee);
                    salida.writeUTF(mencifrado.getText());
                    so.close();
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        } else {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cpublica1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpublica2 = new javax.swing.JTextField();
        mensaje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mencifrado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cpublica1.setEditable(false);

        jLabel1.setText("Clave pública 1");

        jLabel2.setText("Clave pública 2");

        cpublica2.setEditable(false);

        mensaje.setEditable(false);
        mensaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Mensaje");

        jLabel4.setText("Mensaje Cifrado");

        mencifrado.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(mencifrado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpublica1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpublica2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpublica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cpublica2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mencifrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cifrar(String texto) {
        BigInteger P = new BigInteger(texto);
        System.out.println(P + "---------" + cpublica2.getText());
        BigInteger aux = P.pow(Integer.parseInt(cpublica2.getText()));
        System.out.println(aux + "-----mod------" + cpublica1.getText());
        aux = aux.mod(new BigInteger(cpublica1.getText()));
        mencifrado.setText(aux.toString());
    }

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
            java.util.logging.Logger.getLogger(SalmeUwU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalmeUwU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalmeUwU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalmeUwU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalmeUwU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpublica1;
    private javax.swing.JTextField cpublica2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField mencifrado;
    private javax.swing.JTextField mensaje;
    // End of variables declaration//GEN-END:variables
}
