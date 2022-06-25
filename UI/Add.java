package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add extends JFrame implements ActionListener {
    JPanel body = new JPanel();
    JPanel header = new JPanel();
    JPanel main = new JPanel();
    JPanel footer =new JPanel();
    JLabel m1 = new JLabel("Adding new Student");
    JLabel m2 = new JLabel("Name: ");
    JLabel m3 = new JLabel("Group: ");
    JLabel m4 = new JLabel("ID: ");
    JLabel m5 = new JLabel("Math Grade: ");
    JLabel m6 = new JLabel("History Grade: ");
    JLabel m7 = new JLabel("English Grade: ");
    JLabel m8 = new JLabel("Enter Menu ");
    JTextField N = new JTextField();
    JTextField G = new JTextField();
    JTextField I = new JTextField();
    JTextField M = new JTextField();
    JTextField H = new JTextField();
    JTextField E = new JTextField();
    JTextField choice = new JTextField();
    JButton Menu = new JButton("MENU");

    JButton GO = new JButton("GO");
    JButton Add = new JButton("ADD");
    JButton Find = new JButton("FIND");
    JButton Update = new JButton("UPDATE");
    JButton Delete = new JButton("DELETE");;
    public Add(){



        main.setLayout(new GridLayout(3,1));

        header.setSize(100,20);


        footer.setLayout(new GridLayout(1,6));
        body.setLayout(new GridLayout(7,1));
        //body.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        header.add(m1);
        //body.add(m1,BorderLayout.NORTH);
        body.add(m2,BorderLayout.WEST);
        body.add(N,BorderLayout.CENTER);
        body.add(m3,BorderLayout.WEST);
        body.add(G);
        body.add(m4,BorderLayout.WEST);
        body.add(I);
        body.add(m5,BorderLayout.WEST);
        body.add(M);
        body.add(m6,BorderLayout.WEST);
        body.add(H);
        body.add(m7);
        body.add(E);
        body.add(m8);
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
