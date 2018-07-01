package simplefactory;

/*
 * @author : Lordling_Zhang
 * @description : 多个简单方法
 * @date : 2018/7/1
 */
public class ManySimpleFactory {
    /**
     * 生产短信发送
     * @return
     */
    public Sender produceSmsSender(){
        return new SmsSender();
    }

    /**
     * 生产邮件发送
     * @return
     */
    public Sender produceMailSender(){
        return new MailSender();
    }



    public static void main(String[] args){
        ManySimpleFactory manySimpleFactory = new ManySimpleFactory();
        Sender sender = manySimpleFactory.produceMailSender();
        sender.send();
    }
}
