import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.border.EmptyBorder;


public class Registration extends JPanel {


    private JTextField login = new JTextField(); //name = new JTextField();
    private JPasswordField password = new JPasswordField();
    private JButton singup = new JButton("SignUp"), log = new JButton("Back to Login");


    public Registration(){
        setSize(800, 600);
        setLayout(null);
        //name.setBounds(250, 200, 300, 30);
        login.setBounds(250,100, 300, 30);
        password.setBounds(250,150, 300,30);
        singup.setBounds(250,250,300,30);
        singup.setMnemonic(KeyEvent.VK_ENTER);
        log.setBounds(250,300,300,30);
        log.setBorder(new EmptyBorder(0,0,0,0));
        log.setForeground(Color.RED);

        add(login);
        add(password);
        add(singup);
        add(log);




        singup.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    ResultSet result;
                    result = loginPassword.statement.executeQuery("SELECT idautent " + "FROM autent" +
                            " WHERE username=\'" + login.getText() + "\'" );
                    if(login.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Invalid Data");
                    else if(password.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Invalid Data");
                    else if(!result.next()) {
                        loginPassword.statement.executeUpdate("INSERT INTO autent (username, password) VALUES(\'" + login.getText() + "\', \'" + password.getText() + "\')");
                        JOptionPane.showMessageDialog(null, "Congratulations! You have successfully registered");
                    }else {
                        JOptionPane.showMessageDialog(null, "User with the same login has been registered!");
                    }
                    //if()JOptionPane.showMessageDialog(null, "Invalid Data");
                    //}else if(password == null) JOptionPane.showMessageDialog(null, "Invalid Data");

                } catch (SQLException e1) { e1.printStackTrace(); }
            }
        });

        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPassword.layout.show(loginPassword.mainPanel, "Login");

            }
        });



    }


}
