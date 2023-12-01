class Tester
{
    void circle()
     {
        final double pi=3.142;
              int r=3;
         double result=pi*r*r;
         System.out.println(result);
     }
    void square()
     {
        int a=2;
        int result=a*a;
        System.out.println(result);
     }
    void triangle()
     {
        int b=2;
        int h=9;
        double result=0.5*b*h;
        System.out.println(result);
     }
    void rectangle()
     {
        int w=3;
        int h=5;
        int result=w*h;
        System.out.println(result);
     }
    void parallelogram()
     {
        int b=7;
        int h=3;
        int result=b*h;
        System.out.println(result);
     }
    void tapezoid()
     {
        int a=2;
        int b=9;
        int h=6;
        double result=0.5*a+b*h;
        System.out.println(result);
     }
    void ellipse()
     {
        final double pi=3.142;
        int a=3;
        int b=7;
        double result=pi*a*b;
        System.out.println(result);
     }
    void sector()
     {
        int r=4;
        int t=45;
        double result=0.5*r*r*t;
        System.out.println(result);
     }
public static void main(String[] args)
    {
        new Tester().circle();
        new Tester().square();
        new Tester().triangle();
        new Tester().rectangle();
        new Tester().parallelogram();
        new Tester().tapezoid();
        new Tester().ellipse();
        new Tester().sector();
    }
}
