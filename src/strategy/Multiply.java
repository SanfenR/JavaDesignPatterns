package strategy;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Multiply  extends AbstractCalculator implements ICalculator{
    @Override
    public int calcutor(String exp) {
        int arrInt[] = split(exp, "\\*");
        return arrInt[0] * arrInt[1];
    }
}
