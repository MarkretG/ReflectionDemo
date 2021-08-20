package reflectionDemo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtilTestRunner {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
       Class<?> myClass=Class.forName("reflectionDemo.ReflectionUtil");
        Object reflectionUtil=myClass.newInstance();

        Method[] methods=myClass.getMethods();
        for(Method method:methods)
        {
            System.out.println(method);
        }

        Method method=myClass.getDeclaredMethod("display");
        method.invoke(reflectionUtil);

        Method method1=myClass.getDeclaredMethod("run", String.class, int.class);
        method1.invoke(reflectionUtil,"mark",4);
        System.out.println(method1);

        Method method2=myClass.getDeclaredMethod("show", int.class);
        method2.invoke(reflectionUtil,10);

        Method method3=myClass.getDeclaredMethod("close", String.class);
        method3.setAccessible(true);
        method3.invoke(reflectionUtil,"close");

        Method method4=myClass.getDeclaredMethod("display", int.class,String.class,float.class);
        method4.invoke(reflectionUtil,6,"vino",89);

    }
}
