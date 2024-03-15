package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;


import java.util.ArrayList;
import java.util.List;

public abstract class CompositeTemplateMethod implements MathExpression, Observer {
    protected List<MathExpression> expressions = new ArrayList<>();
    protected int lastObservedResult;
    public void add(MathExpression expression) {
        expressions.add(expression);
        if (expression instanceof Observable) {
            ((Observable) expression).attach( this);
        }
    }

    protected abstract int calculateResult();

    @Override
    public int getResult() {
        return calculateResult();
    }

    @Override
    public void update() {
        lastObservedResult = calculateResult();
        System.out.println("New result after update: " + lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}