/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFrameMain.java
 *
 * Created on 25-lug-2011, 10.15.23
 */
package exman.main.view;

import exman.main.controller.ControllerJFrameMain;
import hw2.common.MyCommonMethods;
import java.io.File;
import javax.swing.JFileChooser;


/**
 *
 * @author giuseppe
 */
public class JFrameMain extends javax.swing.JFrame {
    
    private static ControllerJFrameMain instance;
    JFileChooser chooser;

    /** Creates new form JFrameMain */
    public JFrameMain(ControllerJFrameMain instance) {
        this.instance = instance;
        initComponents();
        initialize();

    }
    
    /**
     * Initialize the class.
     */
    private void initialize() {
            // ** inizializzazioni necessarie per visual editor eclipse **
            setContentPane(jPanelContainer);
            setSize(new java.awt.Dimension(800, 600));
            setPreferredSize(getSize());
            MyCommonMethods.setWindowCenterPosition(this);
            // ** **
            
            setTitle("JExtension Manager");

            /*for (SharedDefines.emJava_ver L: SharedDefines.emJava_ver.values()) {
                jComboBoxVerSelector.addItem(L.version);
            }
            
            for (SharedDefines.emJava_ext L: SharedDefines.emJava_ext.values()) {
                jComboBoxVerSelector.addItem(L.type);
            }*/
            
            jTableDBList.setModel(instance.tableModelDatabases);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanelContainer = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelTab1 = new javax.swing.JPanel();
        jTextFieldConfPath = new javax.swing.JTextField();
        jTextFieldOutputPath = new javax.swing.JTextField();
        jButtonXmlFC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxZip = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButtonExport = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDBList = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButtonLoadTables = new javax.swing.JButton();
        jTextFieldXmlPath = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonSaveFC = new javax.swing.JButton();
        jButtonConfFC1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanelTab2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        jPanelContainer.setMinimumSize(new java.awt.Dimension(640, 480));
        jPanelContainer.setName("JPanelContainer"); // NOI18N
        jPanelContainer.setLayout(new java.awt.BorderLayout());

        jPanelTab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldConfPath.setText("/home/giuseppe/WORKSPACE/works-www/joomlacms/sorgenti/branches_latest/hw2/configuration.php");
        jTextFieldConfPath.setEnabled(false);
        jPanelTab1.add(jTextFieldConfPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 20));

