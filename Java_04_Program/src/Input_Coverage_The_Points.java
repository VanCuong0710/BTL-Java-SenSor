/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 84866
 */
// IMPORT THƯ VIỆN CẦN THIẾT
import Exception_and_StoreSenSor.Radius_Exception;
import Exception_and_StoreSenSor.Nulll_Exception;
import Exception_and_StoreSenSor.Heght_Exception;
import Exception_and_StoreSenSor.Store_SenSor_InFo;
import Exception_and_StoreSenSor.The_Ponit_ExcepTion;
import Exception_and_StoreSenSor.Width_Less_Height;
import Exception_and_StoreSenSor.Width_Exception;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Input_Coverage_The_Points extends javax.swing.JFrame {
    // GỌI CLASS SENSOR
    Store_SenSor_InFo senSor = new Store_SenSor_InFo();

    /**
     * Creates new form InputConverageThePoints
     */
    public Input_Coverage_The_Points() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtSLdiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

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

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Số lượng điểm");

        txtSLdiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSLdiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSLdiemKeyTyped(evt);
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
                        .addGap(161, 161, 161)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(txtdai, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbk, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtrong, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(39, 39, 39)
                                .addComponent(txtSLdiem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(70, 70, 70))
            .addComponent(jScrollPane1)
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
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSLdiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            
            //CHECK CÁC TRƯỜNG HỢP NGOẠI LỆ
            checkException();
            checkDai(Integer.parseInt(txtdai.getText().trim()));
            checkRong(Integer.parseInt(txtrong.getText().trim()));
            checkRadius(Integer.parseInt(txtbk.getText().trim()));
            checkWidthandHight(Integer.parseInt(txtdai.getText().trim()), Integer.parseInt(txtrong.getText().trim()));
            checkThePoint(Integer.parseInt(txtSLdiem.getText().trim()));
            
            // LƯU TRỮ CLASS
            senSor.setX(Integer.parseInt(txtdai.getText().trim()));
            senSor.setY(Integer.parseInt(txtrong.getText().trim()));
            senSor.setRadius(Integer.parseInt(txtbk.getText().trim()));
            
            //VIẾT CẤU HÌNH
            txtArea.setText(senSor.toString());
            txtArea.append("|Số lượng điểm: " + Integer.parseInt(txtSLdiem.getText().trim()));
            cauhinh = 1;//CÀI ĐẶT ĐÃ KIỂM TRA DỮ LIỆU
        } catch (Nulll_Exception ex) {
            
            //CÁC TRƯỜNG HỢP NGOẠI LỆ
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (Width_Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (Heght_Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (Radius_Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (Width_Less_Height ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (The_Ponit_ExcepTion ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbkKeyTyped
        // TODO add your handling code here:
        
        //KHÔNG CHO NHẬP CHỮ
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtbkKeyTyped

    private void txtrongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrongKeyTyped
        // TODO add your handling code here:
        
        //KHÔNG CHO NHẬP CHỮ
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtrongKeyTyped

    private void txtdaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdaiKeyTyped
        // TODO add your handling code here:
        
        //KHÔNG CHO NHẬP CHỮ
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdaiKeyTyped

    private void txtdaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdaiKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtdaiKeyPressed
    private void checkException() throws Nulll_Exception {
        //HÀM CHECK NULL
        if (txtdai.getText().trim().equals("")) {
            throw new Nulll_Exception("Chiều dài trống. Vui lòng thử lại!!");
        }
        if (txtbk.getText().trim().equals("")) {
            throw new Nulll_Exception("Bán kính trống. Vui lòng thử lại!!!");
        }
        if (txtrong.getText().trim().equals("")) {
            throw new Nulll_Exception("Chiều rộng trống. Vui lòng thử lại!!!");
        }
        if (txtSLdiem.getText().trim().equals("")) {
            throw new Nulll_Exception("Số lượng điểm rỗng. Vui lòng thử lại!!!");
        }

    }
    int cauhinh = 0;// THIẾT LẬP BIẾN CỜ CẤU HÌNH

    
    //XỬ LÝ NGOẠI LỆ
    private void checkWidthandHight(int x, int y) throws Width_Less_Height {
        if (x < y) {
            
            //NGOẠI LỆ DÀI NHỎ HƠN RỘNG
            throw new Width_Less_Height("Chiều dài phải lớn hơn chiều rộng");
        }
    }

    private void checkDai(int x) throws Width_Exception {
        if (x < 200 || x > 1000) {
            //NGOẠI LỆ VƯỢT QUÁ CHIỀU DÀI
            throw new Width_Exception("Chiều dài nằm trong khoảng từ 200 đến 1000");
        }
    }

    private void checkRong(int x) throws Heght_Exception {
        if (x < 200 || x > 600) {
            //NGOẠI LỆ VƯỢT QUÁ CHIỀU RỘNG
            throw new Heght_Exception("Chiều rộng nằm trong khoảng từ 200 đến 600");
        }
    }

    private void checkRadius(int x) throws Radius_Exception {
        if (x < 40 || x > 70) {
            //NGOẠI LỆ VƯỢT QUÁ BÁN KÍNH
            throw new Radius_Exception("Bán kính nằm trong khoảng từ 40 đến 70");
        }
    }

    private void checkThePoint(int x) throws The_Ponit_ExcepTion {
        if (x < 20 || x > 100) {
            //VƯỢT QUÁ SỐ ĐIỂM
            throw new The_Ponit_ExcepTion("Số lượng điểm nằm trong khoảng từ 20 đến 100");
        }
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        //CLEAR DỮ LIỆU
        txtbk.setText("");
        txtdai.setText("");
        txtrong.setText("");
        txtArea.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (cauhinh == 0) {//TRƯỜNG HỢP CHƯA CẤU HÌNH
            //THÔNG BÁO RA MÀN HÌNH
            JOptionPane.showMessageDialog(rootPane, "Vui lòng cấu hình trước khi vẽ");
        } else {
            
            //GÁN DỮ LIỆU
            int dai = Integer.parseInt(txtdai.getText());
            int rong = Integer.parseInt(txtrong.getText());
            int bankinh = Integer.parseInt(txtbk.getText());
            int sldiem = Integer.parseInt(txtSLdiem.getText());
            //GỌI FRAM MỚI
            JFrame MainFrame = new JFrame();
            
            //THIẾT LẬP SIZE
            MainFrame.setSize(dai+50, rong+100);
            
            //TRUYỀN THAM BIẾN
            Draw_Coverage_The_Points Converage_The_PointPanel = new Draw_Coverage_The_Points(dai, rong, bankinh, sldiem);
            MainFrame.add(Converage_The_PointPanel);
            //SETTITLE
            MainFrame.setTitle("Coverage The Points");
            MainFrame.setLocationRelativeTo(null);
            MainFrame.setVisible(true);
            cauhinh = 0;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // NÚT THOÁT
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSLdiemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSLdiemKeyTyped
        // TODO add your handling code here:
        //KHÔNG CHO NHẬP KÍ TỰ
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSLdiemKeyTyped

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
            java.util.logging.Logger.getLogger(Input_Coverage_The_Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input_Coverage_The_Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input_Coverage_The_Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input_Coverage_The_Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input_Coverage_The_Points().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtSLdiem;
    private javax.swing.JTextField txtbk;
    private javax.swing.JTextField txtdai;
    private javax.swing.JTextField txtrong;
    // End of variables declaration//GEN-END:variables
}
