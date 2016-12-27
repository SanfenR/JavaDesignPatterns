package iterator;

/**
 * Created by sanfen on 2016/12/26.
 */
public interface Iterator {
    Object previous();
    Object next();
    boolean hasNext();
    Object first();
}
