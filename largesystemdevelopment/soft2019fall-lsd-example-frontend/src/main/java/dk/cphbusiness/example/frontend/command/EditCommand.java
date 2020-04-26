package dk.cphbusiness.example.frontend.command;

import dk.cphbusiness.example.contract.PersonManager;
import dk.cphbusiness.example.contract.dto.PersonDetail;
import dk.cphbusiness.example.contract.dto.PersonIdentifier;
import javax.servlet.http.HttpServletRequest;

class EditCommand extends TargetCommand {
  
  EditCommand(Target target) {
    super(target);
    }

  @Override
  public Target execute(HttpServletRequest request, PersonManager manager) throws CommandException {
    String id = request.getParameter("id");
    PersonIdentifier personIdentifier = new PersonIdentifier(Integer.parseInt(id));
    PersonDetail personDetail = manager.find(personIdentifier);
    request.setAttribute("personDetail", personDetail);
    return super.execute(request, manager);
    }
  
  }
