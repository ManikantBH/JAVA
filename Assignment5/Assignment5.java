class Assignment5
{
    static void circle()
      {
          final double pi=3.142;
                        int r=5;
          double result=pi*r*r;
          System.out.println(result);
      }    
    static void triangle()
      {
          int b=3;
          int h=5;
          double result=0.5*b*h;
          System.out.println(result);
      }
     static void square()
      {
          int a=9;
          int result=a*a;
          System.out.println(result);
      }
     static void rectangle()
      {
           int w=8;
           int h=9;
           int result=w*h;
           System.out.println(result);
      }
     static void parallelogram()
      {
           int b=9;
           int h=5;
           int result=b*h;
           System.out.println(result);
      }
     static void tapezoid()
      {
           int a=1;
           int b=3;
           int h=4;
           double result=0.5*a+b*h;
           System.out.println(result);
      }
     static void ellipse()
      {
           final double pi=3.142;
           int a=4;
           int b=5;
           double result=pi*a*b;
           System.out.println(result);
      }
     static void sector()
      {
           int r=2;
           int t=45;
           double result=0.5*r*r*t;
           System.out.println(result);
      }
     public static void main(String[] args)
      {
          System.out.println("-----Main Starts-----");
          circle();
          triangle();
          square();
          rectangle();
          parallelogram();
          tapezoid();
          ellipse();
          sector();
          System.out.println("-----Main Ends-----");
      }
}