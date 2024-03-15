package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {
    private List<MathExpression> expressions = new ArrayList<>();
    private int lastObservedResult;

    public void add(MathExpression expression) {
        expressions.add(expression);
        if (expression instanceof Observable) {
            ((Observable) expression).attach(this);
        }
    }

    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression expression : expressions) {
            result *= expression.getResult();
        }
        return result;
    }

    @Override
    public void update() {
        lastObservedResult = getResult();
        System.out.println("New result after update in MultiplyComposite: " + lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}