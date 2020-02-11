<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<style type="text/css">
.err{
	color: red;
}
</style>
</head>
<body>
<a href="?lang=en">English</a>
<a href="?lang=hi">Hindi</a>
<a href="?lang=te">Telugu</a>
<a href="?lang=kn">Kannada</a>
<a href="?lang=mr">Marathi</a>

<h3><spring:message code="title"/> </h3>
<form:form action="save" method="POST" modelAttribute="employee">
<pre>
<spring:message code="eid"/>    : <form:input path="empId"/>
<spring:message code="ename"/>  : <form:input path="empName"/>
<form:errors path="empName"  cssClass="err"/>
<spring:message code="egen"/>: <form:radiobutton path="empGen" value="Male"/>Male <form:radiobutton path="empGen" value="Female"/>Female
<form:errors  path="empGen" cssClass="err"/>

<spring:message code="addr"/>: <form:textarea path="empAddr"/>
<form:errors path="empAddr" cssClass="err"/>
<spring:message code="prj"/>: 
  <form:select path="empProj">
  	<form:option value="">-SELECT-</form:option>
  	<form:option value="P1">P1</form:option>
  	<form:option value="P2">P2</form:option>
  </form:select>
<form:errors path="empProj" cssClass="err"/>  
<spring:message code="langs"/>:
<form:checkbox path="empLangs" value="English"/> English
<form:checkbox path="empLangs" value="Hindi"/> Hindi
<form:checkbox path="empLangs" value="Telugu"/> Telugu
<form:errors path="empLangs" cssClass="err"/>
  <input type="submit" value="Register"/>
</pre>
</form:form>
</body>
</html>