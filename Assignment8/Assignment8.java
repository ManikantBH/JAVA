class Assignment8
{
    static double circle()
      {
          final double pi=3.142;
          int r=2; 
          double result=pi*r*r;
          return result;
      }
    static int square()
      {
          int a=3;
          int result=a*a;
          return result;
      }
    static int rectangle()
      {
          int w=4;
          int h=6;
          int result=w*h;
          return result;
      }
     static int parallelogram()
      {
          int b=8;
          int h=9;
          int result=b*h;
          return result;
      }
     static double tapezoid()
      {
          int a=2;
          int b=5;
          int h=5;
          double result=0.5*a+b*h;
          return result;
      }
     static double triangle()
      {
          int b=6;
          int h=8;
          double result=0.5*b*h;
          return result;
      }
     static double ellipse()
      {
          final double pi=3.142;
          int a=9;
          int b=7;
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
     public static void main(String[] args)
      {
        System.out.println("----Main Starts----");
        double x=circle();
          System.out.println(x);
        int y=square();   
          System.out.println(y);
        int z=rectangle();
          System.out.println(z);
        int p=parallelogram();
          System.out.println(p);
        double t=tapezoid();
          System.out.println(t);
        double u=triangle();
          System.out.println(u);
        double e=ellipse();
          System.out.println(e);
        double s=sector();
          System.out.println(s);
        System.out.println("----Main Ends----");
      }
}