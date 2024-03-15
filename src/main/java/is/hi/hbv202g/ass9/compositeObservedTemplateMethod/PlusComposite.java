package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;


import java.util.ArrayList;
import java.util.List;

public class PlusComposite extends CompositeTemplateMethod  {
    @Override
    protected int calculateResult() {
        int result = 0;
        for (MathExpression expression : expressions) {
            result += expression.getResult();
        }
        return result;
    }

}
