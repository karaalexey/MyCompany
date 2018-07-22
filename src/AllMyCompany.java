import javax.swing.*;


public class AllMyCompany extends javax.swing.JFrame {

    public AllMyCompany() {
        initComponents();

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        JLabel jLabel1 = new JLabel("All My Company"), jLabel2 = new JLabel("About your Company");
        JLabel jLabel3 = new JLabel("by @Kara");
        JButton jButton1 = new JButton("LogOut"), jButton2 = new JButton("Add new Company");
        JButton jButton3 = new JButton("Edit Company"), jButton4 = new JButton("Del Company");
        JButton jButton5 = new JButton("Show Workmates of this Company");

        JComboBox jComboBox1 = new JComboBox<>(new String[]{});

        JScrollPane jScrollPane1 = new JScrollPane();
        JTextArea jTextArea1 = new JTextArea();


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("My Company");
        setSize(800, 600);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 8));

        jButton1.setActionCommand("out");
        jButton2.setActionCommand("AddnewCompany");
        jButton3.setActionCommand("EditCompany");
        jButton4.setActionCommand("DelCompany");
        jButton5.setActionCommand("ShowWorkmates ");


        jScrollPane1.setToolTipText("Description");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\nDescription");
        jScrollPane1.setViewportView(jTextArea1);

/*
        jButton5.setMaximumSize(new java.awt.Dimension(259, 35));
        jButton5.setMinimumSize(new java.awt.Dimension(232, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
*/
        pack();
    }

//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
//      }



