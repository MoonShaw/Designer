package structuralpattern.prototype;

/**
 * Created by shawn on 2017/4/6.
 */
public class PrototypePatternDemo {

    private static int MAX_COUNT = 6;

    /*public static void main(String[] args) {
        int i=0;

        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("你真是运气太好啦!");
        while(i< MAX_COUNT){

            Mail cloneMail = mail.clone();
            cloneMail.setAppellation((1+Math.random())*10+" ");
            cloneMail.setReceiver((1+Math.random())*10+" ");
            sendMail(cloneMail);
            i++;
        }

    }*/


    public static void sendMail(Mail mail){
        System.out.println(" "+mail.getSubject() +"  "+mail.getAppellation() +" " +mail.getReceiver());
    }


    /**
     * 浅拷贝测试
     *
     * 只是拷贝本对象,其对象内部的数组、引用对象都不拷贝,还是指向原生对象的内部元素地址
     * 其他基本类型比如 int、long、char等都会被拷贝
     * String类型比较特殊，当做基本类型使用
     *
     */
   /* public static void main(String[] args) {
        ShallowThing shallowThing = new ShallowThing();
        shallowThing.setValue("Jonna");

        ShallowThing shallowThing1 = shallowThing.clone();
        shallowThing1.setValue("Lucy");


        System.out.println(shallowThing.getValue());
        System.out.println(shallowThing1.getValue());
    }*/


    /**
     * 深拷贝，对私有的类变量进行独立的拷贝
     * @param args
     */
    public static void main(String[] args) {
        DeepThing deepThing = new DeepThing();
        deepThing.setValue("Jonna");

        DeepThing deepThing1 = deepThing.clone();
        deepThing1.setValue("Lucy");


        System.out.println(deepThing.getValue());
        System.out.println(deepThing1.getValue());
    }




}
