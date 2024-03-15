package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpression {
    private int value;

    public NumberLeaf(int value) {
        this.value = value;
    }

    @Override
    public int getResult() {
        return value;
    }
}