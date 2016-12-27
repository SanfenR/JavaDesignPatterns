package iterator;

/**
 * Created by sanfen on 2016/12/26.
 */
public interface Collection {
    Iterator iterator();
    Object get(int i);
    int size();
}
