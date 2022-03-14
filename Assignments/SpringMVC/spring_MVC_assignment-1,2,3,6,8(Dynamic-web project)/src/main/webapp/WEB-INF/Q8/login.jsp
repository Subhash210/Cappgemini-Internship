<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8"%>

<a href="/MVCAssignment/login?siteLanguage=en">English</a>|
<a href="/MVCAssignment/login?siteLanguage=fr">French</a>|
<a href="/MVCAssignment/login?siteLanguage=vi">Vietnamese</a>



<html>
	<body>
			<form action="/MVCAssignment/login" method="get">
			<table>
					<tr><td><spring:message code="label.userName"/></td>		<td><input type="text" name="userName" required/></td></tr>
					<tr><td><spring:message code="label.password"/></td>		<td><input type="text" name="password" required/></td></tr>
					<tr><td><input type="submit"  value = <spring:message code="label.submitvalue"></spring:message>></input></td></tr>  
			</table>
		</form>
	</body>
</html>