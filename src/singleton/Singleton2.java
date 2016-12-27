package singleton;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Singleton2 {

    private Singleton2(){
    }


    public static class Singleton2Factory {
        private static Singleton2 sIngleton2 = new Singleton2();
    }
    public static Singleton2 getInstance(){
        return Singleton2Factory.sIngleton2;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
