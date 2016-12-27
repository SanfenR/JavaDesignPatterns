package interperter;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
