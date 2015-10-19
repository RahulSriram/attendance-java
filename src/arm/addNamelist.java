/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arm;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author rahul
 */
public class addNamelist extends javax.swing.JFrame {

	/**
	 * Creates new form addNamelist
	 */
	public addNamelist(addClass prev) {
		menu=prev;
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

        backbutton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        idinput = new javax.swing.JTextField();
        nameinput = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        namelabel = new javax.swing.JLabel();
        idlabel = new javax.swing.JLabel();
        tablescroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        applybutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        tablemodel = new javax.swing.table.DefaultTableModel(new String[]{"ID Number","Name"},0);
		idno = new ArrayList<String>();
		name = new ArrayList<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        backbutton.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        backbutton.setText("<");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Add Students");

		idinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idinputActionPerformed(evt);
            }
        });

        addbutton.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        addbutton.setText("+");
        addbutton.setPreferredSize(new java.awt.Dimension(30, 30));
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        
        deletebutton.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        deletebutton.setText("-");
        deletebutton.setPreferredSize(new java.awt.Dimension(30, 30));
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        namelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namelabel.setText("Name:");

        idlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idlabel.setText("ID Number:");

        table.setModel(tablemodel);
        table.getTableHeader().setReorderingAllowed(false);
        tablescroll.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
        }

        applybutton.setText("Next >");
        applybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applybuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablescroll)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(idlabel)
                        .addGap(18, 18, 18)
                        .addComponent(idinput, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(namelabel)
                        .addGap(18, 18, 18)
                        .addComponent(nameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(applybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(backbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idlabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addbutton)
                        .addComponent(namelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablescroll, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(applybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        setVisible(false);
        dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void idinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idinputActionPerformed
        idinput.setForeground(new java.awt.Color(49, 55, 57));
    }//GEN-LAST:event_idinputActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        String idip=idinput.getText();
        String nameip=nameinput.getText();
        List idexisting=new ArrayList(Arrays.asList(util.SQLQuery("ARM_config","SELECT IDNo FROM students")));
        
        if((!idno.contains(idip))&&(!idexisting.contains(idip)))
        {
        	idno.add(idip);
        	name.add(nameip);
        	String[] row=new String[]{idip,nameip};
			tablemodel.addRow(row);
			table.setModel(tablemodel);
       		idinput.setText("");
        	nameinput.setText("");
    	}
    	
    	else
    		idinput.setForeground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_addbuttonActionPerformed
    
    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        if(!idno.isEmpty())
        {
        	idno.remove(idno.size()-1);
        	name.remove(name.size()-1);
        	tablemodel.removeRow(idno.size());
        	table.setModel(tablemodel);
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void applybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applybuttonActionPerformed
        setVisible(false);
        addTimetable.main(this);
    }//GEN-LAST:event_applybuttonActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(addClass prev) {
		/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(addNamelist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(addNamelist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(addNamelist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(addNamelist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        //</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new addNamelist(prev).setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton applybutton;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField idinput;
    private javax.swing.JLabel idlabel;
    private javax.swing.JTextField nameinput;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tablescroll;
    private javax.swing.JLabel title;
    private javax.swing.table.DefaultTableModel tablemodel;
    public addClass menu;
    public List<String> idno;
    public List<String> name;
    // End of variables declaration//GEN-END:variables
}
