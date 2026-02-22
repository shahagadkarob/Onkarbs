
public class Basic {
	public static void main(String args[]) 
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println("Plese Enter at least 2 Arguments...");
		}
		catch(ArithmeticException ae) 
		{
			System.out.println("Don't Enter Second Number as 0");
		}
		catch(NumberFormatException ne) 
		{
			System.out.println("Please Provide Only Degites...!");
		}
		catch(Exception e) 
		{
			System.out.println("Someting Went Wrong....!");
		}
		finally {
			System.out.println("Divison Done....!");
		}
		
	}

}
