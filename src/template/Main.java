package template;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Main {
    public static void main(String[] args){
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);

    }
}
