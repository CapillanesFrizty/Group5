package badiangfinalproject;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Admin_dashboard extends javax.swing.JFrame {

    private databaseConnector database = new databaseConnector();
    DefaultTableModel tblmodel;
    TableModel model;

    public Admin_dashboard() {
        initComponents();
        tab.setSelectedIndex(1);
        paid_display_to_table();
        display_nonpaid_client();
        display_Attendance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sex = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        create = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        list = new javax.swing.JButton();
        attend = new javax.swing.JButton();
        tab = new javax.swing.JTabbedPane();
        ListPgae = new javax.swing.JPanel();
        searchbar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        clients_table = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        registerPage = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        createClient = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        memtype = new javax.swing.JComboBox<>();
        startdate = new javax.swing.JLabel();
        endDate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        fmale = new javax.swing.JRadioButton();
        contactNumber = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        paymentPage = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nonpaid_table = new javax.swing.JTable();
        paybtn = new javax.swing.JButton();
        attendance = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        attedance = new javax.swing.JTable();
        ref = new javax.swing.JButton();
        out = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        create.setText("jButton1");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        jPanel2.add(create);

        payment.setText("jButton2");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        jPanel2.add(payment);

        list.setText("jButton3");
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });
        jPanel2.add(list);

        attend.setText("jButton4");
        attend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendActionPerformed(evt);
            }
        });
        jPanel2.add(attend);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 43, 677));

        searchbar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbarKeyReleased(evt);
            }
        });

        clients_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fullname", "Sex", "Membership Type", "Payment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(clients_table);
        if (clients_table.getColumnModel().getColumnCount() > 0) {
            clients_table.getColumnModel().getColumn(0).setResizable(false);
            clients_table.getColumnModel().getColumn(1).setResizable(false);
            clients_table.getColumnModel().getColumn(2).setResizable(false);
            clients_table.getColumnModel().getColumn(3).setResizable(false);
            clients_table.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel14.setText("Search");

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListPgaeLayout = new javax.swing.GroupLayout(ListPgae);
        ListPgae.setLayout(ListPgaeLayout);
        ListPgaeLayout.setHorizontalGroup(
            ListPgaeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPgaeLayout.createSequentialGroup()
                .addGroup(ListPgaeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ListPgaeLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ListPgaeLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278)
                        .addComponent(Update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refresh)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ListPgaeLayout.setVerticalGroup(
            ListPgaeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPgaeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(ListPgaeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(delete)
                    .addComponent(Update)
                    .addComponent(refresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        tab.addTab("List of Clients", ListPgae);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        createClient.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        createClient.setText("Add Client");
        createClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClientActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Membership Type");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Date Start");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("Date End");

        memtype.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        memtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Monthly" }));
        memtype.setSelectedIndex(-1);
        memtype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                memtypeItemStateChanged(evt);
            }
        });

        startdate.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        endDate.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(memtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setText("Username");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("Password");

        username.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        passwordfield.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        jCheckBox1.setText("Show Password");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("First Name");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Last Name");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Sex");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Contact Number");

        fname.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        lname.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        address.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        age.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        sex.add(male);
        male.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        male.setText("Male");

        sex.add(fmale);
        fmale.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fmale.setText("Female");

        contactNumber.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(40, 40, 40)
                            .addComponent(jLabel5))
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(male)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fmale))
                    .addComponent(address)
                    .addComponent(lname)
                    .addComponent(fname)
                    .addComponent(contactNumber))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fmale)
                    .addComponent(male))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(contactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        cancel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createClient)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createClient)
                            .addComponent(cancel)
                            .addComponent(clear)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registerPageLayout = new javax.swing.GroupLayout(registerPage);
        registerPage.setLayout(registerPageLayout);
        registerPageLayout.setHorizontalGroup(
            registerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPageLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        registerPageLayout.setVerticalGroup(
            registerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPageLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        tab.addTab("Create", registerPage);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Payment Method :");

        nonpaid_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fullname", "Gender", "Membership Type"
            }
        ));
        jScrollPane2.setViewportView(nonpaid_table);

        paybtn.setText("Pay");
        paybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paymentPageLayout = new javax.swing.GroupLayout(paymentPage);
        paymentPage.setLayout(paymentPageLayout);
        paymentPageLayout.setHorizontalGroup(
            paymentPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPageLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(paymentPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(paybtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPageLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        paymentPageLayout.setVerticalGroup(
            paymentPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(14, 14, 14)
                .addComponent(paybtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        tab.addTab("Payment", paymentPage);

        attedance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Time in", "Time out"
            }
        ));
        jScrollPane3.setViewportView(attedance);

        ref.setText("Refresh");
        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });

        out.setText("Log out");
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout attendanceLayout = new javax.swing.GroupLayout(attendance);
        attendance.setLayout(attendanceLayout);
        attendanceLayout.setHorizontalGroup(
            attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendanceLayout.createSequentialGroup()
                        .addComponent(out)
                        .addGap(18, 18, 18)
                        .addComponent(ref)
                        .addGap(12, 12, 12)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        attendanceLayout.setVerticalGroup(
            attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendanceLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ref)
                    .addComponent(out))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        tab.addTab("Attendance", attendance);

        jPanel1.add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, -43, -1, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        UpdateFrame up = new UpdateFrame();
        int selectedrow = clients_table.getSelectedRow();
        model = clients_table.getModel();

        String id = model.getValueAt(selectedrow, 0).toString();
        up.id = Integer.parseInt(id);

        String query = "SELECT`C_Fname`,`C_Lname`,`C_Age`,`C_ContactNUmber` FROM `client_member` WHERE C_ID = '" + id + "'";

        try {
            database.rs = database.mystate.executeQuery(query);
            if (database.rs.next()) {
                up.fname.setText(database.rs.getString("C_Fname"));
                up.lname.setText(database.rs.getString("C_Lname"));
                up.age.setValue(database.rs.getObject("C_Age"));
                up.ConNumber.setText(database.rs.getString("C_ContactNUmber"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

        up.setVisible(true);
    }//GEN-LAST:event_UpdateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        delete();
    }//GEN-LAST:event_deleteActionPerformed

    private void searchbarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbarKeyReleased
        String input = searchbar.getText();
        search(input);
    }//GEN-LAST:event_searchbarKeyReleased

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        DefaultTableModel tblmodel1 = (DefaultTableModel) clients_table.getModel();
        tblmodel1.setRowCount(0);
        paid_display_to_table();
    }//GEN-LAST:event_refreshActionPerformed

    private void paybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybtnActionPerformed
        database.connect();

        int selectedrow = nonpaid_table.getSelectedRow();
        model = nonpaid_table.getModel();

        String id = model.getValueAt(selectedrow, 0).toString();
        int theid = Integer.parseInt(id);
        String query = "UPDATE `client_member` SET `Payment_Status`='paid' WHERE `C_ID` = ?";

        try {
            database.PrepState = database.con.prepareStatement(query);
            database.PrepState.setInt(1, theid);
            database.PrepState.executeUpdate();
            DefaultTableModel tblmodel1 = (DefaultTableModel) nonpaid_table.getModel();
            tblmodel1.setRowCount(0);
            display_nonpaid_client();
            JOptionPane.showMessageDialog(null, "Paid Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Paid Unsuccessfully");
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss aa");
        Date datetime = new Date(System.currentTimeMillis());

        String insertQuery = "INSERT INTO `payment`(`C_ID`, `Payment_Date`) VALUES ('" + theid + "','" + sdf.format(datetime) + "')";

        try {
            database.mystate.execute(insertQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_paybtnActionPerformed

    private void createClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClientActionPerformed
        create();
    }//GEN-LAST:event_createClientActionPerformed

    private void memtypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_memtypeItemStateChanged
        int i = memtype.getSelectedIndex();
        LocalDate todaysdate = LocalDate.now();
        switch (i) {
            case 0:
                startdate.setText(todaysdate.toString());
                LocalDate Daily = todaysdate.plusDays(0);
                endDate.setText(Daily.toString());
                break;
            case 1:
                startdate.setText(todaysdate.toString());
                LocalDate monthly = todaysdate.plusDays(30);
                endDate.setText(monthly.toString());
                break;
        }
    }//GEN-LAST:event_memtypeItemStateChanged

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        clear();
        Admin_dashboard ad = new Admin_dashboard();
        dispose();
        ad.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
    }//GEN-LAST:event_clearActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
            passwordfield.setEchoChar((char) 0);
        } else {
            passwordfield.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        DefaultTableModel tblmodel1 = (DefaultTableModel) attedance.getModel();
        tblmodel1.setRowCount(0);
        display_Attendance();
    }//GEN-LAST:event_refActionPerformed

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        int i = attedance.getSelectedRow();
        model = attedance.getModel();

        String id = (String) model.getValueAt(i, 0);

        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
        java.util.Date date = new java.util.Date();
        String currenttime = formatter.format(date);

        int Cid = Integer.parseInt(id);
        String query = "UPDATE `attendance` SET `Time out`= ?  WHERE `C_ID` = '" + Cid + "'";

        try {
            database.PrepState = database.con.prepareStatement(query);
            database.PrepState.setString(1, currenttime);
            database.PrepState.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Successfully");
            DefaultTableModel tblmodel1 = (DefaultTableModel) attedance.getModel();
            tblmodel1.setRowCount(0);
            display_Attendance();
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_outActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
       tab.setSelectedIndex(1);
    }//GEN-LAST:event_createActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
       tab.setSelectedIndex(2);
    }//GEN-LAST:event_paymentActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        tab.setSelectedIndex(0);
    }//GEN-LAST:event_listActionPerformed

    private void attendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendActionPerformed
       tab.setSelectedIndex(3);
    }//GEN-LAST:event_attendActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_dashboard().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ListPgae;
    private javax.swing.JButton Update;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTable attedance;
    private javax.swing.JButton attend;
    private javax.swing.JPanel attendance;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    public javax.swing.JTable clients_table;
    private javax.swing.JTextField contactNumber;
    private javax.swing.JButton create;
    private javax.swing.JButton createClient;
    private javax.swing.JButton delete;
    private javax.swing.JLabel endDate;
    private javax.swing.JRadioButton fmale;
    private javax.swing.JTextField fname;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton list;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox<String> memtype;
    private javax.swing.JTable nonpaid_table;
    private javax.swing.JButton out;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JButton paybtn;
    private javax.swing.JButton payment;
    private javax.swing.JPanel paymentPage;
    private javax.swing.JButton ref;
    private javax.swing.JButton refresh;
    private javax.swing.JPanel registerPage;
    private javax.swing.JTextField searchbar;
    private javax.swing.ButtonGroup sex;
    private javax.swing.JLabel startdate;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void create() {
        database.connect();

        male.setActionCommand("Male");
        fmale.setActionCommand("Female");

        String C_Fname = fname.getText().toLowerCase();
        String C_Lname = lname.getText().toLowerCase();
        String C_Address = address.getText().toLowerCase();
        String C_Gender = sex.getSelection().getActionCommand();
        String C_ContactNUmber = contactNumber.getText();
        String C_Username = username.getText().toLowerCase();
        String C_Password = new String(passwordfield.getPassword());
        int memberships = memtype.getSelectedIndex();
        int C_Age = Integer.parseInt(age.getText());

        String Query = "INSERT INTO `client_member`(`C_Fname`, `C_Lname`, `C_Age`, `C_Address`, `C_Gender`, `C_ContactNUmber`, `C_Username`, `C_Password`, `Mem_type`, `Payment_Status`) VALUES ('" + C_Fname + "','" + C_Lname + "', '" + C_Age + "','" + C_Address + "','" + C_Gender + "','" + C_ContactNUmber + "','" + C_Username + "',md5('" + C_Password + "'),'" + memberships + "','Unpaid')";

        try {
            database.mystate = database.con.createStatement();
            database.mystate.execute(Query);
            JOptionPane.showMessageDialog(null, "Client's Registered");

            display_nonpaid_client();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        clear();
    }

    private void clear() {
        fname.setText("");
        lname.setText("");
        address.setText("");
        age.setText("");
        sex.clearSelection();
        contactNumber.setText("");
        username.setText("");
        passwordfield.setText("");
        startdate.setText("");
        endDate.setText("");
        memtype.setSelectedIndex(-1);
    }

    public void paid_display_to_table() {
        try {
            String query = "SELECT client_member.C_ID, client_member.C_Fname, client_member.C_Lname, client_member.C_Gender, client_member.Payment_Status, membership_type.Type_name FROM client_member JOIN membership_type ON client_member.Mem_type = membership_type.MemberType_ID\n"
                    + "WHERE client_member.Payment_Status = \"paid\"";
            database.connect();
            database.rs = database.mystate.executeQuery(query);

            while (database.rs.next()) {
                String id = database.rs.getString("client_member.C_ID");
                String fullname = database.rs.getString("client_member.C_Fname") + " " + database.rs.getString("client_member.C_Lname");
                String gender = database.rs.getString("client_member.C_Gender");
                String membertype = database.rs.getString("membership_type.Type_name");
                String paymentStatus = database.rs.getString("client_member.Payment_Status");

                String Data[] = {id, fullname, gender, membertype, paymentStatus};
                tblmodel = (DefaultTableModel) clients_table.getModel();
                tblmodel.addRow(Data);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void search(String input) {
        DefaultTableModel model = (DefaultTableModel) clients_table.getModel();
        TableRowSorter trs = new TableRowSorter<>(model);
        clients_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(input));
    }

    private void delete() {
        database.connect();
        int selectedrow = clients_table.getSelectedRow();
        String cell = clients_table.getModel().getValueAt(selectedrow, 0).toString();

        String theqeury = "DELETE FROM client_member WHERE C_ID = '" + cell + "'";

        try {
            database.mystate.executeUpdate(theqeury);
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
            DefaultTableModel tblmodel1 = (DefaultTableModel) clients_table.getModel();
            tblmodel1.setRowCount(0);
            paid_display_to_table();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void display_nonpaid_client() {
        try {
            String query = "SELECT client_member.C_ID, client_member.C_Fname, client_member.C_Lname, client_member.C_Gender, client_member.Payment_Status, membership_type.Type_name FROM client_member JOIN membership_type ON client_member.Mem_type = membership_type.MemberType_ID\n"
                    + "WHERE client_member.Payment_Status = \"Unpaid\"";

            database.rs = database.mystate.executeQuery(query);

            while (database.rs.next()) {
                String id = database.rs.getString("client_member.C_ID");
                String fullname = database.rs.getString("client_member.C_Fname") + " " + database.rs.getString("client_member.C_Lname");
                String gender = database.rs.getString("client_member.C_Gender");
                String membertype = database.rs.getString("membership_type.Type_name");

                String nonpaidData[] = {id, fullname, gender, membertype};
                tblmodel = (DefaultTableModel) nonpaid_table.getModel();
                tblmodel.addRow(nonpaidData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void display_Attendance() {
        try {
            String query = "SELECT * FROM `attendance`";

            database.rs = database.mystate.executeQuery(query);

            while (database.rs.next()) {
                String id = database.rs.getString("C_ID");
                String fullname = database.rs.getString("Username");
                String timein = database.rs.getString("Time in");
                String timeout = database.rs.getString("Time out");

                String nonpaidData[] = {id, fullname, timein, timeout};
                tblmodel = (DefaultTableModel) attedance.getModel();
                tblmodel.addRow(nonpaidData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
