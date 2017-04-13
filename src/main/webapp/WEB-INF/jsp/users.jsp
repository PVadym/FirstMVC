<%--
  Created by IntelliJ IDEA.
  User: Вадим
  Date: 10.04.2017
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

   Hello user :<c:out value="${name}"/>
    <c:forEach items="${array}" var="a">
        <c:out value="${a}"/>
    </c:forEach>
   <br/>

<c:forEach items="${userslist}" var="user">
    <c:out value="${user.name}"/> =
    <c:out value="${user.age}"/><br/>

</c:forEach>


</body>
</html>
