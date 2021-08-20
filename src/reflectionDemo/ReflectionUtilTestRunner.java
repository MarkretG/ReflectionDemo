package reflectionDemo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class ReflectionUtilTestRunner {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
       Class<?> myClass=Class.forName("reflectionDemo.ReflectionUtil");
        Object reflectionUtil=myClass.newInstance();

        Method[] methods=myClass.getMethods();
        for(Method method:methods) {
         System.out.println(method);
        }

        Constructor<?> constructor1 = myClass.getConstructor(int.class);

     ReflectionUtil myObject1 = (ReflectionUtil) constructor1.newInstance(171501);

     Constructor<?> constructor2 = myClass.getConstructor(String.class,int.class);

     ReflectionUtil myObject2 =(ReflectionUtil) constructor2.newInstance("mark",171502);


     Constructor<?> constructor3 = myClass.getConstructor(int.class,String.class);

     ReflectionUtil myObject3 =(ReflectionUtil) constructor3.newInstance(171518,"vino");

     Constructor<?> constructor4 = myClass.getConstructor(String.class);

     ReflectionUtil myObject4 =(ReflectionUtil) constructor4.newInstance("CSE");




     Method method1=myClass.getDeclaredMethod("display");
        //method.invoke(reflectionUtil);
        method1.invoke(myObject1);

        Method method2=myClass.getDeclaredMethod("show");
       // method1.invoke(reflectionUtil,"mark",4);
        method2.invoke(myObject2);


        Method method3=myClass.getDeclaredMethod("run");
       // method2.invoke(reflectionUtil,10);
        method3.invoke(myObject3);


        Method method4=myClass.getDeclaredMethod("close");
        method4.setAccessible(true);
        method4.invoke(myObject4);

    }
}
