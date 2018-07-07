package adapterpattern.classadapter;

/*
 * @author : Lordling_Zhang
 * @description : ${描述}
 * @date : 2018/7/7
 */
public class Adapter extends Source implements TargetInterface{

    public void method2() {
        System.out.println("this is method2 implements from TargetInterace!");
    }
}
