package is.hi.hbv202g.ass9.compositeObserved;

public class NumberLeaf extends Observable implements MathExpression {
    private int value;

    public NumberLeaf(int value) {
        this.value = value;
    }

    @Override
    public int getResult() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}