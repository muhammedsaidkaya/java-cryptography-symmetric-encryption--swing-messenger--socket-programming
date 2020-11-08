import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author claymorehack
 */
public class ClientPage extends javax.swing.JFrame {

    /**
     * Creates new form ClientPage
     */
    public ClientPage(Client client) {
        this.client = client;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ChatDialogFlow = new javax.swing.JTextArea();
        ConnectButton = new javax.swing.JToggleButton();
        DisconnectButton = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        DESRadioButton = new javax.swing.JRadioButton();
        AESRadioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        OFBRadioButton = new javax.swing.JRadioButton();
        CFCRadionButton = new javax.swing.JRadioButton();
        IsConnected = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        EncryptMessage = new javax.swing.JButton();
        SendMessage = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Message = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        CryptedText = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crypto Messanger");

        ChatDialogFlow.setEditable(false);
        ChatDialogFlow.setColumns(20);
        ChatDialogFlow.setRows(5);
        jScrollPane1.setViewportView(ChatDialogFlow);

        ConnectButton.setText("Connect");
        ConnectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConnectButtonMouseClicked(evt);
            }
        });

        DisconnectButton.setText("Disconnect");
        DisconnectButton.setEnabled(false);
        DisconnectButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DisconnectButtonItemStateChanged(evt);
            }
        });
        DisconnectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisconnectButtonMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)), "Method", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel1AncestorResized(evt);
            }
        });

        DESRadioButton.setText("DES");

        AESRadioButton.setText("AES");
        AESRadioButton.setSelected(true);
        AESRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DESRadioButton.setSelected(false);
            }
        });
        DESRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AESRadioButton.setSelected(false);
            }
        });
        CFCRadionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OFBRadioButton.setSelected(false);
            }
        });
        OFBRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CFCRadionButton.setSelected(false);
            }
        });

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

        CFCRadionButton.setText("CFC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CFCRadionButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OFBRadioButton))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(OFBRadioButton)
                                        .addComponent(CFCRadionButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IsConnected.setText("Not Connected");

        EncryptMessage.setText("Encrypt");
        EncryptMessage.setToolTipText("");
        EncryptMessage.setEnabled(false);
        EncryptMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptMessageActionPerformed(evt);
            }
        });

        SendMessage.setText("Send");
        SendMessage.setEnabled(false);
        SendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendMessageActionPerformed(evt);
                EncryptMessage.setEnabled(false);
                SendMessage.setEnabled(false);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(EncryptMessage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SendMessage)
                                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EncryptMessage)
                                        .addComponent(SendMessage))
                                .addGap(30, 30, 30))
        );

        Message.setColumns(20);
        Message.setRows(5);
        Message.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)), "Text", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jScrollPane4.setViewportView(Message);

        CryptedText.setColumns(20);
        CryptedText.setRows(5);
        CryptedText.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)), "Crypted Text", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        CryptedText.setEditable(false);
        Message.setEditable(false);
        Message.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(Message.getText().trim().isEmpty()) EncryptMessage.setEnabled(false);
                else EncryptMessage.setEnabled(true);
            }
        });
        jScrollPane5.setViewportView(CryptedText);

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

    private void jPanel1AncestorResized(java.awt.event.HierarchyEvent evt) {
        // TO add your handling code here:
    }

    // Encrypt Butonu
    private void EncryptMessageActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            CryptedText.setText(client.getClientConnection().encrypt(Message.getText()));
            SendMessage.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Send Butonu
    private void SendMessageActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            client.getClientConnection().sendMsgToServer(client.getUsername());
            client.getClientConnection().sendMsgToServer(CryptedText.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Message.setText("");
        CryptedText.setText("");

    }


    //Chat TextArea
    public void otherClientMsg(String username,String cipherText){
        try {
            if(!ConnectButton.isEnabled()){
                String plainText = client.getClientConnection().decrypt(cipherText);
                ChatDialogFlow.append(cipherText+"\n");
                ChatDialogFlow.append(username+">"+plainText+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void DisconnectButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        ConnectButton.setEnabled(true);
        DisconnectButton.setEnabled(false);
        SendMessage.setEnabled(false);
        EncryptMessage.setEnabled(false);
        IsConnected.setText("Disconnected");
        Message.setEditable(false);
    }

    private void DisconnectButtonItemStateChanged(java.awt.event.ItemEvent evt) {
        // TODO add your handling code here:
    }

    private void ConnectButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        ConnectButton.setEnabled(false);
        DisconnectButton.setEnabled(true);
        IsConnected.setText("Connected: " + client.getUsername());
        Message.setEditable(true);
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
            java.util.logging.Logger.getLogger(ClientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    private javax.swing.JRadioButton AESRadioButton;
    private javax.swing.JRadioButton CFCRadionButton;
    private javax.swing.JTextArea ChatDialogFlow;
    private javax.swing.JToggleButton ConnectButton;
    private javax.swing.JTextArea CryptedText;
    private javax.swing.JRadioButton DESRadioButton;
    private javax.swing.JToggleButton DisconnectButton;
    private javax.swing.JButton EncryptMessage;
    private javax.swing.JLabel IsConnected;
    private javax.swing.JTextArea Message;
    private javax.swing.JRadioButton OFBRadioButton;
    private javax.swing.JButton SendMessage;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private Client client;

    public JRadioButton getAESRadioButton() {
        return AESRadioButton;
    }

    public JRadioButton getCFCRadionButton() {
        return CFCRadionButton;
    }

    public JRadioButton getDESRadioButton() {
        return DESRadioButton;
    }

    public JRadioButton getOFBRadioButton() {
        return OFBRadioButton;
    }
}