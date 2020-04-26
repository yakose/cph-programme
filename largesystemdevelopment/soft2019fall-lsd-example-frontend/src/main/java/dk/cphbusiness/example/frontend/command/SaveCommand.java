package dk.cphbusiness.example.frontend.command;

import dk.cphbusiness.example.contract.PersonManager;
import dk.cphbusiness.example.contract.dto.PersonDetail;
import javax.servlet.http.HttpServletRequest;

class SaveCommand extends LinkedCommand {
  
  SaveCommand(Command link) {
    super(link);
    }

  @Override
  public Target execute(HttpServletRequest request, PersonManager manager) throws CommandException {
    int id = Integer.parseInt(request.getParameter("id"));
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String email = request.getParameter("email");
    PersonDetail personDetail = new PersonDetail(id, firstName, lastName, email);
    personDetail = manager.save(personDetail);
    return super.execute(request, manager);
    }
  
  }
