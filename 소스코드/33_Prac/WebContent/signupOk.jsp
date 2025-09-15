<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

pw는 유효 여부는 <%=request.getAttribute("isPwEqual")%> 입니다.<br>
<%= request.getParameter("userName") %>의 회원가입을 축하합니다.<br>
id는 <%= request.getParameter("id") %>입니다.<br>
생년월일은 <%= request.getParameter("birth") %> 입니다.<br>
성별은 <%=request.getParameter("gender") %>입니다.
<br>
<br>

