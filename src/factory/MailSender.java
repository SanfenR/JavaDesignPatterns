package factory;

/**
 * Created by sanfen on 2016/12/26.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("MailSender Send!");
    }
}
