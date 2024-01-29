
    
public class A
{
     void showA()
    {
        System.out.println(" DNA class method");
    }
}
class B extends A
{
    void showB()
    {
        System.out.println("b class method");
    }

    public static void main(String[] args) {
        A obj=new A();
        obj.showA();
       // obj.showB();//not call b class method through a class object


        B ob2=new B();
     ob2.showB();
       ob2.showA();
   }
}
