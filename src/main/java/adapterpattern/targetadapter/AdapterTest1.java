package adapterpattern.targetadapter;

/*
 * @author : Lordling_Zhang
 * @description : 对象适配器的测试类
 * @date : 2018/7/7
 */
public class AdapterTest1 {

    /**
     * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题。
     * @param args
     */
    public static void main(String[] args){
        Source1 source1 = new Source1();
        TargetInterface1 targetInterface1 = new Adapter1(source1);
        targetInterface1.method1();
        targetInterface1.method2();
    }
}
