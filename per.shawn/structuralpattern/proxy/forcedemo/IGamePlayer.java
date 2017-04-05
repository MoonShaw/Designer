package structuralpattern.proxy.forcedemo;

/**
 * Created by shawn on 2017/4/5.
 *
 * 游戏者接口
 */
public interface IGamePlayer {

    void login(String user, String password);

    void killBoss();

    void upgrade();


    IGamePlayer getProxy();

}
