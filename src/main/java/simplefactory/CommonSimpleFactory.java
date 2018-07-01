package simplefactory;

import org.apache.commons.lang3.StringUtils;

/*
 * @author : Lordling_Zhang
 * @description : 普通简单工厂
 * @date : 2018/7/1
 */
public class CommonSimpleFactory {
    /**
     * 生产发送类
     * @param type
     * @return
     */
    public Sender produce(String type){
        if (StringUtils.equals(type, "sms")){
            return new SmsSender();
        }else if (StringUtils.equals(type, "mail")){
            return new MailSender();
        }else {
            System.out.println("请输入合适的类型");
        }
        return null;
    }


    public static void main(String[] args){
        CommonSimpleFactory sendFactory = new CommonSimpleFactory();
        Sender sender = sendFactory.produce("sms");
        sender.send();
    }

}
