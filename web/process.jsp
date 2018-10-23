<%-- 
    Document   : process
    Created on : Aug 15, 2017, 1:23:54 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bean.RegisterDao" %>
<jsp:useBean id="obj" class="bean.User"/>
<jsp:setProperty property="*" name="obj"/>
<%
  int status=RegisterDao.register(obj);
  if(status>0)
out.print("You are successfully registered");
%>