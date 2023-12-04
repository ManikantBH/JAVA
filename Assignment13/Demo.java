class Sample1
{
     void circle()
      {
          final double pi=3.142;
           int r=5;
         double result=pi*r*r;
         System.out.println(result);
      }
     void triangle()
      {
         int b=3;
         int h=6; 
         double result=0.5*b*h;
         System.out.println(result);
      }
     void square()
      {
        int a=2;
        int result=a*a;
        System.out.println(result);
      }
     void rectangle()
      {
        int w=9;
        int h=7;
        int result=w*h;
        System.out.println(result);
      }
     void parallelogram()
      {
        int b=3;
        int h=5;
        int result=b*h;
        System.out.println(result);
      }  
     void tapezoid()
      {
        int a=4;
        int b=4;
        int h=6;
        double result=0.5*a+b*h;
        System.out.println(result);
      } 
     void ellipse()
      {
        final double pi=3.142;
          int a=7;
          int b=5;
        double result=pi*a*b;
        System.out.println(result);
      }
     void sector()
      {
        int r=3;
        int t=45;
        double result=0.5*r*r*t;
        System.out.println(result);
     }
}
class Demo
{
      public static void main(String[] args)
      {
         Sample1 s1=new Sample1();
         s1.circle();
         Sample1 t1=new Sample1();
         t1.triangle();
         Sample1 q1=new Sample1();
         q1.square();
         Sample1 r1=new Sample1();
         r1.rectangle();
         Sample1 p1=new Sample1();
         p1.parallelogram();
         Sample1 z1=new Sample1();
         z1.tapezoid();
         Sample1 e1=new Sample1();
         e1.ellipse();
         Sample1 c1=new Sample1();
         c1.sector();
      }
}