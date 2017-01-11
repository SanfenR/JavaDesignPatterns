package singleton;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton(){

    }


//    //线程不安全
//    public static Singleton getInstance(){
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//

    //线程安全
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }



    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve(){
        return instance;
    }

}
