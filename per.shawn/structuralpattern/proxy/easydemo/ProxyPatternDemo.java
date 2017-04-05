package structuralpattern.proxy.easydemo;


import java.util.Date;

/**
 * Created by shawn on 2017/4/5.
 */
public class ProxyPatternDemo {


    public static void main(String[] args){
        IGamePlayer player = new GamePlayer("Jone");

        IGamePlayer proxy = new GamePlayerProxy(player);

        System.out.println("开始时间是:"+ new Date());

        proxy.login("Jone","12331");

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("结束时间是:"+new Date());
    }
}
