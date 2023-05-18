package controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import managesection.KiemTra;
import managesection.HocVien;
import questionssection.CauHoi;
import questionssection.Conversation;
import questionssection.MultipleChoise;
import questionssection.PhuongAn;

public class ConversationPage extends javax.swing.JFrame {

    public ConversationPage() {
        initComponents();
    }

    public ConversationPage(StudingPage stdP, Conversation cvs, HocVien hv) {
        this.hv = hv;
        this.stdP = stdP;
        this.cvst = cvs;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        numQuestion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        choise1 = new javax.swing.JButton();
        choise4 = new javax.swing.JButton();
        choise2 = new javax.swing.JButton();
        choise3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

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
                .addGap(42, 42, 42)
                .addComponent(jButton4)
                .addGap(258, 258, 258)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton4))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 400));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(903, 400));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/prev.jpg"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 224, -1, -1));

        numQuestion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numQuestion.setForeground(new java.awt.Color(0, 0, 0));
        numQuestion.setText("1/10");
        jPanel4.add(numQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 242, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next (2).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 224, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Câu1:\n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 292, 838, 45));

        choise1.setText("abc");
        choise1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choise1ActionPerformed(evt);
            }
        });
        jPanel4.add(choise1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 365, 379, 42));

        choise4.setText("abc");
        choise4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choise4ActionPerformed(evt);
            }
        });
        jPanel4.add(choise4, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 425, 379, 42));

        choise2.setText("abc");
        choise2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choise2ActionPerformed(evt);
            }
        });
        jPanel4.add(choise2, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 365, 379, 42));

        choise3.setText("abc");
        choise3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choise3ActionPerformed(evt);
            }
        });
        jPanel4.add(choise3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 425, 379, 42));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("ATTENTION ALL TENANTS \nWimberley Group will (1).... its rent collection system to electronic one. This change will apply to all apartments effective February 1. (2)..... Cash and personal checks will no longer be accepted.\nEvery tenant needs to create a user profile an www.wimberlygroup.com. After logging in, tenants will be able to (3)... a payment. You can do this by selecting the unpaid bill and then clicking on the button at the bottom of the screen. \n(4).... you hit 'Pay', the amount you designate will be deducted from your registered credit card or bank account. If you wish to arrange automatic payments, please click the button labeled 'Pay this amount every month.' Thank you for you cooperation.\nIf you have any questions, e-mail us at help@wimberlygroup.com.");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 0, 838, 212));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void init() {
        this.ds = cvst.getDs();
        this.currentQuestion = ds.get(0);

        btnChoise.add(choise1);
        btnChoise.add(choise2);
        btnChoise.add(choise3);
        btnChoise.add(choise4);

        jTextArea2.setText(cvst.getNoidung());

        changeQuestionUI(currentQuestion);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void changeQuestion(String type) {
        switch (type) {
            case "left" -> {
                if (currentIndexQuestion > 0) {
                    if (currentSelecion == null) {
                        JOptionPane.showConfirmDialog(this, "Vui lòng chọn một đáp án để chuyển câu hỏi", "Bạn chưa trả lời câu hỏi", JOptionPane.WARNING_MESSAGE);
                    } else {
                        this.currentIndexQuestion -= 1;
                        this.currentQuestion = ds.get(currentIndexQuestion);
                        this.selectedOptions.add(currentSelecion);
                        this.currentSelecion = null;
                        changeQuestionUI(ds.get(currentIndexQuestion));
                    }
                }
            }
            case "right" -> {
                if (currentIndexQuestion < ds.size()) {
                    if (currentSelecion == null) {
                        JOptionPane.showConfirmDialog(this, "Vui lòng chọn một đáp án để chuyển câu hỏi", "Bạn chưa trả lời câu hỏi", JOptionPane.WARNING_MESSAGE);
                    } else {
                        this.selectedOptions.add(currentSelecion);
                        this.currentIndexQuestion += 1;
                        if (currentIndexQuestion == ds.size()) {
                            if (isReview == 0) {
                                this.isReview += 1;
                                showResult();
                            }
                        } else {
                            this.currentSelecion = null;
                            this.currentQuestion = ds.get(currentIndexQuestion);
                            changeQuestionUI(ds.get(currentIndexQuestion));
                        }
                    }
                } else if (isReview == 0) {
//                this.selectedOptions.add(currentSelecion);
                    this.isReview += 1;
                    showResult();
                }
            }
        }
    }

    private void showResult() {
        int choise = JOptionPane.showConfirmDialog(this, "Bạn có muốn nộp bài", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (choise == 0) {
            this.currentIndexQuestion = 0;
            this.currentQuestion = ds.get(0);
            changeQuestionUI(currentQuestion);
            //ghi diem
            Calendar calendar = Calendar.getInstance();
            List<CauHoi> ds = new ArrayList<>();
            ds.add(cvst);
            KiemTra kt = new KiemTra();
            kt.ghiDiem(getMark(), calendar.getTime(), hv, ds);

            ShowResultPage sp = new ShowResultPage(this);
            this.setVisible(false);
            sp.setVisible(true);
        }
    }

    public void changeQuestionUI(MultipleChoise ch) {
        numQuestion.setText(String.format("%d/%d", currentIndexQuestion + 1, ds.size()));
        resetChoises();
        jTextArea1.setText(ch.getNoiDung());
        List<PhuongAn> pa = ch.getCacPhuongAn();
        for (int i = 0; i < pa.size(); i++) {
            btnChoise.get(i).setText(pa.get(i).getNoiDung());
            if (selectedOptions.contains(pa.get(i))) {
                btnChoiseOnClick(i);
            }
        }
        if (isReview != 0) {
            PhuongAn selectedCurrent = pa.stream().filter(p -> p.equals(selectedOptions.get(currentIndexQuestion))).findFirst().get();
            PhuongAn correct = pa.stream().filter(p -> p.isIsPhuongAnDung()).findFirst().get();
            changeUiBtnReview(pa.indexOf(selectedCurrent), pa.indexOf(correct));
        }
    }

    public double getMark() {
        return (getNumOfCor() * 1.0 / ds.size()) * 10;
    }

    public int getNumOfCor() {
        return (int) selectedOptions.stream().filter(choise -> choise.isIsPhuongAnDung()).count();
    }

    private void btnChoiseOnClick(int index) {
        for (int i = 0; i < btnChoise.size(); i++) {
            if (i == index) {
                btnChoise.get(i).setBackground(Color.BLUE);
            } else {
                btnChoise.get(i).setBackground(Color.WHITE);
            }
        }
        currentSelecion = currentQuestion.getCacPhuongAn().get(index);
    }

    private void changeUiBtnReview(int choise, int correct) {
        btnChoise.get(choise).setBackground(Color.RED);
        btnChoise.get(correct).setBackground(Color.GREEN);
    }

    private void resetChoises() {
        btnChoise.forEach(btn -> btn.setBackground(Color.WHITE));
        currentSelecion = null;
    }

    private void choise1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choise1ActionPerformed
        if (isReview == 0)
            btnChoiseOnClick(0);
    }//GEN-LAST:event_choise1ActionPerformed

    private void choise4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choise4ActionPerformed
        if (isReview == 0)
            btnChoiseOnClick(3);
    }//GEN-LAST:event_choise4ActionPerformed

    private void choise2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choise2ActionPerformed
        if (isReview == 0)
            btnChoiseOnClick(1);
    }//GEN-LAST:event_choise2ActionPerformed

    private void choise3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choise3ActionPerformed
        if (isReview == 0)
            btnChoiseOnClick(2);
    }//GEN-LAST:event_choise3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        changeQuestion("right");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        changeQuestion("left");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (isReview == 1) {
            setVisible(false);
            stdP.setVisible(true);
        } else {
            int choise = JOptionPane.showConfirmDialog(this, "Nhấn Ok để quay trở lại", "Nếu thoát điểm sẽ không được lưu lại!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (choise == 0) {
                setVisible(false);
                stdP.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversationPage().setVisible(true);
            }
        });
    }

    private HocVien hv;
    private Conversation cvst;
    private List<MultipleChoise> ds = new ArrayList<>();
    private int currentIndexQuestion = 0;
    private MultipleChoise currentQuestion;
    private PhuongAn currentSelecion;
    private List<PhuongAn> selectedOptions = new ArrayList<>();
    private List<JButton> btnChoise = new ArrayList<>();
    private int isReview = 0;
    private StudingPage stdP;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choise1;
    private javax.swing.JButton choise2;
    private javax.swing.JButton choise3;
    private javax.swing.JButton choise4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel numQuestion;
    // End of variables declaration//GEN-END:variables

    public List<MultipleChoise> getDs() {
        return ds;
    }

    public int getCurrentIndexQuestion() {
        return currentIndexQuestion;
    }

    public MultipleChoise getCurrentQuestion() {
        return currentQuestion;
    }

    public PhuongAn getCurrentSelecion() {
        return currentSelecion;
    }

    public List<PhuongAn> getSelectedOptions() {
        return selectedOptions;
    }

    public List<JButton> getBtnChoise() {
        return btnChoise;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

}
