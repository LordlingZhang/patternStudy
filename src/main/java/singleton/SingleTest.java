package singleton;

/*
 * @author : Lordling_Zhang
 * @description : 优化版的单例使用
 * @date : 2018/7/2
 */
public class SingleTest {

    private static SingleTest instance = null;

    private SingleTest(){

    }

    public static SingleTest getInstance(){
        if (instance == null){
            syncInit();
        }
        return instance;
    }

    /**
     * 将获取实例和实例的初始化分开，避免多进程问题 以及 对获取方法加锁导致 枷锁过于频繁的问题
     */
    public static synchronized void syncInit(){
        if (instance == null){
            instance = new SingleTest();
        }
    }

}
