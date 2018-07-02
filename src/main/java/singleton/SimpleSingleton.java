package singleton;

/**
 * @description: 简单单例
 * @author: 17020644
 */
public class SimpleSingleton {

    private static SimpleSingleton instance = null;

    public SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (instance == null){
            instance = new SimpleSingleton();
        }
        return instance;
    }

}
