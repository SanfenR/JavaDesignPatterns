package bridge;

/**
 * Created by sanfen on 2016/12/26.
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }

}
