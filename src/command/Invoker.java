package command;

/**
 * Created by sanfen on 2016/12/26.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }

}
