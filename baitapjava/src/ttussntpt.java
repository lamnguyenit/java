/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LamIT
 */
public class ttussntpt extends javax.swing.JFrame {

    /**
     * Creates new form ttussntpt
     */
    public ttussntpt() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        txtKQ = new javax.swing.JTextField();
        tong = new javax.swing.JRadioButton();
        uocso = new javax.swing.JRadioButton();
        songuyento = new javax.swing.JRadioButton();
        phantich = new javax.swing.JRadioButton();
        thuchien = new javax.swing.JButton();
        tieptuc = new javax.swing.JButton();
        thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tính Tổng - Ước Số - Số Nguyên Tố - Phân Tích");
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 20));

        jLabel2.setText("Nhập N");

        jLabel3.setText("Kết Quả");

        txtKQ.setEditable(false);
        txtKQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKQActionPerformed(evt);
            }
        });

        buttonGroup1.add(tong);
        tong.setText("S=1+2+...+N");
        tong.setName("tong"); // NOI18N
        tong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongActionPerformed(evt);
            }
        });

        buttonGroup1.add(uocso);
        uocso.setText("Ước Số");
        uocso.setName("uocso"); // NOI18N
        uocso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uocsoActionPerformed(evt);
            }
        });

        buttonGroup1.add(songuyento);
        songuyento.setText("Số Nguyên Tố");
        songuyento.setName("songuyento"); // NOI18N
        songuyento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songuyentoActionPerformed(evt);
            }
        });

        buttonGroup1.add(phantich);
        phantich.setText("Phân tích");
        phantich.setName("phantich"); // NOI18N
        phantich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phantichActionPerformed(evt);
            }
        });

        thuchien.setText("thực hiện");
        thuchien.setName("thuchien"); // NOI18N
        thuchien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuchienActionPerformed(evt);
            }
        });

        tieptuc.setText("tiếp tục");
        tieptuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tieptucActionPerformed(evt);
            }
        });

        thoat.setText("thoat");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uocso)
                            .addComponent(tong)
                            .addComponent(songuyento)
                            .addComponent(phantich)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(thuchien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tieptuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uocso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(songuyento)
                    .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phantich)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thuchien)
                    .addComponent(tieptuc)
                    .addComponent(thoat))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tongActionPerformed

    private void uocsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uocsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uocsoActionPerformed

    private void songuyentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songuyentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songuyentoActionPerformed

    private void phantichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phantichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phantichActionPerformed

    private void txtKQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKQActionPerformed

    private void thuchienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuchienActionPerformed
        if(tong.isSelected())
        {
        int n=Integer.parseInt(txtN.getText());
        int t=(n*(n+1)/2);
        txtKQ.setText(t + "");
        
        }
        if(uocso.isSelected())
        {
            int i=0,dem=0;
            int n=Integer.parseInt(txtN.getText());
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    dem++;
                }
            }
            txtKQ.setText(n+" có "+dem + " ước số");
        }
        if(songuyento.isSelected())
        {
            int i=0,j=0; 
            int n=Integer.parseInt(txtN.getText());
            if(n<1)
            {
                 txtKQ.setText("NHẬP SỐ > 0");
            }
            if(n==1 || n==2)
            {  
                txtKQ.setText(n+" là SNT");
            }
            if(n>2)
            {
                for(i=2; i<n; i++)
                {
                    if(n%i==0)
                    {
                        j=1;
                    }
                }
                if(j==1)
                
                    txtKQ.setText(n+" ko là SNT");
                else
                    txtKQ.setText(n+" là SNT");
            }
            
             
        }
         if(phantich.isSelected())
        {
            String s="";
            int n=Integer.parseInt(txtN.getText());
            int i=2;
            while (n != 1)
            {
                if ((n%i) == 0)
                {
                    s=s+"*"+i;
                    n /= i;
                }

                else
                    i++;
            }
            txtKQ.setText(txtN.getText()+"=1"+s);
            
          
        }
        
    }//GEN-LAST:event_thuchienActionPerformed

    private void tieptucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tieptucActionPerformed
        txtN.setText("");
        txtKQ.setText("");
    }//GEN-LAST:event_tieptucActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_thoatActionPerformed

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
            java.util.logging.Logger.getLogger(ttussntpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ttussntpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ttussntpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ttussntpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ttussntpt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton phantich;
    private javax.swing.JRadioButton songuyento;
    private javax.swing.JButton thoat;
    private javax.swing.JButton thuchien;
    private javax.swing.JButton tieptuc;
    private javax.swing.JRadioButton tong;
    private javax.swing.JTextField txtKQ;
    private javax.swing.JTextField txtN;
    private javax.swing.JRadioButton uocso;
    // End of variables declaration//GEN-END:variables
}
