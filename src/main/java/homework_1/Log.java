package homework_1;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;
public class Log {
    static {
        try (FileInputStream in = new FileInputStream("src/log.config")) { //полный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}
