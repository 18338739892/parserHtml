<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/1 0001
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath = request.getContextPath();%>
<html>
<head>
    <%@ include file="../pages/support/easyui_support.jsp" %>
    <title>首页</title>
</head>
<body>
这是个首页

<br>

<a href=<%=basePath%>"/sysMenuAction!queryMenu.action">点击</a>
</body>
</html>
