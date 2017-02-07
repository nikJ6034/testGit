<%@ page contentType="text/html; charset=UTF-8 " pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

${testVO.name }

<form:form commandName="testVO" method="POST" action="/test/">
<form:errors element="div" />
	<form:input path="name"/>
	<form:errors path="name" />
	<br/>
	<form:input path="id"/>
	<form:errors path="id" />	
	<input type="submit" value="전송"/> 
</form:form>
</body>
</html>
