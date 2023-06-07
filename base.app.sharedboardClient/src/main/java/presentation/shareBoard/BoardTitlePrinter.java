package presentation.shareBoard;

import eapli.framework.visitor.Visitor;

public class BoardTitlePrinter implements Visitor<String> {
    @Override
    public void visit(String visitee) {
        System.out.printf("%s",visitee);
    }
}
