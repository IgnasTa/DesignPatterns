package ignas.app.chain;

import ignas.app.builder.Report;

public class ReportTitleHandler extends Handler {

    @Override
    protected boolean canHandle(String operation) {
        return operation == "LogTitle";
    }

    @Override
    protected void process(Report report) {
        System.out.println("Logging report title: " + report.getTitle());
    }
}
