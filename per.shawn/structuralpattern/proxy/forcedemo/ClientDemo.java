package structuralpattern.proxy.forcedemo;


/**
 * Created by shawn on 2017/4/5.
 */
public class ClientDemo {

   /* public static void main(String[] args){
        IGamePlayer proxy  = new GamePlayer("Jone");

        proxy.login("Jone","1231332");
        proxy.killBoss();
        proxy.upgrade();
    }*/

   /* public static void main(String[] args){
        IGamePlayer player  = new GamePlayer("Jone");
        IGamePlayer proxy = new GamePlayerProxy(player);

        proxy.login("Jone","1231332");
        proxy.killBoss();
        proxy.upgrade();
    }*/


    public static void main(String[] args){
        IGamePlayer player  = new GamePlayer("Jone");
        IGamePlayer proxy = player.getProxy();

        proxy.login("Jone","1231332");
        proxy.killBoss();
        proxy.upgrade();
    }
}
