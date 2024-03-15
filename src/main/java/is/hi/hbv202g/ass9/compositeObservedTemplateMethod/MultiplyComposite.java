package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;


public class MultiplyComposite extends CompositeTemplateMethod implements Observer, MathExpression {
    @Override
    protected int calculateResult() {
        int result = 1;
        for (MathExpression expression : expressions) {
            result *= expression.getResult();
        }
        return result;
    }
}
