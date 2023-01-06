package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu  implements ActionListener , UiCast{


    private static UiCast ui;
    JFrame frame = new JFrame();
    JLabel m1 = new JLabel("MENU");
    JLabel m2 = new JLabel("Add person");
    JLabel m3 = new JLabel("Find person");
    JLabel m4 = new JLabel("Update person");
    JLabel m5 = new JLabel("Delete person");






    JButton Menu = new JButton("MENU");

    JButton Add = new JButton("ADD");
    JButton Find = new JButton("FIND");
    JButton Update = new JButton("UPDATE");
    JButton Delete = new JButton("DELETE");
    public void addCast(){
        ui = new AddUser();
    }

    public void createMenu(){
        frame.setTitle("MENU");
        JPanel body = new JPanel(){
            @Override
            public Dimension getPreferredSize(){

                return new Dimension(600,600);
            }
        };
        body.setLayout(null);
        Add.setOpaque(true);

        Add.setForeground(Color.WHITE);
        Add.setBackground(Color.RED);

        Find.setForeground(Color.WHITE);
        Find.setBackground(Color.RED);

        Update.setForeground(Color.WHITE);
        Update.setBackground(Color.RED);

        Delete.setForeground(Color.WHITE);
        Delete.setBackground(Color.RED);

        body.setBackground(Color.BLACK);

        JLabel line = new JLabel();
        line.setOpaque(true);
        line.setBackground(Color.RED);

        JLabel endline = new JLabel();
        endline.setOpaque(true);
        endline.setBackground(Color.RED);


        line.setBounds(1,10,250,20);
        endline.setBounds(1,260,599,20);


        //Labels bounds
        m1.setBounds(250,10,600,20);
        m1.setOpaque(true);
        m1.setBackground(Color.RED);
        m1.setForeground(Color.WHITE);

        m2.setOpaque(true);


        m3.setOpaque(true);

        m4.setOpaque(true);

        m5.setOpaque(true);


        m2.setBounds(160,50,120,20);
        m3.setBounds(160,100,120,20);
        m4.setBounds(160,150,120,20);
        m5.setBounds(160,200,120,20);


        //Buttons bounds
//
        Add.setBounds(290,50,120,20);
        Find.setBounds(290,100,120,20);
        Update.setBounds(290,150,120,20);
        Delete.setBounds(290,200,120,20);


        //TextFields bounds







        body.add(line);
        body.add(endline);
        body.add(m1);
        body.add(m2);
        body.add(m3);
        body.add(m4);
        body.add(m5);

        body.add(Add);
        body.add(Find);
        body.add(Update);
        body.add(Delete);
        body.add(Menu);




        frame.add(body);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(600,600);
        frame.setResizable(false);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton action = (JButton) e.getSource();
        if(action.equals(Add)){
            addCast();
        }else if (action.equals(Find)){

        }
    }

}
