<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE>

<html>
<head>
<title><fmt:message key="title"/></title>
</head>
<body>
<h1><fmt:message key="title"/></h1>
<h2><fmt:message key="insertHeading"/></h2>
<form name="InsertProfesor" action="/profesor.htm" method="GET">
<label>ID</label><br/>
<input type="text" name="id" required="required"/><br/>
<label>Nombre</label><br/>
<input type="text" name="nombre" required="required"/><br/>
<label>Titulo</label><br/>
<input type="text" name="titulo" required="required"/><br/>
<input type="hidden" name="mode" value="insert"/>
<input type="submit" name="submit" value="Guardar"/>
</form>
<a href="/profesor.htm?mode=list">
volver
</a>
</body>
</html>