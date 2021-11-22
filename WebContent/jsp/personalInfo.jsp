<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<style>  
		.error{color:red}  
	</style>
</head>
<body>

<form:form method="post" modelAttribute="theuser" action="/AssignmentProjectSpringMVC/processPersonalDetails.do">
      <table>
          <tr>
              <td>First Name:</td>
              <td><form:input path="firstName" /></td>
              <td><form:errors path="firstName" cssClass="error" /></td>
          </tr>
          <tr>
              <td>Last Name:</td>
              <td><form:input path="lastName" /></td>
              <td><form:errors path="lastName" cssClass="error" /></td>
          </tr>
          
          <tr>
              <td>middle Name:</td>
              <td><form:input path="middleName" /></td>
              <td><form:errors path="middleName" cssClass="error" /></td>
          </tr>
          
          <tr>
              <td colspan="2">
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>

</form:form>
</body>
</html>