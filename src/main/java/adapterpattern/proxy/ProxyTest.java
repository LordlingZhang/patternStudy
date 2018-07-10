package adapterpattern.proxy;

/*
 * @author : Lordling_Zhang
 * @description : ${描述}
 * @date : 2018/7/10
 */
public class ProxyTest {
    public static void main(String[] args){
        Sourceable1 sourceable1 = new ProxySource();
        sourceable1.method();
    }
}
