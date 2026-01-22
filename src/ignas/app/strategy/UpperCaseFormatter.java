package ignas.app.strategy;

public class UpperCaseFormatter implements Formatter{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
