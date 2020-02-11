<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h3>Welcome to User Login Page</h3>

<c:if test="${param.error!=null}">
 <div style="color: red;">Invalid Username/password</div>
</c:if>
<c:if test="${param.logout!=null}">
 <div style="color: green;">Logout successful</div>
</c:if>

<form action="login" method="post">
<pre>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
Username : <input type="text" name="username"/>
Password : <input type="password" name="password"/>
<input type="submit" value="Login"/>
</pre>
</form>
Dont you have Account? <a href="register">Click Here</a>
</body>
</html>





