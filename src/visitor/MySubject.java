package visitor;

/**
 * Created by sanfen on 2016/12/26.
 */
public class MySubject implements  Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
