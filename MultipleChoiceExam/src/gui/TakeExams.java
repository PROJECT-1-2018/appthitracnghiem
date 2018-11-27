/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.GetDB;
import database.UpdateDB;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import object.Answer;
import object.Questions;
import object.Result;
import Gui.Login;

/**
 *
 * @author User
 */
public class TakeExams extends javax.swing.JFrame {
    private static String IDS;
    private final int testID;
    private ArrayList<Questions> listQuestion;
    //private ArrayList<Answer> listChoice = new ArrayList<>();
    private Answer[] listChoice ; 
    private int amountQue;
    
    /**
     * Creates new form Take_exam
     */
    public TakeExams(String ID) {
        initComponents();
        setBounds(50,50,850,610);
        setResizable(false);
        this.IDS=ID;
        tfStuId.setText(ID);
        tfDate.setText(java.time.LocalDate.now().toString());
        testID = new GetDB().getTestIdFrStuId(Integer.parseInt(IDS));
        tfSub.setText(new GetDB().findNameSubFrTop(new GetDB().getTopicFrTest(testID)));
        tfTop.setText(new GetDB().findNameTopFrId(new GetDB().getTopicFrTest(testID)));
        listQuestion =new GetDB().getListQuestionForTest(testID);
        amountQue = listQuestion.size();
        listChoice = new Answer[amountQue];
        addTime();
        showQuestion(0);
        setCbQuestion();
        
    }
    
    static int second, minute;
    static Timer timer;
    
