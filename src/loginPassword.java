import javax.swing.*;
import java.awt.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class loginPassword extends JFrame {

    public static  Statement statement;

    public static CardLayout layout = new CardLayout();
    public static JPanel mainPanel = new JPanel();
//    public static JPanel aPanel = new JPanel();

    private loginPassword(){

        super("SignIn SignUp");

        setSize(800, 600);

        //add(new Login()); какаха
        //add(new Registration()); какаха

        mainPanel.setLayout(layout);
        mainPanel.add(new Login(), "Login");
        mainPanel.add(new Registration(), "SignUp");
        mainPanel.add(new Company(), "Company");
        //mainPanel.add(new)

//        aPanel.setLayout(layout);
//        aPanel.add(mainPanel, "Login");
//        add(aPanel);
        add(mainPanel);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        layout.show(mainPanel, "Login");

        try{
            statement = DriverManager.getConnection("JDBC:mysql://localhost:3306/boc", "root", "root").createStatement();
        }catch(SQLException e){e.printStackTrace();}
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            //@Override
            public void run() {
                new loginPassword();
                new AllMyCompany();
            }
        });

    }

}





