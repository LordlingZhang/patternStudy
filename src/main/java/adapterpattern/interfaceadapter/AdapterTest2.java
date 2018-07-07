package adapterpattern.interfaceadapter;

/*
 * @author : Lordling_Zhang
 * @description : 接口适配器测试类
 * @date : 2018/7/7
 */
public class AdapterTest2 {

    public static void main(String[] args){
        Sourceable sourceable1 = new SourceSub1();
        sourceable1.method1();
        sourceable1.method2();
        Sourceable sourceable2 = new SourceSub2();
        sourceable2.method2();
        sourceable2.method3();
    }
}
