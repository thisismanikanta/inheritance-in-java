//write a JAVA program to implement multilevel inheritance

class A
{
 public void methodA()
 {
  System.out.println("class A");
  }
}
class B extends A
{
 public void methodB()
 {
  System.out.println("class B");
 }
}
class C extends B
{
 public void methodC()
 {
  System.out.println("class C");
 }
 public static void main(String args[])
 {
  C c=new C();
  c.methodA();
  c.methodB();
  c.methodC();
 
 }
}


//output:
class A
class B
class C
