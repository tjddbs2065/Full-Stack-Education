<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<a href="#">jsp link</a>

<%!	private String name;%>

<% 
	for(int i = 0; i < 10; i++){
		System.out.println(i);
		
		out.print(i);
	}
%>

<%=name.toString()%>