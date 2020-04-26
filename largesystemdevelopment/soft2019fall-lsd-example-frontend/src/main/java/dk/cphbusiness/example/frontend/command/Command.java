package dk.cphbusiness.example.frontend.command;

import dk.cphbusiness.example.contract.PersonManager;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public abstract class Command {
  private static Map<String, Command> commands = null;
  
  public static Command from(String key) {
    if (commands == null) {
      commands = new HashMap<>();
      Target main = new Target("main.jsp");
      Target list = new Target("list.jsp");
      Target edit = new Target("edit.jsp");
      
      Command listCommand = new ListCommand(list);
      
      commands.put("list", listCommand);
      commands.put("edit", new EditCommand(edit));
      commands.put("back", new TargetCommand(main));
      commands.put("save", new SaveCommand(listCommand));
      commands.put("skip", listCommand);
      commands.put("make", new MakeCommand(edit));
      
      // ...
      }
    if (key == null || key.isEmpty()) key = "back";
    return commands.get(key);
    }
  
  public abstract Target execute(HttpServletRequest request, PersonManager manager) throws CommandException;
  
  }
