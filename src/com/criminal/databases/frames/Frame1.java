package com.criminal.databases.frames;


import com.criminal.databases.login.Login_F2;
import com.criminal.databases.login.Login_F3;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 implements ActionListener
{
    public static JFrame jf;
    protected static JLabel jl_p1, jl1_p2, jl2_p2, jl3_p2, jl1_p3, jl2_p3, jl3_p3;
    protected static JPanel panel0,panel1,panel2,panel3;
    public static JTextField jtf1_p2, jtf2_p3;
    public static JPasswordField jpf1_p2, jpf2_p3;
    protected static JButton login_p2, login_p3;
    public Frame1()
    {
        // For Frame
        jf = new JFrame();
        jf.setSize(1000, 500);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setTitle("Criminal Information");
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setLayout(null);

        // For Panel 0
        panel0 = new JPanel();
        panel0.setBounds(0,0,1000,500);
        panel0.setBackground(Color.RED);
        panel0.setLayout(null);
        // For Panel1
        panel1 = new JPanel();
        panel1.setBounds(0,0,1000,50);
        panel1.setBackground(Color.GREEN);
        panel0.add(panel1);
        jf.add(panel0);

        // Inserting a text in Panel 1
        jl_p1 = new JLabel();
        jl_p1.setText("Welcome to Database of Criminals");
        jl_p1.setFont(new Font ("Consolas",Font.ROMAN_BASELINE,30));
        jl_p1.setLayout(new FlowLayout());
        panel1.add(jl_p1);

        // For Panel2
        panel2 = new JPanel();
        panel2.setBounds(0,60,500,440);
        panel2.setBackground(Color.CYAN);
        panel2.setLayout(null);

        // Inserting a text in Panel 2
        jl1_p2 = new JLabel();
        jl1_p2.setText("Login as Admin");
        jl1_p2.setBounds(150,10,200,30);
        jl1_p2.setFont(new Font ("Comic Sans MS",Font.BOLD,22));
        panel2.add(jl1_p2);

        jl2_p2 = new JLabel();
        jl2_p2.setText("Username :");
        jl2_p2.setBounds(100,80,200,30);
        jl2_p2.setFont(new Font ("Comic Sans MS",Font.BOLD,20));
        jl2_p2.setLayout(null);
        panel2.add(jl2_p2);
        panel0.add(panel2);
        jf.add(panel0);

        jl3_p2 = new JLabel();
        jl3_p2.setText("Password :");
        jl3_p2.setBounds(100,160,200,30);
        jl3_p2.setFont(new Font ("Comic Sans MS",Font.BOLD,20));
        jl3_p2.setLayout(null);
        panel2.add( jl3_p2);
        panel0.add(panel2);
        jf.add(panel0);

        // For Panel3
        panel3 = new JPanel();
        panel3.setBounds(510,60,500,440);
        panel3.setBackground(Color.ORANGE);

        // Inserting a text in Panel 3
        jl1_p3 = new JLabel();
        jl1_p3.setText("Login to see the Data of Criminals");
        jl1_p3.setBounds(70,0,450,50);
        jl1_p3.setFont(new Font ("Comic Sans MS",Font.BOLD,22));
        panel3.add(jl1_p3);
        panel3.setLayout(null);
        panel0.add(panel3);
        jf.add(panel0);

        jl2_p3 = new JLabel();
        jl2_p3.setText("Username :");
        jl2_p3.setBounds(100,80,200,30);
        jl2_p3.setFont(new Font ("Comic Sans MS",Font.BOLD,20));
        jl2_p3.setLayout(null);
        panel3.add(jl2_p3);
        panel0.add(panel3);
        jf.add(panel0);

        jl3_p3 = new JLabel();
        jl3_p3.setText("Password :");
        jl3_p3.setBounds(100,160,200,30);
        jl3_p3.setFont(new Font ("Comic Sans MS",Font.BOLD,20));
        jl3_p3.setLayout(null);
        panel3.add(jl3_p3);
        panel0.add(panel3);
        jf.add(panel0);

        // Inserting a tetxfield in panel 2
        jtf1_p2 = new JTextField();
        jtf1_p2.setBounds(250,80,200,30);
        panel2.add(jtf1_p2);
        panel0.add(panel2);
        jf.add(panel0);

        // Inserting a text field in panel 3
        jtf2_p3 = new JTextField();
        jtf2_p3.setBounds(250,80,200,30);
        panel3.add(jtf2_p3);
        panel0.add(panel3);
        jf.add(panel0);

        // Inserting a password field in panel 2
        jpf1_p2 = new JPasswordField();
        jpf1_p2.setBounds(250,160,200,30);
        panel2.add(jpf1_p2);
        panel0.add(panel2);
        jf.add(panel0);

        // Inserting a passwordfield in panel 3
        jpf2_p3 = new JPasswordField();
        jpf2_p3.setBounds(250,160,200,30);
        panel3.add( jpf2_p3);
        panel0.add(panel3);
        jf.add(panel0);

        // Inserting a button in panel 2
        login_p2 = new JButton("Log in");
        login_p2.setBackground(Color.WHITE);
        login_p2.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
        login_p2.setBounds(200,250,100,30);
        panel2.add(login_p2);
        panel0.add(panel2);
        jf.add(panel0);

        // Inserting a button in panel 2
        login_p3 = new JButton("Log in");
        login_p3.setBackground(Color.WHITE);
        login_p3.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
        login_p3.setBounds(200,250,100,30);
        panel3.add(login_p3);
        panel0.add(panel3);
        jf.add(panel0);

        login_p2.addActionListener(this);
        login_p3.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == login_p2)
        {
            Login_F2 f2 = new Login_F2();
            if(f2.getLogin())
            {
                JOptionPane.showMessageDialog(null, "Welcome");
                jf.dispose();
                new Frame2();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error");
            }
        }
        if(e.getSource() == login_p3)
        {
            Login_F3 f3 = new Login_F3();
            if (f3.getLogin())
            {
                JOptionPane.showMessageDialog(null, "Welcome");
                jf.dispose();
                new Frame3();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error");
            }
        }
    }
}

