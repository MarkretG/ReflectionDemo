package reflectionDemo;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtilTestRunner {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
       Class myClass=Class.forName("reflectionDemo.ReflectionUtil");
        Object reflectionUtil=myClass.newInstance();
        Method[] methods=myClass.getMethods();

        for(Method method:methods)
        {
            System.out.println(method.getName());
        }
        Method method=myClass.getDeclaredMethod("display");
        method.invoke(reflectionUtil);

    }
}
