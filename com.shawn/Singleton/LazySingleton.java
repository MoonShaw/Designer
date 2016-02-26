package Singleton;

/**
 * Created by shawn on 2/26/16.
 * 懒汉式
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){

    }

    //第一次调用时,才创建实例,避免资源浪费.
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }


}
