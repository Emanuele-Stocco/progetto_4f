/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;
import java.lang.*;
import java.awt.Component;
import javax.swing.*;
import java.lang.reflect.Method;
import java.util.Random;

/**
 *
 * @author Stocco Emanuele
 */
public class SortComparationGUI extends javax.swing.JFrame 
{
    /**
     * Creates new form SortComparationGUI
     */
    public SortComparationGUI() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ordina");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection Sort", "Quick Sort", "Bitonic Sort", "Insertion Sort", "Shaker Sort", "Bubble Sort", "Shell Sort", "Counting Sort", "Radix Sort", "Merge Sort" }));
        jComboBox1.setToolTipText("Scegli l'algoritmo di ordinamento");

        jTextField1.setToolTipText("Array dimension");
        jTextField1.setName(""); // NOI18N

        jLabel1.setText("Dimensione vettore:");

        jLabel2.setText("Tempo impiegato:");

        jLabel3.setText("0 ms");

        jLabel5.setText("Algoritmo di ordinamento:");

        jLabel6.setText("Vettore generato:");

        jLabel7.setText("Vettore ordinato:");

        jTextField2.setToolTipText("Array dimension");
        jTextField2.setName(""); // NOI18N

        jTextField3.setToolTipText("Array dimension");
        jTextField3.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.getAccessibleContext().setAccessibleDescription("Scegli l'algoritmo di ordinamento");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            int dimensione = Integer.parseInt(jTextField1.getText()); //prende la dimensione del vettore dalla textbox
            
            if(dimensione <= 0) //controllo dimensione inserita
            {
                JOptionPane.showMessageDialog(null, "Inserimento dimensione errata!", "Alert:" + "Error", JOptionPane.ERROR_MESSAGE);             
            }
            
            //dichiarazione variabili
            int vettore [] = new int [dimensione];
            Random casuale = new Random();
            String stringa = "";
            
            //generazione elementi casuali per il vettore
            for(int i = 0; i < dimensione; i++)
            {
                vettore[i] = casuale.nextInt(99)+1; //elementi generati da 1 a 100
            }
            
            for(int i = 0; i < dimensione; i++) //stampa vettore iniziale sulla textbox
            {
                stringa += String.valueOf(vettore[i]) + " ";
            }
            jTextField2.setText(stringa);
            
            //Reflection
            //cerca la classe con l'algoritmo selezionato
            long inizio = System.currentTimeMillis() % 1000; //inizio conteggio tempo          
            String nomeSort = (String)jComboBox1.getSelectedItem();
            nomeSort = ElaboraStringa(nomeSort);
            Class<?> classe = Class.forName("learn." + nomeSort);
            Method m = classe.getMethod("Sort", int[].class);
            m.invoke(classe, vettore);
            
            //stampa vettore ordinato sulla textbox
            stringa = "";
            for(int i = 0; i < dimensione; i++)
            {
                stringa += String.valueOf(vettore[i]) + " ";
            }
            jTextField3.setText(stringa);
            
            long fine = (System.currentTimeMillis() % 1000) - inizio; //fine e stampa del tempo impiegato
            jLabel3.setText(String.valueOf(fine)+ " ms");
        }
        catch (Exception e)
        {   
            String messaggio = e.getMessage();
            //finestra errore
            JOptionPane.showMessageDialog(null, "Richieste errate!.\n" + messaggio,"InfoBox:" + "Error", JOptionPane.ERROR_MESSAGE);          
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    //metodo di controllo
    public String ElaboraStringa(String s)
        {
            String st;
            st = s.replace(" ", "");
            return st;
        }
    
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
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortComparationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}