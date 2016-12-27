package visitor;

/**
 * Created by sanfen on 2016/12/26.
 */
public interface Subject{
    void accept(Visitor visitor);
    String getSubject();
}
