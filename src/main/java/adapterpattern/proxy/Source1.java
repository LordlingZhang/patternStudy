package adapterpattern.proxy;

/*
 * @author : Lordling_Zhang
 * @description : 需要被代理的类
 * @date : 2018/7/10
 */
public class Source1 implements Sourceable1{
    public void method() {
        System.out.println("here method");
    }
}
