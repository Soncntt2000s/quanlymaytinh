/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationLayer;

import businessLayer.*;
import dataTransferObject.*;
import java.awt.event.ActionEvent;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class ThongTinPhieuBan extends javax.swing.JDialog {

    public List<PhieuBanHang> list;
    public DefaultTableModel model;
    public static String mahd;
    public ThongTinPhieuBan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        list = new ArrayList<>();
        model = (DefaultTableModel) tbl_PhieuBan.getModel();
        txt_TongTien.setEnabled(false);
    }
    
    public ThongTinPhieuBan()
    {         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_PhieuBan = new javax.swing.JTable();
        txt_Tim = new javax.swing.JTextField();
        btn_TimKiem = new javax.swing.JButton();
        btn_LamMoi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbx_TenNV = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbx_TenKH = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbx_TenMT = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_Them = new javax.swing.JButton();
        btn_ThanhToan = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        txt_DonGia = new javax.swing.JTextField();
        txt_TongTien = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_NgayLap = new javax.swing.JTextField();
        txt_NgayGiao = new javax.swing.JTextField();
        txt_Soluong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_TongTien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÔNG TIN PHIẾU BÁN");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbl_PhieuBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Tên NV", "Tên KH", "Tên MT", "Số Lượng", "Đơn Giá", "Thành Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_PhieuBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_PhieuBanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_PhieuBan);

        txt_Tim.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_TimKiem.setText("Tìm Kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        btn_LamMoi.setText("Làm Mới");
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên Nhân Viên Xuất Phiếu :");

        jLabel3.setText("Tên Khách Mua Hàng :");

        jLabel4.setText("Tên Máy tính :");

        jLabel5.setText("Đơn Giá :");

        jLabel6.setText("Số Lượng:");

        btn_Them.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_Them.setForeground(new java.awt.Color(51, 0, 255));
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_ThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_ThanhToan.setForeground(new java.awt.Color(0, 0, 255));
        btn_ThanhToan.setText("Thanh Toán");
        btn_ThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThanhToanActionPerformed(evt);
            }
        });

        btn_Sua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_Sua.setForeground(new java.awt.Color(0, 0, 204));
        btn_Sua.setText("Sửa");

        btn_Thoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_Thoat.setForeground(new java.awt.Color(0, 0, 204));
        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        txt_DonGia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_TongTien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_TongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TongTienActionPerformed(evt);
            }
        });

        jLabel7.setText("Ngày Lập :");

        jLabel8.setText("Ngày Giao :");

        txt_NgayLap.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_NgayGiao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_Soluong.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VNĐ");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("VNĐ");

        btn_TongTien.setText("Tổng Tiền:");
        btn_TongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TongTienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_NgayGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Them)
                                    .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(138, 138, 138))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_TongTien)
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_TongTien)
                            .addComponent(btn_Thoat)
                            .addComponent(btn_ThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(txt_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addComponent(cbx_TenNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_TenKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_TenMT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbx_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbx_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_NgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_NgayGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ThanhToan)
                            .addComponent(btn_Them)
                            .addComponent(jLabel4)
                            .addComponent(cbx_TenMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_TongTien))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Sua)
                            .addComponent(btn_Thoat))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TongTienActionPerformed
        
    }//GEN-LAST:event_txt_TongTienActionPerformed

    public void TrangThaiNut(boolean b) {

        this.btn_Them.setEnabled(b);
        this.btn_ThanhToan.setEnabled(b);
        this.btn_Sua.setEnabled(b);
        this.btn_Thoat.setEnabled(b);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showListHoaDon();
        loadTenKhachHang();
        loadTenMayTinh();
        loadTenNhanVien();
    }//GEN-LAST:event_formWindowOpened

    private void tbl_PhieuBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PhieuBanMouseClicked
        TrangThaiNut(true);
        btn_Them.setEnabled(true);
        PhieuBanHang pbh = list.get(tbl_PhieuBan.getSelectedRow());
        
        String mahd = String.valueOf(tbl_PhieuBan.getValueAt(tbl_PhieuBan.getSelectedRow(),0));           
        String tennv = String.valueOf(tbl_PhieuBan.getValueAt(tbl_PhieuBan.getSelectedRow(),1));  
        String tenkh = String.valueOf(tbl_PhieuBan.getValueAt(tbl_PhieuBan.getSelectedRow(),2));
        String tenmt = String.valueOf(tbl_PhieuBan.getValueAt(tbl_PhieuBan.getSelectedRow(),3)); 
        String soluong = String.valueOf(tbl_PhieuBan.getValueAt(tbl_PhieuBan.getSelectedRow(),4));
        String dongiaban = String.valueOf(tbl_PhieuBan.getValueAt(tbl_PhieuBan.getSelectedRow(),5));
        int thanhtien = Integer.parseInt(soluong)*Integer.parseInt(dongiaban);
        String ngaylaphd = pbh.getNgayLapHD().toString();
        String ngaygiao = pbh.getNgayGiao().toString();
                
        cbx_TenNV.setSelectedItem(tennv);
        cbx_TenKH.setSelectedItem(tenkh);
        cbx_TenMT.setSelectedItem(tenmt);
        txt_DonGia.setText(dongiaban);
        txt_Soluong.setText(soluong);
        txt_NgayLap.setText(ngaylaphd);
        txt_NgayGiao.setText(ngaygiao);
        txt_TongTien.setText(String.valueOf(thanhtien));
               
    }//GEN-LAST:event_tbl_PhieuBanMouseClicked

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        Reset();
        showListHoaDon();
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    public void Reset()
    {
        cbx_TenNV.setSelectedIndex(0);
        cbx_TenKH.setSelectedIndex(0);
        cbx_TenMT.setSelectedIndex(0);
        txt_DonGia.setText("");
        txt_Soluong.setText("");
        txt_NgayLap.setText("");
        txt_NgayGiao.setText("");
        txt_TongTien.setText(String.valueOf(""));
        btn_Them.setEnabled(true);
        txt_DonGia.requestFocus();
    }
    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        resetTable();
        renderTable();
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void btn_ThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThanhToanActionPerformed
        
        int RemoveIndex = tbl_PhieuBan.getSelectedRow();
        if(RemoveIndex == -1)
        {
            JOptionPane.showMessageDialog(rootPane,"Bạn chưa chọn hóa đơn nào cả!");
        }
        else 
        {     
            PhieuBanHang pbh =list.get(RemoveIndex);  
            int reply = JOptionPane.showConfirmDialog(rootPane, "Chắc chắn muốn thanh toán hóa đơn : "+pbh.getMaHD()+" chứ ?","Xác nhận",JOptionPane.YES_NO_OPTION);
            if(reply==0)
            {     
                PhieuBanHang phieubh = list.get(tbl_PhieuBan.getSelectedRow());
                PhieuBanHangBL.ThanhToanHoaDon(pbh.getMaHD());                
                model.removeRow(RemoveIndex);    
                JOptionPane.showMessageDialog(rootPane, "Thanh toán thành công!");
                btn_LamMoiActionPerformed(evt);                    
                showListHoaDon();    
//                mahd = phieubh.getMaHD().toString().trim();
//                XuatPhieuBan pb = new XuatPhieuBan(null, rootPaneCheckingEnabled,mahd);
//                pb.setVisible(true);
            }
            else
                return;           
            
        }
    }//GEN-LAST:event_btn_ThanhToanActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
       this.dispose();
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_TongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TongTienActionPerformed
        double soluong = Double.valueOf(txt_Soluong.getText());
        double dongia = Double.valueOf(txt_DonGia.getText());
        
        double thanhtien = soluong*dongia;
        
        if(txt_DonGia.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Đơn giá đang để trống!");
            txt_DonGia.requestFocus();
        }
        else
        {
            if(txt_Soluong.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane,"Số lượng đang để trống!");
                txt_Soluong.requestFocus();
            }
            else
                txt_TongTien.setText(String.valueOf(thanhtien));            
        }
    }//GEN-LAST:event_btn_TongTienActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        
        String tennv = cbx_TenNV.getSelectedItem().toString();
        String tenkh = cbx_TenKH.getSelectedItem().toString();
        String tenmt = cbx_TenMT.getSelectedItem().toString();
        String dongia = txt_DonGia.getText();
        String soluong = txt_Soluong.getText();
        String ngaylap = txt_NgayLap.getText();
        String ngaygiao = txt_NgayGiao.getText();
        String tongtien = txt_TongTien.getText();
        
        if(txt_DonGia.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Đơn giá đang để trống!");
            txt_DonGia.requestFocus();
        }
        else
        {
            if(txt_Soluong.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane,"Số lượng đang để trống!");
                txt_Soluong.requestFocus();
            }
            else
            {
                if(txt_TongTien.equals(""))
                {
                    JOptionPane.showMessageDialog(rootPane,"Tổng tiền đang để trống!");
                    return ;
                }
                else
                {
                    if(txt_NgayLap.equals(""))
                    {
                        JOptionPane.showMessageDialog(rootPane,"Ngày Lập đang để trống!");
                        return ;
                    }
                    else
                    {
                        if(txt_NgayGiao.equals(""))
                        {
                            JOptionPane.showMessageDialog(rootPane,"Ngày Giao đang để trống!");
                            return ;
                        }
                        else
                        {
                            PhieuBanHang pbh = new PhieuBanHang(tennv, tenkh, tenmt, soluong, dongia, ngaylap, ngaygiao);
                            PhieuBanHangBL.ThemHoaDon(pbh);      
                            Reset();
                            JOptionPane.showMessageDialog(rootPane,"Thêm thành công!");
                            list.add(pbh);
                        }
                    }
                }
            }          
        }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void resetTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tbl_PhieuBan.getModel();
        dtm.setRowCount(0);
    }
    
    private void renderTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tbl_PhieuBan.getModel();
        PhieuBanHangBL nvbl = new PhieuBanHangBL();
        nvbl.search(txt_Tim.getText(), dtm);        
    }
    
    private void loadTenNhanVien()
    {
        ArrayList<String> list = PhieuBanHangBL.LoadDataNhanVien();
        for(String nhanvien : list)
        {
            cbx_TenNV.addItem(nhanvien.toString());            
        }
    }
    
    private void loadTenMayTinh()
    {
        ArrayList<String> list = PhieuBanHangBL.LoadDataMayTinh();
        for(String maytinh : list)
        {
            cbx_TenMT.addItem(maytinh.toString());            
        }
    }
    
    private void loadTenKhachHang()
    {
        ArrayList<String> list = PhieuBanHangBL.LoadDataKhachHang();
        for(String khachhang : list)
        {
            cbx_TenKH.addItem(khachhang.toString());            
        }
    }
    
    public void showListHoaDon()
    {                
        list = PhieuBanHangBL.showData();
        model.setRowCount(0);
        for(PhieuBanHang pbh : list)
        {
            model.addRow(new Object[]{
                pbh.getMaHD(),pbh.getTenNV(),pbh.getTenKH(),pbh.getTenMT(),pbh.getSoLuong(),pbh.getDonGia(),Integer.parseInt(pbh.getSoLuong())*Integer.parseInt(pbh.getDonGia())
            });            
        }
    }  
    
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
            java.util.logging.Logger.getLogger(ThongTinPhieuBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinPhieuBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinPhieuBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinPhieuBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongTinPhieuBan dialog = new ThongTinPhieuBan(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_ThanhToan;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_TongTien;
    private javax.swing.JComboBox<String> cbx_TenKH;
    private javax.swing.JComboBox<String> cbx_TenMT;
    private javax.swing.JComboBox<String> cbx_TenNV;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_PhieuBan;
    private javax.swing.JTextField txt_DonGia;
    private javax.swing.JTextField txt_NgayGiao;
    private javax.swing.JTextField txt_NgayLap;
    private javax.swing.JTextField txt_Soluong;
    private javax.swing.JTextField txt_Tim;
    private javax.swing.JTextField txt_TongTien;
    // End of variables declaration//GEN-END:variables
}
