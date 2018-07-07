package adapterpattern.classadapter;

/*
 * @author : Lordling_Zhang
 * @description : 类的适配器模式测试
 * @date : 2018/7/7
 */
public class AdapterTest {

    /**
     * 这样Targetable接口的实现类就具有了Source类的功能。
     * @param args
     */
    public static void main(String[] args){
        TargetInterface targetInterface = new Adapter();
        targetInterface.method2();
        targetInterface.method1();
    }

}
