/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author hp
 */
public class RegisterDao {
  public static int register(User u){
 int status=0;
 try{
     Connection con=ConnectionProvider.getCon();
     PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?,?)");
     ps.setString(1, u.getUname());
     ps.setString(2, u.getUemail());
     ps.setString(3, u.getUpass());
     ps.setString(4, u.getUcpass());
     ps.setString(5, u.getUphone());
     ps.setString(6, u.getUadd());
     status=ps.executeUpdate();
 }catch(Exception e){
 }   
return status;
 }  
}
