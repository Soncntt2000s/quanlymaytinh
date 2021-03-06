/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentationLayer;

import businessLayer.*;
import dataTransferObject.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class DoiMatKhau extends javax.swing.JDialog {

    private List<NhanVien> list;
    private DefaultTableModel model;
    private String MaNV_MK;
    
    public DoiMatKhau(java.awt.Frame parent, boolean modal , String manv) {
        super(parent, modal);
        initComponents();
        list = new ArrayList<>();          
        this.MaNV_MK = manv;
    }   

    public static DoiMatKhauBL dmkbl = new DoiMatKhauBL();      
    
    private DoiMatKhau(JFrame jFrame, boolean b) {
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_CapNhat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_TenHT = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        txt_passNew = new javax.swing.JPasswordField();
        txt_RepassNew = new javax.swing.JPasswordField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Mật Khẩu Cũ :");

        jLabel2.setText("Nhập Mật Khẩu Mới :");

        jLabel3.setText("Nhập Lại Mật Khẩu Mới :");

        btn_CapNhat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_CapNhat.setForeground(new java.awt.Color(0, 0, 153));
        btn_CapNhat.setText("Cập Nhật");
        btn_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatActionPerformed(evt);
            }
        });

        jLabel5.setText("Tên Hiển Thị :");

        txt_TenHT.setSelectionColor(new java.awt.Color(255, 0, 0));
        txt_TenHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenHTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_TenHT, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txt_pass)
                    .addComponent(txt_passNew)
                    .addComponent(txt_RepassNew))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_TenHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_passNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_RepassNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        
        String tenht = txt_TenHT.getText();
        String pass = new String(txt_pass.getPassword());
        String passNew = new String(txt_passNew.getPassword());
        String RepassNew = new String(txt_RepassNew.getPassword());       
       
        String passMD5 = "";
        ///mã hóa mật khẩu cũ để so sánh với database coi có trùng nhau không        
        try {
            passMD5 = MD5Encryptor.encrypt(pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        String passNewMD5 = "";
        ///mã hóa mật khẩu mới md5        
        try {
            passNewMD5 = MD5Encryptor.encrypt(passNew);
        } catch (Exception e) {
            e.printStackTrace();
        }
       if( tenht.length()==0)
        {
            JOptionPane.showMessageDialog(rootPane,"Tên Hiển Thị không được để trống ! Vui lòng nhập để tiếp tục");
            txt_TenHT.requestFocus();
            return;
        }
        else
        {
            if(pass.length()==0)
            {
                JOptionPane.showMessageDialog(rootPane,"Mật khẩu không được để trống ! Vui lòng nhập để tiếp tục");
                txt_pass.requestFocus();
                return;
            }
            else
            {
                if(passNew.length()==0)
                {
                    JOptionPane.showMessageDialog(rootPane,"Xin mời nhập mật khẩu mới !");
                    txt_passNew.requestFocus();
                    return;
                }
                else
                {
                    if( RepassNew.length()==0)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Xin mời nhập lại mật khẩu mới để kiểm chứng !");
                        txt_RepassNew.requestFocus();
                        return;
                    }
                    else
                    {       
                        NhanVien nv = null; 
                        try {
                            nv = dmkbl.showDuLieu(MaNV_MK);
                        } catch (Exception ex) {
                            Logger.getLogger(DoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if(!passMD5.equals(nv.getPassWord().trim()))
                        {
                            JOptionPane.showMessageDialog(rootPane,"Mật khẩu cũ không trùng khớp! Xin nhập lại.");
                            txt_pass.requestFocus();
                            return;
                        }
                        else
                        {
                            if(!passNew.equals(RepassNew))
                            {
                                JOptionPane.showMessageDialog(rootPane,"Mật khẩu nhập lại không trùng nhau.");
                                txt_passNew.requestFocus();
                                return;
                            }
                            else
                            {
                                NhanVien nhanvien = new NhanVien(nv.getsMaNV(),tenht,nv.getsTenNV(),
                                        nv.getsChucVu(), nv.getsPhai(), passNewMD5,
                                        nv.getdNgaySinh(), nv.getsDiaChi(),nv.getsHinhAnh());
                                DoiMatKhauBL.CapNhatMatKhau(nhanvien);
                                JOptionPane.showMessageDialog(rootPane,"Cập nhật thành công!");  
                                ThongTinNhanVien ttnv = new ThongTinNhanVien();                                
                                this.dispose();
                                this.setVisible(false);
                            }
                        }
                    }
                }
            }
        }
       
    }//GEN-LAST:event_btn_CapNhatActionPerformed
   
    
    private void txt_TenHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenHTActionPerformed
       
        
    }//GEN-LAST:event_txt_TenHTActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                      
        try 
        {
            NhanVien nv = dmkbl.showDuLieu(MaNV_MK);            
            if(MaNV_MK.equals(nv.getsMaNV()))                
            {
                txt_TenHT.setText(nv.getsTenHT().toString().trim());                            
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Mã nhân viên này chưa tồn tại!");
                return;
            }
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(DoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened
        
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
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMatKhau dialog = new DoiMatKhau(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txt_RepassNew;
    private javax.swing.JTextField txt_TenHT;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JPasswordField txt_passNew;
    // End of variables declaration//GEN-END:variables

}
