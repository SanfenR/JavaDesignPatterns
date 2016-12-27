package interperter;

/**
 * Created by sanfen on 2016/12/26.
 * 解释器模式（Interpreter）
 * 解释器模式是我们暂时的最后一讲，一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。
 */
public class Main {
    public static void main(String[] args){

        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);

    }
}
