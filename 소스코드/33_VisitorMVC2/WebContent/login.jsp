<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%= request.getAttribute("message")%>님 가입을 환영합니다.<br>

<%@ include file="home.jsp" %> <br>

<jsp:include page="home.html"/> <br>