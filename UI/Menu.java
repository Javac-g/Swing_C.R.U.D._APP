package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {



    JLabel m1 = new JLabel("MENU");
    JLabel m2 = new JLabel("1 - AddUser new person");
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
        setTitle("MENU");
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


        m2.setBounds(10,50,120,20);
        m3.setBounds(10,100,120,20);
        m4.setBounds(10,150,120,20);
        m5.setBounds(10,200,120,20);


        //Buttons bounds
        Menu.setBounds(110,450,200,20);
        Add.setBounds(10,380,200,20);
        Find.setBounds(10,410,200,20);
        Update.setBounds(220,380,200,20);
        Delete.setBounds(220,410,200,20);
        GO.setBounds(440,380,60,150);


        //TextFields bounds

        choice.setBounds(510,380,60,150);





        body.add(line);
        body.add(line2);
        body.add(line3);
        body.add(m1);
        body.add(m2);
        body.add(m3);
        body.add(m4);
        body.add(m5);
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
