package com.criminal.databases.frames;

import com.criminal.databases.connectionprovider.ConnectionProvider;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// for show the database of criminals
public class Frame3 implements ActionListener
{
    JFrame jf2;
    JPanel panel5_f3;
    JLabel show_data;
    JTextField show_tf;
    JButton show,reset,back;
    JTextArea show_text;
    public Frame3()
    {
        // creating 3rd frame
        jf2 = new JFrame();
        jf2.setSize(1000, 500);
        jf2.setResizable(false);
        jf2.setLocationRelativeTo(null);
        jf2.setTitle("Criminal Information");
        jf2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf2.setLayout(null);

        // for panel 1 in frame 3
        panel5_f3 = new JPanel();
        panel5_f3.setLayout(null);
        panel5_f3.setBounds(0,0,1000,500);
        panel5_f3.setBackground(Color.CYAN);
        jf2.add(panel5_f3);

        // for show lable
        show_data = new JLabel("Enter criminal id for see the data");
        show_data.setBounds(300,50,400,30);
        show_data.setFont(new Font("Arial",Font.PLAIN,25));
        panel5_f3.add(show_data);
        jf2.add(panel5_f3);

        // for show textfield
        show_tf = new JTextField();
        show_tf.setBounds(400,100,100,30);
        panel5_f3.add(show_tf);
        jf2.add(panel5_f3);

        // for show button
        show = new JButton("Show");
        show.setBounds(400,160,100,30);
        panel5_f3.add(show);
        jf2.add(panel5_f3);

        // for reset button
        reset = new JButton("Reset");
        reset.setBounds(520,160,100,30);
        panel5_f3.add(reset);
        jf2.add(panel5_f3);

        // for show text area
        show_text = new JTextArea();
        show_text.setBounds(100,210,800,200);
        panel5_f3.add(show_text);
        jf2.add(panel5_f3);
        jf2.setVisible(true);

        // for back button in frame 3
        back = new JButton("Back");
        back.setBounds(5,430,100,30);
        panel5_f3.add(back);
        jf2.add(panel5_f3);

        show.addActionListener(this);
        reset.addActionListener(this);
        back.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == show)
        {
            try
            {
                Connection con = ConnectionProvider.getConnection();

                String get_showID = show_tf.getText();

                String s = "select * from criminal_data where id = ?";

                PreparedStatement pstmt = con.prepareStatement(s);

                pstmt.setString(1,get_showID);


                ResultSet set =pstmt.executeQuery();

                if(set.next())
                {
                    int id = set.getInt(1);
                    String name = set.getString(2);
                    String crime = set.getString(3);
                    String date = set.getString(4);

                    show_text.setText("ID -> "+id+"  "+"\n"+"Name -> "+name+"  "+"\n"+"Crime -> "+crime+"  "+"\n"+"Date -> "+date+"  ");
                }
            }
            catch(Exception excep)
            {
                excep.printStackTrace();
            }
        }
        if(e.getSource() == reset)
        {
            show_tf.setText(null);
            show_text.setText(null);
        }
        if(e.getSource() == back)
        {
            Frame1.jf.setVisible(true);
            jf2.dispose();
        }
    }
}
