/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.sql.*;
/**
 *
 * @author hp
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

     public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
          //  out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
                  
            String sEmail=request.getParameter("Email");
            String sPassword=request.getParameter("Password");
       
//        String email;
  //      String pass;     
                try{
        Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/myproject","root","shalu");
	Statement stat=con.createStatement();
        ResultSet rs=stat.executeQuery("select Email,Password from register");
        while(rs.next()){
          String email=rs.getString("Email");
          String pass=rs.getString("Password");
          
         if(sEmail.equals(email) && sPassword.equals(pass)){
                con.close();
            RequestDispatcher r=request.getRequestDispatcher("/Home_page.html");
            r.forward(request,response);
      
        }
          //else 
       //{
         
            
         //RequestDispatcher rdf=request.getRequestDispatcher("/index.html");
         
         //rdf.forward(request,response);
       //} 
           }           
       }
            catch(Exception e){
             out.println(e);   
            }
                
               out.print("Sorry UserName or Password Error!");  
                RequestDispatcher rdf=request.getRequestDispatcher("/index.jsp");
         
                rdf.forward(request,response);
            
            out.println("</body>");
            out.println("</html>");
        }
}