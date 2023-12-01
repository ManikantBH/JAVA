class Assignment6
{
    static void circle(int r)
      {    
        final double pi=3.142;
        double result=pi*r*r;
        System.out.println(result);
      }
    static void square(int a)
      {
        int result=a*a;
        System.out.println(result);
      }
    static void rectangle(int w,int h)
      {
        int result=w*h;
        System.out.println(result);
      }
    static void parallelogram(int b,int h)
      {
        int result=b*h;
        System.out.println(result);
      }
     static void tapezoid(int a,int b,int h)
      {  
        double result=0.5*a+b*h;
        System.out.println(result);
      }
     static void ellipse(int a,int b)
      {
        final double pi=3.142;
        double result=pi*a*b;
        System.out.println(result);
      }
     static void sector(int r,int t)
      {
        double result=0.5*r*r*t;
        System.out.println(result);
      }
    public static void main(String[] args)
      {
      System.out.println("---Main Starts---");
      circle(3);
      square(9);
      rectangle(10,20);
      parallelogram(2,7);
      tapezoid(3,4,5);
      ellipse(3,4);
      sector(2,30);
      System.out.println("---Main Ends---");
      }
}

    