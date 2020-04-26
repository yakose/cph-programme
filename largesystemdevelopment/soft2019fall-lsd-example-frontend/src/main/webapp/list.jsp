<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>List Page</h1>
    <hr/>
    <form action="Person">
      <input type="hidden" name="command" value="edit"/>
      <ul>
        <c:forEach var="personSummary" items="${personSummaries}">
          <li>
            <button name="id" value="${personSummary.id}">Edit #${personSummary.id}</button>
            ${personSummary.name} <a href="mailto:${personSummary.email}">${personSummary.email}</a>
          </li>
        </c:forEach>
      </ul>
    </form>
    <hr/>
    <form action="Person">
      <button name="command" value="back">Back to Main Page</button>
    </form>
  </body>
</html>
