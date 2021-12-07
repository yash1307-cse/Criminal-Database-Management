package com.criminal.databases.frames;

import com.criminal.databases.connectionprovider.ConnectionProvider;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

// user admin
public class Frame2 implements ActionListener
{
    JFrame jf1;
    JPanel panel1_f2,panel2_f2,panel3_f2,panel4_f2;
    JTextField c_idtf, c_nametf, c_crimetf, c_datetf,delete_tf,cr_idtf,cr_uptf;
    JLabel c_idl,c_namel,c_crimel,c_datel,delete_l,insert_l,update_l,cr_id,cr_up;
    JButton add,update,delete,refresh,reset,back;
    JComboBox update_cb;
    String [] value = {"Name", "Crime", "Date"};
    public Frame2()
    {
        // Create 2nd Frame
        jf1 = new JFrame();
        jf1.setSize(1000, 500);
        jf1.setResizable(false);
        jf1.setLocationRelativeTo(null);
        jf1.setTitle("Criminal Information");
        jf1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf1.setLayout(null);

        // Panel 1 for frame 2nd
        panel1_f2 = new JPanel();
        panel1_f2.setLayout(null);
        panel1_f2.setBounds(0,0,600,250);
        panel1_f2.setBackground(Color.YELLOW);
        jf1.add(panel1_f2);

        // Panel 2 for frame 2nd
        panel2_f2 = new JPanel();
        panel2_f2.setBounds(0,260,600,250);
        panel2_f2.setLayout(null);
        panel2_f2.setBackground(Color.ORANGE);
        jf1.add(panel2_f2);

        // Panel 3 for frame 2nd
        panel3_f2 = new JPanel();
        panel3_f2.setBounds(610,0,380,100);
        panel3_f2.setLayout(null);
        panel3_f2.setBackground(Color.PINK);
        jf1.add(panel3_f2);

        // Panel 4 for frame 2nd
        panel4_f2 = new JPanel();
        panel4_f2.setBounds(610,110,380,400);
        panel4_f2.setLayout(null);
        panel4_f2.setBackground(Color.GREEN);
        jf1.add( panel4_f2);

        // for id text field
        c_idtf = new JTextField();
        c_idtf.setBounds(50,100,100,30);
        panel1_f2.add(c_idtf);
        jf1.add(panel1_f2);

        // for name textfield
        c_nametf = new JTextField();
        c_nametf.setBounds(180,100,100,30);
        panel1_f2.add(c_nametf);
        jf1.add(panel1_f2);

        // for crime textfield
        c_crimetf= new JTextField();
        c_crimetf.setBounds(310,100,100,30);
        panel1_f2.add(c_crimetf);
        jf1.add(panel1_f2);

        // for date textfield
        c_datetf = new JTextField();
        c_datetf.setBounds(440,100,100,30);
        panel1_f2.add(c_datetf);
        jf1.add(panel1_f2);

        // for id label
        c_idl = new JLabel("ID");
        c_idl.setBounds(50,50,50,30);
        c_idl.setFont(new Font("Aerial",Font.PLAIN,20));
        panel1_f2.add(c_idl);
        jf1.add(panel1_f2);

        // for name label
        c_namel = new JLabel("Name");
        c_namel.setBounds(180,50,150,30);
        c_namel.setFont(new Font("Aerial",Font.PLAIN,20));
        panel1_f2.add(c_namel);
        jf1.add(panel1_f2);

        // for crime label
        c_crimel = new JLabel("Crime");
        c_crimel.setBounds(310,50,150,30);
        c_crimel.setFont(new Font("Aerial",Font.PLAIN,20));
        panel1_f2.add( c_crimel);
        jf1.add(panel1_f2);

        // for date label
        c_datel = new JLabel("Date");
        c_datel.setBounds(440,50,150,30);
        c_datel.setFont(new Font("Aerial",Font.PLAIN,20));
        panel1_f2.add(c_datel);
        jf1.add(panel1_f2);

        // for delete record label
        delete_l = new JLabel("Enter criminal id for delete record");
        delete_l.setBounds(150,10,400,30);
        delete_l.setFont(new Font("Aerial",Font.PLAIN,20));
        panel2_f2.add(delete_l);
        jf1.add(panel2_f2);

        // for insert label
        insert_l = new JLabel("Insert new record ");
        insert_l.setBounds(100,20,200,30);
        insert_l.setFont(new Font("Aerial",Font.PLAIN,20));
        panel3_f2.add(insert_l);
        jf1.add(panel3_f2);

        // for refresh button
        refresh = new JButton("Reset");
        refresh.setBounds(130,60,80,30);
        panel3_f2.add(refresh);
        jf1.add(panel3_f2);

        // for delete textfield
        delete_tf= new JTextField();
        delete_tf.setBounds(250,70,100,30);
        panel2_f2.add(delete_tf);
        jf1.add(panel2_f2);

        // for delete button
        delete = new JButton("Delete");
        delete.setBounds(250,120,100,30);
        panel2_f2.add(delete);
        jf1.add(panel2_f2);
        jf1.setVisible(true);

        // for Back button
        back = new JButton("Back");
        back.setBounds(5,170,100,30);
        panel2_f2.add(back);
        jf1.add(panel2_f2);
        jf1.setVisible(true);

        // for add button
        add = new JButton("Add");
        add.setBounds(240,170,70,30);
        panel1_f2.add(add);
        jf1.add(panel1_f2);
        jf1.setVisible(true);

        // for update button
        update = new JButton("Update");
        update.setBounds(130,200,80,30);
        panel4_f2.add(update);
        jf1.add(panel4_f2);
        jf1.setVisible(true);

        // for update combobox
        update_cb = new JComboBox(value);
        update_cb.setBounds(130,55,100,30);
        panel4_f2.add(update_cb);
        jf1.add(panel4_f2);
        jf1.setVisible(true);

        // for update lable
        update_l = new JLabel("Choose what to update");
        update_l.setBounds(70,10,250,30);
        update_l.setFont(new Font("Aerial",Font.PLAIN,20));
        panel4_f2.add(update_l);
        jf1.add(panel4_f2);

        jf1.setVisible(true);

        // for enter criminal id in panel4
        cr_id = new JLabel("Enter Criminal id");
        cr_id.setBounds(20,100,250,30);
        cr_id.setFont(new Font("Aerial",Font.PLAIN,20));
        panel4_f2.add(cr_id);
        jf1.add(panel4_f2);

        // criminal id text field in panel 4
        cr_idtf = new JTextField();
        cr_idtf.setBounds(200,100,80,30);
        panel4_f2.add(cr_idtf);
        jf1.add(panel4_f2);

        cr_up = new JLabel("Type for update");
        cr_up.setBounds(20,140,250,30);
        cr_up.setFont(new Font("Aerial",Font.PLAIN,20));
        panel4_f2.add(cr_up);
        jf1.add(panel4_f2);

        // for criminal update textfield in panel 4
        cr_uptf = new JTextField();
        cr_uptf.setBounds(200,140,80,30);
        panel4_f2.add(cr_uptf);
        jf1.add(panel4_f2);
        jf1.setVisible(true);

        // for reset button in panel 4
        reset = new JButton("Reset");
        reset.setBounds(130,260,80,30);
        panel4_f2.add(reset);
        jf1.add(panel4_f2);
        jf1.setVisible(true);

        add.addActionListener(this);
        delete.addActionListener(this);
        refresh.addActionListener(this);
        update.addActionListener(this);
        reset.addActionListener(this);
        back.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == add)
        {
            try
            {
                Connection con = ConnectionProvider.getConnection();

                String get_id = c_idtf.getText();
                int id = Integer.parseInt(get_id);

                String name = c_nametf.getText();

                String crime = c_crimetf.getText();

                String get_date = c_datetf.getText();
                int date = Integer.parseInt(get_date);


                String s = "insert into criminal_data(id,name,crime,crime_date) values (?,?,?,?)"; // dynamic query

                PreparedStatement pstmt = con.prepareStatement(s);


                pstmt.setString(1, Integer.toString(id));
                pstmt.setString(2, name);
                pstmt.setString(3, crime);
                pstmt.setString(4, Integer.toString(date));

                pstmt.executeUpdate();
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,"Added Successfully");
        }
        if(e.getSource() == delete)
        {
            try
            {
                Connection con = ConnectionProvider.getConnection();

                String get_delid = delete_tf.getText();

                String del = "delete from criminal_data where id = ?";

                PreparedStatement pstmt = con.prepareStatement(del);
                pstmt.setString(1,get_delid);
                pstmt.executeUpdate();
            }
            catch(Exception exce)
            {
                exce.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,"Deleted Successfully");
        }
        if(e.getSource() == refresh)
        {
            c_idtf.setText(null);
            c_nametf.setText(null);
            c_crimetf.setText(null);
            c_datetf.setText(null);
            delete_tf.setText(null);
            JOptionPane.showMessageDialog(null,"Reset Successfully");
        }
        if(e.getSource() == update)
        {
            if(update_cb.getSelectedItem() == value[0] )
            {
                try
                {
                    Connection con = ConnectionProvider.getConnection();

                    String update_name = cr_uptf.getText();
                    String get_cr_id = cr_idtf.getText();
                    String up_query = "update criminal_data set name = ? where id = ?";

                    PreparedStatement pstmt = con.prepareStatement(up_query);

                    pstmt.setString(1,update_name);
                    pstmt.setString(2,get_cr_id);
                    pstmt.executeUpdate();
                }
                catch(Exception a)
                {
                    a.printStackTrace();
                }
                JOptionPane.showMessageDialog(null,"Updated Successfully");
            }
            if(update_cb.getSelectedItem() == value[1] )
            {
                try
                {
                    Connection con = ConnectionProvider.getConnection();

                    String update_crime = cr_uptf.getText();
                    String get_cr_id = cr_idtf.getText();
                    String up_query = "update criminal_data set crime = ? where id = ?";

                    PreparedStatement pstmt = con.prepareStatement(up_query);

                    pstmt.setString(1,update_crime);
                    pstmt.setString(2,get_cr_id);
                    pstmt.executeUpdate();
                }
                catch(Exception a)
                {
                    a.printStackTrace();
                }
                JOptionPane.showMessageDialog(null,"Updated Successfully");
            }
            
            if(update_cb.getSelectedItem() == value[2] )
            {
                try
                {
                    Connection con = ConnectionProvider.getConnection();

                    String update_date = cr_uptf.getText();
                    String get_cr_id = cr_idtf.getText();
                    String up_query = "update criminal_data set crime_date = ? where id = ?";

                    PreparedStatement pstmt = con.prepareStatement(up_query);

                    pstmt.setString(1,update_date);
                    pstmt.setString(2,get_cr_id);
                    pstmt.executeUpdate();
                }
                catch(Exception a)
                {
                    a.printStackTrace();
                }
                JOptionPane.showMessageDialog(null,"Updated Successfully");
            }
        }
        if(e.getSource() == reset)
        {
            cr_idtf.setText(null);
            cr_uptf.setText(null);
            JOptionPane.showMessageDialog(null,"Reset Successfully");
        }
        if(e.getSource() == back)
        {
            Frame1.jf.setVisible(true);
            jf1.dispose();
        }
    }
}