        jTextFieldOutputPath.setText("/home/giuseppe/Scrivania/WORKS_TEMP/comtest");
        jTextFieldOutputPath.setName("jTextFieldOutputPath"); // NOI18N
        jTextFieldOutputPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOutputPathActionPerformed(evt);
            }
        });
        jPanelTab1.add(jTextFieldOutputPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 150, 20));

        jButtonXmlFC.setText("...");
        jButtonXmlFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXmlFCActionPerformed(evt);
            }
        });
        jPanelTab1.add(jButtonXmlFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 60, 20));

        jLabel1.setText("Save In:");
        jPanelTab1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jCheckBoxZip.setSelected(true);
        jCheckBoxZip.setText("Zip the folder");
        jCheckBoxZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxZipActionPerformed(evt);
            }
        });
        jPanelTab1.add(jCheckBoxZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel4.setText("Site conf. file");
        jPanelTab1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jButtonExport.setText("Export");
        jButtonExport.setEnabled(false);
        jButtonExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportActionPerformed(evt);
            }
        });
        jPanelTab1.add(jButtonExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelTab1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        jTableDBList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Table list"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDBList.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTableDBList);
        jTableDBList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableDBList.getColumnModel().getColumn(0).setResizable(false);

        jPanelTab1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 280, 290));

        jLabel5.setText("Export tables:");
        jPanelTab1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        jButtonLoadTables.setText("Load Conf");
        jButtonLoadTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadTablesActionPerformed(evt);
            }
        });
        jPanelTab1.add(jButtonLoadTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 110, -1));

        jTextFieldXmlPath.setText("/home/giuseppe/WORKSPACE/works-www/joomlacms/sorgenti/branches_latest/hw2/administrator/components/com_jce/jce.xml");
        jPanelTab1.add(jTextFieldXmlPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, -1));

        jLabel6.setText("Manifest (xml) file");
        jPanelTab1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jButtonSaveFC.setText("...");
        jButtonSaveFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveFCActionPerformed(evt);
            }
        });
        jPanelTab1.add(jButtonSaveFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 60, 20));

        jButtonConfFC1.setText("...");
        jButtonConfFC1.setEnabled(false);
        jButtonConfFC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfFC1ActionPerformed(evt);
            }
        });
        jPanelTab1.add(jButtonConfFC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 60, 20));

        jCheckBox1.setText("Custom");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanelTab1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTabbedPane1.addTab("Export", jPanelTab1);

        jPanelTab2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable2);

        jPanel1.add(jScrollPane4);

        jScrollPane3.setViewportView(jPanel1);

        jPanelTab2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 466));

        jTabbedPane1.addTab("tab2", jPanelTab2);

        jPanelContainer.add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);
        jTabbedPane1.getAccessibleContext().setAccessibleName("tab1");

        getContentPane().add(jPanelContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonXmlFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXmlFCActionPerformed
        chooser = new JFileChooser();
        String path = jTextFieldXmlPath.getText().isEmpty() ? "." : jTextFieldXmlPath.getText();
        chooser.setCurrentDirectory(new java.io.File(path));
        chooser.setDialogTitle("Select where the root path..");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        //    
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
           jTextFieldXmlPath.setText(chooser.getSelectedFile().getPath());
           jButtonExport.setEnabled(false);
           
           if (!jCheckBox1.isSelected()) {
               String confPath = MyCommonMethods.getParentDirectory(jTextFieldXmlPath.getText(), 4)+File.separator+"configuration.php";
               jTextFieldConfPath.setText(confPath);
           }
           
        } else {
            System.out.println("No Selection ");
        }
    }//GEN-LAST:event_jButtonXmlFCActionPerformed

    private void jTextFieldOutputPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOutputPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOutputPathActionPerformed

    private void jButtonExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportActionPerformed
        String xmlPath = jTextFieldXmlPath.getText();
        String outPath = jTextFieldOutputPath.getText();
        boolean isZip = jCheckBoxZip.isSelected();
        instance.export(xmlPath, outPath, isZip);
    }//GEN-LAST:event_jButtonExportActionPerformed

    private void jCheckBoxZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxZipActionPerformed

    private void jButtonLoadTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadTablesActionPerformed
        instance.loadInfo(jTextFieldXmlPath.getText(),jTextFieldConfPath.getText());
    }//GEN-LAST:event_jButtonLoadTablesActionPerformed

    private void jButtonSaveFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveFCActionPerformed
        chooser = new JFileChooser();
        String path = jTextFieldOutputPath.getText().isEmpty() ? "." : jTextFieldOutputPath.getText();
        chooser.setCurrentDirectory(new java.io.File(path));
        chooser.setDialogTitle("Select where to save..");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        //    
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
           jTextFieldOutputPath.setText(chooser.getSelectedFile().getPath());
        } else {
            System.out.println("No Selection ");
        }
    }//GEN-LAST:event_jButtonSaveFCActionPerformed

    private void jButtonConfFC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfFC1ActionPerformed
        chooser = new JFileChooser();
        String path = jTextFieldConfPath.getText().isEmpty() ? "." : jTextFieldConfPath.getText();
        chooser.setCurrentDirectory(new java.io.File(path));
        chooser.setDialogTitle("Select the site configuration file..");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        //    
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
           jTextFieldConfPath.setText(chooser.getSelectedFile().getPath());
           jButtonExport.setEnabled(false);
        } else {
            System.out.println("No Selection ");
        }
        
    }//GEN-LAST:event_jButtonConfFC1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        boolean sel = jCheckBox1.isSelected();
        jTextFieldConfPath.setEnabled(sel);
        jButtonConfFC1.setEnabled(sel);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        instance.tableModelDatabases.cleanList();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonConfFC1;
    public javax.swing.JButton jButtonExport;
    private javax.swing.JButton jButtonLoadTables;
    private javax.swing.JButton jButtonSaveFC;
    private javax.swing.JButton jButtonXmlFC;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBoxZip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel jPanelTab1;
    private javax.swing.JPanel jPanelTab2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public javax.swing.JTable jTableDBList;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldConfPath;
    private javax.swing.JTextField jTextFieldOutputPath;
    private javax.swing.JTextField jTextFieldXmlPath;
    // End of variables declaration//GEN-END:variables
}
