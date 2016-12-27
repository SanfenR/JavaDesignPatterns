package builder;

/**
 * Created by sanfen on 2016/12/26.
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
