import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel body = new JPanel();
    JPanel header = new JPanel();
    JPanel main = new JPanel();
    JPanel footer =new JPanel();

    //body    section
    JLabel m1 = new JLabel("Menu");
    JLabel m2 = new JLabel("1 - add");
    JLabel m3 = new JLabel("2 - find");
    JLabel m4 = new JLabel("3 - update");
    JLabel m5 = new JLabel("4 - delete");
    public void Menu(){
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);

        main.setLayout(new BorderLayout());

        header.setBorder(BorderFactory.createLineBorder(Color.RED));

        header.setLayout(new FlowLayout(FlowLayout.CENTER));

        body.setLayout(new GridLayout(4,1));
        body.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        header.add(m1);

        body.add(m2);
        body.add(m3);
        body.add(m4);
        body.add(m5);
        main.add(header,BorderLayout.CENTER);
        main.add(body,BorderLayout.WEST);
        frame.add(main);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
