<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" modelAttribute="theuser" action="/AssignmentProjectSpringMVC/processBankDetails.do">
      <table>
      
    <!-- <input type="number" name="phoneNumber" value=""><br><br>
     -->  
     
     <%-- <% 
			Object obj = request.getAttribute("errors");
			out.println("" + obj);
	%> --%>
          <tr>
              <td>Bank Name:</td>
              <td><form:input path="bankName" /></td>
          </tr>
          <tr>
              <td>Account:</td>
              <td><form:input path="account" /></td>
          </tr>
          
          <tr>
              <td>SSN:</td>
              <td><form:input path="ssn" /></td>
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