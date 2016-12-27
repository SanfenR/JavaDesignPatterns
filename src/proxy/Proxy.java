package proxy;

/**
 * Created by sanfen on 2016/12/26.
 *
 * 代理模式（Proxy）
 * 其实每个模式名称就表明了该模式的作用，代理模式就是多一个代理类出来，替原对象进行一些操作，
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
