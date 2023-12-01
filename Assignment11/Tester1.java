class Tester1
{
   double circle()
     {
        final double pi=3.142;
         int r=3;
        double result=pi*r*r;
        return result;
     }
    double triangle()
     {
        int b=3;
        int h=9;
        double result=0.5*b*h;
        return result;
     }
    int rectangle()
     {
        int w=9;
        int h=7;
        int result=w*h;
        return result;
     }
    int parallelogram()
     {
        int b=4;
        int h=7;
        int result=b*h;
        return result;
     }
    double tapezoid()
     {
       int a=2;
       int b=7;
       int h=7;
       double result=0.5*a+b*h;
       return result;
     }
    double ellipse()
     {
       final double pi=3.142;
       int a=2;
       int b=4;
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
        double x=new Tester1().circle();
          System.out.println(x);
        double y=new Tester1().triangle();
          System.out.println(y);
        int z=new Tester1().rectangle();
          System.out.println(z);
        int p=new Tester1().parallelogram();
          System.out.println(p);
        double t=new Tester1().tapezoid();
          System.out.println(t);
        double e=new Tester1().ellipse();
          System.out.println(e);
        double s=new Tester1().sector();
          System.out.println(s);  
     }

}