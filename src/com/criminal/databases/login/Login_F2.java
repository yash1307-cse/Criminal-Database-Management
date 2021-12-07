package com.criminal.databases.login;

import com.criminal.databases.connectionprovider.ConnectionProvider;
import com.criminal.databases.frames.Frame1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// database connection
public class Login_F2
{
    public boolean getLogin()
    {
        try
        {
            Connection con = ConnectionProvider.getConnection();

            // getting id and password from frame1 login panel
            String get_id = Frame1.jtf1_p2.getText();
            int id = Integer.parseInt(get_id);

            String get_pass = Frame1.jpf1_p2.getText();
            int pass = Integer.parseInt(get_pass);

            String s = "select *from admin where id = ? and password = ?";

            PreparedStatement pstmt = con.prepareStatement(s);
            pstmt.setString(1,Integer.toString(id));
            pstmt.setString(2,Integer.toString(pass));

            ResultSet set = pstmt.executeQuery();
            if(set.next())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
