package dk.cphbusiness.example.frontend;

import dk.cphbusiness.example.contract.PersonManager;
import dk.cphbusiness.example.contract.dto.PersonSummary;
import dk.cphbusiness.example.dummy.PersonManagerDummy;
import dk.cphbusiness.example.frontend.command.Command;
import dk.cphbusiness.example.frontend.command.CommandException;
import dk.cphbusiness.example.frontend.command.Target;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PersonServlet", urlPatterns = {"/Person"})
public class PersonServlet extends HttpServlet {

  @EJB
  private PersonManager manager;

  // private PersonManager manager = new PersonManagerDummy();

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try {
      String commandKey = request.getParameter("command");
      Target target = Command.from(commandKey).execute(request, manager);
      request.getRequestDispatcher(target.getPage()).forward(request, response);
      }
    catch (CommandException ce) {
      request.getRequestDispatcher("oups.jsp").forward(request, response);
      }
    catch (Exception e) {
      try (PrintWriter out = response.getWriter()) {
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<body>");
        out.println("<h3>"+e.getMessage()+"</h2>");
        out.print("<pre>");
        e.printStackTrace(out);
        out.println("</pre>");
        out.println("</body>");
        out.println("</html>");
        }
      }
    }
  }
