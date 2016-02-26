package Singleton;

/**
 * Created by shawn on 2/26/16.
 * 饿汉式
 */
public class HungerySingleton {

    private static HungerySingleton hungerySingleton = new HungerySingleton();

    private HungerySingleton(){

    }

    //类加载时就初始化,浪费内存.但是没有加锁,执行效率会提高.
    public static HungerySingleton getInstance(){
        return hungerySingleton;
    }
}
