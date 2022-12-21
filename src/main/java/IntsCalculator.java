public class IntsCalculator implements Ints {

    protected final Calculator target;

    public IntsCalculator(Calculator target) {
        this.target = target;
    }

    @Override
    public int sum(int arg0, int arg1) {

        return (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int sub(int arg0, int arg1) {
        return (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUB)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public double div(double arg0, double arg1) {
        if (arg1 == 0) {
            throw new IllegalStateException("На ноль делить нельзя");
        }
        return target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.DIV)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        if (a == 0 & b == 0) {
            throw new IllegalStateException("0^0 не определен!");
        }
        return (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
