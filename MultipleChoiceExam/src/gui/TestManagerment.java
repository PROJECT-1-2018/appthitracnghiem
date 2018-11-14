/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.CheckDB;
import database.DeleteDB;
import database.GetDB;
import database.UpdateDB;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import object.CreateTest;
import object.Questions;
import object.Subject;
import object.Test;
import object.Topic;

/**
 *
 * @author DuongSon
 */
public class TestManagerment extends javax.swing.JFrame {
    
     private ArrayList<Subject> listSj = new GetDB().getListSubject();
     private int subjectID, topicID;
     DefaultTableModel model;
     private ArrayList<Test> listTest;
    /**
     * Creates new form TestManagerment
     */
    public TestManagerment() {
        initComponents();
        setBounds(50,50,800,500);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setCbSuject();
        showTable();
    }
    
    public void showTable(){
        listTest = new GetDB().getListTest();
        model =(DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã đề", "Số câu hỏi", "Môn học", "Chủ đề"
        });

        for(Test t : listTest){
            model.addRow(new Object[]{
                t.getTestID(),t.getAmountQuestion() ,new GetDB().findNameSubFrTop(t.getTopicID()),
                new GetDB().findNameTopFrId(t.getTopicID())
            });
        }
        
    }

    public void setCbSuject(){
       
        for(int i=0; i<listSj.size(); i++){
            cbSubject.addItem(listSj.get(i).getSubjectName());
        }
        
    }
   
    public void setCbTopic(int id){
        cbTopic.removeAllItems();
        ArrayList<Topic> list = new GetDB().getListTopic(id);  //tìm cách sử dụng hàm getListTopic có sẵn trong
         for(int i=0; i<list.size(); i++){
            cbTopic.addItem(list.get(i).getTopicName());
        }   
    }
    
    public Vector randomList(int input, int get){
        Random rd = new Random();
        Vector v = new Vector();
        int iNew = 0;
        for (int i = 0; i < get ;  ) {
            iNew = rd.nextInt(input);
            if (!v.contains(iNew)){
                i++;
                v.add(iNew);
            }
        
        }
        
        return v;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNumQuestion = new javax.swing.JTextField();
        tfTestTime = new javax.swing.JTextField();
        tfLevel1 = new javax.swing.JTextField();
        tfLevel2 = new javax.swing.JTextField();
        tfLevel3 = new javax.swing.JTextField();
        cbSubject = new javax.swing.JComboBox<>();
        cbTopic = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addTestButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfMaxPoint = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfTestID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Số câu hỏi :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Môn học :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Chủ đề :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Thời gian (phút ) :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Số câu dễ :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Số câu trung bình :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Số câu khó :");

        tfNumQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumQuestionActionPerformed(evt);
            }
        });

        cbSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSubjectActionPerformed(evt);
            }
        });

        cbTopic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTopicMouseClicked(evt);
            }
        });
        cbTopic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTopicActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đề ", "Số câu hỏi", "Môn học ", "Chủ đề"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        addTestButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addTestButton.setText("Thêm ");
        addTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTestButtonActionPerformed(evt);
            }
        });

        delButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delButton.setText("Xóa");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Thoát ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Tổng điểm");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Mã đề");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLevel1)
                            .addComponent(tfLevel2)
                            .addComponent(tfLevel3)
                            .addComponent(cbSubject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbTopic, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNumQuestion)
                            .addComponent(tfTestTime)
                            .addComponent(delButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfMaxPoint)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfTestID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfNumQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfTestTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(tfLevel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMaxPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addTestButton)
                            .addComponent(delButton)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MenuGV().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTestButtonActionPerformed
        // TODO add your handling code here:
        Test t = new Test();
        t.setTestID(Integer.parseInt(tfTestID.getText()));
        if (new CheckDB().CheckTestID(t.getTestID())) 
                 JOptionPane.showMessageDialog(rootPane, "Mã đề đã tồn tại !");
        else{
            t.setTopicID(topicID);
            t.setAmountQuestion(Integer.parseInt(tfNumQuestion.getText()));
            t.setMaxPoint(Integer.parseInt(tfMaxPoint.getText()));
            t.setTestTime(Integer.parseInt(tfTestTime.getText()));
            t.setLevel1(Integer.parseInt(tfLevel1.getText()));
            t.setLevel2(Integer.parseInt(tfLevel2.getText()));
            t.setLevel3(Integer.parseInt(tfLevel3.getText()));
            if (((t.getLevel1()+t.getLevel2()+t.getLevel3()) != t.getAmountQuestion())||(t.getAmountQuestion()==0))
                JOptionPane.showMessageDialog(rootPane,"Mời nhập lại số câu hỏi !");
            else if  ((Integer.parseInt(tfLevel1.getText()))> new GetDB().countQuestionLevel(topicID, 1) 
                   || (Integer.parseInt(tfLevel2.getText()))> new GetDB().countQuestionLevel(topicID, 2)
                   || (Integer.parseInt(tfLevel3.getText()))> new GetDB().countQuestionLevel(topicID, 3))
                JOptionPane.showMessageDialog(rootPane, "Ngân hàng đề ko đủ số câu hỏi");
            else{
            
            try {
                UpdateDB up = new UpdateDB();
                up.dbTest(t);
                listTest.add(t);


                ArrayList list1 = new GetDB().getListLevel(topicID,1);
                Vector v1 = randomList(list1.size(),t.getLevel1());
                for ( int i = 0 ; i < v1.size() ; i++){
                   // System.out.println(v1.elementAt(i));
                    CreateTest creTest = new CreateTest();
                    Questions que = new Questions();
                    que = (Questions) list1.get((int)v1.elementAt(i));                  
                    creTest.setTestID(t.getTestID());
                    creTest.setquestionID(que.getQuestionID());         
                    System.out.println("testID = " + t.getTestID()+"cau hoi : " +que.getQuestionID());
                    UpdateDB u = new UpdateDB();
                    u.dbCreateTest(creTest);
                }

                ArrayList list2 = new GetDB().getListLevel(topicID,2);
                Vector v2 = randomList(list2.size(),t.getLevel2());
                for (  int i = 0 ; i < v2.size() ; i++){
                    //System.out.println(v2.elementAt(i));
                    CreateTest creTest = new CreateTest();
                    Questions que = new Questions();
                    que = (Questions) list2.get((int) v2.elementAt(i));
                    //System.out.println(que.getQuestionID());
                    creTest.setTestID(t.getTestID());
                    creTest.setquestionID(que.getQuestionID());
                    System.out.println("testID = " + t.getTestID()+"cau hoi : " +que.getQuestionID());
                    UpdateDB u = new UpdateDB();
                    u.dbCreateTest(creTest);
                }

                ArrayList list3 = new GetDB().getListLevel(topicID,3); 
                Vector v3 = randomList(list3.size(),t.getLevel3());
                for (  int i = 0 ; i < v3.size() ; i++){
                    //System.out.println(v3.elementAt(i));
                    CreateTest creTest = new CreateTest();
                    Questions que = new Questions();
                    que = (Questions) list3.get((int) v3.elementAt(i));
                    //System.out.println(que.getQuestionID());
                    creTest.setTestID(t.getTestID());
                    creTest.setquestionID(que.getQuestionID());
                    System.out.println("testID = " + t.getTestID()+"cau hoi : " +que.getQuestionID());
                    UpdateDB u = new UpdateDB();
                    u.dbCreateTest(creTest);
                }
                addTable();
                JOptionPane.showMessageDialog(rootPane, "Thêm đề thi thành công !");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Thêm đề thi không thành công !");
            }
            
        }
        }
        
        
    }//GEN-LAST:event_addTestButtonActionPerformed
    
     public void addTable(){
        Test t = listTest.get(listTest.size()-1);
        model.addRow(new Object[]{
             t.getTestID(),t.getAmountQuestion() ,new GetDB().findNameSubFrTop(t.getTopicID()),
                new GetDB().findNameTopFrId(t.getTopicID())
        });
    }
    private void cbTopicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTopicMouseClicked
        
    }//GEN-LAST:event_cbTopicMouseClicked

    private void cbSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSubjectActionPerformed
       
       String st = cbSubject.getSelectedItem().toString();
       int id=0;
       for(Subject s : listSj){
            if (s.getSubjectName().equals(st))
            id = s.getSubjectID();
        }
        subjectID  =id;        
        setCbTopic(id); 

    }//GEN-LAST:event_cbSubjectActionPerformed

    private void cbTopicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTopicActionPerformed
        // TODO add your handling code here:
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
            }
    }//GEN-LAST:event_cbTopicActionPerformed

    private void tfNumQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumQuestionActionPerformed
int index ; //chỉ số hàng được chọn trong bảng
    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        // TODO add your handling code here:
        Test t = new Test();
        TableModel mdl = jTable1.getModel();
        String ID = model.getValueAt(index, 0).toString();
        DeleteDB del = new DeleteDB();
        del.deleteTest(Integer.parseInt(ID));
        listTest.remove(t);
        model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(index);
        JOptionPane.showMessageDialog(rootPane,"Xoá thành công");
    }//GEN-LAST:event_delButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        index =jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(TestManagerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestManagerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestManagerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestManagerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestManagerment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTestButton;
    private javax.swing.JComboBox<String> cbSubject;
    private javax.swing.JComboBox<String> cbTopic;
    private javax.swing.JButton delButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfLevel1;
    private javax.swing.JTextField tfLevel2;
    private javax.swing.JTextField tfLevel3;
    private javax.swing.JTextField tfMaxPoint;
    private javax.swing.JTextField tfNumQuestion;
    private javax.swing.JTextField tfTestID;
    private javax.swing.JTextField tfTestTime;
    // End of variables declaration//GEN-END:variables
}
