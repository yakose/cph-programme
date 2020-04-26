package dk.cphbusiness.example.frontend.command;

import dk.cphbusiness.example.contract.PersonManager;
import dk.cphbusiness.example.contract.dto.PersonDetail;
import javax.servlet.http.HttpServletRequest;

public class MakeCommand extends TargetCommand {
  
  public MakeCommand(Target target) {
    super(target);
    }

  @Override
  public Target execute(HttpServletRequest request, PersonManager manager) throws CommandException {
    PersonDetail personDetail = new PersonDetail(0, "", "", "");
    request.setAttribute("personDetail", personDetail);
    return super.execute(request, manager);
    }
  
  
  }
