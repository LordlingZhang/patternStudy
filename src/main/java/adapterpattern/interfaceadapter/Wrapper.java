package adapterpattern.interfaceadapter;

/*
 * @author : Lordling_Zhang
 * @description : 抽象包装类 继承接口，这样所有的子类就不需要实现所有的接口
 * @date : 2018/7/7
 */
public abstract class Wrapper implements Sourceable{

    public void method1() {
        System.out.println("methos1 from wrapper!");
    }

    public void method2() {
        System.out.println("methos2 from wrapper!");
    }

    public void method3() {
        System.out.println("methos3 from wrapper!");
    }
}
