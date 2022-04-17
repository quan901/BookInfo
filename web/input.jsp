<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/17
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>书本信息</title>
  </head>
  <body>
  <form action="/book5-4/BookServlet" method="post" >
  <table border="1" align="center">
    <tr><td>教材名</td><td><input type="text" name="bookname"/></td></tr>
    <tr><td>作者</td><td><input type="text" name="author"/></td></tr>
    <tr><td>出版社</td><td><input type="text" name="publish"/></td></tr>
    <tr><td>出版时间</td><td><input type="text" name="date"/></td></tr>
    <tr><td>价格</td><td><input type="text" name="price"/></td></tr>
    <tr><td colspan="2"><input type="submit" value="提交"></td></tr>
  </table>
  </form>
  </body>
</html>
