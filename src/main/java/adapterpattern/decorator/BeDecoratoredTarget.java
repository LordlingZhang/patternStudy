package adapterpattern.decorator;

/*
 * @author : Lordling_Zhang
 * @description : 被装饰的对象
 * @date : 2018/7/7
 */
public class BeDecoratoredTarget implements Sourceable3 {

    public void method() {
        System.out.println("被装饰类的执行方式！");
    }
}
