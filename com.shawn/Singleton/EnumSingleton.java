package Singleton;

/**
 * Created by shawn on 2/26/16.
 * 枚举单例类.
 * 自动支持序列化机制,绝对防止多次实例化.
 * 枚举实例创建默认为线程安全的,避免多线程同步问题
 * 使用 EnumSingleton.INSTANCE 调用
 */
public enum EnumSingleton {
    INSTANCE;
    public void whateverMethod(){

    }
}
