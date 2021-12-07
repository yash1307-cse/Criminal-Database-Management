package com.criminal.databases.login;

import com.criminal.databases.connectionprovider.ConnectionProvider;
import com.criminal.databases.frames.Frame1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// this class is for showing the database of criminals
// database connection
public class Login_F3
{
    public boolean getLogin()
    {
        try
        {
            Connection con = ConnectionProvider.getConnection();

            // getting id and password from frame1 login panel
            String get_id_p = Frame1.jtf2_p3.getText();
            int id = Integer.parseInt(get_id_p);

            String get_pass_p = Frame1.jpf2_p3.getText();
            int pass = Integer.parseInt(get_pass_p);

            String s = "select *from police_data where id = ? and password = ?";

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
