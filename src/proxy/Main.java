package proxy;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Main {
    public static void main(String[] args){
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
