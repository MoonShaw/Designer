package structuralpattern.proxy.normaldemo;

/**
 * Created by shawn on 2017/4/5.
 */
public class ClientDemo {

    public static void main(String[] args){
        IGamePlayer proxy  = new GamePlayerProxy("Jone");

        proxy.login("Jone","1231332");
        proxy.killBoss();
        proxy.upgrade();
    }
}
