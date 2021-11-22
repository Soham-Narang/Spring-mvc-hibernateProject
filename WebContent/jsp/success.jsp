<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>Spring Controller Example</h2>

<table>
<tr>
<td>First Name :</td><td>${sessionScope.user.firstName}</td>
</tr>

<tr>
<td>Address :</td><td>${sessionScope.user.address}</td>
</tr>


<tr>
<td>Bank-Name :</td><td>${user.bankName}</td>
</tr>
</table>

</body>
</html>