class Gmail
{
    static void signup()
      {
        System.out.println("Signing up");
      }
     static void login()
      {
        System.out.println("logging in");
      }
     static void homepage()
      {
        System.out.println("homepage");
      }
     static void logout()
      {
        System.out.println("logout");
      }
     public static void main(String[] args)
      {
        System.out.println("----Gmail Starts----");
        signup();
        login();
        homepage();
        logout();
        System.out.println("----Gmail Ends----");
      }
}  