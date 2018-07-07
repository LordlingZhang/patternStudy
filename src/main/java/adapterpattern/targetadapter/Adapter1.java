package adapterpattern.targetadapter;

/*
 * @author : Lordling_Zhang
 * @description : 对象是配置模式
 * @date : 2018/7/7
 */
public class Adapter1 extends Source1 implements TargetInterface1{

    private Source1 source1;

    public Adapter1(Source1 source1){
        super();
        this.source1 = source1;
    }

    public void method2() {
        System.out.println("this is method2 implements from TargetInterace!");
    }

    @Override
    public void method1(){
        source1.method1();
    }
}
