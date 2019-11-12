import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class unit_tests
{ // START OF UNIT TESTS
	//1: false, "Civilization", "V", 0, 0, 0
	//2: true, "Samuel", "Sparenga", 16, 25, 49
	
	//toString
	@Test
	void testToString ()
	{
		intellij_class first = new intellij_class ();
		assertEquals ("false/n /n0 1 2", first.toString () );
	}
	
	@Test
	void secondTestToString ()
	{
		intellij_class second = new intellij_class (false, "AZ", "BY", 1, 2, 3);
		assertEquals ("false/nAZ BY/n1 2 3", second.toString () );
	}
	
	@Test
	void thirdTestToString ()
	{
		intellij_class third = new intellij_class (true, "xyz", "abc", 6, 7, 8);
		assertEquals ("true/nxyz abc/n6 7 8", third.toString () );
	}
	
	@Test
	void fourthTestToString ()
	{
		intellij_class fourth = new intellij_class (true, "Samuel", "Sparenga", 16, 25, 49);
		assertEquals ("true/nSamuel Sparenga/n16 25 49", fourth.toString () );
	}
	
	//If
	@Test
	void simpleIf ()
	{
		intellij_class first = new intellij_class (true, "Samuel", "Sparenga", 16, 25, 49);
		assertEquals (true, first.simpleIf () );
	}
	
	@Test
	void secondSimpleIf ()
	{
		intellij_class second = new intellij_class (true, "a", "b", 16, 25, 49);
		assertEquals (false, second.simpleIf () );
	}
	
	@Test
	void thirdSimpleIf ()
	{
		intellij_class third = new intellij_class ();
		assertEquals (true, third.simpleIf () );
	}
	
	@Test
	void fourthSimpleIf ()
	{
		intellij_class fourth = new intellij_class (false, "Civilization", "V", 0, 0, 0);
		assertEquals (false, fourth.simpleIf () );
	}
	
	//If/Else
	@Test
	void ifAndElse ()
	{
		intellij_class first = new intellij_class ();
		assertEquals ("", first.ifAndElse ());
	}
	
	@Test
	void secondIfAndElse ()
	{
		intellij_class second = new intellij_class (true, "Samuel", "Sparenga", 16, 25, 49);
		assertEquals ("Samuel", second.ifAndElse ());
	}
	
	@Test
	void thirdIfAndElse ()
	{
		intellij_class third = new intellij_class (false, "Civilization", "V", 0, 0, 0);
		assertEquals ("V", third.ifAndElse ());
	}
	
	@Test
	void fourthIfAndElse ()
	{
		intellij_class fourth = new intellij_class (false, "Civilization", "V", 3, 3, 4);
		assertEquals ("Civilization", fourth.ifAndElse ());
	}
	
	//If/Else If
	@Test
	void ifAndElif ()
	{
		intellij_class first = new intellij_class ();
		assertEquals (false, first.ifAndElif ());
	}
	
	@Test
	void secondIfAndElif ()
	{
		intellij_class second = new intellij_class (false, "Civilization", "V", 0, 0, 0);
		assertEquals (false, second.ifAndElif ());
	}
	
	@Test
	void thirdIfAndElif ()
	{
		intellij_class third = new intellij_class (true, "Civ", "V", 0, 0, 0);
		assertEquals (true, third.ifAndElif ());
	}
	
	@Test
	void fourthIfAndElif ()
	{
		intellij_class fourth = new intellij_class (true, "Sam", "Spar", 5, 5, 5);
		assertEquals (true, fourth.ifAndElif ());
	}
	
	//While
	@Test
	void whileLoop ()
	{
		intellij_class first = new intellij_class ();
		assertEquals ("", first.whileLoop ());
	}
	
	@Test
	void secondWhileLoop ()
	{
		intellij_class second = new intellij_class (false, "Civilization", "V", 0, 0, 0);
		assertEquals ("CivilizationCivilizationCivilization", second.whileLoop ());
	}
	
	@Test
	void thirdWhileLoop ()
	{
		intellij_class third = new intellij_class (true, "Sam", "", 2, 2, 2);
		assertEquals ("SamSamSam", third.whileLoop ());
	}
	
	@Test
	void fourthWhileLoop ()
	{
		intellij_class fourth = new intellij_class (false, "", "Civilization", 1, 2, 3);
		assertEquals ("", fourth.whileLoop ());
	}
	
	//For
	@Test
	void forLoop ()
	{
		intellij_class first = new intellij_class ();
		assertEquals (10, first.forLoop ());
	}
	
	@Test
	void secondForLoop ()
	{
		intellij_class second = new intellij_class (false, "Civilization", "V", 0, 9, 0);
		assertEquals (90, second.forLoop ());
	}
	
	@Test
	void thirdForLoop ()
	{
		intellij_class third = new intellij_class (true, "Samuel", "Sparenga", 16, 25, 49);
		assertEquals (250, third.forLoop ());
	}
	
	@Test
	void fourthForLoop ()
	{
		intellij_class fourth = new intellij_class (false, "s", "s", 2, 0, 2);
		assertEquals (0, fourth.forLoop ());
	}
	
	//1-D Array
	@Test
	void oneDArray ()
	{
		intellij_class first = new intellij_class ();
		assertEquals (" ", first.oneDArray ());
	}
	
	@Test
	void secondOneDArray ()
	{
		intellij_class second = new intellij_class (false, "Samuel", "S.", 2, 4, 8);
		assertEquals ("Samuel S.", second.oneDArray ());
	}
	
	@Test
	void thirdOneDArray ()
	{
		intellij_class third = new intellij_class (false, "4567876543", "efnsdjfndjkf", 67, 45, 45);
		assertEquals ("4567876543 efnsdjfndjkf", third.oneDArray ());
	}
	
	@Test
	void fourthOneDArray ()
	{
		intellij_class fourth = new intellij_class (true, "Civilization V", "is the best.", 45, 3, 45);
		assertEquals ("Civilization V is the best.", fourth.oneDArray ());
	}
	
	//2-D Array
	@Test
	void twoDArray ()
	{
		intellij_class first = new intellij_class ();
		assertEquals ("0 1 2 /n0 3 6 /n", first.twoDArray ());
	}
	
	@Test
	void secondTwoDArray ()
	{
		intellij_class second = new intellij_class (false, "", "", 4, 5, 6);
		assertEquals ("4 5 6 /n12 15 18 /n", second.twoDArray ());
	}
	
	@Test
	void thirdTwoDArray ()
	{
		intellij_class third = new intellij_class (false, "S", "S", 0, 0, 0);
		assertEquals ("0 0 0 /n0 0 0 /n", third.twoDArray ());
	}
	
	@Test
	void fourthTwoDArray ()
	{
		intellij_class fourth = new intellij_class ( true, "Samuel", "Sparenga", 16, 25, 49);
		assertEquals ("16 25 49 /n48 75 147 /n", fourth.twoDArray ());
	}
	
	//Array List
	@Test
	void inArrayList ()
	{
		intellij_class first = new intellij_class ();
		assertEquals (true, first.inArrayList (""));
	}
	
	@Test
	void secondInArrayList ()
	{
		intellij_class second = new intellij_class ( false, "Samuel", "Sparenga", 16, 25, 49);
		assertEquals (true, second.inArrayList ("Samuel"));
	}
	
	@Test
	void thirdInArrayList ()
	{
		intellij_class third = new intellij_class (false, "Civilization V", "Best", 0,0,0);
		assertEquals (false, third.inArrayList ("Worst"));
	}
	
	@Test
	void fourthInArrayList ()
	{
		intellij_class fourth = new intellij_class (true, "", "asdf", 3, 2, 1);
		assertEquals (true, fourth.inArrayList (""));
	}
} // END OF UNIT TESTS
