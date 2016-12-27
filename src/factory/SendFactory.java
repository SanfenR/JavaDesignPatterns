package factory;

/**
 * Created by sanfen on 2016/12/26.
 */


/**
 * 普通工厂模式，
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 */
public class SendFactory {
    public Sender product(String type){
        if ("mail".equals(type)){
            return new MailSender();
        } else if ("sms".equals(type)){
            return new SmsSender();
        }else {
            return null;
        }
    }
}
