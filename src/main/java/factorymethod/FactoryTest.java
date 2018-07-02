package factorymethod;

import simplefactory.Sender;

/**
 * @author : Lordling_Zhang
 * @description : 工厂方法测试类
 * @date : 2018/7/1
 */
public class FactoryTest {

    public static void main(String[] args){
        Provider provider = new SendMailFactoy();
        Sender sender = provider.produce();
        sender.send();
    }
}
