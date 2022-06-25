package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    JPanel body = new JPanel();
    JPanel header = new JPanel();
    JPanel main = new JPanel();
    JPanel footer =new JPanel();

    JLabel m1 = new JLabel("MENU");
    JLabel m2 = new JLabel("1 - Add new person");
    JLabel m3 = new JLabel("2 - Find person");
    JLabel m4 = new JLabel("3 - Update person");
    JLabel m5 = new JLabel("4 - Delete person");


    JTextField choice = new JTextField();

    JButton Menu = new JButton("MENU");
    JButton GO = new JButton("GO");
    JButton Add = new JButton("ADD");
    JButton Find = new JButton("FIND");
    JButton Update = new JButton("UPDATE");
    JButton Delete = new JButton("DELETE");;

    public Menu(){
        Add.setOpaque(true);
        Add.setForeground(Color.RED);
        Add.setBackground(Color.BLACK);



        main.setLayout(new GridLayout(3,1));

        header.setSize(100,20);


        footer.setLayout(new GridLayout(1,6));
        body.setLayout(new GridLayout(7,1));
        //body.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        header.add(m1);
        //body.add(m1,BorderLayout.NORTH);
        body.add(m2);

        body.add(m3);

        body.add(m4);

        body.add(m5);

        body.add(choice);
        footer.add(Add);
        footer.add(Find);
        footer.add(Update);
        footer.add(Delete);
        footer.add(Menu);
        footer.add(GO);
        //setContentPane(body);
        main.add(header,BorderLayout.CENTER);
        main.add(body);
        main.add(footer);

        add(main);
        // add(header);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setSize(600,600);
        setResizable(false);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
