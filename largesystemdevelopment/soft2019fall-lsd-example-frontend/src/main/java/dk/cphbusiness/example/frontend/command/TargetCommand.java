package dk.cphbusiness.example.frontend.command;

import dk.cphbusiness.example.contract.PersonManager;
import javax.servlet.http.HttpServletRequest;

class TargetCommand extends Command {
  private final Target target;
  
  TargetCommand(Target target) {
    this.target = target;
    }
  
  @Override
  public Target execute(HttpServletRequest request, PersonManager manager) throws CommandException {
    return target;
    }
  
  }
