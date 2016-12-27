package adapter;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is this targetable method");
    }
}
