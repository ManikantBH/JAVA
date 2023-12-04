class Tester1
{
     double triangle()
       {
           int b=9;
           int h=8;
        double result=0.5*b*h;
        return result;
       }
     int square()
       {
          int a=3;
          int result=a*a;
          return result;
       }
     int rectangle()
       {
          int w=3;
          int h=4;
          int result=w*h;
          return result;
       }
    int paralleogram()
       {
          int b=3;
          int h=4;
          int result=b*h;
          return result;
       }
     double tapezoid()
       {
          int a=5;
          int b=8;
          int h=9;
          double result=0.5*a+b*h;
          return result;
       }
     double circle()
       {
          final double pi=3.142;
          int r=3;
          double result=pi*r*r;
          return result;
       } 
     double  ellipse()
       {
          final double pi=3.142;
          int a=7;
          int b=6;
          double result=pi*a*b;
          return result;
       }
     double sector()
       {
          int r=5;
          int t=45;
          double result=0.5*r*r*t;
          return result;
       } 
public static void main(String[] args)
       {
          Tester1 t=new Tester1();
          double x=t.triangle();
          System.out.println(x);
             
          Tester1 s=new Tester1();
          int y=s.square();
          System.out.println(y);
   
          Tester1 r=new Tester1();
          int z=r.rectangle();
          System.out.println(z);

          Tester1 p=new Tester1();
          int a=p.paralleogram();
          System.out.println(a);
 
          Tester1 e=new Tester1();
          double b=e.tapezoid();
          System.out.println(b);
    
          Tester1 c=new Tester1();
          double d=c.circle();
          System.out.println(d);

          Tester1 l=new Tester1();
          double m=l.ellipse();
          System.out.println(m);
 
          Tester1 k=new Tester1();
          double n=k.sector();
          System.out.println(n);
       }
}