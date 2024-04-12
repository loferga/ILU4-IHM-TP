/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fr.loferga.boundary;

/**
 *
 * @author LFM4179A
 */
public class ChatEtDessin extends javax.swing.JFrame {

    /**
     * Creates new form ChatEtDessin
     */
    public ChatEtDessin() {
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

        colorButtonGroup = new javax.swing.ButtonGroup();
        widthButtonGroup = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        blueToggle = new javax.swing.JToggleButton();
        redToggle = new javax.swing.JToggleButton();
        greenToggle = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        traitFinToggle = new javax.swing.JToggleButton();
        TraitEpaisToogle = new javax.swing.JToggleButton();
        dessinPartage = new fr.loferga.boundary.DessinPanel();
        jPanel2 = new javax.swing.JPanel();
        loginTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatArea = new javax.swing.JTextArea();
        seConnecterButton = new javax.swing.JButton();
        timerLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        messageField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        blueToggle.setBackground(new java.awt.Color(0, 51, 255));
        colorButtonGroup.add(blueToggle);
        blueToggle.setSelected(true);
        blueToggle.setEnabled(false);
        blueToggle.setFocusable(false);
        blueToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blueToggle.setOpaque(true);
        blueToggle.setPreferredSize(new java.awt.Dimension(20, 20));
        blueToggle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(blueToggle);

        redToggle.setBackground(new java.awt.Color(0, 0, 0));
        colorButtonGroup.add(redToggle);
        redToggle.setForeground(new java.awt.Color(255, 255, 255));
        redToggle.setEnabled(false);
        redToggle.setFocusable(false);
        redToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        redToggle.setOpaque(true);
        redToggle.setPreferredSize(new java.awt.Dimension(20, 20));
        redToggle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(redToggle);

        greenToggle.setBackground(new java.awt.Color(0, 255, 0));
        colorButtonGroup.add(greenToggle);
        greenToggle.setEnabled(false);
        greenToggle.setFocusable(false);
        greenToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        greenToggle.setOpaque(true);
        greenToggle.setPreferredSize(new java.awt.Dimension(20, 20));
        greenToggle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(greenToggle);
        jToolBar1.add(jSeparator1);

        widthButtonGroup.add(traitFinToggle);
        traitFinToggle.setSelected(true);
        traitFinToggle.setText("Trait fin");
        traitFinToggle.setEnabled(false);
        traitFinToggle.setFocusable(false);
        traitFinToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        traitFinToggle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(traitFinToggle);

        widthButtonGroup.add(TraitEpaisToogle);
        TraitEpaisToogle.setText("Trait �pais");
        TraitEpaisToogle.setEnabled(false);
        TraitEpaisToogle.setFocusable(false);
        TraitEpaisToogle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TraitEpaisToogle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(TraitEpaisToogle);

        dessinPartage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dessin partag�"));
        dessinPartage.setEnabled(false);

        javax.swing.GroupLayout dessinPartageLayout = new javax.swing.GroupLayout(dessinPartage);
        dessinPartage.setLayout(dessinPartageLayout);
        dessinPartageLayout.setHorizontalGroup(
            dessinPartageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dessinPartageLayout.setVerticalGroup(
            dessinPartageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(dessinPartage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dessinPartage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel1);

        jLabel1.setText("Login:");

        jLabel2.setText("Pasword:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chat"));

        chatArea.setEditable(false);
        chatArea.setColumns(20);
        chatArea.setRows(5);
        chatArea.setFocusable(false);
        jScrollPane1.setViewportView(chatArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addContainerGap())
        );

        seConnecterButton.setText("Se Connecter");
        seConnecterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seConnecterButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Votre message:");

        messageField.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(seConnecterButton)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messageField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(loginTextField)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(timerLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(timerLabel)
                .addGap(21, 21, 21)
                .addComponent(seConnecterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seConnecterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seConnecterButtonActionPerformed
        seConnecterButton.setEnabled(false);
        seConnecterButton.setFocusable(false);
        loginTextField.setEnabled(false);
        loginTextField.setFocusable(false);
        passwordField.setEnabled(false);
        passwordField.setFocusable(false);
        messageField.setEnabled(true);
        messageField.setFocusable(true);
        chatArea.setEnabled(true);
        chatArea.setFocusable(true);
        dessinPartage.setEnabled(true);
        blueToggle.setEnabled(true);
        redToggle.setEnabled(true);
        greenToggle.setEnabled(true);
    }//GEN-LAST:event_seConnecterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChatEtDessin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatEtDessin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatEtDessin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatEtDessin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatEtDessin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton TraitEpaisToogle;
    private javax.swing.JToggleButton blueToggle;
    private javax.swing.JTextArea chatArea;
    private javax.swing.ButtonGroup colorButtonGroup;
    private fr.loferga.boundary.DessinPanel dessinPartage;
    private javax.swing.JToggleButton greenToggle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JTextField messageField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JToggleButton redToggle;
    private javax.swing.JButton seConnecterButton;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JToggleButton traitFinToggle;
    private javax.swing.ButtonGroup widthButtonGroup;
    // End of variables declaration//GEN-END:variables
}