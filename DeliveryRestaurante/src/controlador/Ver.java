/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

/**
 *
 * @author patri
 */
public class Ver extends javax.swing.JFrame {

    /**
     * Creates new form Ver
     */
    public Ver() {
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

        Estado = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VER PEDIDO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 790, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("N°");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MESA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 40, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 40, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ORDEN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 110));

        Estado.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("EN PROCESO");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        Estado.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("FINALIZADO");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, 110));

        jButton1.setText("BUSCAR");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, -1));

        jButton2.setText("ELIMINAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° de Pedido", "Mesa", "Pedido", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 440, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoel2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
