public class LogLine {
    String name = "";
    String logLine = "";
    public LogLine(String logLine) {
        this.logLine = logLine;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<3; i++){
            sb.append(logLine.charAt(i+1));
        }
        
        this.name = sb.toString();
    }

    public LogLevel getLogLevel() {
        return LogLevel.fromCode(this.name);
    }

    public String getOutputForShortLog() {
        String[] str = logLine.split("]: ");
        
        return LogLevel.encoder(this.name) + ":" + str[1];
        
    }
}
