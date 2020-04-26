package dk.cphbusiness.example.frontend.command;

import dk.cphbusiness.example.contract.PersonManager;
import dk.cphbusiness.example.contract.dto.PersonSummary;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

class ListCommand extends TargetCommand {
  
  ListCommand(Target target) {
    super(target);
    }

  @Override
  public Target execute(HttpServletRequest request, PersonManager manager) throws CommandException {
    Collection<PersonSummary> personSummaries = manager.list();
    request.setAttribute("personSummaries", personSummaries);
    return super.execute(request, manager);
    }
  
  }
