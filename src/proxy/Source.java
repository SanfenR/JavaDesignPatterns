package proxy;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this original method!");
    }
}
