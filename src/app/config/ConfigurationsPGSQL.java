package app.config;

public class ConfigurationsPGSQL extends Configurations{
    public ConfigurationsPGSQL() {
        super.TYPE = "postgres";
        super.HOST = "localhost";
        super.USER = "postgres";
        super.PASS = "106868";
        super.PORT = "5432";
        super.BASE = "med";
        super.DRIV = "com.mysql.cj.jdbc.Driver";
        super.SSL = "&useSSL=false";
        super.TIMEZONE = "&useTimezone=true&serverTimezone=UTC";
    }
}