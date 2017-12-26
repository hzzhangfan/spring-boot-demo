<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http‐equiv="X‐UA‐Compatible" content="IE=Edge" />
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name", "happyman");
%>
<h1>test ${name}</h1>
<h2>${model_value}</h2>
<h3><c:out value="${model_value}"/></h3>
</body>
</html>