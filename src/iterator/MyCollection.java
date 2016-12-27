package iterator;


/**
 * Created by sanfen on 2016/12/26.
 */
public class MyCollection implements Collection {
    public String string[] = {"A", "B", "C", "D", "E"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
