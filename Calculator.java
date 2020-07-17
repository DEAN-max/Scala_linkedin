public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println(addition(x,y));
        System.out.println(quotient(x,y));
        System.out.println(times(x,y));
        System.out.println(minus(x,y));

    }
    public static int addition(int a, int b)
	{
		return a + b;
	}
	public static int quotient(int a, int b)
	{
            if(b == 0)
                return 0;
            return a/b;
	}
	public static int times(int c, int d)
	{
		return c * d;
	}
	public static int minus(int a, int b)
	{
		return a - b;
	}
    
}
