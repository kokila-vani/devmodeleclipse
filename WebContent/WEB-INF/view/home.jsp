<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head></head>
<body>
	<form:form action="insertUser" method="post" modelAttribute="stu">
		<form:hidden path="id" />
		<form:input cssClass="ajay" path="firstName" required="required"/>
		<form:input path="age" required="required"/>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>