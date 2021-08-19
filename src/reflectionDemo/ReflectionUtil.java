package reflectionDemo;
public class ReflectionUtil {

    int num;
    String name;
    float number;
    double balance;
    public ReflectionUtil() {
        System.out.println("default constructor");
    }
    public ReflectionUtil(int num) {
        this.num=num;
    }
    public ReflectionUtil(String name) {
        this.name=name;
    }
    public ReflectionUtil(float number) {
        this.number=number;
    }
    public ReflectionUtil(double balance) {
        this.balance=balance;
    }


    public void display()
    {
        System.out.println("display success");
    }
    public void show(int number)
    {
        System.out.println("Number:"+number);
    }
    public  void run(String s,int number)
    {
        System.out.println(s+" "+number);
    }
    private void close(String s)
    {
        System.out.println("");
    }
    public void  display(int number,String name,float num)
    {
        System.out.println("Number:"+number+" "+"Name:"+name+" "+"Float value");
    }
}
