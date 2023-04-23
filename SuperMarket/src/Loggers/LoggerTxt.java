package Loggers;

import java.util.logging.*;
import java.io.File;
import Interfaces.iLogger;

public class LoggerTxt implements iLogger {
  private String loggerName;
  private String mainFilePath;
  private Logger mainLogger;

  public LoggerTxt(String loggerName) {
    this.loggerName = loggerName;
    this.mainFilePath = this.checkFile("market.txt");
    this.initLogger();
  }

  public String getLoggerName() {
    return this.loggerName;
  }

  @Override
  public Logger getMainLogger() {
    return mainLogger;
  }

  @Override
  public String checkFile(String fileName) {
    String localPath = this.getClass().getResource("").getPath();
    String pathFile = localPath.concat("files/"+fileName);
    try {
      File file = new File(pathFile);
      if (file.createNewFile()) {
        System.out.printf("%s > New file created!\n", getLoggerName());
      } else {
        System.out.printf("%s > Necessary file existed!\n", getLoggerName());
      }
    } catch (Exception e) {
      System.out.printf("%s > BOOM!\n", getLoggerName());
      e.printStackTrace();
    }
    return pathFile;
  }

  @Override
  public void initLogger() {
    this.mainLogger = createFileHandler(this.mainFilePath);
    System.out.printf("*** %s is ready! ***\n", getLoggerName());
  }

  @Override
  public Logger createFileHandler(String filePath) {
    Logger logger = Logger.getLogger(filePath);
    /*
     * Path was format: /C:/Folder
     * Error, just fix it by cut that symbol
     */
    String pathFile = filePath.substring(1);
    FileHandler fh;
    try {
      fh = new FileHandler(pathFile, true); // add new lines mode
      logger.addHandler(fh);
      // To turn off the console handler:
      logger.setUseParentHandlers(false);
      SimpleFormatter sFormat = new SimpleFormatter();
      fh.setFormatter(sFormat);
    } catch (Exception e) {
      System.out.println("BOOM!");
      e.printStackTrace();
    }
    return logger;
  }

  @Override
  public void writeLog(Logger logger, String message) {
    logger.info(message);
  }

}