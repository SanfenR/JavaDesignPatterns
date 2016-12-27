package mediator;

/**
 * Created by sanfen on 2016/12/26.
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.print("user2 exe");
    }
}
