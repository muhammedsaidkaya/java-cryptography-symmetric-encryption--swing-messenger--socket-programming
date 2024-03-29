import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author claymorehack
 */
public class ClientGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClientPage
     */
    public ClientGUI(Client client) {
        this.client = client;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        JScrollPane jScrollPane1 = new JScrollPane();
        ChatDialogFlow = new javax.swing.JTextArea();
        ConnectButton = new javax.swing.JToggleButton();
        DisconnectButton = new javax.swing.JToggleButton();
        JPanel jPanel1 = new JPanel();
        DESRadioButton = new javax.swing.JRadioButton();
        AESRadioButton = new javax.swing.JRadioButton();
        JPanel jPanel2 = new JPanel();
        OFBRadioButton = new javax.swing.JRadioButton();
        CBCRadioButton = new javax.swing.JRadioButton();
        IsConnected = new javax.swing.JLabel();
        JPanel jPanel5 = new JPanel();
        EncryptMessageButton = new javax.swing.JButton();
        SendMessageButton = new javax.swing.JButton();
        JScrollPane jScrollPane4 = new JScrollPane();
        PlainTextArea = new javax.swing.JTextArea();
        JScrollPane jScrollPane5 = new JScrollPane();
        CipherTextArea = new javax.swing.JTextArea();
        JMenuBar jMenuBar1 = new JMenuBar();
        JMenu jMenu1 = new JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crypto Messenger");

        ChatDialogFlow.setEditable(false);
        ChatDialogFlow.setColumns(20);
        ChatDialogFlow.setRows(5);
        jScrollPane1.setViewportView(ChatDialogFlow);

        ConnectButton.setText("Connect");
        ConnectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConnectButtonMouseClicked();
            }
        });

        DisconnectButton.setText("Disconnect");
        DisconnectButton.setEnabled(false);
        DisconnectButton.addItemListener(this::DisconnectButtonItemStateChanged);
        DisconnectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisconnectButtonMouseClicked();
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)), "Method", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel1AncestorResized();
            }
        });

        DESRadioButton.setText("DES");

        AESRadioButton.setText("AES");
        AESRadioButton.setSelected(true);
        AESRadioButton.addActionListener(e -> DESRadioButton.setSelected(false));
        DESRadioButton.addActionListener(e -> AESRadioButton.setSelected(false));
        CBCRadioButton.addActionListener(e -> OFBRadioButton.setSelected(false));
        OFBRadioButton.addActionListener(e -> CBCRadioButton.setSelected(false));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(AESRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DESRadioButton)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AESRadioButton)
                                        .addComponent(DESRadioButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)), "Mode", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        OFBRadioButton.setText("OFB");
        OFBRadioButton.setSelected(true);

        CBCRadioButton.setText("CBC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBCRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OFBRadioButton))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(OFBRadioButton)
                                        .addComponent(CBCRadioButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IsConnected.setText("Not Connected");

        EncryptMessageButton.setText("Encrypt");
        EncryptMessageButton.setToolTipText("");
        EncryptMessageButton.setEnabled(false);
        EncryptMessageButton.addActionListener(this::EncryptMessageActionPerformed);

        SendMessageButton.setText("Send");
        SendMessageButton.setEnabled(false);
        SendMessageButton.addActionListener(evt -> {
            SendMessageActionPerformed();
            EncryptMessageButton.setEnabled(false);
            SendMessageButton.setEnabled(false);
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(EncryptMessageButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SendMessageButton)
                                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EncryptMessageButton)
                                        .addComponent(SendMessageButton))
                                .addGap(30, 30, 30))
        );

        PlainTextArea.setColumns(20);
        PlainTextArea.setRows(5);
        PlainTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)), "Text", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jScrollPane4.setViewportView(PlainTextArea);

        CipherTextArea.setColumns(20);
        CipherTextArea.setRows(5);
        CipherTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)), "Crypted Text", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        CipherTextArea.setEditable(false);
        PlainTextArea.setEditable(false);
        PlainTextArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                EncryptMessageButton.setEnabled(!PlainTextArea.getText().trim().isEmpty());
            }
        });
        jScrollPane5.setViewportView(CipherTextArea);

        jMenu1.setText("Server");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(IsConnected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(49, 49, 49)
                                                                .addComponent(ConnectButton)
                                                                .addGap(33, 33, 33)
                                                                .addComponent(DisconnectButton)
                                                                .addGap(44, 44, 44)
                                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(19, 19, 19)
                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ConnectButton)
                                                        .addComponent(DisconnectButton))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IsConnected)
                                .addContainerGap())
        );

        pack();
    }

    private void jPanel1AncestorResized() {
        // TO add your handling code here:
    }

    // Encrypt Butonu
    private void EncryptMessageActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            CipherTextArea.setText(client.encryptPlainText(PlainTextArea.getText()));
            SendMessageButton.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Send Butonu
    private void SendMessageActionPerformed() {
        try {
            client.sendMsgToServer(client.getUsername());
            client.sendMsgToServer(CipherTextArea.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        PlainTextArea.setText("");
        CipherTextArea.setText("");

    }


    //Chat TextArea
    public void addMsgToChatBox(String cipherTextSenderUsername,String cipherText,String plainText){
        try {
            if(!ConnectButton.isEnabled()){
                ChatDialogFlow.append(cipherText+"\n");
                ChatDialogFlow.append(cipherTextSenderUsername+">"+plainText+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void DisconnectButtonMouseClicked() {
        ConnectButton.setEnabled(true);
        DisconnectButton.setEnabled(false);
        SendMessageButton.setEnabled(false);
        EncryptMessageButton.setEnabled(false);
        IsConnected.setText("Disconnected");
        PlainTextArea.setEditable(false);
    }

    private void DisconnectButtonItemStateChanged(java.awt.event.ItemEvent evt) {
    }

    private void ConnectButtonMouseClicked() {
        ConnectButton.setEnabled(false);
        DisconnectButton.setEnabled(true);
        IsConnected.setText("Connected: " + client.getUsername());
        PlainTextArea.setEditable(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {

        });
    }

    private javax.swing.JRadioButton AESRadioButton;
    private javax.swing.JRadioButton CBCRadioButton;
    private javax.swing.JTextArea ChatDialogFlow;
    private javax.swing.JToggleButton ConnectButton;
    private javax.swing.JTextArea CipherTextArea;
    private javax.swing.JRadioButton DESRadioButton;
    private javax.swing.JToggleButton DisconnectButton;
    private javax.swing.JButton EncryptMessageButton;
    private javax.swing.JLabel IsConnected;
    private javax.swing.JTextArea PlainTextArea;
    private javax.swing.JRadioButton OFBRadioButton;
    private javax.swing.JButton SendMessageButton;
    private final Client client;

    public JRadioButton getAESRadioButton() {
        return AESRadioButton;
    }

    public JRadioButton getOFBRadioButton() {
        return OFBRadioButton;
    }
}
