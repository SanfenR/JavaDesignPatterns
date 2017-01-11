package factory;

/**
 * Created by sanfen on 2016/12/26.
 * 4种工厂模式
 */
public class Main {
    public static void main(String[] args){
        //普通工厂
        SendFactory factory = new SendFactory();
        Sender mail = factory.product("mail");
        mail.send();

        //多个工厂
        MoreSendFactory moreSendFactory = new MoreSendFactory();
        Sender sender = moreSendFactory.produceMail();
        sender.send();


        //静态工厂
        Sender sender1 = StaticSendFactory.produceMail();
        sender1.send();

        //抽象工厂

        Sender produce = new SmsSendFactory().produce();
        produce.send();
    }
}
