package createPattern.singleton;

/**
 * Created by shawn on 2/26/16.
 * 静态内部类
 * 对静态域使用延迟初始化,应该使用这种方式.Singleton类被装载使用时,instance不一定被初始化,
 * 因为SingletonHolder类没有被主动使用,只有显示通过调用getInstance方法时,
 * 才会显示装载SingletonHolder类,从而实例化instance.
 */
public class InstanceSingleton {

    private static class SingletonHolder{
        private static final InstanceSingleton INSTANCE = new InstanceSingleton();

    }

    private InstanceSingleton(){

    }

    public static final InstanceSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
