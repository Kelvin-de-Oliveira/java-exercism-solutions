public class LogLine {
    private String logLine;
    private LogLevel logLevel;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    
        String logLevelStr = logLine.substring(1, 4); 
        switch (logLevelStr) {
            case "TRC" -> this.logLevel = LogLevel.TRACE;
            case "DBG" -> this.logLevel = LogLevel.DEBUG;
            case "INF" -> this.logLevel = LogLevel.INFO;
            case "WRN" -> this.logLevel = LogLevel.WARNING;
            case "ERR" -> this.logLevel = LogLevel.ERROR;
            case "FTL" -> this.logLevel = LogLevel.FATAL;
            default    -> this.logLevel = LogLevel.UNKNOWN;
        }
    }
    
    public LogLevel getLogLevel() {
        return this.logLevel;
        
    }
    public String getOutputForShortLog() {
        String message = logLine.substring(logLine.indexOf("]:") + 2).trim();
        return logLevel.getCodeLevel() + ":" + message;
    }
}
