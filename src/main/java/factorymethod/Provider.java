package factorymethod;/*
 * @author : Lordling_Zhang
 * @description : ${描述}
 * @date : 2018/7/1
 */

import simplefactory.Sender;

public interface Provider {
    /**
     * 产生工厂
     * @return
     */
    Sender produce();
}
