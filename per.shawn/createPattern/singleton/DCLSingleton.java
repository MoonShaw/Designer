package createPattern.singleton;

/**
 * Created by shawn on 2/26/16.
 * 双重校验锁机制
 * 安全,并且在多线程的情况下能保持高性能.
 * 只要该类被装载了,那么instance就会被实例化.
 */
public class DCLSingleton {

    private volatile static DCLSingleton singleton;

    private DCLSingleton(){

    }

    public static DCLSingleton getSingleton(){
        if(singleton == null){
            synchronized (DCLSingleton.class){
                if(singleton == null){
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }

}
