/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//IMPORT THƯ VIỆN CẦN THIẾT
import  Exception_and_StoreSenSor.Radius_Exception;
import Exception_and_StoreSenSor.Nulll_Exception;
import Exception_and_StoreSenSor.Heght_Exception;
import Exception_and_StoreSenSor.Store_SenSor_InFo;
import Exception_and_StoreSenSor.Width_Less_Height;
import Exception_and_StoreSenSor.Width_Exception;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author 84866
 */
public class Input_K_Barrier extends javax.swing.JFrame {
    Store_SenSor_InFo senSor = new Store_SenSor_InFo();
    /**
     * Creates new form FormInput
     */
    public Input_K_Barrier() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtdai = new javax.swing.JTextField();
        txtrong = new javax.swing.JTextField();
        txtbk = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 0));

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("Vẽ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nhập chiều dài");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Nhập dữ liệu");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Nhập chiều rộng");

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Nhập bán kính");

        txtdai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtdai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdaiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdaiKeyTyped(evt);
            }
        });

        txtrong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtrong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrongKeyTyped(evt);
            }
        });

        txtbk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtbk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbkKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Cấu hình");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(txtrong, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(39, 39, 39)
                                .addComponent(txtbk, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(txtdai, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtbk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(489, 489, 489)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
                //JFRAME ĐÓNG
                this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    int cauhinh=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            checkException();//CHECK NULL
            
            //CHECK CHIỀU DÀI RỘNG
            checkDai(Integer.parseInt(txtdai.getText().trim()));
            checkRong(Integer.parseInt(txtrong.getText().trim()));
            checkRadius(Integer.parseInt(txtbk.getText().trim()));
            checkWidthandHight(Integer.parseInt(txtdai.getText().trim()), Integer.parseInt(txtrong.getText().trim()));
            senSor.setX(Integer.parseInt(txtdai.getText().trim()));
            senSor.setY(Integer.parseInt(txtrong.getText().trim()));
            senSor.setRadius(Integer.parseInt(txtbk.getText().trim()));
            
            //THÔNG BÁO DIỆN TÍCH
            txtArea.setText(senSor.toString());
            
            //TRƯỜNG HỢP DỮ LIỆU HỢP LỆ
            cauhinh =1;
        }
        catch (Nulll_Exception ex) {
            
            //THÔNG BÁO CÁC NGOẠI LỆ
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        catch (Width_Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        catch (Heght_Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        catch (Radius_Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (Width_Less_Height ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        
      
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        //LÀM SẠCH Ô JTEXT
        txtbk.setText("");
        txtdai.setText("");
        txtrong.setText("");
        txtArea.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtdaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdaiKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtdaiKeyPressed

    private void txtrongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrongKeyTyped
        // TODO add your handling code here:
        
        //KHÔNG CHO NHẬP CHỮ
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtrongKeyTyped

    private void txtdaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdaiKeyTyped
        // TODO add your handling code here:
       char c = evt.getKeyChar();
        
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtdaiKeyTyped

    private void txtbkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbkKeyTyped
        // TODO add your handling code here:
        //KHÔNG CHO NHẬP CHỮ
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtbkKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(cauhinh==0)
        {
            //TRƯỜNG HỢP CHƯA CẤU HÌNH
            JOptionPane.showMessageDialog(rootPane, "Vui lòng cấu hình trước khi vẽ");
        }
        else
        {
            
            //GẮN DỮ LIỆU VÀ CHUYỂN ĐỔI KIỂU TEXT SANG INT
        int dai=Integer.parseInt(txtdai.getText());
        int rong=Integer.parseInt(txtrong.getText());
        int bankinh=Integer.parseInt(txtbk.getText());
        
        //GỌI JFANEL ĐỂ VẼ
        JFrame MainFrame = new JFrame();
        Draw_K_Barrier c = new Draw_K_Barrier(dai,rong,bankinh);
        MainFrame.setBackground(Color.cyan);
        
        //TRUYỀN THAM BIẾN
        MainFrame.setSize(dai+bankinh+bankinh/3,rong+100);
        MainFrame.setLocationRelativeTo(null);
        Draw_K_Barrier CirclePanel = new Draw_K_Barrier(dai,rong,bankinh);
        //SET TITLE
        MainFrame.setTitle("Vẽ cảm biến");
        MainFrame.add(CirclePanel);
        MainFrame.setVisible(true);
        cauhinh=0;
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Input_K_Barrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input_K_Barrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input_K_Barrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input_K_Barrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input_K_Barrier().setVisible(true);
            }
        });
    }
    private void checkException() throws Nulll_Exception
    {
        //HÀM KIỂM TRA NGOẠI LỆ
        if(txtdai.getText().trim().equals("")) throw new Nulll_Exception ("Chiều dài trống. Vui lòng thử lại!!");
        if(txtbk.getText().trim().equals("")) throw new Nulll_Exception ("Bán kính trống. Vui lòng thử lại!!!");
        if(txtrong.getText().trim().equals("")) throw new Nulll_Exception ("Chiều rộng trống. Vui lòng thử lại!!!");
        
    }
    private void checkWidthandHight(int x,int y) throws Width_Less_Height
    {
        //CHECK DÀI CÓ NHỎ HƠN RỘNG HAY KHÔNG
        if(x < y) throw new Width_Less_Height("Chiều dài phải lớn hơn chiều rộng");
    }
    
    private void checkDai(int x) throws Width_Exception
    {
        //CHECK ĐIỀU KIỆN CỦA DÀI
        if(x<200 || x>1000) throw new Width_Exception("Chiều dài nằm trong khoảng từ 200 đến 1000");
    }
    private void checkRong(int x) throws Heght_Exception
    {
        //CHECK RỘNG
        if(x<200 || x>600) throw new Heght_Exception("Chiều rộng nằm trong khoảng từ 200 đến 600");
    }
    private void checkRadius(int x) throws Radius_Exception
    {
        //CHECK NGOẠI LỆ BÁN KINH
        if(x<40 || x>70) throw new Radius_Exception("Bán kính nằm trong khoảng từ 40 đến 70");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtbk;
    private javax.swing.JTextField txtdai;
    private javax.swing.JTextField txtrong;
    // End of variables declaration//GEN-END:variables
}
