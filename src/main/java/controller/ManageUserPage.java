package controller;

import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import mainapp.Utils;
import managesection.HocVien;
import managesection.QuanLyHocVien;

public class ManageUserPage extends javax.swing.JFrame {

    public ManageUserPage() {
        initComponents();
    }

    public ManageUserPage(LoginPage lgP) {
        this.loginPage = lgP;
        initComponents();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTAdress = new javax.swing.JTextField();
        JTname = new javax.swing.JTextField();
        JRadioMale = new javax.swing.JRadioButton();
        JRadioFemale = new javax.swing.JRadioButton();
        JRadioOther = new javax.swing.JRadioButton();
        JDdayOfBirth = new com.toedter.calendar.JDateChooser();
        btnCreate1 = new javax.swing.JButton();
        btnCreate2 = new javax.swing.JButton();
        btnCreate3 = new javax.swing.JButton();
        btnCreate4 = new javax.swing.JButton();
        JTPassword = new javax.swing.JTextField();
        JTUsername1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCreate5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addGap(258, 258, 258)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton4)
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 400));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 903, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Họ và tên:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 27, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ngày sinh:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 27, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Giới tính:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 84, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Quê quán:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 141, -1, -1));

        JTAdress.setBackground(new java.awt.Color(255, 255, 255));
        JTAdress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTAdress.setToolTipText("");
        jPanel3.add(JTAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 135, 231, 40));

        JTname.setBackground(new java.awt.Color(255, 255, 255));
        JTname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTname.setToolTipText("");
        jPanel3.add(JTname, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 21, 231, 40));

        buttonGroup1.add(JRadioMale);
        JRadioMale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JRadioMale.setForeground(new java.awt.Color(0, 0, 0));
        JRadioMale.setText("Nam");
        jPanel3.add(JRadioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 79, -1, -1));

        buttonGroup1.add(JRadioFemale);
        JRadioFemale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JRadioFemale.setForeground(new java.awt.Color(0, 0, 0));
        JRadioFemale.setText("Nữ");
        jPanel3.add(JRadioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 79, -1, -1));

        buttonGroup1.add(JRadioOther);
        JRadioOther.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JRadioOther.setForeground(new java.awt.Color(0, 0, 0));
        JRadioOther.setText("Khác");
        jPanel3.add(JRadioOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 79, -1, -1));
        jPanel3.add(JDdayOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 21, 231, 40));

        btnCreate1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate1.setForeground(new java.awt.Color(0, 0, 0));
        btnCreate1.setText("Xoá Học Viên");
        btnCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnCreate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        btnCreate2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate2.setForeground(new java.awt.Color(0, 0, 0));
        btnCreate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnCreate2.setText("Tìm");
        btnCreate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnCreate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        btnCreate3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate3.setForeground(new java.awt.Color(0, 0, 0));
        btnCreate3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btnCreate3.setText("Xoá");
        btnCreate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnCreate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, -1));

        btnCreate4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate4.setForeground(new java.awt.Color(0, 0, 0));
        btnCreate4.setText("Thêm");
        btnCreate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnCreate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        JTPassword.setBackground(new java.awt.Color(255, 255, 255));
        JTPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTPassword.setToolTipText("");
        jPanel3.add(JTPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 136, 231, 38));

        JTUsername1.setBackground(new java.awt.Color(255, 255, 255));
        JTUsername1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTUsername1.setToolTipText("");
        jPanel3.add(JTUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 79, 231, 38));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tên đăng nhập:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mật khẩu:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 141, -1, -1));

        btnCreate5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate5.setForeground(new java.awt.Color(0, 0, 0));
        btnCreate5.setText("Cập nhập");
        btnCreate5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate5ActionPerformed(evt);
            }
        });
        jPanel3.add(btnCreate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Họ tên", "Ngày Sinh", "Giới Tính", "Quê quán", "Tên đăng nhập", "Mật khẩu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(15);
        }

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void init() {
        this.model = (DefaultTableModel) jTable1.getModel();
//        JRadioMale.setSelected(true);
        ql.setDs(Utils.danhSachHocVien);
        ql.getDs().forEach(hv -> model.addRow(hv.getFields()));
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void btnCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate1ActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            int choise = JOptionPane.showConfirmDialog(this, "Bạn chắc xoá học viên này");
            if (choise == 0) {
                String username = model.getValueAt(jTable1.getSelectedRow(), 5).toString();
                String password = model.getValueAt(jTable1.getSelectedRow(), 6).toString();

                HocVien hvSlt = ql.timHocVien(username, password);
                ql.xoa(hvSlt);
                clearRows();
                ql.getDs().forEach(hv -> model.addRow(hv.getFields()));
            }
        }
        handleClear();
    }//GEN-LAST:event_btnCreate1ActionPerformed

    private void btnCreate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate2ActionPerformed
        if (JTname.getText().length() == 0) {
            if (JDdayOfBirth.getDate() == null) {
                if (JTAdress.getText().length() == 0) {
                    if (getGioiTinhDuocChon().length() == 0) {

                    } else {
                        clearRows();
                        ql.timGioiTinh(getGioiTinhDuocChon()).forEach(hv -> model.addRow(hv.getFields()));
                    }
                } else {
                    clearRows();
                    ql.timTheoQueQuan(JTAdress.getText()).forEach(hv -> model.addRow(hv.getFields()));
                }
            } else {
                clearRows();
                ql.timTheoNgaySinh(Utils.sp.format(JDdayOfBirth.getDate())).forEach(hv -> model.addRow(hv.getFields()));
            }
        } else {
            if (JDdayOfBirth.getDate() == null) {
                if (JTAdress.getText().length() == 0) {
                    if (getGioiTinhDuocChon().length() == 0) {
                        clearRows();
                        ql.timTheoTen(JTname.getText()).forEach(hv -> model.addRow(hv.getFields()));
                    }
                } else {

                }
            } else {
                if (JTAdress.getText().length() == 0) {

                } else {

                }
            }
        }
    }//GEN-LAST:event_btnCreate2ActionPerformed

    private void btnCreate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate3ActionPerformed
        handleClear();
    }//GEN-LAST:event_btnCreate3ActionPerformed

    private void btnCreate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate4ActionPerformed
        String name = JTname.getText();
        String userName = JTUsername1.getText();
        String address = JTAdress.getText();
        String password = JTPassword.getText();
        String dob = ((JTextField) JDdayOfBirth.getDateEditor().getUiComponent()).getText();
        String gender = " ";
        if (JRadioMale.isSelected()) {
            gender = "Nam";
        } else if (JRadioFemale.isSelected()) {
            gender = "Nu";
        } else {
            gender = "Khac";
        }
        if (name.length() == 0 || userName.length() == 0 || address.length() == 0
                || password.length() == 0 || JDdayOfBirth.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Vui long nhap du thong tin", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            if (ql.kiemTraTonTai(userName)) {
                JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại", "Đăng kí thất bại", JOptionPane.NO_OPTION);
            } else {
                HocVien hv = new HocVien(name, address, JDdayOfBirth.getDate(), gender, userName, password);
                Utils.danhSachHocVien.add(hv);
                handleClear();
                clearRows();
                ql.getDs().forEach(ele -> model.addRow(ele.getFields()));
                JOptionPane.showMessageDialog(this, "Thêm học viên thành công");
            }
        }
    }//GEN-LAST:event_btnCreate4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int choise = JOptionPane.showConfirmDialog(this, "Trở về trang đang nhập?");
        if (choise == 0) {
            setVisible(false);
            new LoginPage().setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            String jtbId = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
            String jtbName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String jtbdob = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String jtbGender = model.getValueAt(jTable1.getSelectedRow(), 3).toString();
            String jtbAdrres = model.getValueAt(jTable1.getSelectedRow(), 4).toString();
            String jtbUsername = model.getValueAt(jTable1.getSelectedRow(), 5).toString();
            String jtbPassword = model.getValueAt(jTable1.getSelectedRow(), 6).toString();

            JTname.setText(jtbName);
            JDdayOfBirth.setDate(Utils.sp.parse(jtbdob));
            if (jtbGender.equals("Nam")) {
                setSelectedGender(1);
            } else if (jtbGender.equals("Nu")) {
                setSelectedGender(2);
            } else {
                setSelectedGender(3);
            }
            JTAdress.setText(jtbAdrres);
            JTUsername1.setText(jtbUsername);
            JTPassword.setText(jtbPassword);
        } catch (ParseException ex) {
            Logger.getLogger(ManageUserPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnCreate5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate5ActionPerformed
        if (jTable1.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(this, "Vui lòng chọn học viên muốn cập nhập");
        else {
            try {
                String jtbId = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
                String name = JTname.getText();
                String userName = JTUsername1.getText();
                String address = JTAdress.getText();
                String password = JTPassword.getText();
                Date dob = JDdayOfBirth.getDate();
                String gender =getGioiTinhDuocChon();
                
                boolean v1 = this.ql.capNhap(Integer.parseInt(jtbId),name, userName, password, dob, gender, address);
                if(v1) {
                JOptionPane.showMessageDialog(this, "Cập nhập thành công");
                handleClear();
                } else 
                    JOptionPane.showMessageDialog(this, "Cập nhập thất bại(xem lại tên đang nhập)");
            } catch (ParseException ex) {
                Logger.getLogger(ManageUserPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCreate5ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUserPage().setVisible(true);
            }
        });
    }

    private void clearRows() {
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    private void handleClear() {
        clearRows();
        JTname.setText("");
        JTname.setText("");
        JTAdress.setText("");
        JTUsername1.setText("");
        JTPassword.setText("");
        JDdayOfBirth.setDate(null);
        ql.getDs().forEach(hv -> model.addRow(hv.getFields()));
    }

    private void setSelectedGender(int index) {
        if (index == 1) {
            JRadioMale.setSelected(true);
        } else if (index == 2) {
            JRadioFemale.setSelected(true);
        } else {
            JRadioOther.setSelected(true);
        }
    }

    private String getGioiTinhDuocChon() {
        if (!JRadioMale.isSelected() && !JRadioFemale.isSelected() && !JRadioOther.isSelected()) {
            return "";
        }
        return JRadioMale.isSelected() ? "Nam" : (JRadioFemale.isSelected() ? "Nu" : "Khac");
    }
    private DefaultTableModel model;
    private LoginPage loginPage;
    private QuanLyHocVien ql = new QuanLyHocVien();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDdayOfBirth;
    private javax.swing.JRadioButton JRadioFemale;
    private javax.swing.JRadioButton JRadioMale;
    private javax.swing.JRadioButton JRadioOther;
    private javax.swing.JTextField JTAdress;
    private javax.swing.JTextField JTPassword;
    private javax.swing.JTextField JTUsername1;
    private javax.swing.JTextField JTname;
    private javax.swing.JButton btnCreate1;
    private javax.swing.JButton btnCreate2;
    private javax.swing.JButton btnCreate3;
    private javax.swing.JButton btnCreate4;
    private javax.swing.JButton btnCreate5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
