import java.util.ArrayList;
import java.util.ListIterator;

public class intellij_class
{ // START OF INTELLIJ CLASS
	private boolean Test_Boolean;
	
	private String Test_String;
	private String Second_Test_String;
	
	private int Test_Int;
	private int Second_Test_Int;
	private int Third_Test_Int;
	
	public intellij_class ()
	{
		Test_Boolean = false;
		
		Test_String = "";
		Second_Test_String = "";
		
		Test_Int = 0;
		Second_Test_Int = 1;
		Third_Test_Int = 2;
	}
		
	public intellij_class ( boolean Test_Boolean, String Test_String, String Second_Test_String, int Test_Int, int Second_Test_Int, int Third_Test_Int)
	{
		this.Test_Boolean = Test_Boolean;
			
		this.Test_String = Test_String;
		this.Second_Test_String = Second_Test_String;
			
		this.Test_Int = Test_Int;
		this.Second_Test_Int = Second_Test_Int;
		this.Third_Test_Int = Third_Test_Int;
	}
		
	@Override
	public String toString ()
	{
		return Test_Boolean + "/n" +
				Test_String + " " + Second_Test_String + "/n" +
				Test_Int + " " + Second_Test_Int + " " + Third_Test_Int;
	}
	
	public boolean simpleIf ()
	{
		String example = Test_String + Second_Test_String;
		
		if (example.length () >= 4)
		{
			return Test_Boolean;
		}
		
		return !(Test_Boolean);
	}
	
	public String ifAndElse ()
	{
		int sum = Test_Int + Second_Test_Int + Third_Test_Int;
		
		if (sum >= 10)
		{
			return Test_String;
		}
		else
		{
			return Second_Test_String;
		}
	}
	
	public boolean ifAndElif ()
	{
		String total = Test_String + Second_Test_String;
		int sum = Test_Int + Second_Test_Int + Third_Test_Int;
		
		if (total.length () >= 6)
		{
			return Test_Boolean;
		}
		else if (sum < 20)
		{
			return (true && Test_Boolean);
		}
		
		return false;
	}
	
	public String whileLoop ()
	{
		String returner = "";
		int i = 0;
		
		while (i < 3)
		{
			returner += Test_String;
			
			i++;
		}
		
		return returner;
	}
	
	public int forLoop ()
	{
		int sum = 0;
		
		for (int i = 0; i < 10; i++)
		{
			sum += Second_Test_Int;
		}
		
		return sum;
	}
	
	public String oneDArray ()
	{
		String[] line = new String[2];
		
		line[0] = Test_String;
		line[1] = Second_Test_String;
		
		return line[0] + " " + line[1];
	}
	
	public String twoDArray ()
	{
		int[][] grid = new int[2][3];
		String returner = "";
		
		grid[0][0] = Test_Int;
		grid[0][1] = Second_Test_Int;
		grid[0][2] = Third_Test_Int;
		
		grid[1][0] = 3 * Test_Int;
		grid[1][1] = 3 * Second_Test_Int;
		grid[1][2] = 3 * Third_Test_Int;
		
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				returner += grid[i][j] + " ";
			}
			
			returner += "/n";
		}
		
		return returner;
	}
	
	public boolean inArrayList (String input)
	{
		ArrayList<String> a = new ArrayList<String> ();
		a.add (Test_String);
		a.add (Second_Test_String);
		
		if (a.get (0) == input || a.get (1) == input)
		{
			return true;
		}
		else
		{
			return Test_Boolean;
		}
	}
} // END OF INTELLIJ CLASS
