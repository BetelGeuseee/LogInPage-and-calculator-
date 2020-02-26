
package FirstPage;


public class LogInFrame extends javax.swing.JFrame  {

    
    int sum;
    String str2;
    public LogInFrame() {
        
        
        initComponents();
        oneButton.setEnabled(false);
        twoButton.setEnabled(false);
        oneButton.setEnabled(false);
        threeButton.setEnabled(false);
        fourButton.setEnabled(false);
        fiveButton.setEnabled(false);
        sixButton.setEnabled(false);
        sevenButton.setEnabled(false);
        eightButton.setEnabled(false);
        nineButton.setEnabled(false);
        zeroButton.setEnabled(false);
        addButton.setEnabled(false);
        substractButton.setEnabled(false);
        multiplyButton.setEnabled(false);
        divideButton.setEnabled(false);
        equalButton.setEnabled(false);
        outputField.setEditable(false);
        reserveField.setEditable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sixButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        outputField = new javax.swing.JTextField();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        substractButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        addButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        reserveField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(109, 24, 24));

        jLabel2.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("TEAM");

        jLabel3.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("SPARTANS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 10, 390, 706));

        jPanel3.setBackground(new java.awt.Color(51, 85, 104));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 48)); // NOI18N
        jLabel1.setText("CALCULATOR");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 0, 416, 65));

        sixButton.setBackground(new java.awt.Color(147, 104, 7));
        sixButton.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        sixButton.setText("6");
        sixButton.setPreferredSize(new java.awt.Dimension(100, 100));
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });
        jPanel3.add(sixButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 391, -1, -1));

        oneButton.setBackground(new java.awt.Color(147, 104, 7));
        oneButton.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        oneButton.setText("1");
        oneButton.setPreferredSize(new java.awt.Dimension(100, 100));
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        jPanel3.add(oneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 273, -1, -1));

        sevenButton.setBackground(new java.awt.Color(147, 104, 7));
        sevenButton.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        sevenButton.setText("7");
        sevenButton.setPreferredSize(new java.awt.Dimension(100, 100));
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });
        jPanel3.add(sevenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 509, -1, -1));

        fourButton.setBackground(new java.awt.Color(147, 104, 7));
        fourButton.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        fourButton.setText("4");
        fourButton.setPreferredSize(new java.awt.Dimension(100, 100));
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });
        jPanel3.add(fourButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 391, -1, -1));

        outputField.setBackground(new java.awt.Color(204, 204, 255));
        outputField.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        outputField.setForeground(new java.awt.Color(0, 0, 0));
        outputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputFieldActionPerformed(evt);
            }
        });
        jPanel3.add(outputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 182, 551, 60));

        twoButton.setBackground(new java.awt.Color(147, 104, 7));
        twoButton.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        twoButton.setText("2");
        twoButton.setPreferredSize(new java.awt.Dimension(100, 100));
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });
        jPanel3.add(twoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 273, -1, -1));

        threeButton.setBackground(new java.awt.Color(147, 104, 7));
        threeButton.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        threeButton.setText("3");
        threeButton.setPreferredSize(new java.awt.Dimension(100, 100));
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });
        jPanel3.add(threeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 273, -1, -1));

        eightButton.setBackground(new java.awt.Color(147, 104, 7));
        eightButton.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        eightButton.setText("8");
        eightButton.setPreferredSize(new java.awt.Dimension(100, 100));
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });
        jPanel3.add(eightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 509, -1, -1));

        nineButton.setBackground(new java.awt.Color(147, 104, 7));
        nineButton.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        nineButton.setText("9");
        nineButton.setPreferredSize(new java.awt.Dimension(100, 100));
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });
        jPanel3.add(nineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 509, -1, -1));

        fiveButton.setBackground(new java.awt.Color(147, 104, 7));
        fiveButton.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        fiveButton.setText("5");
        fiveButton.setPreferredSize(new java.awt.Dimension(100, 100));
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });
        jPanel3.add(fiveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 391, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButton1.setText("ON");
        jRadioButton1.setPreferredSize(new java.awt.Dimension(30, 30));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 70, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButton2.setText("OFF");
        jRadioButton2.setPreferredSize(new java.awt.Dimension(30, 30));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 70, -1));

        substractButton.setBackground(new java.awt.Color(146, 146, 163));
        substractButton.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        substractButton.setText("-");
        substractButton.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel3.add(substractButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 328, -1, 66));

        divideButton.setBackground(new java.awt.Color(146, 146, 163));
        divideButton.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        divideButton.setText("÷");
        divideButton.setPreferredSize(new java.awt.Dimension(100, 100));
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });
        jPanel3.add(divideButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 412, -1, 66));

        multiplyButton.setBackground(new java.awt.Color(146, 146, 163));
        multiplyButton.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        multiplyButton.setText("X");
        multiplyButton.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel3.add(multiplyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 412, -1, 66));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 273, -1, 328));

        addButton.setBackground(new java.awt.Color(146, 146, 163));
        addButton.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        addButton.setText("+");
        addButton.setPreferredSize(new java.awt.Dimension(100, 100));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 328, -1, 66));

        equalButton.setBackground(new java.awt.Color(0, 255, 204));
        equalButton.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        equalButton.setText("=");
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });
        jPanel3.add(equalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 489, 203, 57));

        zeroButton.setBackground(new java.awt.Color(99, 101, 30));
        zeroButton.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });
        jPanel3.add(zeroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 614, 100, 86));

        jSeparator2.setBackground(new java.awt.Color(255, 0, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, 400));

        reserveField.setBackground(new java.awt.Color(204, 204, 255));
        reserveField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveFieldActionPerformed(evt);
            }
        });
        jPanel3.add(reserveField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 551, 60));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
            Object source = evt.getSource();
            if(source==oneButton)
            {
                outputField.setText(outputField.getText()+"1");
                
            }
    }//GEN-LAST:event_oneButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
       Object source = evt.getSource();
            if(source==sixButton)
            {
                outputField.setText(outputField.getText()+"6");
                
            }
      
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        Object source = evt.getSource();
            if(source==sevenButton)
            {
                outputField.setText(outputField.getText()+"7");
                
            }
       
           
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        Object source = evt.getSource();
            if(source==fourButton)
            {
                outputField.setText(outputField.getText()+"4");
                
            }
    }//GEN-LAST:event_fourButtonActionPerformed


 
    

    private void outputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputFieldActionPerformed
        
    }//GEN-LAST:event_outputFieldActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
       Object source = evt.getSource();
            if(source==twoButton)
            {
                outputField.setText(outputField.getText()+"2");
                
            }
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        Object source = evt.getSource();
            if(source==threeButton)
            {
                outputField.setText(outputField.getText()+"3");
                
            }
    }//GEN-LAST:event_threeButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        Object source = evt.getSource();
            if(source==eightButton)
            {
                outputField.setText(outputField.getText()+"8");
                
            }
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        Object source = evt.getSource();
            if(source==nineButton)
            {
                outputField.setText(outputField.getText()+"9");
                
            }
    }//GEN-LAST:event_nineButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        Object source = evt.getSource();
            if(source==fiveButton)
            {
                outputField.setText(outputField.getText()+"5");
                
            }
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        
    }//GEN-LAST:event_divideButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
   Object source = evt.getSource();
            if(source==zeroButton)
            {
                outputField.setText(outputField.getText()+"0");
                
            }
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
      
            
            int first;
            
            String data1 = outputField.getText();
            
            first=Integer.parseInt(data1);
            outputField.setText(null);
           
            
            if(reserveField.getText().isEmpty()==true)
            {
               reserveField.setText(data1); 
            }
            else
            {
                String data2 = reserveField.getText();
                reserveField.setText(data2+ "+" +data1);
                 
            }
          sum=sum+first;
            str2 = Integer.toString(sum);
           
    }//GEN-LAST:event_addButtonActionPerformed

    private void reserveFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveFieldActionPerformed
        
    }//GEN-LAST:event_reserveFieldActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
        outputField.setText(str2);
    }//GEN-LAST:event_equalButtonActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        oneButton.setEnabled(true);
        twoButton.setEnabled(true);
        oneButton.setEnabled(true);
        threeButton.setEnabled(true);
        fourButton.setEnabled(true);
        fiveButton.setEnabled(true);
        sixButton.setEnabled(true);
        sevenButton.setEnabled(true);
        eightButton.setEnabled(true);
        nineButton.setEnabled(true);
        zeroButton.setEnabled(true);
        addButton.setEnabled(true);
        substractButton.setEnabled(true);
        multiplyButton.setEnabled(true);
        divideButton.setEnabled(true);
        equalButton.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        
        oneButton.setEnabled(false);
        twoButton.setEnabled(false);
        oneButton.setEnabled(false);
        threeButton.setEnabled(false);
        fourButton.setEnabled(false);
        fiveButton.setEnabled(false);
        sixButton.setEnabled(false);
        sevenButton.setEnabled(false);
        eightButton.setEnabled(false);
        nineButton.setEnabled(false);
        zeroButton.setEnabled(false);
        addButton.setEnabled(false);
        substractButton.setEnabled(false);
        multiplyButton.setEnabled(false);
        divideButton.setEnabled(false);
        equalButton.setEnabled(false);
        outputField.setText(null);
        reserveField.setText(null);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JTextField outputField;
    private javax.swing.JTextField reserveField;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton substractButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
