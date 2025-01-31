package CMS;

import CMSBll.UserAccount;
import CMSBll.OrderAccount;
import CMSBll.FeedbackAccount;
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
import CMSBll.OrderItemAccount;

public class ManagingStaff extends javax.swing.JFrame {
    
    boolean isFound = false;
        
    public ManagingStaff() {
        initComponents();
        loadOrderItemData();
        loadData();
        loadOrderData();
        loadFeedbackData();
    }
    
    
    private void loadOrderItemData(){
        try {
            ArrayList<String> fileData;
            UserAccountDAO cd = new UserAccountDA();
            fileData = cd.getAllOrderItem();
            DefaultTableModel dtm = new DefaultTableModel(new String[]{"Item ID", "Item Name", "Price"}, 0);
            Object[] tableLines = fileData.toArray();
            for(int i=0;i<tableLines.length;i++){
                String lines=tableLines[i].toString();
                String[] row=lines.split(",");
                dtm.addRow(row);
                
            }
            AddOrderTable.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(ManagingStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    

        private void loadData(){
        try {
            ArrayList<String> fileData;
            UserAccountDAO cd = new UserAccountDA();
            fileData = cd.getAllUsers();
            DefaultTableModel dtm = new DefaultTableModel(new String[]{"UserID", "User Name", "Password", "Role", "Email"}, 0);
            Object[] tableLines = fileData.toArray();
            for(int i=0;i<tableLines.length;i++){
                String lines=tableLines[i].toString();
                String[] row=lines.split(",");
                row[2]="******";
                dtm.addRow(row);
                
            }
            jTable1.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(ManagingStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
    
        
        private void loadOrderData(){
        try {
            ArrayList<String> fileData;
            UserAccountDAO cd = new UserAccountDA();
            fileData = cd.getAllOrders();
            DefaultTableModel dtm = new DefaultTableModel(new String[]{"ID", "Name", "Address", "Contact", "Status", "Order Details", "Order Date", "FeedBack", "Amount", "Deliver Date", "Deliver By"}, 0);
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
        
        
    private void loadFeedbackData(){
        try {
            ArrayList<String> fileData;
            UserAccountDAO cd = new UserAccountDA();
            fileData = cd.getAllFeedback();
            DefaultTableModel dtm = new DefaultTableModel(new String[]{" Customer ID", "Name", "Feedback", "Feedback Category", "Improve Needed"}, 0);
            Object[] tableLines = fileData.toArray();
            for(int i=0;i<tableLines.length;i++){
                String lines=tableLines[i].toString();
                String[] row=lines.split(",");
                dtm.addRow(row);
                
            }
            feedbacktable.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(ManagingStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        customerid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderdetails = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        orderdate = new javax.swing.JTextField();
        SaveOrder = new javax.swing.JButton();
        UpdateOrder = new javax.swing.JButton();
        DeleteOrder = new javax.swing.JButton();
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
        jLabel13 = new javax.swing.JLabel();
        serviceamount = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        itemid = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        itemname = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        AddOrderTable = new javax.swing.JTable();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        close = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        feedbackcustomerid = new javax.swing.JTextField();
        feedbackcustomerfeedback = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        feedbackcustomername = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        feedbackimproveneeded = new javax.swing.JTextField();
        feedbackcategory = new javax.swing.JComboBox<>();
        savefeedback = new javax.swing.JButton();
        updatefeedback = new javax.swing.JButton();
        searchfeedback = new javax.swing.JButton();
        resetfeedback = new javax.swing.JButton();
        closefeedback = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        feedbacktable = new javax.swing.JTable();
        deletefeedback = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        custid = new javax.swing.JTextField();
        generatereport = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        reportcustomerid = new javax.swing.JLabel();
        reportcustomername = new javax.swing.JLabel();
        reportcustomeraddress = new javax.swing.JLabel();
        reportcustomercontact = new javax.swing.JLabel();
        reportorderdate = new javax.swing.JLabel();
        reportorderstatus = new javax.swing.JLabel();
        reportorderdetails = new javax.swing.JLabel();
        reportamount = new javax.swing.JLabel();
        reportcustomerfeedback = new javax.swing.JLabel();
        reportdeliverydate = new javax.swing.JLabel();
        reportdeliveredby = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        userid = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        resetuser = new javax.swing.JButton();
        finduser = new javax.swing.JButton();
        userpassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        userlogout = new javax.swing.JButton();
        userrole = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Managing Staff Panel");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
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

        SaveOrder.setBackground(new java.awt.Color(0, 153, 51));
        SaveOrder.setForeground(new java.awt.Color(240, 240, 240));
        SaveOrder.setText("Save");
        SaveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveOrderActionPerformed(evt);
            }
        });

        UpdateOrder.setBackground(new java.awt.Color(0, 153, 51));
        UpdateOrder.setForeground(new java.awt.Color(240, 240, 240));
        UpdateOrder.setText("Update");
        UpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateOrderActionPerformed(evt);
            }
        });

        DeleteOrder.setBackground(new java.awt.Color(0, 153, 51));
        DeleteOrder.setForeground(new java.awt.Color(240, 240, 240));
        DeleteOrder.setText("Delete");
        DeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOrderActionPerformed(evt);
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
        customerstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Delivered" }));
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

        jLabel13.setText("Amount");

        serviceamount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        serviceamount.setForeground(new java.awt.Color(51, 51, 51));
        serviceamount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(SaveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResetOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CloseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(93, 93, 93)
                                .addComponent(serviceamount))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(customerstatus, 0, 140, Short.MAX_VALUE)
                                    .addComponent(customercontact)
                                    .addComponent(customeraddress)
                                    .addComponent(customername)
                                    .addComponent(customerid, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(SearchOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderdate)
                            .addComponent(jScrollPane2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(serviceamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveOrder)
                    .addComponent(UpdateOrder)
                    .addComponent(DeleteOrder)
                    .addComponent(ResetOrder)
                    .addComponent(CloseOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Order Management", jPanel2);

        itemid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemid.setForeground(new java.awt.Color(51, 51, 51));
        itemid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel32.setText("Item ID");

        jLabel33.setText("Item Name");

        itemname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemname.setForeground(new java.awt.Color(51, 51, 51));
        itemname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel34.setText("Price");

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        price.setForeground(new java.awt.Color(51, 51, 51));
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        AddOrderTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        AddOrderTable.setForeground(new java.awt.Color(51, 51, 51));
        AddOrderTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(AddOrderTable);

        save.setBackground(new java.awt.Color(0, 153, 51));
        save.setForeground(new java.awt.Color(240, 240, 240));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 153, 51));
        update.setForeground(new java.awt.Color(240, 240, 240));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 153, 51));
        delete.setForeground(new java.awt.Color(240, 240, 240));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 153, 51));
        reset.setForeground(new java.awt.Color(240, 240, 240));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(0, 153, 51));
        close.setForeground(new java.awt.Color(240, 240, 240));
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 153, 51));
        search.setForeground(new java.awt.Color(240, 240, 240));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(save)
                                .addGap(18, 18, 18)
                                .addComponent(update)
                                .addGap(18, 18, 18)
                                .addComponent(delete))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel32)
                                    .addComponent(itemid, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(0, 23, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(search)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(reset)
                        .addGap(18, 18, 18)
                        .addComponent(close)))
                .addGap(55, 55, 55))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(update)
                    .addComponent(delete))
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(close))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Product", jPanel9);

        jLabel12.setText("Customer ID ");

        jLabel28.setText("Customer Feedback");

        feedbackcustomerid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        feedbackcustomerid.setForeground(new java.awt.Color(51, 51, 51));
        feedbackcustomerid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        feedbackcustomerfeedback.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        feedbackcustomerfeedback.setForeground(new java.awt.Color(51, 51, 51));
        feedbackcustomerfeedback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel29.setText("Customer Name ");

        jLabel30.setText("Feedback category");

        feedbackcustomername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        feedbackcustomername.setForeground(new java.awt.Color(51, 51, 51));
        feedbackcustomername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel31.setText("Improve Needed ");

        feedbackimproveneeded.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        feedbackimproveneeded.setForeground(new java.awt.Color(51, 51, 51));
        feedbackimproveneeded.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        feedbackcategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        feedbackcategory.setForeground(new java.awt.Color(51, 51, 51));
        feedbackcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Excellent ", "Good", "Satisfying", "Unsatisfying" }));
        feedbackcategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        savefeedback.setBackground(new java.awt.Color(0, 153, 51));
        savefeedback.setForeground(new java.awt.Color(240, 240, 240));
        savefeedback.setText("Save");
        savefeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefeedbackActionPerformed(evt);
            }
        });

        updatefeedback.setBackground(new java.awt.Color(0, 153, 51));
        updatefeedback.setForeground(new java.awt.Color(240, 240, 240));
        updatefeedback.setText("Update");
        updatefeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatefeedbackActionPerformed(evt);
            }
        });

        searchfeedback.setBackground(new java.awt.Color(0, 153, 51));
        searchfeedback.setForeground(new java.awt.Color(240, 240, 240));
        searchfeedback.setText("Search ID");
        searchfeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfeedbackActionPerformed(evt);
            }
        });

        resetfeedback.setBackground(new java.awt.Color(0, 153, 51));
        resetfeedback.setForeground(new java.awt.Color(240, 240, 240));
        resetfeedback.setText("Reset");
        resetfeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetfeedbackActionPerformed(evt);
            }
        });

        closefeedback.setBackground(new java.awt.Color(0, 153, 51));
        closefeedback.setForeground(new java.awt.Color(240, 240, 240));
        closefeedback.setText("Close");
        closefeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closefeedbackActionPerformed(evt);
            }
        });

        feedbacktable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        feedbacktable.setForeground(new java.awt.Color(51, 51, 51));
        feedbacktable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(feedbacktable);

        deletefeedback.setBackground(new java.awt.Color(0, 153, 51));
        deletefeedback.setForeground(new java.awt.Color(240, 240, 240));
        deletefeedback.setText("Delete");
        deletefeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletefeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(feedbackcustomerid)
                                    .addComponent(feedbackcustomerfeedback)
                                    .addComponent(feedbackimproveneeded, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(searchfeedback)
                                .addGap(97, 97, 97)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(feedbackcustomername)
                                    .addComponent(feedbackcategory, 0, 147, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(savefeedback)
                        .addGap(18, 18, 18)
                        .addComponent(updatefeedback)
                        .addGap(18, 18, 18)
                        .addComponent(deletefeedback)
                        .addGap(18, 18, 18)
                        .addComponent(resetfeedback)
                        .addGap(18, 18, 18)
                        .addComponent(closefeedback)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(feedbackcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchfeedback)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(feedbackcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(feedbackcustomerfeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(feedbackcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(feedbackimproveneeded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savefeedback)
                    .addComponent(updatefeedback)
                    .addComponent(resetfeedback)
                    .addComponent(closefeedback)
                    .addComponent(deletefeedback))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Feedback Management", jPanel3);

        jLabel14.setText("Enter Customer ID ");

        custid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        custid.setForeground(new java.awt.Color(51, 51, 51));
        custid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        generatereport.setBackground(new java.awt.Color(0, 153, 51));
        generatereport.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generatereport.setForeground(new java.awt.Color(240, 240, 240));
        generatereport.setText("Generate Report");
        generatereport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatereportActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Courier management System");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Customer Delivery Report");

        jLabel17.setText("Customer ID :");

        jLabel18.setText("Customer name :");

        jLabel19.setText("Customer Address :");

        jLabel20.setText("Customer Contact :");

        jLabel21.setText("Order Date :");

        jLabel22.setText("Delivery Status :");

        jLabel23.setText("Order Details :");

        jLabel24.setText("Amount (Rs.) :");

        jLabel25.setText("Customer Feedback :");

        jLabel26.setText("Delivered Date :");

        jLabel27.setText("Delivered By :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(reportcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(reportorderdate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(reportcustomeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(reportorderstatus, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(reportcustomercontact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reportcustomername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reportcustomerfeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(reportdeliverydate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(99, 99, 99)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reportdeliveredby, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 29, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel16))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel15))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reportorderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addGap(107, 107, 107)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(reportamount, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reportcustomerid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportcustomername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel18)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportcustomercontact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(reportcustomeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportorderstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jLabel22)
                        .addComponent(reportorderdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportorderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportamount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(reportcustomerfeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(reportdeliverydate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(reportdeliveredby, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(generatereport)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(custid, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(custid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(generatereport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Report Management", jPanel4);

        userid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userid.setForeground(new java.awt.Color(51, 51, 51));
        userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        btnSave.setBackground(new java.awt.Color(0, 153, 51));
        btnSave.setForeground(new java.awt.Color(240, 240, 240));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 51));
        btnUpdate.setForeground(new java.awt.Color(240, 240, 240));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 153, 51));
        btnDelete.setForeground(new java.awt.Color(240, 240, 240));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("User ID");

        btnClose.setBackground(new java.awt.Color(0, 153, 51));
        btnClose.setForeground(new java.awt.Color(240, 240, 240));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel2.setText("User Name");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Password");

        resetuser.setBackground(new java.awt.Color(0, 153, 51));
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

        jLabel4.setText("Role");

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
        userrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ManagingStaff", "DeliveryStaff" }));
        userrole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel35.setText("Email");

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(51, 51, 51));
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userrole, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel35))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userid, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(email)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(userpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addComponent(finduser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userlogout)
                .addGap(207, 207, 207))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(resetuser, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finduser)
                    .addComponent(jLabel35)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userlogout))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(resetuser)
                    .addComponent(btnClose))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("User Account Management", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userlogoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login lo = new Login();
        lo.setVisible(true);
    }//GEN-LAST:event_userlogoutActionPerformed

    private void finduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finduserActionPerformed
        // TODO add your handling code here:
        userid.setText("");
        username.setText("");
        userpassword.setText("");
        userrole.getSelectedItem().toString();
        isFound = false;
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        btnClose.setEnabled(true);
        resetuser.setEnabled(true);
        btnSave.setEnabled(false);
        userid.setEnabled(false);

        String search_id = email.getText();

        if (search_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter an user id to search");
        } else {
            File file = new File("User.txt");

            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String data;
                UserAccount user;

                while ((data = br.readLine()) != null) {
                    user = new UserAccount(data);
                    if (user.getUserEmail().equals(search_id)) {
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
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(true);
        finduser.setEnabled(true);
    }//GEN-LAST:event_resetuserActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String delete_id = userid.getText();

        ArrayList<UserAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter a valid user id and search");
        } else {
            File file = new File("User.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    UserAccount tempUser;

                    while ((data = br.readLine()) != null) {
                        tempUser = new UserAccount(data);
                        if (!tempUser.getUserid().equals(delete_id)) {
                            userList.add(tempUser);
                        }
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(this, "Are You Sure you want to delete?");
                    JOptionPane.showMessageDialog(this, "Deleted Successfully!");
                    btnDelete.setEnabled(false);
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
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String uid = userid.getText();
        String search_id = email.getText();
        String uusername = username.getText();
        String uuserpassword = userpassword.getText();
        String uuserrole = userrole.getSelectedItem().toString();

        ArrayList<UserAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter valid Email and search");
        } else if (uid.isEmpty() || search_id.isEmpty() || uusername.isEmpty() || uuserpassword.isEmpty()) {
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
                        if (tempUser.getUserEmail().equals(search_id)) {
                            tempUser.setUserid(uid);
                            tempUser.setUserName(uusername);
                            tempUser.setUserPassword(uuserpassword);
                            tempUser.setUserRole(uuserrole);
                            tempUser.setUserEmail(search_id);
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        String usid = userid.getText();
        String uemail = email.getText();
        String usname = username.getText();
        String uspassword = userpassword.getText();
        String usrole = userrole.getSelectedItem().toString();

        if (uemail.isEmpty() || usid.isEmpty() || usname.isEmpty() || uspassword.isEmpty() || usrole.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields Necessary");
        } else {

            File search = new File("User.txt");

            try {

                FileReader fr = new FileReader(search);
                BufferedReader br = new BufferedReader(fr);
                String data;
                UserAccount sid;


                        UserAccount ua=new UserAccount();
                        UserAccountDAO ud=new UserAccountDA();

                        ua.setUserEmail(email.getText());
                        ua.setUserid(userid.getText());
                        ua.setUserName(username.getText());
                        ua.setUserPassword(userpassword.getText());
                        ua.setUserRole(userrole.getSelectedItem().toString());

                        try {
                            ud.SaveUser(ua);
                        } catch (IOException ex) {
                            Logger.getLogger(DeliveryStaff.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        loadData();
                        
            } catch (IOException ex) {

                Logger.getLogger(ManagingStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void generatereportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatereportActionPerformed
        // TODO add your handling code here:
        reportcustomername.setText("");
        reportcustomeraddress.setText("");
        reportcustomercontact.setText("");
        reportorderstatus.setText("");
        reportorderdetails.setText("");
        reportorderdate.setText("");
        reportcustomerfeedback.setText("");
        reportamount.setText("");
        reportdeliverydate.setText("");
        reportdeliveredby.setText("");

        isFound = false;

        String search_id = custid.getText();

        if (search_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter valid Customer id to Generate Report");
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
                        custid.setText(order.getCustid());
                        reportcustomerid.setText(order.getCustomerid());
                        reportcustomername.setText(order.getCustomerName());
                        reportcustomeraddress.setText(order.getCustomerAddress());
                        reportcustomercontact.setText(order.getCustomerContact());
                        reportorderstatus.setText(order.getCustomerStatus());
                        reportorderdetails.setText(order.getOrderDetails());
                        reportorderdate.setText(order.getOrderDate());
                        reportcustomerfeedback.setText(order.getCustomerFeedback());
                        reportamount.setText(order.getServiceAmount());
                        reportdeliverydate.setText(order.getDeliveredDate());
                        reportdeliveredby.setText(order.getDeliveredBy());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "Customer not found");
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
        }

    }//GEN-LAST:event_generatereportActionPerformed

    private void deletefeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletefeedbackActionPerformed
        // TODO add your handling code here:
        String delete_id = feedbackcustomerid.getText();

        ArrayList<FeedbackAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter a valid Customer id and search");
        } else {
            File file = new File("FeedbackData.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    FeedbackAccount tempUser;

                    while ((data = br.readLine()) != null) {
                        tempUser = new FeedbackAccount(data);
                        if (!tempUser.getFeedbackCustomerid().equals(delete_id)) {
                            userList.add(tempUser);
                        }
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(this, "Are You Sure you want to delete?");
                    JOptionPane.showMessageDialog(this, "Deleted Successfully!");
                    deletefeedback.setEnabled(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                loadFeedbackData();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_deletefeedbackActionPerformed

    private void closefeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closefeedbackActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closefeedbackActionPerformed

    private void resetfeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetfeedbackActionPerformed
        // TODO add your handling code here:
        feedbackcustomerid.setText("");
        feedbackcustomername.setText("");
        feedbackcustomerfeedback.setText("");
        feedbackcategory.getSelectedItem().toString();
        feedbackimproveneeded.setText("");

        feedbackcustomerid.setEnabled(true);
        feedbackcustomername.setEnabled(true);
        feedbackcustomerfeedback.setEnabled(true);
        feedbackcategory.setEnabled(true);
        feedbackimproveneeded.setEnabled(true);

        savefeedback.setEnabled(true);
        updatefeedback.setEnabled(true);
        deletefeedback.setEnabled(true);
        searchfeedback.setEnabled(true);
        closefeedback.setEnabled(true);
    }//GEN-LAST:event_resetfeedbackActionPerformed

    private void searchfeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfeedbackActionPerformed
        // TODO add your handling code here:
        feedbackcustomername.setText("");
        feedbackcustomerfeedback.setText("");
        feedbackimproveneeded.setText("");
        feedbackcategory.getSelectedItem().toString();
        isFound = false;
        updatefeedback.setEnabled(true);
        deletefeedback.setEnabled(true);
        closefeedback.setEnabled(true);
        resetfeedback.setEnabled(true);
        savefeedback.setEnabled(true);
        feedbackcustomerid.setEnabled(false);
        feedbackcustomername.setEnabled(false);
        feedbackcustomerfeedback.setEnabled(false);

        String search_id = feedbackcustomerid.getText();

        if (search_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter an customer id to search");
        } else {
            File file = new File("OrderData.txt");
            File feedback = new File("FeedbackData.txt");

            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                FileReader ff = new FileReader(feedback);
                BufferedReader bb = new BufferedReader(ff);
                String data;
                String fee;
                OrderAccount order;
                FeedbackAccount feed;

                while ((data = br.readLine()) != null) {
                    order = new OrderAccount(data);
                    if (order.getCustomerid().equals(search_id)) {
                        isFound = true;
                        feedbackcustomerid.setText(order.getCustomerid());
                        feedbackcustomername.setText(order.getCustomerName());
                        feedbackcustomerfeedback.setText(order.getCustomerFeedback());
                        while ((fee = bb.readLine()) != null){
                            feed = new FeedbackAccount(fee);
                            if (feed.getFeedbackCustomerid().equals(search_id)){
                                feedbackcategory.setSelectedItem(feed.getFeedbackCategory());
                                feedbackimproveneeded.setText(feed.getImproveNeeded());
                                return;
                            }
                        }
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "Customer not found");
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
        }
    }//GEN-LAST:event_searchfeedbackActionPerformed

    private void updatefeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatefeedbackActionPerformed
        // TODO add your handling code here:
        String search_id = feedbackcustomerid.getText();
        String ufeedbackcustomername = feedbackcustomername.getText();
        String ufeedbackcustomerfeedback = feedbackcustomerfeedback.getText();
        String ufeedbackcategory = feedbackcategory.getSelectedItem().toString();
        String ufeedbackimproveneeded = feedbackimproveneeded.getText();

        ArrayList<FeedbackAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter a valid id and search for a order record first");
        } else if (search_id.isEmpty()|| ufeedbackcategory.isEmpty() || ufeedbackimproveneeded.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are Necessary!");
        } else {
            File file = new File("FeedbackData.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    FeedbackAccount tempUser;

                    while ((data = br.readLine()) != null) {
                        tempUser = new FeedbackAccount(data);
                        if (tempUser.getFeedbackCustomerid().equals(search_id)) {
                            tempUser.setFeedbackCustomerName(ufeedbackcustomername);
                            tempUser.setFeedbackCustomerFeedback(ufeedbackcustomerfeedback);
                            tempUser.setFeedbackCategory(ufeedbackcategory);
                            tempUser.setImproveNeeded(ufeedbackimproveneeded);
                        }
                        userList.add(tempUser);
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(null, "Feedback Data Updated Successfully!");
                    updatefeedback.setEnabled(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                loadFeedbackData();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_updatefeedbackActionPerformed

    private void savefeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefeedbackActionPerformed
        // TODO add your handling code here:

        String feedbackid = feedbackcustomerid.getText();
        String feedbackname = feedbackcustomername.getText();
        String feedback = feedbackcustomerfeedback.getText();
        String fcategory = feedbackcategory.getSelectedItem().toString();
        String improve = feedbackimproveneeded.getText();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter a valid id and search for a order record first");
        }else if (feedbackid.isEmpty() || feedbackname.isEmpty() || feedback.isEmpty() || fcategory.isEmpty() || improve.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields Necessary");
        } else {
            File file = new File("FeedbackData.txt");
            FeedbackAccount user = new FeedbackAccount(feedbackid, feedbackname, feedback, fcategory, improve);

            try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
                pw.println(user.toString());
                pw.flush();
                pw.write("");
                pw.close();

                JOptionPane.showMessageDialog(this, "Customer Feedback Added");
                savefeedback.setEnabled(false);
                feedbackcustomerid.setEnabled(false);
                feedbackcustomername.setEnabled(false);
                feedbackcustomerfeedback.setEnabled(false);
                feedbackcategory.setEnabled(false);
                feedbackimproveneeded.setEnabled(false);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            loadFeedbackData();
        }
    }//GEN-LAST:event_savefeedbackActionPerformed

    //Customer/Order Action Performen
    
    private void ResetOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetOrderActionPerformed
        // TODO add your handling code here:
        customerid.setText("");
        customername.setText("");
        customeraddress.setText("");
        customercontact.setText("");
        customerstatus.getSelectedItem().toString();
        orderdetails.setText("");
        orderdate.setText("");
        serviceamount.setText("");

        customerid.setEnabled(true);
        customername.setEnabled(true);
        customeraddress.setEnabled(true);
        customercontact.setEnabled(true);
        customerstatus.setEnabled(true);
        orderdetails.setEnabled(true);
        orderdate.setEnabled(true);
        serviceamount.setEnabled(true);

        SaveOrder.setEnabled(true);
        UpdateOrder.setEnabled(true);
        DeleteOrder.setEnabled(true);
        SearchOrder.setEnabled(true);
        CloseOrder.setEnabled(true);
    }//GEN-LAST:event_ResetOrderActionPerformed

    private void SearchOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchOrderActionPerformed
        // TODO add your handling code here:

        customername.setText("");
        customeraddress.setText("");
        customercontact.setText("");
        customerstatus.getSelectedItem().toString();
        orderdetails.setText("");
        orderdate.setText("");
        serviceamount.setText("");
        isFound = false;
        UpdateOrder.setEnabled(true);
        DeleteOrder.setEnabled(true);
        CloseOrder.setEnabled(true);
        ResetOrder.setEnabled(true);
        SaveOrder.setEnabled(false);
        customerstatus.setEnabled(false);
        customerid.setEnabled(false);

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
                        serviceamount.setText(order.getServiceAmount());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "Customer not found");
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
        }

    }//GEN-LAST:event_SearchOrderActionPerformed

    private void customerstatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customerstatusItemStateChanged
        // TODO add your handling code here:
        /**        if (customerstatus.getSelectedItem().toString().equals("Delivered")){
            customerfeedback.setEnabled(true);
            serviceamount.setEnabled(true);
        } else {
            customerfeedback.setEnabled(false);
            serviceamount.setEnabled(false);
        }
        * **/
    }//GEN-LAST:event_customerstatusItemStateChanged

    private void CloseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseOrderActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseOrderActionPerformed

    private void DeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteOrderActionPerformed
        // TODO add your handling code here:
        String delete_id = customerid.getText();

        ArrayList<OrderAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter a valid Customer id and search");
        } else {
            File file = new File("OrderData.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    OrderAccount tempUser;

                    while ((data = br.readLine()) != null) {
                        tempUser = new OrderAccount(data);
                        if (!tempUser.getCustomerid().equals(delete_id)) {
                            userList.add(tempUser);
                        }
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(this, "Are You Sure you want to delete?");
                    JOptionPane.showMessageDialog(this, "Deleted Successfully!");
                    DeleteOrder.setEnabled(false);
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
    }//GEN-LAST:event_DeleteOrderActionPerformed

    private void UpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateOrderActionPerformed
        // TODO add your handling code here:
        String search_id = customerid.getText();
        String ucustomername = customername.getText();
        String ucustomeraddress = customeraddress.getText();
        String ucustomercontact = customercontact.getText();
        //String ucustomerstatus = customerstatus.getSelectedItem().toString();
        String uorderdetails = orderdetails.getText();
        String uorderdate = orderdate.getText();
        String userviceamount = serviceamount.getText();

        ArrayList<OrderAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter a valid id and search");
        } else if (search_id.isEmpty() || ucustomername.isEmpty() || ucustomeraddress.isEmpty() || ucustomercontact.isEmpty() || uorderdetails.isEmpty() || uorderdate.isEmpty() || userviceamount.isEmpty()) {
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
                            //tempUser.setCustomerStatus(ucustomerstatus);
                            tempUser.setOrderDetails(uorderdetails);
                            tempUser.setOrderDate(uorderdate);
                            tempUser.setServiceAmount(userviceamount);
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

    private void SaveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveOrderActionPerformed
        // TODO add your handling code here:

        String ucustomerid = customerid.getText();
        String ucustomername = customername.getText();
        String ucustomeraddress = customeraddress.getText();
        String ucustomercontact = customercontact.getText();
        String ucustomerstatus = customerstatus.getSelectedItem().toString();
        String uorderdetails = orderdetails.getText();
        String uorderdate = orderdate.getText();
        String userviceamount = serviceamount.getText();

        if (ucustomerid.isEmpty() || ucustomername.isEmpty() || ucustomeraddress.isEmpty() || ucustomercontact.isEmpty() || ucustomerstatus.isEmpty() || uorderdetails.isEmpty() || uorderdate.isEmpty() || userviceamount.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields Necessary");
        } else {

            File search = new File("OrderData.txt");

            try {

                FileReader fr = new FileReader(search);
                BufferedReader br = new BufferedReader(fr);
                String data;
                OrderAccount s;

                while ((data = br.readLine()) != null) {
                    s = new OrderAccount(data);
                    if (s.getCustomerid().equals(ucustomerid)) {
                        JOptionPane.showMessageDialog(null, "ID Already Exists. Try Another ID!");
                    } else {

                        OrderAccount ua=new OrderAccount();
                        UserAccountDAO ud=new UserAccountDA();

                        ua.setCustomerid(customerid.getText());
                        ua.setCustomerName(customername.getText());
                        ua.setCustomerAddress(customeraddress.getText());
                        ua.setCustomerContact(customercontact.getText());
                        ua.setCustomerStatus(customerstatus.getSelectedItem().toString());
                        ua.setOrderDetails(orderdetails.getText());
                        ua.setOrderDate(orderdate.getText());
                        ua.setServiceAmount(serviceamount.getText());

                        try {
                            ud.SaveOrder(ua);
                        } catch (IOException ex) {
                            Logger.getLogger(ManagingStaff.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        loadOrderData();
                        return;
                    }

                }
            } catch (IOException ex) {

                Logger.getLogger(ManagingStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SaveOrderActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        itemid.setText("");
        itemname.setText("");
        price.setText("");
        
        itemid.setEnabled(true);
        itemname.setEnabled(true);
        price.setEnabled(true);
        
        search.setEnabled(true);
        save.setEnabled(true);
        delete.setEnabled(true);
        update.setEnabled(true);
        close.setEnabled(true);
    
    }//GEN-LAST:event_resetActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        itemname.setText("");
        price.setText("");
        isFound = false;
        update.setEnabled(true);
        delete.setEnabled(true);
        close.setEnabled(true);
        reset.setEnabled(true);
        save.setEnabled(false);
        itemname.setEnabled(true);
        itemid.setEnabled(true);

        String search_id = itemid.getText();

        if (search_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter an Item id to search");
        } else {
            File file = new File("OrderItem.txt");

            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String data;
                OrderItemAccount order;

                while ((data = br.readLine()) != null) {
                    order = new OrderItemAccount(data);
                    if (order.getItemid().equals(search_id)) {
                        isFound = true;
                        itemid.setText(order.getItemid());
                        itemname.setText(order.getItemName());
                        price.setText(order.getPrice());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "Item not found");
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
        }


    }//GEN-LAST:event_searchActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String itemcode = itemid.getText();
        String itemn = itemname.getText();
        String itemprice = price.getText();
        
        if (itemcode.isEmpty() || itemn.isEmpty() || itemprice.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields Necessary");
        } else {

            File search = new File("OrderItem.txt");

            try {

                FileReader fr = new FileReader(search);
                BufferedReader br = new BufferedReader(fr);
                String data;
                OrderItemAccount oi;

                        OrderItemAccount oia=new OrderItemAccount();
                        UserAccountDAO ud=new UserAccountDA();

                        oia.setItemid(itemid.getText());
                        oia.setItemName(itemname.getText());
                        oia.setPrice(price.getText());
                        
                        try {
                            ud.SaveOrderItem(oia);
                        } catch (IOException ex) {
                            Logger.getLogger(DeliveryStaff.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        loadOrderItemData();
                    
            } catch (IOException ex) {

                Logger.getLogger(ManagingStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String search_id = itemid.getText();
        String itemn = itemname.getText();
        String itemprice = price.getText();

        ArrayList<OrderItemAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter a valid Item id and search");
        } else if (search_id.isEmpty() || itemn.isEmpty() || itemprice.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are Necessary!");
        } else {
            File file = new File("OrderItem.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    OrderItemAccount tempUser;

                    while ((data = br.readLine()) != null) {
                        tempUser = new OrderItemAccount(data);
                        if (tempUser.getItemid().equals(search_id)) {
                            tempUser.setItemName(itemn);
                            tempUser.setPrice(itemprice);
                        }
                        userList.add(tempUser);
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(null, "Item Data Updated Successfully!");
                    update.setEnabled(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                loadOrderItemData();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }

    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
        String delete_id = itemid.getText();

        ArrayList<OrderItemAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter a valid Item id and search");
        } else {
            File file = new File("OrderItem.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    OrderItemAccount tempUser;

                    while ((data = br.readLine()) != null) {
                        tempUser = new OrderItemAccount(data);
                        if (!tempUser.getItemid().equals(delete_id)) {
                            userList.add(tempUser);
                        }
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(this, "Are You Sure you want to delete?");
                    JOptionPane.showMessageDialog(this, "Deleted Successfully!");
                    delete.setEnabled(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                loadOrderItemData();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AddOrderTable;
    private javax.swing.JButton CloseOrder;
    private javax.swing.JButton DeleteOrder;
    private javax.swing.JButton ResetOrder;
    private javax.swing.JButton SaveOrder;
    private javax.swing.JButton SearchOrder;
    private javax.swing.JButton UpdateOrder;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton close;
    private javax.swing.JButton closefeedback;
    private javax.swing.JTextField custid;
    private javax.swing.JTextField customeraddress;
    private javax.swing.JTextField customercontact;
    private javax.swing.JTextField customerid;
    private javax.swing.JTextField customername;
    private javax.swing.JComboBox<String> customerstatus;
    private javax.swing.JButton delete;
    private javax.swing.JButton deletefeedback;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> feedbackcategory;
    private javax.swing.JTextField feedbackcustomerfeedback;
    private javax.swing.JTextField feedbackcustomerid;
    private javax.swing.JTextField feedbackcustomername;
    private javax.swing.JTextField feedbackimproveneeded;
    private javax.swing.JTable feedbacktable;
    private javax.swing.JButton finduser;
    private javax.swing.JButton generatereport;
    private javax.swing.JTextField itemid;
    private javax.swing.JTextField itemname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField orderdate;
    private javax.swing.JTextArea orderdetails;
    private javax.swing.JTextField price;
    private javax.swing.JLabel reportamount;
    private javax.swing.JLabel reportcustomeraddress;
    private javax.swing.JLabel reportcustomercontact;
    private javax.swing.JLabel reportcustomerfeedback;
    private javax.swing.JLabel reportcustomerid;
    private javax.swing.JLabel reportcustomername;
    private javax.swing.JLabel reportdeliveredby;
    private javax.swing.JLabel reportdeliverydate;
    private javax.swing.JLabel reportorderdate;
    private javax.swing.JLabel reportorderdetails;
    private javax.swing.JLabel reportorderstatus;
    private javax.swing.JButton reset;
    private javax.swing.JButton resetfeedback;
    private javax.swing.JButton resetuser;
    private javax.swing.JButton save;
    private javax.swing.JButton savefeedback;
    private javax.swing.JButton search;
    private javax.swing.JButton searchfeedback;
    private javax.swing.JTextField serviceamount;
    private javax.swing.JButton update;
    private javax.swing.JButton updatefeedback;
    private javax.swing.JTextField userid;
    private javax.swing.JButton userlogout;
    private javax.swing.JTextField username;
    private javax.swing.JPasswordField userpassword;
    private javax.swing.JComboBox<String> userrole;
    // End of variables declaration//GEN-END:variables
}
