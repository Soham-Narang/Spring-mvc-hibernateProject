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

<form:form method="post" modelAttribute="theuser" action="/AssignmentProjectSpringMVC/processAccountDetails.do">
      
      <table>
      
    <!-- <input type="number" name="phoneNumber" value=""><br><br>
     -->  
     
     <%-- <% 
			Object obj = request.getAttribute("errors");
			out.println("" + obj);
	%> --%>
          <tr>
              <td>Address:</td>
              <td><form:input path="address" /></td>
              <td><form:errors path="address" cssClass="error" /></td>
          </tr>
          <tr>
              <td>City:</td>
              <td><form:input path="city" /></td>
              <td><form:errors path="city" cssClass="error" /></td>
          </tr>
          
          <tr>
              <td>State:</td>
              <td><form:input path="state" /></td>
              <td><form:errors path="state" cssClass="error" /></td>
          </tr>
         
          <tr>
              <td>Country:</td>
              <td><form:input path="country" /></td>
              <td><form:errors path="country" cssClass="error" /></td>
          </tr>
          
          <tr>
              <td>Phone Number:</td>
              <td><form:input path="phoneNumber" /></td>
              <td><form:errors path="phoneNumber" cssClass="error" /></td>
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