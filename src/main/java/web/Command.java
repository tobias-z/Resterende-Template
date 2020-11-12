
package web;

import api.Template;
import api.facades.TemplateFacade;
import exceptions.WebException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put("redirect", new Redirect());
    }

    static Command from( HttpServletRequest request ) {
        String targetName = request.getParameter( "target" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(targetName, new UnknownCommand() );   // unknowncommand er default.
    }

    protected static final Template api;

    static {
        api = createTemplate();
    }

    private static Template createTemplate(){
        return new Template(TemplateFacade.getInstance());
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response )
            throws WebException;

}
