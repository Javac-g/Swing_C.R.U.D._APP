import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    //menu section
    JLabel m1 = new JLabel("Menu");
    JLabel m2 = new JLabel("1 - add");
    JLabel m3 = new JLabel("2 - find");
    JLabel m4 = new JLabel("3 - update");
    JLabel m5 = new JLabel("4 - delete");
    public void Menu(){
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        panel.setLayout(new GridLayout(5,1));

        add(new Label("Menu"));
        add(new Label("1 - add"));
        add(new Label("1 - find"));
        add(new Label("1 - update"));
        add(new Label("1 - delete"));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
