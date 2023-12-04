class Tester
{
     void circle(int r)
       {
           final double pi=3.142;
           double result=pi*r*r;
           System.out.println(result);
       }
     void triangle(int b,int h)
       {
          double result=0.5*b*h;
          System.out.println(result);
       }
     void square(int a)
       {
          int result=a*a;
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
     public static void main(String[] args)
       {
           Tester c=new Tester();
                  c.circle(5);
           Tester t=new Tester();
                  t.triangle(2,3);
           Tester s=new Tester();
                  s.square(8);
           Tester r=new Tester();
                  r.rectangle(2,7);
           Tester p=new Tester();
                  p.parallelogram(4,4);
           Tester z=new Tester();
                  z.tapezoid(2,3,4);
           Tester e=new Tester();
                  e.ellipse(4,5);
           Tester o=new Tester();
                  o.sector(3,45);        
       }
}