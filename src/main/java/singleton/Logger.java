package singleton;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Logger {
  protected int num = 1;

  public void log(String msg) {
    Calendar calendar = new GregorianCalendar();
    DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    String s = "[" + formatter.format(calendar.getTime()) + "] ";
    System.out.println("[" + num++ + "] " + s + msg);
  }

  private static Logger logger;

  private Logger() {}

  public static Logger getInstance() {
    if(logger == null) {
      logger = new Logger();
    }
    return logger;
  }
}