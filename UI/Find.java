package UI;

import javax.swing.*;
import java.awt.*;

public class Find extends JFrame implements UiCast{
    JLabel m1 = new JLabel("Finding Service.Student");
    JLabel m2 = new JLabel("Id: ");

    JTextField N = new JTextField();

    JTextField choice = new JTextField();
    JButton Menu = new JButton("MENU");
    JButton f = new JButton("Find");


    public Find(){
        setTitle("FIND USER");
        JPanel body = new JPanel(){
            @Override
            public Dimension getPreferredSize(){

                return new Dimension(600,600);
            }
        };
        body.setLayout(null);

//        body.setBackground(Color.DARK_GRAY);

        JLabel line = new JLabel();
        line.setOpaque(true);
        line.setBackground(Color.RED);

        JLabel line2 = new JLabel();
        line2.setOpaque(true);
        line2.setBackground(Color.RED);

        JLabel line3 = new JLabel();
        line3.setOpaque(true);
        line3.setBackground(Color.RED);

        line.setBounds(1,10,250,20);
        line2.setBounds(1,350,250,20);
        line3.setBounds(305,350,295,20);

        //Labels bounds
        m1.setBounds(250,10,600,20);
        m1.setOpaque(true);
        m1.setBackground(Color.RED);
        m1.setForeground(Color.WHITE);

        m2.setOpaque(true);
        m2.setBounds(10,50,120,20);


        //Buttons bounds
        Menu.setBounds(110,450,200,20);



        //TextFields bounds
        N.setBounds(140,50,120,20);

        choice.setBounds(510,380,60,150);





        body.add(line);
        body.add(line2);
        body.add(line3);
        body.add(m1);
        body.add(m2);
        body.add(N);
        body.add(choice);
        body.add(Menu);

        //setContentPane(body);



        add(body);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setSize(600,600);
        setResizable(false);
        setVisible(true);

    }
}
