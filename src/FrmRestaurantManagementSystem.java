
import settings.SendMessage;


public class FrmRestaurantManagementSystem extends javax.swing.JFrame {

    double firstnum;
    double secondnum;
    double result;
    double Nigerian_Naira = 34.6;
    double Kenyan_Shilling = 67.9;
    double US_Dollar = 78.09;
    double Brazilian_Brazil = 89.67;
    double Canadian_Canada = 56.90;
    double []i=new double[5];
    String operation;
    String answer;

    public FrmRestaurantManagementSystem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbProducts = new javax.swing.JComboBox();
        txtcb = new javax.swing.JTextField();
        txtbcb = new javax.swing.JTextField();
        txtcbm = new javax.swing.JTextField();
        jCChicBurger = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCDelivery = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        cmdconvert = new javax.swing.JButton();
        cmdclose = new javax.swing.JButton();
        cmbCountry = new javax.swing.JComboBox();
        txtconvert = new javax.swing.JTextField();
        txtconResult = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        txtDisplay = new javax.swing.JTextField();
        btnseven = new javax.swing.JButton();
        btnarrow = new javax.swing.JButton();
        btnone = new javax.swing.JButton();
        btnfore = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btnzero = new javax.swing.JButton();
        btneight = new javax.swing.JButton();
        btnfive = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btnplusminus = new javax.swing.JButton();
        btnnine = new javax.swing.JButton();
        btntow = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();
        btnthree = new javax.swing.JButton();
        btnsix = new javax.swing.JButton();
        btnplus = new javax.swing.JButton();
        btnminues = new javax.swing.JButton();
        btnmultiplication = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcd = new javax.swing.JTextField();
        txtcm = new javax.swing.JTextField();
        txtcdeli = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtst = new javax.swing.JTextField();
        txtt = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        cmdexit = new javax.swing.JButton();
        cmdreset = new javax.swing.JButton();
        cmdreceipt = new javax.swing.JButton();
        cmdtotal = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        lblimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Restaurant Management Systems");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setText("Drinks");

