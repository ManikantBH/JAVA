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
       new Tester().circle(2);
       new Tester().triangle(3,4);
       new Tester().square(5);
       new Tester().rectangle(3,5);
       new Tester().parallelogram(6,7);
       new Tester().tapezoid(2,6,3);
       new Tester().ellipse(4,4);
       new Tester().sector(3,90);
    }
}