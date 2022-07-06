package view;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Phong;
import service.IPhongService;
import service.implement.PhongServiceImplement;

public class PhongUI extends javax.swing.JFrame {

    private DefaultComboBoxModel cbb;
    private DefaultTableModel dtm;
    private IPhongService listPhong = new PhongServiceImplement();

    public PhongUI() {
        initComponents();
        ArrayList<Phong> list = listPhong.getList();
        loadData(list);
        addCbb();
        clearForm();
    }

    private void clearForm() {
        this.txtSoPhong.setText("");
        this.cbbKhuVuc.setSelectedIndex(0);
        this.rdoPhongDon.setSelected(true);
    }

    private void addCbb() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hà Nội");
        list.add("Thái Bình");
        list.add("Nam Định");
        cbb = (DefaultComboBoxModel) cbbKhuVuc.getModel();
        for (String x : list) {
            cbb.addElement(x);
        }
    }

    private void loadData(ArrayList<Phong> list) {
        dtm = (DefaultTableModel) tblPhong.getModel();
        dtm.setRowCount(0);
        for (Phong phong : list) {
            dtm.addRow(new Object[]{
                phong.getSoPhong(),
                phong.getKhuVuc(),
                phong.isLoaiPhong() == true ? "Phòng Đơn" : "Phòng Kép"
            });
        }
    }

    private Phong getData() {
        String soPhong = txtSoPhong.getText();
        String khuVuc = cbbKhuVuc.getSelectedItem().toString();
        Boolean loaiPhong = null;
        
        int chon = cbbKhuVuc.getSelectedIndex();
        if (chon == 0) {
            loaiPhong = true;
        }
        else if (chon == 1) {
            loaiPhong = false;
        }
        else if (chon == 2) {
            loaiPhong = true;
        }
        
        if(soPhong.trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        
        
        Phong phong = new Phong(soPhong, khuVuc, loaiPhong);
        return phong;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoPhong = new javax.swing.JTextField();
        rdoPhongDon = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        rdoPhongKep = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhong = new javax.swing.JTable();
        cbbKhuVuc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản Lý Phòng");

        jLabel2.setText("Số Phòng");

        jLabel3.setText("Khu Vực");

        jLabel4.setText("Loại Phòng");

        buttonGroup1.add(rdoPhongDon);
        rdoPhongDon.setText("Phòng Đơn");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoPhongKep);
        rdoPhongKep.setText("Phòng Kép");

        tblPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số Phòng", "Khu Vực", "Loại Phòng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhong);

        cbbKhuVuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKhuVucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoPhongDon)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoPhongKep)
                                        .addGap(30, 30, 30)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSoPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(cbbKhuVuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(75, 75, 75)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(14, 14, 14)))))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnSua)
                    .addComponent(cbbKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdoPhongDon)
                    .addComponent(btnXoa)
                    .addComponent(rdoPhongKep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        Phong phong = this.getData();
        if(phong == null){
            return;
        }
        this.listPhong.insert(phong);
        loadData(listPhong.getList());
        clearForm();
        JOptionPane.showMessageDialog(this, "Thêm thành công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        Phong phong = this.getData();
        if(phong == null){
            return;
        }
        int row = tblPhong.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn một dòng trên Table");
        }
        else if (listPhong.update(row, phong)) {
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            loadData(listPhong.getList());
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tblPhong.getSelectedRow();
        Phong phong = listPhong.getList().get(row);
        
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn một dòng trên Table");
        }
        
        int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ?");
        if (chon == JOptionPane.CANCEL_OPTION) {
            return;
        } else if (chon == JOptionPane.NO_OPTION) {
            return;
        }
        
        if (listPhong.delete(row)) {
            loadData(listPhong.getList());
        } else {
            JOptionPane.showMessageDialog(this, "Xoá thất bại");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongMouseClicked
        int row = tblPhong.getSelectedRow();
        if(row == -1){
            return;
        }
        this.txtSoPhong.setText(tblPhong.getValueAt(row, 0).toString());
        this.cbbKhuVuc.setSelectedItem(tblPhong.getValueAt(row, 1).toString());
        if (tblPhong.getValueAt(row, 2).toString().equals("Phòng Đơn")) {
            rdoPhongDon.setSelected(true);
        }
        else{
            rdoPhongKep.setSelected(true);
        }
    }//GEN-LAST:event_tblPhongMouseClicked

    private void cbbKhuVucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKhuVucActionPerformed
        int chon = cbbKhuVuc.getSelectedIndex();
        if (chon == 0) {
            rdoPhongDon.setSelected(true);
        }
        else if (chon == 1) {
            rdoPhongKep.setSelected(true);
        }
        else if (chon == 2) {
            rdoPhongDon.setSelected(true);
        }
    }//GEN-LAST:event_cbbKhuVucActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhongUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbKhuVuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoPhongDon;
    private javax.swing.JRadioButton rdoPhongKep;
    private javax.swing.JTable tblPhong;
    private javax.swing.JTextField txtSoPhong;
    // End of variables declaration//GEN-END:variables
}
