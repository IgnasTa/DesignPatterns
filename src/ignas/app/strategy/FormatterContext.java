package ignas.app.strategy;

public class FormatterContext {
    private Formatter formatter;

    public FormatterContext(Formatter formatter) {
        this.formatter = formatter;
    }

    public Formatter getFormatter() {
        return formatter;
    }
    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }

    public String apply(String text){
        return formatter.format(text);
    }
}
