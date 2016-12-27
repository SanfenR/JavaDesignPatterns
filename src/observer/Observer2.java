package observer;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
