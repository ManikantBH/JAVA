class Demo2
{
    static double circle()
      {
         final double pi=3.142;
                int r=5;
        double result=pi*r*r;
          return result;
      }
    static int square()
      {
         int a=2;
         int result=a*a;
         return result;
      }
    static double triangle()
     {
          int b=4;
          int h=9;
          double result=0.5*b*h;
          return result;
     }
    static int rectangle()
     {
          int w=7;
          int h=7;
          int result=w*h;
          return result;
     }
    static int parallelogram()
     {
          int b=6;
          int h=6;
          int result=b*h;
          return result;
     }
    static double tapezoid()
     {
          int a=2;
          int b=6;
          int h=9;
          double result=0.5*a+b*h;
          return result;
     }
    static double ellipse()
     {
          final double pi=3.142;
          int a=2;
          int b=2;
          double result=pi*a*b;
          return result;
     }
    static double sector()
     {
          int r=3;
          int t=45;
          double result=0.5*r*r*t;
          return result;
     }
}
     class Tester2
      {
         public static void main(String[] args)
           {
             double x=Demo2.circle();
               System.out.println(x);
             int y=Demo2.square();
               System.out.println(y);
             double z=Demo2.triangle();
               System.out.println(z);
             int m=Demo2.rectangle();
               System.out.println(m);
             int n=Demo2.parallelogram();
               System.out.println(n);
             double o=Demo2.tapezoid();
               System.out.println(o);
             double p=Demo2.ellipse();
               System.out.println(p);
             double q=Demo2.sector();
               System.out.println(q);     
           }
      }