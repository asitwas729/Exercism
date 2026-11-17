public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split(": ");
        return arr[1].trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[") + 1;
        int end = logLine.indexOf("]");
        return logLine.substring(start, end).toLowerCase();
    }

    public static String reformat(String logLine) {
        String result = message(logLine) + " (" + logLevel(logLine) + ")" ;
        return result;
    }
}
