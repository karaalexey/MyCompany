import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.border.EmptyBorder;

public class Login extends JPanel {

    private JTextField login = new JTextField();
    private JPasswordField password = new JPasswordField();
    private JButton singin = new JButton("Login");


    private JButton reg = new JButton("New SignUp");



    public Login(){
        setSize(800,600);
        setLayout(null);


        login.setBounds(250,100, 300, 30);
        password.setBounds(250,150, 300,30);
        singin.setBounds(250,250,300,30);
        singin.setMnemonic(KeyEvent.VK_ENTER);
        reg.setBounds(250,300,300,30);
        reg.setBorder(new EmptyBorder(0, 0, 0, 0));
        reg.setForeground(Color.RED);

        add(login);
        add(password);
        add(singin);
        add(reg);


        singin.addActionListener(new ActionListener() {



            public void actionPerformed (ActionEvent e) {



                singin.setMnemonic(KeyEvent.VK_ENTER);

                try {
                    ResultSet result = loginPassword.statement.executeQuery("SELECT idautent " +
                            "FROM autent" +
                            " WHERE username=\'" + login.getText() +
                            "\' AND password=\'" + password.getText() +"\'");
                    if(result.next()) {
                        //JOptionPane.showMessageDialog(null, "Your ID is " + result.getInt("idautent"));
                        loginPassword.layout.show(loginPassword.mainPanel, "Company");

                    } else JOptionPane.showMessageDialog(null, "Invalid Login or Password");

                } catch (SQLException e1) { e1.printStackTrace(); }

            }

        });

        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPassword.layout.show(loginPassword.mainPanel, "SignUp");

            }
        });


    }
}
