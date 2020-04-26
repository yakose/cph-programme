package dk.cphbusiness.example.frontend.command;

import dk.cphbusiness.example.contract.PersonManager;
import javax.servlet.http.HttpServletRequest;

class LinkedCommand extends Command {
  private final Command link;
  
  LinkedCommand(Command link) {
    this.link = link;
    }

  @Override
  public Target execute(HttpServletRequest request, PersonManager manager) throws CommandException {
    return link.execute(request, manager);
    }
  
  }
