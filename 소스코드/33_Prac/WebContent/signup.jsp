<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>sign up.jsp</h1>


<form method="post" action="SignUpAction">
	id <input type="text" name="id" required="required"><br>
	pw <input type="password" name="pw"><br>
	pw check <input type="password" name="pwCheck"><br>
	name <input type="text" name="userName"><br>
	남<input type="radio" name="gender" value="m">
	여 <input type="radio" name="gender" value="f">
	birth <input type="date" name="birth"><br>
	<input type="submit" value="회원가입">
</form>