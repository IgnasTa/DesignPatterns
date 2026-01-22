package ignas.app.chain;

import ignas.app.builder.Report;

public abstract class Handler {

    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public void handle(Report report, String operation) {
        if (canHandle(operation)) {
            process(report);
            return; // stop chain after handling
        }
        if (next != null) {
            next.handle(report, operation);
        }
    }

    protected abstract boolean canHandle(String operation);
    protected abstract void process(Report report);
}