     private void addTime(){              
        int delay = 1000;
        int period = 1000;
        timer  = new Timer();
        second =    60;   
        minute =   new GetDB().getTestTimeOfTest(testID) -1 ;  
        lbMinutes.setText(""+minute+"m ");
        lbSec.setText(""+second+" s");       
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {             
                lbSec.setText(""+setSeconds()+" s");
            }
        }, delay, period);         
    }
    private  int setSeconds() {
        if (second == 0){
           lbMinutes.setText(""+setMinute());
        }      
        if (minute == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hết giờ làm bài ");
            //btDoneActionPerformed(evt);
            endExam();
        }
        return --second;        
    }
    private int setMinute(){
        if (minute == 0 ){             
             timer.cancel();                       
        }           
        second = 60;             
        return --minute;
    }
    
    private void showAnswer(int idQue){//chua tron dap an
        ArrayList<Answer> listAns = new GetDB().getListAnswerFromQuestion(idQue);
        //System.out.println(listAns.size());
        //System.out.println(listAns.get(1).getAnswerContent());
        Collections.shuffle(listAns);
        lbAns1.setText(listAns.get(0).getAnswerContent());
        lbAns2.setText(listAns.get(1).getAnswerContent());
        lbAns3.setText(listAns.get(2).getAnswerContent());
        lbAns4.setText(listAns.get(3).getAnswerContent());
        
    }
    
    private void showQuestion( int index){
         tfNumOfQes.setText(String.valueOf(listQuestion.get(index).getIndex()));
         tfQueContent.setText(listQuestion.get(index).getQuestionContent()); 
         showAnswer(listQuestion.get(index).getQuestionID());
        
    }
    
    public void setCbQuestion(){
       
        for(int i=0; i<listQuestion.size(); i++){
            cbQuestion.addItem(String.valueOf(listQuestion.get(i).getIndex()));
        }
        
    }
    
    private void addChoice(String str){
        int m = Integer.parseInt(tfNumOfQes.getText());
        ArrayList<Answer> listAns = new GetDB().getListAnswerFromQuestion(listQuestion.get(m-1).getQuestionID());
        for ( int i =0; i<listAns.size();i++) 
            if (str.equals(listAns.get(i).getAnswerContent())){
              //  System.out.println(listAns.get(i).getAnswerContent());
                listChoice[m-1]= listAns.get(i);
                //System.out.println(listChoice.get(0).getAnswerContent());
                break;
            
            }
       
        
    }
    
    private int countRightChoice(){
        int count = 0;
        for (int i=0; i< listChoice.length;i++)
            if (listChoice[i] != null)
                if (listChoice[i].isIsTrue()) count++;
        
        return count;
    }
    
    private float givePoint(){
        float point = 0 ;
        point = (float)new GetDB().getMaxPointOfTest(testID) * countRightChoice()/amountQue ;
        return point;
    }
    
    private void endExam(){
        JOptionPane.showMessageDialog(rootPane, "SỐ CÂU ĐÚNG LÀ " + countRightChoice() +"/"+amountQue +"  "+givePoint());
        Result rs = new Result(givePoint(),testID,tfDate.getText() , Integer.parseInt(IDS));
        UpdateDB u = new UpdateDB();
        u.dbResult(rs);
        Login log = new Login();
        setVisible(false);
        log.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbChoiceA = new javax.swing.JRadioButton();
        rbChoiceB = new javax.swing.JRadioButton();
        rbChoiceC = new javax.swing.JRadioButton();
        rbChoiceD = new javax.swing.JRadioButton();
        btPre = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btDone = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfStuId = new javax.swing.JLabel();
        tfSub = new javax.swing.JLabel();
        tfDate = new javax.swing.JLabel();
        tfTop = new javax.swing.JLabel();
        lbMinutes = new javax.swing.JLabel();
        tfNumOfQes = new javax.swing.JLabel();
        cbQuestion = new javax.swing.JComboBox<>();
        lbSec = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfQueContent = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbAns2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        lbAns3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        lbAns4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        lbAns1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thi Trắc Nghiệm ");
        setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Mã Sinh Viên:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Môn Thi :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Chủ đề: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Ngày thi :");

        labelTime.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelTime.setText("Thời gian còn :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Câu hỏi số :");

        buttonGroup1.add(rbChoiceA);
        rbChoiceA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbChoiceA.setText("A");
        rbChoiceA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbChoiceAMouseClicked(evt);
            }
        });
        rbChoiceA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChoiceAActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbChoiceB);
        rbChoiceB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbChoiceB.setText("B");
        rbChoiceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChoiceBActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbChoiceC);
        rbChoiceC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbChoiceC.setText("C");
        rbChoiceC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbChoiceCMouseClicked(evt);
            }
        });
        rbChoiceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChoiceCActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbChoiceD);
        rbChoiceD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbChoiceD.setText("D");
        rbChoiceD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbChoiceDMouseClicked(evt);
            }
        });
        rbChoiceD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChoiceDActionPerformed(evt);
            }
        });

        btPre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btPre.setText("<< Câu trước");
        btPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPreActionPerformed(evt);
            }
        });

        btNext.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btNext.setText("Câu sau >>");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        btDone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btDone.setText("Nộp bài");
        btDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Chọn câu hỏi");

        tfStuId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfStuId.setText("mssv");

        tfSub.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfSub.setText("mon thi");

        tfDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfDate.setText("date");

        tfTop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfTop.setText("chude");

        lbMinutes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbMinutes.setText("time");

        tfNumOfQes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfNumOfQes.setText("number");

        cbQuestion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQuestionActionPerformed(evt);
            }
        });

        lbSec.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbSec.setText("jLabel5");

        tfQueContent.setColumns(20);
        tfQueContent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfQueContent.setRows(5);
        jScrollPane1.setViewportView(tfQueContent);

        lbAns2.setColumns(20);
        lbAns2.setRows(5);
        jScrollPane2.setViewportView(lbAns2);

        lbAns3.setColumns(20);
        lbAns3.setRows(5);
        jScrollPane3.setViewportView(lbAns3);

        lbAns4.setColumns(20);
        lbAns4.setRows(5);
        jScrollPane4.setViewportView(lbAns4);

        lbAns1.setColumns(20);
        lbAns1.setRows(5);
        jScrollPane5.setViewportView(lbAns1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPre, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNumOfQes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfStuId)
                                        .addComponent(tfSub))
                                    .addGap(69, 69, 69)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfTop))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfDate)
                                            .addGap(72, 72, 72)
                                            .addComponent(labelTime)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbMinutes)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbSec)
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbQuestion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbChoiceB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbChoiceA)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane5)))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btDone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbChoiceD, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rbChoiceC, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStuId)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDate)
                            .addComponent(lbMinutes)
                            .addComponent(lbSec))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSub)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTop))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumOfQes)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbChoiceA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbChoiceC, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbChoiceB, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rbChoiceD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        int m = Integer.parseInt(tfNumOfQes.getText());
        if (m == listQuestion.size()) m = 0;
        showQuestion(m);
        for (int i = 0 ; i < listChoice.length; i++ ){
            if (listChoice[i] != null ){
                if (listQuestion.get(m).getQuestionID()== listChoice[i].getQuestionID()){
                    if (lbAns1.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceA.doClick();break;}
                    if (lbAns2.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceB.doClick();break;}
                    if (lbAns3.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceC.doClick();break;}
                    if (lbAns4.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceD.doClick();break;}
               }
            }
        }
    }//GEN-LAST:event_btNextActionPerformed

    private void btPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPreActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        int m = Integer.parseInt(tfNumOfQes.getText());  
        if (m == 1) m =  listQuestion.size()+1;
        showQuestion(m-2);
        for (int i = 0 ; i < listChoice.length; i++ ){
            if (listChoice[i] != null ){
                if (listQuestion.get(m-2).getQuestionID()== listChoice[i].getQuestionID()){
                    if (lbAns1.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceA.doClick();break;}
                    if (lbAns2.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceB.doClick();break;}
                    if (lbAns3.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceC.doClick();break;}
                    if (lbAns4.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceD.doClick();break;}
               }
            }
        }
    }//GEN-LAST:event_btPreActionPerformed

    private void rbChoiceAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbChoiceAMouseClicked
        // TODO add your handling code here:    
        
    }//GEN-LAST:event_rbChoiceAMouseClicked

    private void rbChoiceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChoiceBActionPerformed
        // TODO add your handling code here:
        addChoice(lbAns2.getText());
    }//GEN-LAST:event_rbChoiceBActionPerformed

    private void rbChoiceCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbChoiceCMouseClicked
        // TODO add your handling code here:
       // addChoice(lbAns3.getText());
        
    }//GEN-LAST:event_rbChoiceCMouseClicked

    private void rbChoiceDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbChoiceDMouseClicked
        // TODO add your handling code here:
        //addChoice(lbAns4.getText());
    }//GEN-LAST:event_rbChoiceDMouseClicked

    private void rbChoiceAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChoiceAActionPerformed
        // TODO add your handling code here:
               addChoice(lbAns1.getText());
    }//GEN-LAST:event_rbChoiceAActionPerformed

    private void rbChoiceCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChoiceCActionPerformed
        // TODO add your handling code here:
        
        addChoice(lbAns3.getText());
    }//GEN-LAST:event_rbChoiceCActionPerformed

    private void rbChoiceDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChoiceDActionPerformed
        // TODO add your handling code here:
        addChoice(lbAns4.getText());
    }//GEN-LAST:event_rbChoiceDActionPerformed

    private void cbQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQuestionActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        String str = cbQuestion.getSelectedItem().toString();
        int a=Integer.parseInt(str)-1;
        showQuestion(a);
        for (int i = 0 ; i < listChoice.length; i++ ){
            if (listChoice[i] != null ){
                if (listQuestion.get(a).getQuestionID()== listChoice[i].getQuestionID()){
                    if (lbAns1.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceA.doClick();break;}
                    if (lbAns2.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceB.doClick();break;}
                    if (lbAns3.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceC.doClick();break;}
                    if (lbAns4.getText().equals(listChoice[i].getAnswerContent())) {rbChoiceD.doClick();break;}
               }
            }
        }
        
    }//GEN-LAST:event_cbQuestionActionPerformed

    private void btDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoneActionPerformed
        // TODO add your handling code here:
        for (int i=0; i< listChoice.length;i++)
            if ( listChoice[i] == null ){
                JOptionPane.showMessageDialog(rootPane,"Bạn còn câu chưa làm");
                break;
            } 
        int click = JOptionPane.showConfirmDialog(rootPane,"Thời gian vẫn còn . "
                + "Bạn có chắc chắn nộp bài không?", "Nộp bài", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.YES_OPTION){
            endExam();
        }
        
        
        
    }//GEN-LAST:event_btDoneActionPerformed

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
            java.util.logging.Logger.getLogger(TakeExams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeExams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeExams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeExams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeExams("10").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDone;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelTime;
    private javax.swing.JTextArea lbAns1;
    private javax.swing.JTextArea lbAns2;
    private javax.swing.JTextArea lbAns3;
    private javax.swing.JTextArea lbAns4;
    private javax.swing.JLabel lbMinutes;
    private javax.swing.JLabel lbSec;
    private javax.swing.JRadioButton rbChoiceA;
    private javax.swing.JRadioButton rbChoiceB;
    private javax.swing.JRadioButton rbChoiceC;
    private javax.swing.JRadioButton rbChoiceD;
    private javax.swing.JLabel tfDate;
    private javax.swing.JLabel tfNumOfQes;
    private javax.swing.JTextArea tfQueContent;
    private javax.swing.JLabel tfStuId;
    private javax.swing.JLabel tfSub;
    private javax.swing.JLabel tfTop;
    // End of variables declaration//GEN-END:variables
}
