class Tester2
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
          int b=4;
          int h=8;
          double result=0.5*b*h;
          System.out.println(result);
       }
     void square()
       {
          int a=4;
          int result=a*a;
          System.out.println(result);
       }
      void rectangle()
       {
          int w=7;
          int h=4;  
          int result=w*h;
          System.out.println(result);
       }
      void parallelogram()
       {
          int b=9;
          int h=5;
          int result=b*h;
          System.out.println(result);
       }
      void tapezoid()
       {
          int a=7;
          int b=6;
          int h=3;
          double result=0.5*a+b*h;
          System.out.println(result);
       }
      void ellipse()
       {
          final double pi=3.142;
             int a=3;
             int b=4;
          double result=pi*a*b;
          System.out.println(result);
       }
      void sector()
       {
          int r=4;
          int t=60;
          double result=0.5*r*r*t;
          System.out.println(result);
       } 
     public static void main(String[] args)
       {
           Tester2 c=new Tester2();
                  c.circle();
           Tester2 t=new Tester2();
                  t.triangle();
           Tester2 s=new Tester2();
                  s.square();
           Tester2 r=new Tester2();
                  r.rectangle();
           Tester2 p=new Tester2();
                  p.parallelogram();
           Tester2 z=new Tester2();
                  z.tapezoid();
           Tester2 e=new Tester2();
                  e.ellipse();
           Tester2 o=new Tester2();
                  o.sector();        
       }
}