package Interfaces;

import java.util.logging.Logger;
public interface iLogger {
  String checkFile(String fileName);
  Logger createFileHandler(String filePath);
  void initLogger();
  Logger getMainLogger();
  void writeLog(Logger logger, String message);

}
