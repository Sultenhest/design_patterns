package singleton;

import java.util.Date;
import java.util.List;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Logger {
    private List<String> cmds = Collections.synchronizedList( new ArrayList<>() );
    private static Logger logger;
    private PrintWriter writer;

    private Logger() {
        try{
            FileWriter file = new FileWriter("src/singleton/log.txt", true);
            writer = new PrintWriter(file, true);
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }

    public static synchronized Logger getInstance() {
        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void addCommand(String cmd) {
        cmds.add( new Date().toString() + " : " + cmd );
    }

    public void undoCommand() {
        cmds.remove( cmds.size() - 1 );
    }

    public void print() {
        for ( String cmd : cmds ) {
            System.out.println( cmd );
        }
    }

    public void logToFile() {
        writer.println( "* * * * * * * * * * * * * * * * * * * * *" );
        writer.println( new Date().toString() + " - NEW ENTRY" );
        writer.println( "* * * * * * * * * * * * * * * * * * * * *" );
        for ( String cmd : cmds ) {
            writer.println( cmd );
        }
    }
}
