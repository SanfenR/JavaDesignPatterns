package state;

/**
 * Created by sanfen on 2016/12/26.
 */
public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("execute the first opt");
    }

    public void method2(){
        System.out.println("execute the second opt");
    }
}

