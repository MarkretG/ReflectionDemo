package reflectionDemo;
public class ReflectionUtil {
    String name;
    int rollNum;
    int regNo;
    String dep;
   /* public ReflectionUtil() {
        System.out.println("default constructor");
    }*/
    public ReflectionUtil(int rollNum) {
        this.rollNum=rollNum;
    }
    public ReflectionUtil(String name,int rollNum) {
        this.name=name;
        this.rollNum=rollNum;
    }
    public ReflectionUtil(int regNo,String name) {
        this.regNo=regNo;
        this.name=name;
    }
    public ReflectionUtil(String dep) {
        this.dep=dep;
    }

    public void show()
    {
        System.out.println("Number:"+name+" "+"Number:"+rollNum);
    }
    public void run()
    {

        System.out.println("reg no:"+regNo+ "name:"+name);
    }

    private void close()
    {
        System.out.println("department:"+dep);
    }
    public void  display()
    {
        System.out.println(rollNum);
    }
}
