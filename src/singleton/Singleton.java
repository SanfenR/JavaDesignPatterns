package singleton;

/**
 * Created by sanfen on 2016/12/26.
 * 单例对象（Singleton）是一种常用的设计模式。
 * 在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在。这样的模式有几个好处：
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
