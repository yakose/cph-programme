<%-- 
    Document   : edit
    Created on : Sep 5, 2019, 10:19:10 PM
    Author     : AKA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Edit Page</h1>
    <form action="Person">
      <input type="hidden" name="id" value="${personDetail.id}"/>
      <table>
        <tr>
          <th>Id:</th>
          <td>${personDetail.id}</td>
        </tr>
        <tr>
          <th>First Name:</th>
          <td><input type="text" name="firstName" value="${personDetail.firstName}"/></td>
        </tr>
        <tr>
          <th>Last Name:</th>
          <td><input type="text" name="lastName" value="${personDetail.lastName}"/></td>
        </tr>
        <tr>
          <th>Email:</th>
          <td><input type="text" name="email" value="${personDetail.email}"/></td>
        </tr>
        <tr>
          <td colspan="2">
            <button name="command" value="save">Save</button>
            <button name="command" value="skip">Cancel</button>
          </td>
        </tr>
      </table>
    </form>
    <hr/>
  </body>
</html>
