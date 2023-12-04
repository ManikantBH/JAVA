class Sample1
{
    void circle(int r)
       {
          final double pi=3.142;
          double result=pi*r*r;
          System.out.println(result);
       }
    void square(int a)
       {
          int result=a*a;
          System.out.println(result);
       }
    void triangle(int b,int h)
       {
          double result=0.5*b*h;
          System.out.println(result);
       }
    void rectangle(int w,int h)
       {
          int result=w*h;
          System.out.println(result);
       }
    void parallelogram(int b,int h)
       {
          int result=b*h;
          System.out.println(result);
       } 
    void tapezoid(int a,int b,int h)
       {
          double result=0.5*a+b*h;
          System.out.println(result);
       }
    void ellipse(int a,int b)
       {
          final double pi=3.142;
          double result=pi*a*b;
          System.out.println(result);
       }
    void sector(int r,int t)
       {
          double result=0.5*r*r*t;
          System.out.println(result);
       }     
}
class Demo1
{
     public static void main(String[] args)
       {
          Sample1 c1=new Sample1();
               c1.circle(7);
          Sample1 s1=new Sample1();
               s1.square(3);
          Sample1 t1=new Sample1();
               t1.triangle(2,2);
          Sample1 r1=new Sample1();
               r1.rectangle(3,3);
          Sample1 p1=new Sample1();
               p1.parallelogram(6,6);
          Sample1 z1=new Sample1();
               z1.tapezoid(2,3,4);
          Sample1 e1=new Sample1();
               e1.ellipse(3,4);
          Sample1 o1=new Sample1();
               o1.sector(2,90);
       }
}