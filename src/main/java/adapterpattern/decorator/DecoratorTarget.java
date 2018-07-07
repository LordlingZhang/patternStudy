package adapterpattern.decorator;

/*
 * @author : Lordling_Zhang
 * @description : 装饰类，用于装饰包装被装饰类
 * @date : 2018/7/7
 */
public class DecoratorTarget implements Sourceable3 {

    private Sourceable3 sourceable;

    public DecoratorTarget(Sourceable3 sourceable){
        super();
        this.sourceable = sourceable;
    }

    public void method() {
        System.out.println("before invoke method!");
        sourceable.method();
        System.out.println("after invoke method!");
    }
}
