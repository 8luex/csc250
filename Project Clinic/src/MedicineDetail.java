
import java.awt.Font;
import java.io.EOFException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class MedicineDetail extends javax.swing.JFrame {
    private Patient patient;
    private TreatmentHistory treatmentHistory;
    private ArrayList<Medicine> medicines;
    private Prescription prescription;

    /**
     * Creates new form HomePatient
     */
    public MedicineDetail(String patientId, String historyId) {
        initComponents();
                try {
            Patient.initialize();
            Doctor.initialize();
        } catch (EOFException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        try {
            patient = Patient.FindPatient(patientId);
        } catch (Exception e) {
            System.out.println("Please try again: " + e.getMessage());
            return;
        }
            
        ArrayList<TreatmentHistory> histories = new ArrayList<>();
        histories = patient.getAllPatienttreatmenthistory();
        treatmentHistory = null;
        for(int i=0; i<histories.size(); i++) {
            if (historyId.equals(histories.get(i).getID())) {
                treatmentHistory = histories.get(i);
            }
        }
        medicines = new ArrayList<Medicine>();
        
        jTextField1.setText(treatmentHistory.getID());
        jTextField4.setText(patient.getPatientId());
        jTextField3.setText(patient.getName());
        jTextField5.setText(treatmentHistory.getDoctor().getDoctorId());
        jTextField6.setText(treatmentHistory.getDoctor().getName());
        jTextArea1.setText("รหัสยา\tชื่อยา\tราคาต่อหน่วย\tปริมาณ\tราคารวม\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btSubmit = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btAddMore = new javax.swing.JButton();
        btDel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("หน้าเพิ่มยา");

        jLabel1.setFont(new java.awt.Font("supermarket", 0, 18)); // NOI18N
        jLabel1.setText("ลงข้อมูลการจ่ายยา");

        btBack.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        btBack.setText("ยกเลิก");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jLabel2.setText("รหัสข้อมูลการรักษา");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N

        btSubmit.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        btSubmit.setText("ยืนยัน");
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jLabel4.setText("ชื่อ");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jLabel5.setText("รหัสผู้ป่วย");

        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jLabel6.setText("รหัสแพทย์");

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jLabel7.setText("ชื่อ");

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jLabel8.setText("ราคารวมทั้งหมด");

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jLabel9.setText("บาท");

        btAddMore.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        btAddMore.setText("เพิ่ม");
        btAddMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddMoreActionPerformed(evt);
            }
        });

        btDel.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        btDel.setText("ลบ");
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAddMore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBack)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1))
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBack)
                    .addComponent(btSubmit)
                    .addComponent(btAddMore)
                    .addComponent(btDel))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        HomeDoctor h = new HomeDoctor();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        // TODO add your handling code here:
        treatmentHistory.setPrescription(prescription);
        Patient.terminate();
        
            boolean status = true;
            if(status) {
                JOptionPane.showMessageDialog(this, "Complete", "บันทึกข้อมูลการจ่ายยาสำเร็จ", JOptionPane.INFORMATION_MESSAGE);
                HomeDoctor h = new HomeDoctor();
                h.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Fail - Try again", "ผิดพลาด", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_btSubmitActionPerformed

    private void btAddMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddMoreActionPerformed
        // TODO add your handling code here:
        DecimalFormat df = new DecimalFormat("#,###.00");
        String medicineName = "";
        double medicinePrice = 0;
        int amount = 0;
        int i = medicines.size()+1;
            
        JTextField jname = new JTextField(15);
        JTextField jprice = new JTextField(15);
        JTextField jamount = new JTextField(15);
        jname.setFont(new Font("Leelawadee", 0, 14));
        jprice.setFont(new Font("Leelawadee", 0, 14));
        jamount.setFont(new Font("Leelawadee", 0, 14));
        
        Object[] message = {
            "Name:", jname,
            "Price:", jprice,
            "Amount:", jamount
        };

        int option = JOptionPane.showConfirmDialog(null, message, "เพิ่มรายการ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            try {
                medicineName = jname.getText();
                medicinePrice = Double.parseDouble(jprice.getText());
                amount = Integer.parseInt(jamount.getText());
                Medicine medicine = new Medicine(i+"", medicineName, medicinePrice, amount);
                medicines.add(medicine);
                
            String formatStr = "";
            formatStr += "รหัสยา\tชื่อยา\tราคาต่อหน่วย\tปริมาณ\tราคารวม\n";
            for(int j=0; j<medicines.size(); j++) {
                Medicine m = medicines.get(j);
                formatStr += m.getID() + "\t" +
                             m.getName() + "\t" +
                             m.getPrice()+ "\t" + 
                             m.getAmount() + "\t" +
                             df.format(m.getTotalPrice()) + "\n";
            }
            jTextArea1.setText(formatStr);

            prescription = new Prescription(medicines);
            jTextField7.setText(df.format(prescription.getTotal()));
            } catch (Exception e) {
                JLabel label = new JLabel("โปรดกรอกข้อมูลให้ถูกต้อง");
                label.setFont(new Font("Leelawadee", 0, 14));
                JOptionPane.showMessageDialog(null, label,"แจ้งเตือน", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_btAddMoreActionPerformed

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        if (medicines.size() == 0) {
            return;
        }
        DecimalFormat df = new DecimalFormat("#,###.00");
        medicines.remove(medicines.size()-1);
        
        try {
                        String formatStr = "";
            formatStr += "รหัสยา\tชื่อยา\tราคาต่อหน่วย\tปริมาณ\tราคารวม\n";
            for(int j=0; j<medicines.size(); j++) {
                Medicine m = medicines.get(j);
                formatStr += m.getID() + "\t" +
                             m.getName() + "\t" +
                             m.getPrice()+ "\t" + 
                             m.getAmount() + "\t" +
                             df.format(m.getTotalPrice()) + "\n";
            }
            jTextArea1.setText(formatStr);

            prescription = new Prescription(medicines);
            if (prescription.getTotal() == 0) {
                jTextField7.setText("");
            }else
                jTextField7.setText(df.format(prescription.getTotal()));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btDelActionPerformed

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
            java.util.logging.Logger.getLogger(HomePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddMore;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
