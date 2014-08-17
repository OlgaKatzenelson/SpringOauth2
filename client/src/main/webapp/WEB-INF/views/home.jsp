<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello From Foo Company
</h1>

<p>
	<a href="<c:url value="/cats"/>">Get private Cats.</a>
    <a href="<c:url value="/publicCats"/>">Get public Cats.</a>
</p>

</body>
</html>
