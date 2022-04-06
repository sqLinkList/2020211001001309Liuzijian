<%--
  Created by IntelliJ IDEA.
  User: Alan
  Date: 2022/3/29
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>Login</h1>
<form method="post" action="${pageContext.request.contextPath}/Login">
  username:<input type="text"  name="Username" placeholder="username"><br>
  password:<input type="password" name="password" placeholder="password"><br>
  <input type="submit" value="Login">
</form>
<%@include file="footer.jsp"%>
