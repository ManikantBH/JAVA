class Demo3
{
    static void circle()
      {
         final double pi=3.142;
         int r=2;
         double result=pi*r*r;
         System.out.println(result);
      }
    static void square()
      {
         int a=3;
         int result=a*a;
         System.out.println(result);
      }
    static void triangle()
      {
         int b=2;
         int h=9;
         double result=0.5*b*h;
         System.out.println(result);
      }
    static void rectangle()
      {
         int w=5;
         int h=9;
         int result=w*h;
         System.out.println(result);
      }
    static void parallelogram()
      {
         int b=7;
         int h=8;
         int result=b*h;
         System.out.println(result);
      }
    static void tapezoid()
      {
         int a=7;
         int b=8;
         int h=9;
         double result=0.5*a+b*h;
         System.out.println(result);
      }
    static void ellipse()
      {
         final double pi=3.142;
         int a=7;
         int b=6;
         double result=pi*a*b;
         System.out.println(result);
      }
    static void sector()
      {
         int r=3;
         int t=45;
         double result=0.5*r*r*t;
         System.out.println(result);
      }

}
class Tester3
{
    public static void main(String[] args)
    {
       Demo3.circle();
       Demo3.square();
       Demo3.triangle();
       Demo3.rectangle();
       Demo3.parallelogram();
       Demo3.tapezoid();
       Demo3.ellipse();
       Demo3.sector();
    }
}