//write a JAVA program to implement single inheritance

class A
{
 public void methodA()
 {
  System.out.println("parent class");
  }
}
class B extends A
{
 public void methodB()
 {
  System.out.println("child class");
 }
 public static void main(String args[])
 {
  B b=new B();
  b.methodA();
  b.methodB();
 }
}


//output:
parent class
child class  
