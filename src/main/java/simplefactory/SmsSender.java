package simplefactory;

/*
 * @author : Lordling_Zhang
 * @description : 短信发送类
 * @date : 2018/7/1
 */
public class SmsSender implements Sender{

    public void send() {
        System.out.println("发送短信");
    }
}
