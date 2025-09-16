<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>tomcat memory</h1>

<h2>request</h2>
<%=request.getAttribute("r1")%>

<h2>session</h2>
<%=session.getAttribute("s1")%>

<h2>session clear</h2>
<% //if(session != null) session.invalidate(); %>

<h2>application</h2>
<%=application.getAttribute("info")%>

