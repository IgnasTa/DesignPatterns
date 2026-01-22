package ignas.app.chain;

import ignas.app.builder.Report;

public class ReportSectionCount  extends Handler {

    @Override
    protected boolean canHandle(String operation) {
        return operation == "CountSections";
    }

    @Override
    protected void process(Report report) {
        System.out.println("Count of report sections: " + report.getSections().size());
    }
}

