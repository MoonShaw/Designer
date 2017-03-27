package createPattern.abstractfactory;

/**
 * Created by shawn on 2017/3/27.
 */
public class FactoryProducer {
   static  <T extends AbstractFactory> T getFactory(Class<T> tClass){

         AbstractFactory abstractFactory = null;

         try {
             abstractFactory = (AbstractFactory)Class.forName(tClass.getName()).newInstance();
         } catch (InstantiationException e) {
             e.printStackTrace();
         } catch (IllegalAccessException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }

         return (T)abstractFactory;

     }
}
