package builder;

/**
 * Created by sanfen on 2016/12/26.
 *
 * 构建器模式(Builder Pattern)
 * 当参数过多的时候避免重载构造方法而使用构建器
 */
public class Main {

    public static void main(String[] args){
        Example example = new Example.Builder()
                .setDate("123")
                .setName("456")
                .builder();

        Example builder = example
                .reBuilder()
                .setDate("456")
                .builder();

    }
}
