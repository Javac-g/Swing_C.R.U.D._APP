package UI;

import DataConnect.DbConnector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class AddUser extends JFrame implements ActionListener,UiCast {


   public JLabel m1 = new JLabel("Adding Student");
    JLabel m2 = new JLabel("Name: ");
    JLabel m9 = new JLabel("Second Name: ");
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

    JButton Add = new JButton("ADD");

    public AddUser(){
        setTitle("ADD USER");
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
        m9.setBounds(50,50,120,20);
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
        Menu.setBounds(10,450,200,20);
        Add.setBounds(10,380,200,20);



        //TextFields bounds
        N.setBounds(140,50,120,20);
        G.setBounds(140,100,120,20);
        I.setBounds(140,150,120,20);
        M.setBounds(140,200,120,20);
        H.setBounds(140,250,120,20);
        E.setBounds(140,300,120,20);
        choice.setBounds(510,380,60,150);


        m8.setOpaque(true);
        m9.setOpaque(true);
        m8.setForeground(Color.WHITE);
        m8.setBackground(Color.RED);
        Add.addActionListener(this);


        body.add(line);
        body.add(line2);
        body.add(line3);
        body.add(m1);
        body.add(m2);
        body.add(N);
        body.add(m3);
        body.add(m9);
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
    public void clearAll(){

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton action = (JButton) e.getSource();
        m1.setText("Adding Student");

        if (action.equals(Add)){
            System.out.println("Add");
            DbConnector db = new DbConnector();
            try {
                db.addUser(Integer.parseInt(I.getText()),
                                            N.getText(),"Nonamov",
                                            G.getText(),
                            Integer.parseInt(M.getText()),
                            Integer.parseInt(E.getText()),
                            Integer.parseInt(H.getText()));

            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

        }
        m1.setText("Saved");

    }
}
