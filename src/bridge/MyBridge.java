package bridge;

/**
 * Created by sanfen on 2016/12/26.
 *
 *
 */
public class MyBridge extends Bridge {
    public void method() {
        getSourceable().method();
    }

}
