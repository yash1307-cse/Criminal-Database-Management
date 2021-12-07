package com.criminal.databases;

import com.criminal.databases.frames.Frame1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome implements ActionListener
{
    protected static  JFrame welcome_f;
    protected static JButton welcome_b;
    protected static JPanel welcome_p;
    protected static JLabel welcome_l,welcome_l2;
    public Welcome()
    {
        // for welcome frame
        welcome_f = new JFrame();
        welcome_f.setSize(1000,500);
        welcome_f.setLocationRelativeTo(null);
        welcome_f.setLayout(null);
        welcome_f.setResizable(false);
        welcome_f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // for welcome panel
        welcome_p = new JPanel();
        welcome_p.setBounds(0,0,1000,500);
        welcome_p.setLayout(null);
        welcome_p.setBackground(Color.CYAN);
        welcome_f.add(welcome_p);

        // for welcome button
        welcome_b = new JButton("Welcome");
        welcome_b.setBounds(400,350,90,30);
        welcome_p.add(welcome_b);
        welcome_f.add(welcome_p);

        // for welcome lable
        welcome_l = new JLabel("Welcome to criminal database");
        welcome_l.setFont(new Font("Aerial",Font.PLAIN,20));
        welcome_l.setBounds(400,100,500,100);
        welcome_p.add(welcome_l);
        welcome_f.add(welcome_p);

        welcome_l2 = new JLabel("Lets get Started");
        welcome_l2.setFont(new Font("Aerial",Font.PLAIN,20));
        welcome_l2.setBounds(400,200,500,30);
        welcome_f.setVisible(true);
        welcome_p.add(welcome_l2);
        welcome_f.add(welcome_p);

        welcome_b.addActionListener(this);

    }
    public static void main(String[] args)
    {
        new Welcome();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == welcome_b)
        {
            new Frame1();
            Frame1.jf.setVisible(true);
            welcome_f.dispose();
        }
    }
}
