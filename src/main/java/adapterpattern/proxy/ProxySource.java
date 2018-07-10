package adapterpattern.proxy;

/*
 * @author : Lordling_Zhang
 * @description : ${描述}
 * @date : 2018/7/10
 */
public class ProxySource implements Sourceable1{

    private Source1 source1;

    public ProxySource(){
        super();
        this.source1 = new Source1();
    }


    public void method() {
        before();
        source1.method();
        after();
    }

    private void before(){
        System.out.println("before proxy!");
    }
    private void after(){
        System.out.println("after proxy!");
    }
}
