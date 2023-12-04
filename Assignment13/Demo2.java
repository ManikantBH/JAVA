class Sample1
{
     double circle()
       {
          final double pi=3.142;
            int r=9;
          double result=pi*r*r;
          return result;
       }
     int square()
       {
          int a=3;
          int result=a*a;
          return result;
       }
     double triangle()
       {
          int b=4;
          int h=4;
          double result=0.5*b*h;
          return result;
       }
     int rectangle()
       {
          int w=5;
          int h=8;
          int result=w*h;
          return result;
       }
     int parallelogram()
       {
          int b=5;
          int h=7;
          int result=b*h;
          return result;
       }
     double tapezoid()
       {
          int a=1;
          int b=2;
          int h=3;
          double result=0.5*a+b*h;
          return result;
       }
     double ellipse()
       {
          final double pi=3.142;
             int a=2;
             int b=3;
          double result=pi*a*b;
           return result;
       }
     double sector()
       {
          int r=3;
          int t=90;
          double result=0.5*r*r*t;
          return result;
       }
}
class Demo2
{
     public static void main(String[] args)
       {
           Sample1 c1=new Sample1();
           double a=c1.circle();
           System.out.println(a);

           Sample1 s1=new Sample1();
           int b=s1.square();
           System.out.println(b);

           Sample1 t1=new Sample1();
           double c=t1.triangle();
           System.out.println(c);
 
           Sample1 r1=new Sample1();
           int d=r1.rectangle();
           System.out.println(d);
 
           Sample1 p1=new Sample1();
           int e=p1.parallelogram();
           System.out.println(e);

           Sample1 z1=new Sample1();
           double f=z1.tapezoid();
           System.out.println(f);

           Sample1 e1=new Sample1();
           double g=e1.ellipse();
           System.out.println(g);

           Sample1 o1=new Sample1();
           double h=o1.sector();
           System.out.println(h);
       }
}
              