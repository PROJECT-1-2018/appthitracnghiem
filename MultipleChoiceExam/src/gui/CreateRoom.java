/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import database.CheckDB;
import database.GetDB;
import database.UpdateDB;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import object.CheckAll;
import object.InforLoginStudent;
import object.Questions;
import object.RandomAll;
import object.Student;
import object.Subject;
import object.Test;
import object.Topic;

/**
 *
 * @author Nguyen Viet Tien
 */
public class CreateRoom extends javax.swing.JFrame {
    private int numStudent, roomId;
    private ArrayList<Subject> listSubjects = new GetDB().getListSubject();
    private ArrayList<InforLoginStudent> listInfor = new ArrayList<>() ;
    private ArrayList<Test> listTests;
    private int subjectID, topicID;
    DefaultTableModel tableModel;
   
    public CreateRoom(int roomID, int numstudent) {
        this.roomId = roomID;
        this.numStudent = numstudent;            
        initComponents();       
        setBounds(50, 50, 800, 450);        
        init();
        addCbSuject();      // them mon hoc  
    }
    private void addTable(){       
        tableModel = (DefaultTableModel)tbList.getModel();
        tableModel.setColumnIdentifiers(new Object[]{  // ten bang
            "Số thứ tự", "MSSV","Họ tên","Phòng thi ","Mật khẩu","Mã đề"
        });       
        tableModel.setRowCount(0);
        for (InforLoginStudent infor : listInfor)
        tableModel.addRow(new Object[]{
            tableModel.getRowCount()+1,infor.getStudentID(),
            new GetDB().getNameStudentFromID(infor.getStudentID()),
            infor.getRoomID(),
            infor.getUserPw(),
            infor.getTestID()                
            });        
    }
    private void addCbSuject(){       // add mon hoc vao combobox
        for(Subject s : listSubjects){            
            cbSubject.addItem(s.getSubjectName());
        }
        
    }
    private void addCbTopic(int id){    // add chu de vao combobox // truyen tham so id là ma mon hoc 
        cbTopic.removeAllItems();
        ArrayList<Topic> listTopics = new GetDB().getListTopic(id);
        for(Topic s : listTopics){            
            cbTopic.addItem(s.getTopicName());
        }              
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNum = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbSubject = new javax.swing.JComboBox<>();
        cbTopic = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfIDSt = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbList = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tao Phong Thi");

        lbNum.setText("Số lượng SV : ");

        jLabel2.setText("Môn thi : ");

        jLabel3.setText("Chủ đề :");

        cbSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSubjectActionPerformed(evt);
            }
        });

        cbTopic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTopicActionPerformed(evt);
            }
        });

        jLabel4.setText("Thêm MSSV");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MSSV", "Họ Tên ", "Tên đăng nhập ", "Mật Khẩu ", "Mã đề "
            }
        ));
        tbList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbList);

        jButton3.setText("Thoát");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lb.setText("Sinh viên thứ : ");

        tfID.setText("jTextField1");

        lbID.setText("jLabel1");

        jButton1.setText("Lưu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNum)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbID))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfIDSt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(26, 26, 26)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNum)
                    .addComponent(jLabel2)
                    .addComponent(cbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfIDSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void init(){
        lbNum.setText("Số lượng sinh viên dự thi : "+numStudent);
        tfID.setText(""+1);
        lbID.setText("/"+numStudent);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (listInfor.size() < numStudent ){
            Object[] options = {"Ở lại trang này ", "Thoát"};
                    int n = JOptionPane.showOptionDialog(rootPane,
                                    "Chưa nhập đủ số lượng học sinh, nếu thoát các dữ liệu vừa nhập sẽ bị mất !",
                                    "Question",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options,
                                    options[0]);
                    if (n == JOptionPane.YES_OPTION) {
                       //       
                       return;
                    } else if (n == JOptionPane.NO_OPTION) {
                        //
                        new RoomManagerment().setVisible(true);
                        setVisible(false);  
                    } else {
                        //
                    }                 
        } else {
            Object[] options = {"Ở lại trang này ", "Thoát"};
                    int n = JOptionPane.showOptionDialog(rootPane,
                                    "Cần lưu trước khi thoát !",
                                    "Question",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options,
                                    options[0]);
                    if (n == JOptionPane.YES_OPTION) {
                       //       
                       return;
                    } else if (n == JOptionPane.NO_OPTION) {
                        //
                        new RoomManagerment().setVisible(true);
                        setVisible(false);  
                    } else {
                        //
                    }                        
        }                     
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (listTests.size() == 0 ) {
            WarningDialog();
            return;
        } 
        if (listInfor.size() == numStudent){
            JOptionPane.showMessageDialog(rootPane,"Số lượng sinh viên đã đủ -> Thoát !");      
            return;
        }
        try {
            int studentID = Integer.parseInt(tfIDSt.getText());
            if (new CheckAll().checkStudentExist(listInfor,studentID) ) {
            
                if (new CheckDB().CheckStudentAdd(studentID))
                {
                    int numStudentTmp  = listInfor.size()+1;
                    int testId = listTests.get(numStudentTmp % listTests.size() ).getTestID(); // testID 
                    InforLoginStudent infor = new InforLoginStudent(roomId,studentID,new RandomAll().createRandom(8), testId);             
                    listInfor.add(infor);                
                    addTable();
                    tfID.setText(""+(1+(Integer.parseInt(tfID.getText()))));
                }
            }else   JOptionPane.showMessageDialog(rootPane,"Mã sinh viên đã được thêm ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Mã sinh viên không tồn tại");
        }                                    
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int index = tbList.getSelectedRow();
        TableModel model = tbList.getModel();
        int id = Integer.parseInt(model.getValueAt(index, 0).toString());       
        listInfor.remove(index);
        addTable();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSubjectActionPerformed
         Object selected = cbSubject.getSelectedItem();
        String subjectname = selected.toString();

        int id=0;
        for(Subject s : listSubjects){
            if (s.getSubjectName().equals(subjectname))
            id = s.getSubjectID();
        }
        subjectID  =id;        // lay duoc id cua mon hoc -> hien thi ra cac chu  de tuong ung 
        addCbTopic(id); // sau khi them  chon mon hoc thi moi chon duoc chu de 
    }//GEN-LAST:event_cbSubjectActionPerformed
    private void WarningDialog(){
        Object[] options = {"Ở lại trang này ", "Thoát"};
                    int n = JOptionPane.showOptionDialog(rootPane,
                                    "Chủ đề này chưa được tạo đề thi! - > Thoát",
                                    "Question",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options,
                                    options[0]);
                    if (n == JOptionPane.YES_OPTION) {
                       //       
                       return;
                    } else if (n == JOptionPane.NO_OPTION) {
                        //
                        new MenuGV().setVisible(true);
                        setVisible(false);  
                    } else {
                        //
                    }
    }
    private void cbTopicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTopicActionPerformed
       Object selected = cbTopic.getSelectedItem();
            if (selected != null) // kiem tra neu co chu de thi moi lay ve duoc
            {            
                String topicname = selected.toString();
                ArrayList<Topic> listTopics = new GetDB().getListTopic(subjectID);
                int id=0;
                for(Topic s : listTopics){
                    if (s.getTopicName().equals(topicname))
                    id = s.getTopicID();
                }
                topicID  =id;
                listTests = new GetDB().getListTestFromTopic(topicID);
                if (listTests.size() == 0 ) {                                     
                    WarningDialog();
                }                
            }
    }//GEN-LAST:event_cbTopicActionPerformed

    private void tbListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListMouseClicked
        
    }//GEN-LAST:event_tbListMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (listInfor.size() == numStudent){
            for (InforLoginStudent infor : listInfor ){
                new UpdateDB().dbCreateSignIn(infor);
            }
            JOptionPane.showMessageDialog(rootPane, "Lưu thành công !");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nhập chưa đủ số học sinh ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             //  new CreateRoom(6).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cbSubject;
    private javax.swing.JComboBox<String> cbTopic;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNum;
    private javax.swing.JTable tbList;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfIDSt;
    // End of variables declaration//GEN-END:variables

}
