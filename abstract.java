// write a JAVA program for abstract class to find areas of different shapes

abstract class A
{
 abstract void circle(int r);
 abstract void triangle(int b,int h);
 abstract void square(int a);
}
class Shapes extends A
{
  void circle(int r)
  {
    System.out.println("circle area:"+(3.145*r*r));
  }
  void triangle(int b,int h)
  {
      System.out.println("triangle area:"+(0.5*b*h));
  }
  void square(int a)
  {
    System.out.println("square area:"+(a*a));
  }
  public static void main(String args[])
  {
    Shapes obj=new Shapes();
    obj.circle(2);
    obj.triangle(5,2);
    obj.square(4);
  }
 }


//output
circle area: 12.58
triangle area:5.0
square area: 16
