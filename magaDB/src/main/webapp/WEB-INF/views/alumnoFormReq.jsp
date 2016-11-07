<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
	font-size: 15px;
}
</style>
</head>
<body>
	<form:form commandName="nuevoAlumno">
		<form:input path="nombre" type="text" name="nombre"
			placeholder="nombre" />
		<form:errors path="nombre" cssClass="error" />
		<br>
		<form:input path="legajo" type="text" name="legajo"
			placeholder="legajo" />
		<form:errors path="legajo" cssClass="error" />
		<input type="submit" value="enviar" />
	</form:form>

</body>
</html>