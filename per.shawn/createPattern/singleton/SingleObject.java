package createPattern.singleton;

/**
 * Created by shawn on 2/26/16.
 */
public class SingleObject {


    //创建自身类的对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为private,这样类就不会被实例化
    private SingleObject(){

    }

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.print("Hello world!");
    }
}
