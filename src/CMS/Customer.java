package CMS;

import CMSBll.CustomerAccount;
import CMSBll.OrderAccount;
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

public class Customer extends javax.swing.JFrame {
    
    boolean isFound = false;

    public Customer() {
        initComponents();
        loadOrderItemData();
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddOrderTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itemid = new javax.swing.JTextField();
        finditem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        customerid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        orderdetails = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        serviceamount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        customername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        customeraddress = new javax.swing.JTextField();
        customercontact = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        orderdate = new javax.swing.JTextField();
        saveitem = new javax.swing.JButton();
        resetitem = new javax.swing.JButton();
        closeitem = new javax.swing.JButton();
        searchlogs = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rname = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        raddress = new javax.swing.JLabel();
        rid2 = new javax.swing.JLabel();
        rorderdate = new javax.swing.JLabel();
        rcontact = new javax.swing.JLabel();
        rstatus = new javax.swing.JLabel();
        rorder = new javax.swing.JLabel();
        ramount = new javax.swing.JLabel();
        rdeliverdate = new javax.swing.JLabel();
        rdeliverby = new javax.swing.JLabel();
        rfeedback = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        customerfeedback = new javax.swing.JTextField();
        updatefeed = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        secretcodeinfo = new javax.swing.JTextField();
        searchinfo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        fullnameinfo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        emailinfo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        usernameinfo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        passwordinfo = new javax.swing.JPasswordField();
        updateinfo = new javax.swing.JButton();
        closeinfo = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Section");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
        jScrollPane1.setViewportView(AddOrderTable);

        jLabel1.setText("Available Items for Order");

        jLabel2.setText("Enter Item ID");

        itemid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemid.setForeground(new java.awt.Color(51, 51, 51));
        itemid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        finditem.setBackground(new java.awt.Color(0, 153, 51));
        finditem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        finditem.setForeground(new java.awt.Color(240, 240, 240));
        finditem.setText("Find");
        finditem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finditemActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Your Secret Code");

        customerid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerid.setForeground(new java.awt.Color(51, 51, 51));
        customerid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel4.setText("Order Detail");

        orderdetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderdetails.setForeground(new java.awt.Color(51, 51, 51));
        orderdetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        orderdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderdetailsActionPerformed(evt);
            }
        });

        jLabel5.setText("Price");

        serviceamount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        serviceamount.setForeground(new java.awt.Color(51, 51, 51));
        serviceamount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel6.setText("Name");

        customername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customername.setForeground(new java.awt.Color(51, 51, 51));
        customername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel7.setText("Address");

        jLabel8.setText("Contact");

        customeraddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customeraddress.setForeground(new java.awt.Color(51, 51, 51));
        customeraddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        customercontact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customercontact.setForeground(new java.awt.Color(51, 51, 51));
        customercontact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel14.setText("Date");

        orderdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderdate.setForeground(new java.awt.Color(51, 51, 51));
        orderdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        saveitem.setBackground(new java.awt.Color(0, 153, 51));
        saveitem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveitem.setForeground(new java.awt.Color(240, 240, 240));
        saveitem.setText("Save");
        saveitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveitemActionPerformed(evt);
            }
        });

        resetitem.setBackground(new java.awt.Color(0, 153, 51));
        resetitem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resetitem.setForeground(new java.awt.Color(240, 240, 240));
        resetitem.setText("Reset");
        resetitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetitemActionPerformed(evt);
            }
        });

        closeitem.setBackground(new java.awt.Color(0, 153, 51));
        closeitem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        closeitem.setForeground(new java.awt.Color(240, 240, 240));
        closeitem.setText("Close");
        closeitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeitemActionPerformed(evt);
            }
        });

        searchlogs.setBackground(new java.awt.Color(0, 153, 51));
        searchlogs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchlogs.setForeground(new java.awt.Color(240, 240, 240));
        searchlogs.setText("Search");
        searchlogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchlogsActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("ID");

        jLabel16.setText("Name");

        jLabel17.setText("Address");

        jLabel18.setText("Contact");

        jLabel19.setText("Status");

        jLabel20.setText("Order Details");

        jLabel21.setText("Order Date");

        jLabel22.setText("Feedback");

        jLabel23.setText("Amount");

        jLabel24.setText("Deliver Date");

        jLabel25.setText("Deliver By");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel16)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel17)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(rid2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(raddress, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(rcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(rorder, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rorderdate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel22)
                        .addGap(18, 56, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rfeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ramount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(rdeliverdate, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addContainerGap())
                    .addComponent(rdeliverby, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raddress, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rorderdate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rid2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rorder, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ramount, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdeliverdate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdeliverby, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rfeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jLabel26.setText("Give Feedback");

        customerfeedback.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerfeedback.setForeground(new java.awt.Color(51, 51, 51));
        customerfeedback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        updatefeed.setBackground(new java.awt.Color(0, 153, 51));
        updatefeed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updatefeed.setForeground(new java.awt.Color(240, 240, 240));
        updatefeed.setText("Update");
        updatefeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatefeedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(saveitem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatefeed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resetitem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(closeitem))
                            .addComponent(customerfeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel14))
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(58, 58, 58)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(itemid, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(orderdetails, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(serviceamount, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(customeraddress, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(customercontact, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(customername, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(orderdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                .addComponent(customerid)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finditem)
                            .addComponent(searchlogs))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(itemid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(finditem)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchlogs))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(customercontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(customername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerfeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetitem)
                    .addComponent(saveitem)
                    .addComponent(closeitem)
                    .addComponent(updatefeed))
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Order Item", jPanel1);

        jLabel9.setText("Your Secret Code");

        secretcodeinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        secretcodeinfo.setForeground(new java.awt.Color(51, 51, 51));
        secretcodeinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        searchinfo.setBackground(new java.awt.Color(0, 153, 51));
        searchinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchinfo.setForeground(new java.awt.Color(240, 240, 240));
        searchinfo.setText("Search");
        searchinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchinfoActionPerformed(evt);
            }
        });

        jLabel10.setText("Your Full Name");

        fullnameinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullnameinfo.setForeground(new java.awt.Color(51, 51, 51));
        fullnameinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel11.setText("Enter Your Email");

        emailinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailinfo.setForeground(new java.awt.Color(51, 51, 51));
        emailinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel12.setText("Your User Name");

        usernameinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameinfo.setForeground(new java.awt.Color(51, 51, 51));
        usernameinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel13.setText("Your Password");

        passwordinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordinfo.setForeground(new java.awt.Color(51, 51, 51));
        passwordinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        updateinfo.setBackground(new java.awt.Color(0, 153, 51));
        updateinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateinfo.setForeground(new java.awt.Color(240, 240, 240));
        updateinfo.setText("Update");
        updateinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateinfoActionPerformed(evt);
            }
        });

        closeinfo.setBackground(new java.awt.Color(0, 153, 51));
        closeinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        closeinfo.setForeground(new java.awt.Color(240, 240, 240));
        closeinfo.setText("Close");
        closeinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeinfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(updateinfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(closeinfo))
                            .addComponent(passwordinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(fullnameinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(emailinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchinfo))
                            .addComponent(usernameinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addContainerGap(532, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secretcodeinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchinfo)
                    .addComponent(emailinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullnameinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel9)
                .addGap(8, 8, 8)
                .addComponent(secretcodeinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateinfo)
                    .addComponent(closeinfo))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Personal Info", jPanel2);

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

    private void searchinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchinfoActionPerformed
        // TODO add your handling code here:
        
        fullnameinfo.setText("");
        secretcodeinfo.setText("");
        usernameinfo.setText("");
        passwordinfo.setText("");
        isFound = false;
        updateinfo.setEnabled(true);
        closeinfo.setEnabled(true);

        String search_id = emailinfo.getText();

        if (search_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Your Email to search");
        } else {
            File file = new File("Customer.txt");

            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String data;
                CustomerAccount order;

                while ((data = br.readLine()) != null) {
                    order = new CustomerAccount(data);
                    if (order.getCustomerEmail().equals(search_id)) {
                        isFound = true;
                        secretcodeinfo.setText(order.getCustomerid());
                        fullnameinfo.setText(order.getCustomerFullName());
                        emailinfo.setText(order.getCustomerEmail());
                        usernameinfo.setText(order.getCustomerName());
                        passwordinfo.setText(order.getCustomerPassword());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "This is not your Email!");
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
        }


    }//GEN-LAST:event_searchinfoActionPerformed

    private void closeinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeinfoActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeinfoActionPerformed

    private void updateinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateinfoActionPerformed
        // TODO add your handling code here:
        
        String secretcode = secretcodeinfo.getText();
        String search_id = emailinfo.getText();
        String fullname = fullnameinfo.getText();
        String username = usernameinfo.getText();
        String password = passwordinfo.getText();

        ArrayList<CustomerAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter Your Email and search");
        } else if (search_id.isEmpty() || username.isEmpty() || password.isEmpty() || secretcode.isEmpty() || fullname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are Necessary!");
        } else {
            File file = new File("Customer.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    CustomerAccount tempUser;

                    while ((data = br.readLine()) != null) {
                        tempUser = new CustomerAccount(data);
                        if (tempUser.getCustomerEmail().equals(search_id)) {
                            tempUser.setCustomerName(username);
                            tempUser.setCustomerPassword(password);
                            tempUser.setCustomerFullName(fullname);
                            tempUser.setCustomerid(secretcode);
                        }
                        userList.add(tempUser);
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(null, "Your Info Updated Successfully!");
                    updateinfo.setEnabled(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_updateinfoActionPerformed

    private void closeitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeitemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeitemActionPerformed

    private void finditemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finditemActionPerformed
        // TODO add your handling code here:
        
        orderdetails.setText("");
        serviceamount.setText("");
        isFound = false;

        String search_id = itemid.getText();

        if (search_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Valid Item ID to search");
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
                        orderdetails.setText(order.getItemName());
                        serviceamount.setText(order.getPrice());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "Item ID not found!");
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
        }


    }//GEN-LAST:event_finditemActionPerformed

    private void resetitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetitemActionPerformed
        // TODO add your handling code here:
        
        itemid.setText("");
        customerid.setText("");
        customername.setText("");
        customercontact.setText("");
        customeraddress.setText("");
        orderdate.setText("");
        orderdetails.setText("");
        serviceamount.setText("");
        customerfeedback.setText("");
        
        itemid.setEnabled(true);
        customerid.setEnabled(true);
        customername.setEnabled(true);
        customercontact.setEnabled(true);
        customeraddress.setEnabled(true);
        orderdate.setEnabled(true);
        orderdetails.setEnabled(true);
        serviceamount.setEnabled(true);

        closeitem.setEnabled(true);
        saveitem.setEnabled(true);
        finditem.setEnabled(true);
    }//GEN-LAST:event_resetitemActionPerformed

    private void saveitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveitemActionPerformed
        // TODO add your handling code here:
        customerfeedback.setText("");
        String ucustomerid = customerid.getText();
        String ucustomername = customername.getText();
        String ucustomeraddress = customeraddress.getText();
        String ucustomercontact = customercontact.getText();
        String uorderdetails = orderdetails.getText();
        String uorderdate = orderdate.getText();
        String userviceamount = serviceamount.getText();

        if (ucustomerid.isEmpty() || ucustomername.isEmpty() || ucustomeraddress.isEmpty() || ucustomercontact.isEmpty() || uorderdetails.isEmpty() || uorderdate.isEmpty() || userviceamount.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields Necessary");
        } else {

            File search = new File("OrderData.txt");

            try {

                FileReader fr = new FileReader(search);
                BufferedReader br = new BufferedReader(fr);
                String data;
                OrderAccount s;

                        OrderAccount ua=new OrderAccount();
                        UserAccountDAO ud=new UserAccountDA();

                        ua.setCustomerid(customerid.getText());
                        ua.setCustomerName(customername.getText());
                        ua.setCustomerAddress(customeraddress.getText());
                        ua.setCustomerContact(customercontact.getText());
                        ua.setOrderDetails(orderdetails.getText());
                        ua.setOrderDate(orderdate.getText());
                        ua.setServiceAmount(serviceamount.getText());

                        try {
                            ud.saveitem(ua);
                        } catch (IOException ex) {
                            Logger.getLogger(ManagingStaff.class.getName()).log(Level.SEVERE, null, ex);
                        }

                
            } catch (IOException ex) {

                Logger.getLogger(ManagingStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_saveitemActionPerformed

    private void searchlogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchlogsActionPerformed
        // TODO add your handling code here:
        //customername.setText("");
        //customeraddress.setText("");
        //customercontact.setText("");
        rstatus.setText("");
        rorder.setText("");
        rorderdate.setText("");
        rfeedback.setText("");
        ramount.setText("");
        rdeliverdate.setText("");
        rdeliverby.setText("");
        
        itemid.setEnabled(false);
        customername.setEnabled(false);
        customeraddress.setEnabled(false);
        customercontact.setEnabled(false);
        serviceamount.setEnabled(false);
        orderdate.setEnabled(false);
        orderdetails.setEnabled(false);
        customerid.setEnabled(false);
        saveitem.setEnabled(false);
        
        isFound = false;

        String search_id = customerid.getText();

        if (search_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Your Secret Id to View Logs");
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
                        rid2.setText(order.getCustomerid());
                        rname.setText(order.getCustomerName());
                        raddress.setText(order.getCustomerAddress());
                        rcontact.setText(order.getCustomerContact());
                        rstatus.setText(order.getCustomerStatus());
                        rorder.setText(order.getOrderDetails());
                        rorderdate.setText(order.getOrderDate());
                        rfeedback.setText(order.getCustomerFeedback());
                        ramount.setText(order.getServiceAmount());
                        rdeliverdate.setText(order.getDeliveredDate());
                        rdeliverby.setText(order.getDeliveredBy());
                        
                        
                        customerid.setText(order.getCustomerid());
                        customername.setText(order.getCustomerName());
                        customeraddress.setText(order.getCustomerAddress());
                        customercontact.setText(order.getCustomerContact());
                        orderdetails.setText(order.getOrderDetails());
                        orderdate.setText(order.getOrderDate());
                        customerfeedback.setText(order.getCustomerFeedback());
                        serviceamount.setText(order.getServiceAmount());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "Invalid ID");
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
        }

    }//GEN-LAST:event_searchlogsActionPerformed

    private void orderdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderdetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderdetailsActionPerformed

    private void updatefeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatefeedActionPerformed
        // TODO add your handling code here:
        
        String feedback = customerfeedback.getText();
        String search_id = customerid.getText();

        ArrayList<OrderAccount> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "Enter Your Secret ID and search");
        } else if (feedback.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Feedback field is Necessary!");
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
                            tempUser.setCustomerFeedback(feedback);
                        }
                        userList.add(tempUser);
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(null, "Your Data Updated Successfully!");
                    updatefeed.setEnabled(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_updatefeedActionPerformed

       
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AddOrderTable;
    private javax.swing.JButton closeinfo;
    private javax.swing.JButton closeitem;
    private javax.swing.JTextField customeraddress;
    private javax.swing.JTextField customercontact;
    private javax.swing.JTextField customerfeedback;
    private javax.swing.JTextField customerid;
    private javax.swing.JTextField customername;
    private javax.swing.JTextField emailinfo;
    private javax.swing.JButton finditem;
    private javax.swing.JTextField fullnameinfo;
    private javax.swing.JTextField itemid;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField orderdate;
    private javax.swing.JTextField orderdetails;
    private javax.swing.JPasswordField passwordinfo;
    private javax.swing.JLabel raddress;
    private javax.swing.JLabel ramount;
    private javax.swing.JLabel rcontact;
    private javax.swing.JLabel rdeliverby;
    private javax.swing.JLabel rdeliverdate;
    private javax.swing.JButton resetitem;
    private javax.swing.JLabel rfeedback;
    private javax.swing.JLabel rid2;
    private javax.swing.JLabel rname;
    private javax.swing.JLabel rorder;
    private javax.swing.JLabel rorderdate;
    private javax.swing.JLabel rstatus;
    private javax.swing.JButton saveitem;
    private javax.swing.JButton searchinfo;
    private javax.swing.JButton searchlogs;
    private javax.swing.JTextField secretcodeinfo;
    private javax.swing.JTextField serviceamount;
    private javax.swing.JButton updatefeed;
    private javax.swing.JButton updateinfo;
    private javax.swing.JTextField usernameinfo;
    // End of variables declaration//GEN-END:variables
}
