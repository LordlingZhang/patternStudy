package adapterpattern.interfaceadapter;

/*
 * @author : Lordling_Zhang
 * @description : 对象1
 * @date : 2018/7/7
 */
public class SourceSub1 extends Wrapper{

    @Override
    public void method1(){
        System.out.println("only implements method1");
    }
}
