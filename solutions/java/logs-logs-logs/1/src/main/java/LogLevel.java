public enum LogLevel {
    TRACE("TRC"),
    DEBUG("DBG"),
    INFO("INF"),
    WARNING("WRN"),
    ERROR("ERR"),
    FATAL("FTL"),
    UNKNOWN("UKN");

    private final String code;

    LogLevel(String code){
        this.code = code;
    }

    public static LogLevel fromCode(String code){
        return switch (code){
            case "TRC" -> TRACE;
            case "DBG" -> DEBUG;
            case "INF" -> INFO;
            case "WRN" -> WARNING;
            case "ERR" -> ERROR;
            case "FTL" -> FATAL;
            default -> UNKNOWN;
        };
    }
    public static int encoder(String code){
        return switch (code){
            case "TRC" -> 1;
            case "DBG" -> 2;
            case "INF" -> 4;
            case "WRN" -> 5;
            case "ERR" -> 6;
            case "FTL" -> 42;
            default -> 0;
        };
    }
}


