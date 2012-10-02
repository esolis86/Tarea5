<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
 <head><title><fmt:message key="title"/></title></head>
 <body>
   <h1><fmt:message key="heading"/></h1>
   <p><fmt:message key="mensaje"/> <c:out value="${model.now}"/></p>
   <h3>Profesores</h3>
   <table border="1">
     <tr><th>Nombre</th><th>ID</th><th>Titulo</th></tr>
     <c:forEach items="${model.profesores}" var="prof">
       <tr><td><c:out value="${prof.nombre}"/></td>
       <td><c:out value="${prof.id}"/></td>
       <td><c:out value="${prof.titulo"/></td>
	   <td>
			<a href='detalleProfesor.htm?id=${prof.id}'>
				<input type="submit" value="Detalle"/></a>
		</td>
	   </tr>
     </c:forEach>
   </table>
 </body>
</html>