package adapterpattern.interfaceadapter;

/*
 * @author : Lordling_Zhang
 * @description : 对象2
 * @date : 2018/7/7
 */
public class SourceSub2 extends Wrapper{

    @Override
    public void method2(){
        System.out.println("only implements method2!");
    }
}
