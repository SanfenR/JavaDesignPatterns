package bridge;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Main {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        Sourceable sourceable = new SourceSub1();
        bridge.setSourceable(sourceable);
        bridge.method();


        Sourceable sourceable1 = new SourceSub2();
        bridge.setSourceable(sourceable1);
        bridge.method();

    }
}
