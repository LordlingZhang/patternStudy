package factorymethod;

import simplefactory.Sender;
import simplefactory.SmsSender;

/**
 * @author : Lordling_Zhang
 * @description : 短信发送工厂
 * @date : 2018/7/1
 */
public class SendSmsFactoy implements Provider{
    /**
     * 产生工厂
     *
     * @return
     */
    public Sender produce() {
        return new SmsSender();
    }
}
