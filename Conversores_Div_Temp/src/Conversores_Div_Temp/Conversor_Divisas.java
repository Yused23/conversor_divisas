/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Conversores_Div_Temp;


import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Michel Yused Sanchez
 */
public class Conversor_Divisas extends javax.swing.JFrame {

    
    public String de="COP";
    public String a="COP";
    public double conversion=0;
    public int cantidad=0;
    
    public Conversor_Divisas() {
       
        initComponents();
        this.setTitle("CONVERSOR DE DIVISAS");
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        
    }
    
    
    
    public String aMoneda (double cantidad, String moneda){
        return "$ "+Math.round(cantidad*100.0)/100.0+" "+moneda;
    } 
    
   
    @Override
    public Image getIconImage(){
        
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icon.png"));
        
        return retValue;
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textImporte = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboBoxA = new javax.swing.JComboBox<>();
        comboBoxDe = new javax.swing.JComboBox<>();
        btnConvertir1 = new javax.swing.JButton();
        btnTemp = new javax.swing.JButton();
        btnConvertir = new javax.swing.JButton();
        lblimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONVERSOR DE DIVISAS");
        setAlwaysOnTop(true);
        setIconImages(getIconImages());
        setName("lienzo"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblResultado.setBackground(new java.awt.Color(255, 255, 255));
        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblResultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 590, 110));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel5.setText("CONVERSOR DE DIVISAS ALURA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 420, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("a");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 30, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Importe");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        textImporte.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        textImporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textImporteActionPerformed(evt);
            }
        });
        jPanel1.add(textImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("De:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        comboBoxA.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        comboBoxA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COP", "USD", "EUR", "GBP", "JPY", "KRW" }));
        comboBoxA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        comboBoxA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 160, 30));

        comboBoxDe.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        comboBoxDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COP", "USD", "EUR", "GBP", "JPY", "KRW" }));
        comboBoxDe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        comboBoxDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDeActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 190, 30));

        btnConvertir1.setBackground(new java.awt.Color(204, 204, 204));
        btnConvertir1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConvertir1.setText("Salir");
        btnConvertir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConvertir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConvertir1MouseExited(evt);
            }
        });
        btnConvertir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConvertir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 100, 30));

        btnTemp.setBackground(new java.awt.Color(204, 204, 204));
        btnTemp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTemp.setText("Conversor de Temperaturas");
        btnTemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTempMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTempMouseExited(evt);
            }
        });
        btnTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempActionPerformed(evt);
            }
        });
        jPanel1.add(btnTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 190, 30));

        btnConvertir.setBackground(new java.awt.Color(204, 204, 204));
        btnConvertir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConvertirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConvertirMouseExited(evt);
            }
        });
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        jPanel1.add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 100, 30));

        lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pixel.png"))); // NOI18N
        jPanel1.add(lblimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAActionPerformed
        a = comboBoxA.getSelectedItem().toString();
        convertir();
    }//GEN-LAST:event_comboBoxAActionPerformed

    private void textImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textImporteActionPerformed
       
        
    }//GEN-LAST:event_textImporteActionPerformed

    private void comboBoxDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDeActionPerformed
        de = comboBoxDe.getSelectedItem().toString();
        convertir();
    }//GEN-LAST:event_comboBoxDeActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
         try {
            cantidad = Integer.parseInt(textImporte.getText()); 
            convertir();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Ingresa un número válido en el campo de Importe.", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
         
       
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempActionPerformed
        Conversor_Temperatura newconver = new Conversor_Temperatura();
        newconver.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnTempActionPerformed

    private void btnConvertirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertirMouseEntered
      btnConvertir.setBackground(new java.awt.Color(255, 119, 255));
    }//GEN-LAST:event_btnConvertirMouseEntered

    private void btnConvertirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertirMouseExited
    btnConvertir.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btnConvertirMouseExited

    private void btnTempMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTempMouseEntered
    btnTemp.setBackground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_btnTempMouseEntered

    private void btnTempMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTempMouseExited
    btnTemp.setBackground(new java.awt.Color(128, 128, 128));
    }//GEN-LAST:event_btnTempMouseExited

    private void btnConvertir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertir1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConvertir1MouseEntered

    private void btnConvertir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertir1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConvertir1MouseExited

    private void btnConvertir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertir1ActionPerformed
       int i =  JOptionPane.showConfirmDialog(this, "¿Le gustaria hacer otra conversion?");
       
        switch (i) {
            case 0:
                
                break;
            case 1:
                System.exit(0);
            default:
                break;
        }
        
    }//GEN-LAST:event_btnConvertir1ActionPerformed
    
    public void convertir (){
        switch(de){
            case "COP" -> {
                conversion = switch (a) {
                case "USD" -> cantidad*0.00025;
                case "EUR" -> cantidad*0.00023;
                case "GBP" -> cantidad*0.0002;
                case "JPY" -> cantidad*0.03513;
                case "KRW" -> cantidad*0.3245;
                default -> cantidad;
            };
            }
            case "KRW" -> {
                conversion = switch (a) {
                case "COP" -> cantidad*3.081802;
                case "USD" -> cantidad*0.000764;
                case "EUR" -> cantidad*0.000694;
                case "GBP" -> cantidad*0.0005991;
                case "JPY" -> cantidad*0.108271;
                default -> cantidad;
            };
            }
            case "JPY" -> conversion = switch (a) {
                case "KRW" -> cantidad*9.2360924;
                case "COP" -> cantidad*28.463804;
                case "USD" -> cantidad*0.0070542223;
                case "EUR" -> cantidad*0.0064071911;
                case "GBP" -> cantidad*0.005534;
                default -> cantidad;
            };
            case "GBP" -> conversion = switch (a) {
                case "JPY" -> cantidad*180.70481;
                case "KRW" -> cantidad*1669.162;
                case "COP" -> cantidad*5144.0243;
                case "USD" -> cantidad*1.2748503;
                case "EUR" -> cantidad*1.1578103;
                default -> cantidad;
            };
            case "EUR" -> conversion = switch (a) {
                case "GBP" -> cantidad*0.8636994;
                case "JPY" -> cantidad*156.07463;
                case "KRW" -> cantidad*1441.654 ;
                case "COP" -> cantidad*4442.891;
                case "USD" -> cantidad*1.1010874;
                default -> cantidad;
            };
            case "USD" -> conversion = switch (a) {
                case "EUR" -> cantidad*0.9081931;
                case "GBP" -> cantidad*0.78441;
                case "JPY" -> cantidad*141.75;
                case "KRW" -> cantidad*1309.3002;
                case "COP" -> cantidad*4035.003;
                default -> cantidad;
            };
            
            
            


        }
        lblResultado.setText (aMoneda(cantidad,de)+" EQUIVALE A:  "+aMoneda(conversion, a));
    
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
            java.util.logging.Logger.getLogger(Conversor_Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor_Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor_Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor_Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor_Divisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnConvertir1;
    private javax.swing.JButton btnTemp;
    private javax.swing.JComboBox<String> comboBoxA;
    private javax.swing.JComboBox<String> comboBoxDe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblimg;
    private javax.swing.JTextField textImporte;
    // End of variables declaration//GEN-END:variables

  


}