        cmbProducts.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Drinks", "Apple juice", "Tea", "Coffe", "Mango juice", "7up", "Twing", "Cocacola" }));
        cmbProducts.setToolTipText("");
        cmbProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductsActionPerformed(evt);
            }
        });

        jCChicBurger.setText("Chicken Burger");
        jCChicBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCChicBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCChicBurgerMouseClicked(evt);
            }
        });

        jCheckBox2.setText("Chicken Burger Meal");
        jCheckBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });

        jCheckBox3.setText("Bacon and Cheese Burger");
        jCheckBox3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseClicked(evt);
            }
        });

        jCheckBox4.setText("Tax");
        jCheckBox4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseClicked(evt);
            }
        });

        jCDelivery.setText("Home Delivery");
        jCDelivery.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCDeliveryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCDelivery))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCChicBurger)
                            .addComponent(jCheckBox2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcb)
                            .addComponent(txtcbm, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtbcb, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCChicBurger))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcbm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCDelivery)
                    .addComponent(jCheckBox4)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        cmdconvert.setText("Convert");
        cmdconvert.setBorder(null);
        cmdconvert.setMaximumSize(new java.awt.Dimension(73, 23));
        cmdconvert.setMinimumSize(new java.awt.Dimension(73, 23));
        cmdconvert.setPreferredSize(new java.awt.Dimension(73, 23));
        cmdconvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdconvertActionPerformed(evt);
            }
        });

        cmdclose.setText("Close");
        cmdclose.setBorder(null);
        cmdclose.setMaximumSize(new java.awt.Dimension(73, 23));
        cmdclose.setMinimumSize(new java.awt.Dimension(73, 23));
        cmdclose.setPreferredSize(new java.awt.Dimension(73, 23));

        cmbCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose One", "USA", "Nigeria", "Kenyan", "Canada", "Brazil", "Indonesia", "Philippine" }));

        txtconvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtconvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconvertActionPerformed(evt);
            }
        });

        txtconResult.setBackground(new java.awt.Color(204, 204, 204));
        txtconResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cmdconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmbCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtconvert)
                    .addComponent(txtconResult))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdconvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });

        btnseven.setText("7");

        btnarrow.setText("<-");

        btnone.setText("1");

        btnfore.setText("4");
        btnfore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnforeActionPerformed(evt);
            }
        });

        btnc.setText("c");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        btnzero.setText("0");
        btnzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnzeroActionPerformed(evt);
            }
        });

        btneight.setText("8");
        btneight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneightActionPerformed(evt);
            }
        });

        btnfive.setText("5");
        btnfive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiveActionPerformed(evt);
            }
        });

        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });

        btnplusminus.setText("+/-");
        btnplusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusminusActionPerformed(evt);
            }
        });

        btnnine.setText("9");
        btnnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnineActionPerformed(evt);
            }
        });

        btntow.setText("2");
        btntow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntowActionPerformed(evt);
            }
        });

        btnequal.setText("=");
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });

        btnthree.setText("3");
        btnthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthreeActionPerformed(evt);
            }
        });

        btnsix.setText("6");
        btnsix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsixActionPerformed(evt);
            }
        });

        btnplus.setText("+");
        btnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusActionPerformed(evt);
            }
        });

        btnminues.setText("-");
        btnminues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminuesActionPerformed(evt);
            }
        });

        btnmultiplication.setText("*");
        btnmultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicationActionPerformed(evt);
            }
        });

        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDisplay)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnzero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnseven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnfore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnarrow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnfive, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btneight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnnine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnthree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnsix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnplusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btndiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnmultiplication, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnplus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnminues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnarrow)
                    .addComponent(btnc)
                    .addComponent(btnplusminus)
                    .addComponent(btnplus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnseven)
                    .addComponent(btneight, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnine)
                    .addComponent(btnminues))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfore)
                    .addComponent(btnfive)
                    .addComponent(btnsix)
                    .addComponent(btnmultiplication))
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnone)
                    .addComponent(btntow)
                    .addComponent(btnthree)
                    .addComponent(btndiv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndot)
                    .addComponent(btnequal))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calculator", jPanel9);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Report", jPanel7);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setText("Cost of Drinks");

        jLabel4.setText("Cost of Meal");

        jLabel5.setText("Cost of Delivery");

        txtcd.setBackground(new java.awt.Color(204, 204, 204));
        txtcd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtcm.setBackground(new java.awt.Color(204, 204, 204));
        txtcm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtcdeli.setBackground(new java.awt.Color(204, 204, 204));
        txtcdeli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcdeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcdeliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcd)
                    .addComponent(txtcm)
                    .addComponent(txtcdeli, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcdeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setText("Sub Total:");

        jLabel7.setText("Tax:");

        jLabel8.setText("Total:");

        txtst.setBackground(new java.awt.Color(204, 204, 204));
        txtst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtt.setBackground(new java.awt.Color(204, 204, 204));
        txtt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txttotal.setBackground(new java.awt.Color(204, 204, 204));
        txttotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtst)
                    .addComponent(txtt)
                    .addComponent(txttotal, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        cmdexit.setText("Exit");
        cmdexit.setAlignmentX(0.5F);
        cmdexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdexitActionPerformed(evt);
            }
        });

        cmdreset.setText("Reset");
        cmdreset.setAlignmentX(0.5F);

        cmdreceipt.setText("Receipt");
        cmdreceipt.setAlignmentX(0.5F);
        cmdreceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdreceiptMouseClicked(evt);
            }
        });
        cmdreceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdreceiptActionPerformed(evt);
            }
        });

        cmdtotal.setText("Total");
        cmdtotal.setAlignmentX(0.5F);

        jButton11.setText("Message");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdtotal)
                .addGap(18, 18, 18)
                .addComponent(cmdreceipt)
                .addGap(18, 18, 18)
                .addComponent(cmdreset)
                .addGap(18, 18, 18)
                .addComponent(cmdexit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton11)
                .addGap(33, 33, 33))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdexit)
                    .addComponent(cmdreset)
                    .addComponent(cmdreceipt)
                    .addComponent(cmdtotal)
                    .addComponent(jButton11))
                .addGap(20, 20, 20))
        );

        lblimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bellhop_bows.gif"))); // NOI18N
        lblimage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(130, 130, 130)
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdreceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdreceiptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdreceiptActionPerformed

    private void cmdreceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdreceiptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdreceiptMouseClicked

    private void cmdexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmdexitActionPerformed

    private void txtcdeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcdeliActionPerformed

    }//GEN-LAST:event_txtcdeliActionPerformed

    private void txtconvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconvertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconvertActionPerformed

    private void cmdconvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdconvertActionPerformed
        double British_pound = Double.parseDouble(txtconvert.getText());
        if (cmbCountry.getSelectedItem().equals("Nigeria")) {
            String cConvert1 = String.format("N %.2f", British_pound * Nigerian_Naira);
            txtconResult.setText(cConvert1);
        }
        if (cmbCountry.getSelectedItem().equals("Kenyan")) {
            String cConvert2 = String.format("KS % .2f", British_pound * Kenyan_Shilling);
            txtconResult.setText(cConvert2);
        }
        if (cmbCountry.getSelectedItem().equals("USA")) {
            String cConvert3 = String.format("$ % .2f", British_pound * US_Dollar);
            txtconResult.setText(cConvert3);
        }
        if (cmbCountry.getSelectedItem().equals("Canada")) {
            String cConvert4 = String.format("c$ % .2f", British_pound * Canadian_Canada);
            txtconResult.setText(cConvert4);
        }
        if (cmbCountry.getSelectedItem().equals("Brazil")) {
            String cConvert5 = String.format("Bra % .2f", British_pound * Brazilian_Brazil);
            txtconResult.setText(cConvert5);
        }
        if (cmbCountry.getSelectedItem().equals("Choose Country")) {
            txtconResult.setText("Select Country");
        }
    }//GEN-LAST:event_cmdconvertActionPerformed

    private void jCDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCDeliveryMouseClicked
        double iDelivery=3.78;
        if(jCDelivery.isSelected()){
            String pDelivery=String.format("N %.2f",iDelivery);
        }else{
            txtcdeli.setText(null);
        }
    }//GEN-LAST:event_jCDeliveryMouseClicked

    private void jCheckBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox4MouseClicked
        txtcb.setText(null);

        txtcd.setText(null);
        txtcdeli.setText(null);
        txtcm.setText(null);
        txtconvert.setText(null);
        txtst.setText(null);
        txtt.setText(null);
        txttotal.setText(null);
    }//GEN-LAST:event_jCheckBox4MouseClicked

    private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseClicked
        double BCBurger=Double.parseDouble(txtbcb.getText());
        double cMeal=Double.parseDouble(txtcm.getText());
        double iBCBurger=23.49;
        if(jCheckBox2.isSelected()){
            i[2]=(int) ((BCBurger*iBCBurger)+cMeal);
            String pMeal=String.format("%. 2f", i[0]);
            txtcm.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox3MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
        double cMeal=Double.parseDouble(txtcm.getText());
        double ChicBurger=Double.parseDouble(txtcb.getText());
        double iChicBurger=23.49;
        if(jCheckBox2.isSelected()){
            i[1]=(int) ((ChicBurger*iChicBurger)+cMeal);
            String pMeal=String.format("%. 2f", i[0]);
            txtcm.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jCChicBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCChicBurgerMouseClicked
        double cMeal=Double.parseDouble(txtcm.getText());
        double ChicBurger=Double.parseDouble(txtcb.getText());
        double iChicBurger=2.39;
        if(jCChicBurger.isSelected()){
            i[0]=((ChicBurger*iChicBurger)+cMeal);
            String pMeal=String.format("%. 2f", i[0]);
            txtcm.setText(pMeal);
        }
    }//GEN-LAST:event_jCChicBurgerMouseClicked

    private void cmbProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductsActionPerformed
        double Tea = 1.20;
        double Applejuice = 0.30;
        double Coffe = 1.20;
        double Mangojuice = 2.90;
        double sevenup = 0.34;
        double Twing = 5;
        double Cocacola = 2.80;
        if (cmbProducts.getSelectedItem().equals("Apple juice")) {
            String convert1 = String.format("N % .2f", Applejuice);
            txtcd.setText(convert1);
        }
        if (cmbProducts.getSelectedItem().equals("Tea")) {
            String convert2 = String.format("N % .2f", Tea);
            txtcd.setText(convert2);
        }
        if (cmbProducts.getSelectedItem().equals("Coffe")) {
            String convert3 = String.format("N % .2f", Coffe);
            txtcd.setText(convert3);
        }
        if (cmbProducts.getSelectedItem().equals("Mango juice")) {
            String convert4 = String.format("N % .2f", Mangojuice);
            txtcd.setText(convert4);
        }
        if (cmbProducts.getSelectedItem().equals("7up")) {
            String convert5 = String.format("N % .2f", sevenup);
            txtcd.setText(convert5);
        }
        if (cmbProducts.getSelectedItem().equals("Twing")) {
            String convert6 = String.format("N % .2f", Twing);
            txtcd.setText(convert6);
        }
        if (cmbProducts.getSelectedItem().equals("Cocacola")) {
            String convert7 = String.format("N % .2f", Cocacola);
            txtcd.setText(convert7);
        }
        if (cmbProducts.getSelectedItem().equals("Select a drink")) {
            txtcb.setText(null);
        }
    }//GEN-LAST:event_cmbProductsActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
     new SendMessage();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnzeroActionPerformed
        String entervalue = txtDisplay.getText() + btnzero.getText();
        txtDisplay.setText(entervalue);
    }//GEN-LAST:event_btnzeroActionPerformed

    private void btneightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneightActionPerformed
       String entervalue = txtDisplay.getText() + btneight.getText();
        txtDisplay.setText(entervalue);
    }//GEN-LAST:event_btneightActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
      
    }//GEN-LAST:event_btndotActionPerformed

    private void btnplusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusminusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnplusminusActionPerformed

    private void btnnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnineActionPerformed
      String entervalue = txtDisplay.getText() + btnnine.getText();
        txtDisplay.setText(entervalue);
    }//GEN-LAST:event_btnnineActionPerformed

    private void btntowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntowActionPerformed
         String entervalue = txtDisplay.getText() + btntow.getText();
        txtDisplay.setText(entervalue);
    }//GEN-LAST:event_btntowActionPerformed

    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalActionPerformed
        
        try {
            secondnum = Double.parseDouble(txtDisplay.getName());

            if (operation == "+") {
                result = firstnum + secondnum;
                answer = String.format("%.0f", result);
                txtDisplay.setText(answer);
            } else if (operation == "-") {
                result = firstnum - secondnum;
                answer = String.format("%.0f", result);
                txtDisplay.setText(answer);
            } else if (operation == "*") {
                result = firstnum * secondnum;
                answer = String.format("%.0f", result);
                txtDisplay.setText(answer);
            } else if (operation == "/") {
                result = firstnum / secondnum;
                answer = String.format("%.0f", result);
                txtDisplay.setText(answer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnequalActionPerformed

    private void btnthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthreeActionPerformed
        String entervalue = txtDisplay.getText() + btnthree.getText();
        txtDisplay.setText(entervalue);
    }//GEN-LAST:event_btnthreeActionPerformed

    private void btnsixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsixActionPerformed
         String entervalue = txtDisplay.getText() + btnsix.getText();
        txtDisplay.setText(entervalue);
    }//GEN-LAST:event_btnsixActionPerformed

    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusActionPerformed
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "+";
    }//GEN-LAST:event_btnplusActionPerformed

    private void btnminuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminuesActionPerformed
firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "-";
    }//GEN-LAST:event_btnminuesActionPerformed

    private void btnmultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicationActionPerformed
firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "*";
    }//GEN-LAST:event_btnmultiplicationActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "/";
    }//GEN-LAST:event_btndivActionPerformed

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
    
    }//GEN-LAST:event_txtDisplayActionPerformed

    private void btnforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnforeActionPerformed
       String entervalue = txtDisplay.getText() + btnfore.getText();
        txtDisplay.setText(entervalue);
    }//GEN-LAST:event_btnforeActionPerformed

    private void btnfiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiveActionPerformed
        String entervalue = txtDisplay.getText() + btnfive.getText();
        txtDisplay.setText(entervalue);
    }//GEN-LAST:event_btnfiveActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
     txtDisplay.setText(" ");
    }//GEN-LAST:event_btncActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRestaurantManagementSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnarrow;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btneight;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btnfive;
    private javax.swing.JButton btnfore;
    private javax.swing.JButton btnminues;
    private javax.swing.JButton btnmultiplication;
    private javax.swing.JButton btnnine;
    private javax.swing.JButton btnone;
    private javax.swing.JButton btnplus;
    private javax.swing.JButton btnplusminus;
    private javax.swing.JButton btnseven;
    private javax.swing.JButton btnsix;
    private javax.swing.JButton btnthree;
    private javax.swing.JButton btntow;
    private javax.swing.JButton btnzero;
    private javax.swing.JComboBox cmbCountry;
    private javax.swing.JComboBox cmbProducts;
    private javax.swing.JButton cmdclose;
    private javax.swing.JButton cmdconvert;
    private javax.swing.JButton cmdexit;
    private javax.swing.JButton cmdreceipt;
    private javax.swing.JButton cmdreset;
    private javax.swing.JButton cmdtotal;
    private javax.swing.JButton jButton11;
    private javax.swing.JCheckBox jCChicBurger;
    private javax.swing.JCheckBox jCDelivery;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTextField txtDisplay;
    private javax.swing.JTextField txtbcb;
    private javax.swing.JTextField txtcb;
    private javax.swing.JTextField txtcbm;
    private javax.swing.JTextField txtcd;
    private javax.swing.JTextField txtcdeli;
    private javax.swing.JTextField txtcm;
    private javax.swing.JTextField txtconResult;
    private javax.swing.JTextField txtconvert;
    private javax.swing.JTextField txtst;
    private javax.swing.JTextField txtt;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
