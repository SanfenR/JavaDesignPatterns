package proxy;

/**
 * Created by sanfen on 2016/12/26.
 *  代理模式（Proxy）
 * 其实每个模式名称就表明了该模式的作用，
 * 代理模式就是多一个代理类出来，替原对象进行一些操作，
 */
public class Main {
    public static void main(String[] args){
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
