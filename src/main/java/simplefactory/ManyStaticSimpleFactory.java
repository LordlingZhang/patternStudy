package simplefactory;

/*
 * @author : Lordling_Zhang
 * @description : 多个静态工厂
 * @date : 2018/7/1
 */
public class ManyStaticSimpleFactory {
    /**
     * 生产短信发送
     * @return
     */
    public static Sender produceSmsSender(){
        return new SmsSender();
    }

    /**
     * 生产邮件发送
     * @return
     */
    public static Sender produceMailSender(){
        return new MailSender();
    }



    public static void main(String[] args){
        Sender sender = ManyStaticSimpleFactory.produceMailSender();
        sender.send();
    }

}
