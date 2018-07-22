import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Company extends JPanel {

    private static JTextField MC = new JTextField("All My Company");
    private JButton out = new JButton("Exit");

    public Company(){
        setSize(800, 600);
        setLayout(null);

        Font SmallFont = new Font("TimesRoman", Font.BOLD, 10);

        MC.setBounds(20,30, 150,30);
        out.setBounds(10,10,45,25);
        out.setFont(SmallFont);


        add(MC);
        add(out);

        out.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPassword.layout.show(loginPassword.mainPanel, "Login");

            }
        });

    }

}
