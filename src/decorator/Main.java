package decorator;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Main  {
    public static void main(String[] args){


        Sourceable sourceable = new Source();

        Sourceable sourceable1 = new Decorator(sourceable);

        sourceable1.method();
    }
}
