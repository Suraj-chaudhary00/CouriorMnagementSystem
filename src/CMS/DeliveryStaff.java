package CMS;
import CMSBll.OrderAccount;
import CMSBll.UserAccount;
import CMSDao.UserAccountDA;
import CMSDao.UserAccountDAO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DeliveryStaff extends javax.swing.JFrame {

    boolean isFound = false;
    
    public DeliveryStaff() {
        initComponents();
        loadData();
        loadOrderData();
    }
    
    private void loadData(){
        try {
            ArrayList<String> fileData;
            UserAccountDAO cd = new UserAccountDA();
            fileData = cd.getAllUsers();
            DefaultTableModel dtm = new DefaultTableModel(new String[]{"UserID", "User Name", "Password", "Role"}, 0);
            Object[] tableLines = fileData.toArray();
            for(int i=0;i<tableLines.length;i++){
                String lines=tableLines[i].toString();
                String[] row=lines.split(",");
                row[2]="******";
                if (row[3].equals("DeliveryStaff")){
                dtm.addRow(row);
                }
            }
            //jTable1.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(DeliveryStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

            
    
    private void loadOrderData(){
        try {
            ArrayList<String> fileData;
            UserAccountDAO cd = new UserAccountDA();
            fileData = cd.getAllOrders();
            DefaultTableModel dtm = new DefaultTableModel(new String[]{"ID", "Name", "Address", "Contact", "Status", "Order Details", "Order Date", "FeedBack", "Amount", "Delivered Date", "Delivered By"}, 0);
            Object[] tableLines = fileData.toArray();
            for(int i=0;i<tableLines.length;i++){
                String lines=tableLines[i].toString();
                String[] row=lines.split(",");
                dtm.addRow(row);
                
            }
            jTable2.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(ManagingStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        customerid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderdetails = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        orderdate = new javax.swing.JTextField();
        UpdateOrder = new javax.swing.JButton();
        CloseOrder = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        customername = new javax.swing.JTextField();
        customeraddress = new javax.swing.JTextField();
        customercontact = new javax.swing.JTextField();
        customerstatus = new javax.swing.JComboBox<>();
        SearchOrder = new javax.swing.JButton();
        ResetOrder = new javax.swing.JButton();
        customerfeedback = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        serviceamount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        delivereddate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        deliveredby = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        userid = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        resetuser = new javax.swing.JButton();
        finduser = new javax.swing.JButton();
        userpassword = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        userlogout = new javax.swing.JButton();
        userrole = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delivery Staff Panel");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setText("Order Details ");

        jLabel7.setText("Customer ID ");

        customerid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerid.setForeground(new java.awt.Color(51, 51, 51));
        customerid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        orderdetails.setColumns(20);
        orderdetails.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        orderdetails.setForeground(new java.awt.Color(51, 51, 51));
        orderdetails.setRows(5);
        orderdetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jScrollPane2.setViewportView(orderdetails);

        jLabel8.setText("Order Date (Y-M-D)");

        orderdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderdate.setForeground(new java.awt.Color(51, 51, 51));
        orderdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        UpdateOrder.setBackground(new java.awt.Color(0, 153, 51));
        UpdateOrder.setForeground(new java.awt.Color(240, 240, 240));
        UpdateOrder.setText("Update");
        UpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateOrderActionPerformed(evt);
            }
        });

        CloseOrder.setBackground(new java.awt.Color(0, 153, 51));
        CloseOrder.setForeground(new java.awt.Color(240, 240, 240));
        CloseOrder.setText("Close");
        CloseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseOrderActionPerformed(evt);
            }
        });

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTable2.setForeground(new java.awt.Color(51, 51, 51));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jLabel5.setText("Customer Name");

        jLabel9.setText("Address");

        jLabel10.setText("Contact");

        jLabel11.setText("Status");

        customername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customername.setForeground(new java.awt.Color(51, 51, 51));
        customername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        customeraddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customeraddress.setForeground(new java.awt.Color(51, 51, 51));
        customeraddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        customercontact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customercontact.setForeground(new java.awt.Color(51, 51, 51));
        customercontact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        customerstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerstatus.setForeground(new java.awt.Color(51, 51, 51));
        customerstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Pending", "Delivered" }));
        customerstatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        customerstatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customerstatusItemStateChanged(evt);
            }
        });

        SearchOrder.setBackground(new java.awt.Color(0, 153, 51));
        SearchOrder.setForeground(new java.awt.Color(240, 240, 240));
        SearchOrder.setText("Search ID");
        SearchOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchOrderActionPerformed(evt);
            }
        });

        ResetOrder.setBackground(new java.awt.Color(0, 153, 51));
        ResetOrder.setForeground(new java.awt.Color(240, 240, 240));
        ResetOrder.setText("Reset");
        ResetOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetOrderActionPerformed(evt);
            }
        });

        customerfeedback.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerfeedback.setForeground(new java.awt.Color(51, 51, 51));
        customerfeedback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel12.setText("Feedback");

        jLabel13.setText("Amount");

        serviceamount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        serviceamount.setForeground(new java.awt.Color(51, 51, 51));
        serviceamount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel1.setText("Delivered Date (Y-M-D)");

        delivereddate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delivereddate.setForeground(new java.awt.Color(51, 51, 51));
        delivereddate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel2.setText("Delivered By");

        deliveredby.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deliveredby.setForeground(new java.awt.Color(51, 51, 51));
        deliveredby.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(delivereddate))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel11))
                                        .addGap(67, 67, 67)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(customerstatus, 0, 140, Short.MAX_VALUE)
                                            .addComponent(customercontact)
                                            .addComponent(customeraddress)
                                            .addComponent(customername)
                                            .addComponent(customerid)
                                            .addComponent(customerfeedback))))
                                .addGap(18, 18, 18)
                                .addComponent(SearchOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel2))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(UpdateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResetOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CloseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12))
                                .addGap(519, 585, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderdate)
                            .addComponent(serviceamount)
                            .addComponent(jScrollPane2)
                            .addComponent(deliveredby))
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(customerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchOrder)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(customername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(customeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(orderdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(customercontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(customerstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(customerfeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(serviceamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(delivereddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(deliveredby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateOrder)
                    .addComponent(ResetOrder)
                    .addComponent(CloseOrder))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Delivery Management", jPanel1);

        userid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userid.setForeground(new java.awt.Color(51, 51, 51));
        userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        btnUpdate.setBackground(new java.awt.Color(0, 153, 51));
        btnUpdate.setForeground(new java.awt.Color(240, 240, 240));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel3.setText("User ID");

        btnClose.setBackground(new java.awt.Color(0, 153, 51));
        btnClose.setForeground(new java.awt.Color(240, 240, 240));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel4.setText("User Name");

        jLabel14.setText("Password");

        resetuser.setBackground(new java.awt.Color(0, 153, 0));
        resetuser.setForeground(new java.awt.Color(240, 240, 240));
        resetuser.setText("Reset");
        resetuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetuserActionPerformed(evt);
            }
        });

        finduser.setBackground(new java.awt.Color(0, 153, 51));
        finduser.setForeground(new java.awt.Color(240, 240, 240));
        finduser.setText("Search ID");
        finduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finduserActionPerformed(evt);
            }
        });

        userpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userpassword.setForeground(new java.awt.Color(51, 51, 51));
        userpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel15.setText("Role");

        userlogout.setBackground(new java.awt.Color(0, 153, 51));
        userlogout.setForeground(new java.awt.Color(240, 240, 240));
        userlogout.setText("Logout");
        userlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userlogoutActionPerformed(evt);
            }
        });

        userrole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userrole.setForeground(new java.awt.Color(51, 51, 51));
        userrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DeliveryStaff" }));
        userrole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel16.setText("Enter Your Email Provided by Admin");

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(51, 51, 51));
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(userid)
                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(username)
                                    .addComponent(userpassword))
                                .addGap(80, 80, 80)
                                .addComponent(finduser)
                                .addGap(139, 139, 139)
                                .addComponent(userlogout))
                            .addComponent(userrole, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetuser, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finduser)
                    .addComponent(jLabel16)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userlogout))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(userrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(resetuser)
                    .addComponent(btnClose))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Profile Management", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateOrderActionPerformed
        // TODO add your handling code here:
        String search_id = customerid.getText();
        String ucustomername = customername.getText();
        String ucustomeraddress = customeraddress.getText();
        String ucustomercontact = customercontact.getText();
        String ucustomerstatus = customerstatus.getSelectedItem().toString();
        String uorderdetails = orderdetails.getText();
        String uorderdate = orderdate.getText();
        String ucustomerfeedback = customerfeedback.getText();
        String userviceamount = serviceamount.getText();
        String udelivereddate = delivereddate.getText();
        String udeliveredby = deliveredby.getText();

        ArrayList<OrderAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter a valid id and search");
        } else if (search_id.isEmpty() || ucustomername.isEmpty() || ucustomeraddress.isEmpty() || ucustomercontact.isEmpty() || ucustomerstatus.isEmpty() || uorderdetails.isEmpty() || uorderdate.isEmpty() || ucustomerfeedback.isEmpty() || userviceamount.isEmpty() || udelivereddate.isEmpty() || udeliveredby.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are Necessary!");
        } else {
            File file = new File("OrderData.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    OrderAccount tempUser;

                    while ((data = br.readLine()) != null) {
                        tempUser = new OrderAccount(data);
                        if (tempUser.getCustomerid().equals(search_id)) {
                            tempUser.setCustomerName(ucustomername);
                            tempUser.setCustomerAddress(ucustomeraddress);
                            tempUser.setCustomerContact(ucustomercontact);
                            tempUser.setCustomerStatus(ucustomerstatus);
                            tempUser.setOrderDetails(uorderdetails);
                            tempUser.setOrderDate(uorderdate);
                            tempUser.setCustomerFeedback(ucustomerfeedback);
                            tempUser.setServiceAmount(userviceamount);
                            tempUser.setDeliveredDate(udelivereddate);
                            tempUser.setDeliveredBy(udeliveredby);
                        }
                        userList.add(tempUser);
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(null, "Order Data Updated Successfully!");
                    UpdateOrder.setEnabled(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                loadOrderData();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_UpdateOrderActionPerformed

    private void CloseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseOrderActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseOrderActionPerformed

    private void customerstatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customerstatusItemStateChanged
        // TODO add your handling code here:
        if (customerstatus.getSelectedItem().toString().equals("Delivered")){
            customerfeedback.setEnabled(true);
            delivereddate.setEnabled(true);
            deliveredby.setEnabled(true);
        } else {
            customerfeedback.setEnabled(false);
            delivereddate.setEnabled(false);
            deliveredby.setEnabled(false);
        }
    }//GEN-LAST:event_customerstatusItemStateChanged

    private void SearchOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchOrderActionPerformed
        // TODO add your handling code here:
        
        customername.setText("");
        customeraddress.setText("");
        customercontact.setText("");
        customerstatus.getSelectedItem().toString();
        orderdetails.setText("");
        orderdate.setText("");
        customerfeedback.setText("");
        serviceamount.setText("");
        delivereddate.setText("");
        deliveredby.setText("");
        isFound = false;
        UpdateOrder.setEnabled(true);
        CloseOrder.setEnabled(true);
        ResetOrder.setEnabled(true);
        customerid.setEnabled(false);
        customername.setEnabled(false);
        customeraddress.setEnabled(false);
        customerstatus.setEnabled(true);
        orderdetails.setEnabled(false);
        orderdate.setEnabled(false);
        serviceamount.setEnabled(false);
        customercontact.setEnabled(false);

        String search_id = customerid.getText();

        if (search_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter an customer id to search");
        } else {
            File file = new File("OrderData.txt");

            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String data;
                OrderAccount order;

                while ((data = br.readLine()) != null) {
                    order = new OrderAccount(data);
                    if (order.getCustomerid().equals(search_id)) {
                        isFound = true;
                        customerid.setText(order.getCustomerid());
                        customername.setText(order.getCustomerName());
                        customeraddress.setText(order.getCustomerAddress());
                        customercontact.setText(order.getCustomerContact());
                        customerstatus.setSelectedItem(order.getCustomerStatus());
                        orderdetails.setText(order.getOrderDetails());
                        orderdate.setText(order.getOrderDate());
                        customerfeedback.setText(order.getCustomerFeedback());
                        serviceamount.setText(order.getServiceAmount());
                        delivereddate.setText(order.getDeliveredDate());
                        deliveredby.setText(order.getDeliveredBy());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "Order Not found");
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
        }

    }//GEN-LAST:event_SearchOrderActionPerformed

    private void ResetOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetOrderActionPerformed
        // TODO add your handling code here:
        customerid.setText("");
        customername.setText("");
        customeraddress.setText("");
        customercontact.setText("");
        customerstatus.getSelectedItem().toString();
        orderdetails.setText("");
        orderdate.setText("");
        customerfeedback.setText("");
        serviceamount.setText("");
        delivereddate.setText("");
        deliveredby.setText("");

        customerid.setEnabled(true);
        customername.setEnabled(true);
        customeraddress.setEnabled(true);
        customercontact.setEnabled(true);
        customerstatus.setEnabled(true);
        orderdetails.setEnabled(true);
        orderdate.setEnabled(true);
        customerfeedback.setEnabled(true);
        serviceamount.setEnabled(true);
        delivereddate.setEnabled(true);
        deliveredby.setEnabled(true);

        UpdateOrder.setEnabled(true);
        SearchOrder.setEnabled(true);
        CloseOrder.setEnabled(true);
    }//GEN-LAST:event_ResetOrderActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String uemail = email.getText();
        String search_id = userid.getText();
        String uusername = username.getText();
        String uuserpassword = userpassword.getText();
        String uuserrole = userrole.getSelectedItem().toString();

        ArrayList<UserAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter Your Email and search");
        } else if (uemail.isEmpty() || search_id.isEmpty() || uusername.isEmpty() || uuserpassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are Necessary!");
        } else {
            File file = new File("User.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    UserAccount tempUser;

                    while ((data = br.readLine()) != null) {
                        tempUser = new UserAccount(data);
                        if (tempUser.getUserEmail().equals(uemail)) {
                            tempUser.setUserid(search_id);
                            tempUser.setUserName(uusername);
                            tempUser.setUserPassword(uuserpassword);
                            tempUser.setUserRole(uuserrole);
                            tempUser.setUserEmail(uemail);
                        }
                        userList.add(tempUser);
                    }
                }


                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(null, "User Data Updated Successfully!");
                    btnUpdate.setEnabled(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                loadData();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void resetuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetuserActionPerformed
        // TODO add your handling code here:
        userid.setText("");
        email.setText("");
        username.setText("");
        userpassword.setText("");
        userrole.getSelectedItem().toString();

        userid.setEnabled(true);
        username.setEnabled(true);
        userpassword.setEnabled(true);
        userrole.setEnabled(true);

        btnClose.setEnabled(true);
        btnUpdate.setEnabled(true);
        finduser.setEnabled(true);
    }//GEN-LAST:event_resetuserActionPerformed

    private void finduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finduserActionPerformed
        // TODO add your handling code here:
        userid.setText("");
        username.setText("");
        userpassword.setText("");
        userrole.getSelectedItem().toString();
        isFound = false;
        btnUpdate.setEnabled(true);
        btnClose.setEnabled(true);
        resetuser.setEnabled(true);

        String search_id = email.getText();

        if (search_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Your Email to search");
        } else {
            File file = new File("User.txt");

            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String data;
                UserAccount user;

                while ((data = br.readLine()) != null) {
                    user = new UserAccount(data);
                    if (user.getUserEmail().equals(search_id) && user.getUserRole().equals("DeliveryStaff")) {
                        isFound = true;
                        email.setText(user.getUserEmail());
                        userid.setText(user.getUserid());
                        username.setText(user.getUserName());
                        userpassword.setText(user.getUserPassword());
                        userrole.setSelectedItem(user.getUserRole());
                        return;
                    }

                }
                JOptionPane.showMessageDialog(this, "User not found");
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
        }
    }//GEN-LAST:event_finduserActionPerformed

    private void userlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userlogoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login lo = new Login();
        lo.setVisible(true);
    }//GEN-LAST:event_userlogoutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseOrder;
    private javax.swing.JButton ResetOrder;
    private javax.swing.JButton SearchOrder;
    private javax.swing.JButton UpdateOrder;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField customeraddress;
    private javax.swing.JTextField customercontact;
    private javax.swing.JTextField customerfeedback;
    private javax.swing.JTextField customerid;
    private javax.swing.JTextField customername;
    private javax.swing.JComboBox<String> customerstatus;
    private javax.swing.JTextField deliveredby;
    private javax.swing.JTextField delivereddate;
    private javax.swing.JTextField email;
    private javax.swing.JButton finduser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField orderdate;
    private javax.swing.JTextArea orderdetails;
    private javax.swing.JButton resetuser;
    private javax.swing.JTextField serviceamount;
    private javax.swing.JTextField userid;
    private javax.swing.JButton userlogout;
    private javax.swing.JTextField username;
    private javax.swing.JPasswordField userpassword;
    private javax.swing.JComboBox<String> userrole;
    // End of variables declaration//GEN-END:variables
}
