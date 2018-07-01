package simplefactory;

/*
 * @author : Lordling_Zhang
 * @description : 邮件发送类
 * @date : 2018/7/1
 */
public class MailSender implements Sender{


    public void send() {
        System.out.println("发送邮件");
    }
}
