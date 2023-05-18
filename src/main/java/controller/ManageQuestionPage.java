package controller;
import javax.swing.table.DefaultTableModel;
import mainapp.Utils;
import managesection.HocVien;
import managesection.QuanLyCauHoi;
import questionssection.DanhMuc;
import questionssection.DoKho;

public class ManageQuestionPage extends javax.swing.JFrame {
    public ManageQuestionPage() {
        initComponents();
    }

    public ManageQuestionPage(HomePage homePage, HocVien hv) {
        this.hv = hv;
        this.homePage = homePage;
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTSearchInput = new javax.swing.JTextField();
        JRadioDe = new javax.swing.JRadioButton();
        JRadioTrungBinh = new javax.swing.JRadioButton();
        JRadioKho = new javax.swing.JRadioButton();
        btnCreate2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 0, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 26, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 400));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 923, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nội dung");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 27, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Độ khó");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 79, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Danh Mục");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 129, -1, -1));

        JTSearchInput.setBackground(new java.awt.Color(255, 255, 255));
        JTSearchInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTSearchInput.setToolTipText("");
        JTSearchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTSearchInputActionPerformed(evt);
            }
        });
        jPanel3.add(JTSearchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 21, 410, 40));

        buttonGroup1.add(JRadioDe);
        JRadioDe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JRadioDe.setForeground(new java.awt.Color(0, 0, 0));
        JRadioDe.setText("Dễ");
        jPanel3.add(JRadioDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 81, -1, -1));

        buttonGroup1.add(JRadioTrungBinh);
        JRadioTrungBinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JRadioTrungBinh.setForeground(new java.awt.Color(0, 0, 0));
        JRadioTrungBinh.setText("Trung bình");
        jPanel3.add(JRadioTrungBinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 81, -1, -1));

        buttonGroup1.add(JRadioKho);
        JRadioKho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JRadioKho.setForeground(new java.awt.Color(0, 0, 0));
        JRadioKho.setText("Khó");
        jPanel3.add(JRadioKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 81, -1, -1));

        btnCreate2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate2.setForeground(new java.awt.Color(0, 0, 0));
        btnCreate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnCreate2.setText("Tìm");
        btnCreate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnCreate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 182, 133, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Tất cả","Danh từ","Động từ","Tính từ","Trạng Từ","Giới Từ","Câu hỏi đuôi" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 133, 201, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btnClear.setText("Xoá");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 133, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nội dung", "Đáp án", "Danh Mục", "Độ khó", "Loại câu hỏi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(5);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(10);
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void init() {
        setVisible(true);
        this.model = (DefaultTableModel) jTable1.getModel();
        ql.setDs(Utils.danhSachCauHoi);
        ql.getDs().forEach(ch -> model.addRow(ch.getFields()));
        setLocationRelativeTo(null);
    }

    private void btnCreate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate2ActionPerformed
        if (hasDoKho()) {
            if (hasDanhMuc()) {
                if(hasTextSearch()) {
                    
                } else {
                    
                }
            } else {
                if(hasTextSearch()) {

                    
                } else {
                    clearRows();
                    ql.timTheoDoKho(getDoKhoChecked()).forEach(ch -> model.addRow(ch.getFields()));
                }
            }
        } else {
            if (hasDanhMuc()) {
                System.out.println(JTSearchInput.getText());
                if (hasTextSearch()) {
                    clearRows();
                    ql.timTheoNoiDung(JTSearchInput.getText()).forEach(ch -> model.addRow(ch.getFields()));
                } else {
                    clearRows();
                    System.out.println(jComboBox1.getSelectedItem());
                    ql.timTheoDanhMuc(Utils.napDanhMuc().get(jComboBox1.getSelectedIndex() - 1)).forEach(ch -> model.addRow(ch.getFields()));
                }
            } else {
                if (hasTextSearch()) {
                    clearRows();
                    ql.timTheoNoiDung(JTSearchInput.getText()).forEach(ch -> model.addRow(ch.getFields()));
                } else {}
            }
        }
    }//GEN-LAST:event_btnCreate2ActionPerformed

    private void JTSearchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTSearchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTSearchInputActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearRows();
        JTSearchInput.setText("");
        buttonGroup1.clearSelection();
        ql.getDs().forEach(ch -> model.addRow(ch.getFields()));
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        this.homePage.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageQuestionPage().setVisible(true);
            }
        });
    }
    private DoKho getDoKhoChecked() {
        return JRadioDe.isSelected() ? DoKho.DE : (JRadioTrungBinh.isSelected() ? DoKho.TRUNG_BINH : DoKho.KHO);
    }
    private void clearRows() {
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    private boolean hasTextSearch() {
        return JTSearchInput.getText().length() > 0;
    }
    private boolean hasDanhMuc() {
        return jComboBox1.getSelectedIndex() != 0;
    }
    private boolean hasDoKho() {
        return JRadioDe.isSelected() || JRadioTrungBinh.isSelected() || JRadioKho.isSelected();
    }
    private DefaultTableModel model;
    private final QuanLyCauHoi ql = new QuanLyCauHoi();
    private HomePage homePage;
    private HocVien hv;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JRadioDe;
    private javax.swing.JRadioButton JRadioKho;
    private javax.swing.JRadioButton JRadioTrungBinh;
    private javax.swing.JTextField JTSearchInput;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
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
