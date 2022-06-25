package UI;

import javafx.scene.text.FontWeight;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add extends JFrame implements ActionListener {


    JLabel m1 = new JLabel("Adding new Student");
    JLabel m2 = new JLabel("Name: ");
    JLabel m3 = new JLabel("Group: ");
    JLabel m4 = new JLabel("ID: ");
    JLabel m5 = new JLabel("Math Grade: ");
    JLabel m6 = new JLabel("History Grade: ");
    JLabel m7 = new JLabel("English Grade: ");
    JLabel m8 = new JLabel(" Controls ");
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

        JPanel body = new JPanel(){
            @Override
            public Dimension getPreferredSize(){

                return new Dimension(600,600);
            }
        };
        body.setLayout(null);
        Add.setOpaque(true);
        Add.setForeground(Color.RED);
        Add.setBackground(Color.BLACK);
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

        m3.setOpaque(true);

        m4.setOpaque(true);

        m5.setOpaque(true);

        m6.setOpaque(true);

        m7.setOpaque(true);

        m8.setBackground(Color.RED);
        m2.setBounds(10,50,120,20);
        m3.setBounds(10,100,120,20);
        m4.setBounds(10,150,120,20);
        m5.setBounds(10,200,120,20);
        m6.setBounds(10,250,120,20);
        m7.setBounds(10,300,120,20);
        m8.setBounds(250,350,55,20);

        //Buttons bounds
        Menu.setBounds(110,450,200,20);
        Add.setBounds(10,380,200,20);
        Find.setBounds(10,410,200,20);
        Update.setBounds(220,380,200,20);
        Delete.setBounds(220,410,200,20);
        GO.setBounds(440,380,60,150);


        //TextFields bounds
        N.setBounds(140,50,120,20);
        G.setBounds(140,100,120,20);
        I.setBounds(140,150,120,20);
        M.setBounds(140,200,120,20);
        H.setBounds(140,250,120,20);
        E.setBounds(140,300,120,20);
        choice.setBounds(510,380,60,150);


        m8.setOpaque(true);
        m8.setForeground(Color.WHITE);
        m8.setBackground(Color.RED);


        body.add(line);
        body.add(line2);
        body.add(line3);
        body.add(m1);
        body.add(m2);
        body.add(N);
        body.add(m3);
        body.add(G);
        body.add(m4);
        body.add(I);
        body.add(m5);
        body.add(M);
        body.add(m6);
        body.add(H);
        body.add(m7);
        body.add(E);
        body.add(m8);
        body.add(choice);
        body.add(Add);
        body.add(Find);
        body.add(Update);
        body.add(Delete);
        body.add(Menu);
        body.add(GO);
        //setContentPane(body);



        add(body);

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
