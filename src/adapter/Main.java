package adapter;

/**
 * Created by sanfen on 2016/12/26.
 * 3种适配器模式
 */
public class Main {
    public static void main(String[] args){
        //类的适配器模式
        Targetable targetable = new Adapter();

        targetable.method1();
        targetable.method2();

        //对象的适配器模式
        Targetable targetable1 = new Wrapper(new Source());

        targetable.method1();
        targetable.method2();


        //接口适配器模式
        Sourceable sourceable = new SourceSub1();

        sourceable.method1();
        sourceable.method2();

        Sourceable sourceable1 = new SourseSub2();
        sourceable1.method1();
        sourceable1.method2();

    }
}
