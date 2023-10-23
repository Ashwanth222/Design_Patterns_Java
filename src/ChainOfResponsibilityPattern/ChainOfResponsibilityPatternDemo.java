package ChainOfResponsibilityPattern;

public class ChainOfResponsibilityPatternDemo {
    //    public static void main(String[] args)
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;

    }

    public static void main(String[] args) {
        AbstractLogger logOfChain = getChainOfLoggers();
        logOfChain.logMessage(AbstractLogger.INFO, "this is info information");
        System.out.println(" ");
        logOfChain.logMessage(AbstractLogger.DEBUG, "this is debug level information");
        System.out.println(" ");
        logOfChain.logMessage(AbstractLogger.ERROR, "this is error level information");
        System.out.println(" ");

    }
}
