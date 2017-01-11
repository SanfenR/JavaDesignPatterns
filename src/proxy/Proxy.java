package proxy;

/**
 * Created by sanfen on 2016/12/26.
 *
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();

        source.method();
        after();
    }

    private void after() {
        System.out.println("before proxy");
    }

    private void before() {
        System.out.println("after proxy!");
    }

}
