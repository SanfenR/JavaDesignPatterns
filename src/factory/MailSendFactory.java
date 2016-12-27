package factory;

/**
 * Created by sanfen on 2016/12/26.
 */
public class MailSendFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
