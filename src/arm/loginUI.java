/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arm;

/**
 *
 * @author rahul
 */
public class loginUI extends javax.swing.JFrame {

    /**
     * Creates new form loginUI
     */
    public loginUI(String ch,javax.swing.JFrame prev) {
        choice=ch;
        previous=prev;
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

        title = new javax.swing.JLabel();
        idinput = new javax.swing.JTextField();
        idlabel = new javax.swing.JLabel();
        passwordlabel = new javax.swing.JLabel();
        accept = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        passwordinput = new javax.swing.JPasswordField();
        notifier = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        title.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText(choice+" Login");

        idlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idlabel.setText("Username:");

        passwordlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordlabel.setText("Password:");

	passwordinput.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
		acceptActionPerformed(evt);
            }
        });

	accept.setText("Login");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        notifier.setForeground(new java.awt.Color(255, 0, 0));
        notifier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idinput)
                            .addComponent(passwordinput)))
                    .addComponent(notifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(accept)
                .addGap(48, 48, 48)
                .addComponent(cancel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idlabel))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notifier, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel)
                    .addComponent(accept))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {
    	setVisible(false);
		dispose();
    }                                      
    
    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        String idno=idinput.getText();
        String password=new String(passwordinput.getPassword());
        String table=new String(choice).toLowerCase();
		boolean available=false;
        String[] list=util.SQLQuery("ARM_config","SELECT IDNo FROM "+table);
        
    	for(int i=0;i<list.length;i++)
        	if(idno.equals(list[i]))
           	{
               	available=true;
                break;
            }
		
        if(available)
        {
        	if(password.equals(util.SQLQuery("ARM_config","SELECT Password FROM "+table+" WHERE IDNo='"+idno+"'")[0]))
            {
        	   	previous.setVisible(false);
               	previous.dispose();
               	setVisible(false);
				dispose();
				
				if(table.equals("staff"))
					staffMenuUI.main(util.SQLQuery("ARM_config","SELECT Class FROM staff WHERE IDNo='"+idno+"'"));
            
            	else
            		adminMenuUI.main(null);
            }
            
            else
                notifier.setText("Invalid Username or Password");
        }
            
        else
            notifier.setText("Invalid Username or Password");
    }//GEN-LAST:event_acceptActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String ch,javax.swing.JFrame prev) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
        	util.setLookAndFeel();
	} catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginUI(ch,prev).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField idinput;
    private javax.swing.JLabel idlabel;
    private javax.swing.JLabel notifier;
    private javax.swing.JPasswordField passwordinput;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JLabel title;
    private String choice;
    private javax.swing.JFrame previous;
    // End of variables declaration//GEN-END:variables
}
