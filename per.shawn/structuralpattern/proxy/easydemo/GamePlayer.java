package structuralpattern.proxy.easydemo;

/**
 * Created by shawn on 2017/4/5.
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    /**
     * 构造参数,指定需要代练的游戏玩家
     * @param name
     */
    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为"+user+"的用户"+this.name+"登陆成功!");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+"正在打怪!");
    }

    @Override
    public void upgrade() {

        System.out.println(this.name+"又升级了!");
    }
}
