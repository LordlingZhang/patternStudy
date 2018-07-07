package adapterpattern.decorator;

/*
 * @author : Lordling_Zhang
 * @description : 装饰类测试
 * @date : 2018/7/7
 */
public class DecoratorTest {

    /**
     * 个人认为这个装饰类有点像切面的方法
     * @param args
     */
    public static void main(String[] args){
        Sourceable3 sourceable1 = new BeDecoratoredTarget();
        Sourceable3 sourceable2 = new DecoratorTarget(sourceable1);
        sourceable2.method();

    }
}
