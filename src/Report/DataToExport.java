package Report;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataToExport extends javax.swing.JFrame {

    private JFileChooser FileChooser=new JFileChooser(); 
    Vector columna = new Vector(); 
    Vector filas = new  Vector();  
    static int tabla_ancho = 0; 
    static int tabla_alto = 0; 
    
    UploadData u = new UploadData(); //Para usar los métodos de carga de tabla
    
    public DataToExport() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
//        u.UploadDataAsset(this);
        //Cargar la table de acuerdo al tipo de reporte que se selecciona
    }

    public JTable getTblData() {
        return tblData;
    }

    public void setTblData(JTable tblData) {
        this.tblData = tblData;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogSearch = new javax.swing.JDialog();
        fldPath = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnSaveFile = new javax.swing.JButton();
        btnCancelDialog = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnExport = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        DialogSearch.setTitle("Exportar Datos");

        btnBrowse.setText("Buscar");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnSaveFile.setText("Guardar");
        btnSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFileActionPerformed(evt);
            }
        });

        btnCancelDialog.setText("Cancelar");
        btnCancelDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogSearchLayout = new javax.swing.GroupLayout(DialogSearch.getContentPane());
        DialogSearch.getContentPane().setLayout(DialogSearchLayout);
        DialogSearchLayout.setHorizontalGroup(
            DialogSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogSearchLayout.createSequentialGroup()
                .addGroup(DialogSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(DialogSearchLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveFile)
                        .addGap(26, 26, 26)
                        .addComponent(btnCancelDialog))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DialogSearchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fldPath, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBrowse)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        DialogSearchLayout.setVerticalGroup(
            DialogSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogSearchLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(DialogSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(DialogSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveFile)
                    .addComponent(btnCancelDialog))
                .addGap(31, 31, 31))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblData);

        btnExport.setText("Exportar");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExport)
                    .addComponent(btnClose))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(this);

        if(opcion == JFileChooser.APPROVE_OPTION){

            File dir = dialog.getSelectedFile();
            String fl = dir.toString();

            this.fldPath.setText(fl);
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFileActionPerformed
        try {      	 
            List<JTable> tb = new ArrayList<JTable>();
            tb.add(this.tblData);
           
            Export excelExporter = new Export(tb, new File(this.fldPath.getText()+".xls"));
            if (excelExporter.export()) {
                JOptionPane.showMessageDialog(null, "Documento generado con éxito!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        llama_excel();
        this.DialogSearch.dispose();
    }//GEN-LAST:event_btnSaveFileActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        this.llamarJDialogExcel();
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCancelDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelDialogActionPerformed
        this.DialogSearch.dispose();
    }//GEN-LAST:event_btnCancelDialogActionPerformed

    private void llamarJDialogExcel() {
        this.DialogSearch.setLocationRelativeTo(null);
        this.DialogSearch.setModal(true);
        this.DialogSearch.setMinimumSize(new Dimension(393, 190));
        this.DialogSearch.setTitle("Exportar a Excel");
        this.DialogSearch.setVisible(true);
    }
    
    public void llama_excel() {
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+this.fldPath.getText()+".xls");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void CrearTabla(File file) throws IOException {
		
        Workbook workbook = null;

        try { 
            workbook = Workbook.getWorkbook(file); 	

            Sheet sheet = workbook.getSheet(0); 
            columna.clear(); 

            for (int i = 0; i < sheet.getColumns(); i++) { 
                Cell cell1 = sheet.getCell(i, 0);
                columna.add(cell1.getContents()); 
            } 
            filas.clear(); 

            for (int j = 1; j < sheet.getRows(); j++) {
                Vector d = new Vector(); 
                for (int i = 0; i < sheet.getColumns(); i++) {

                        Cell cell = sheet.getCell(i, j); 
                        d.add(cell.getContents());
                }
                d.add("\n");
                filas.add(d); 
            } 
        } catch (BiffException e) { 
            e.printStackTrace(); 
        }
    }
    
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
            java.util.logging.Logger.getLogger(DataToExport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataToExport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataToExport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataToExport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataToExport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogSearch;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCancelDialog;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnSaveFile;
    private javax.swing.JTextField fldPath;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}
