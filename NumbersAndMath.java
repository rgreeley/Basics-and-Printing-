public class NumbersAndMath
{
	public static void main( String[] args )
	{
		System.out.println( "I will now count my chickens:" );
		//The line below does the math in the paren.
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0) );
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );
		
		System.out.println( "Now I will count the eggs:" );
		
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );
		//This line takes the math statement as a question and give an answer or True or False.
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );
		//These lines state the question and then give the answer.
		System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );
		
		System.out.println( "Oh, that's why it's false." );
		
		System.out.println( "How about some more." );
		//These lines are asking a question doing the math and stating a True or False answer.
		System.out.println( "Is it greater? " + ( 5.0 > -2.0 ) );
		System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ) );
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
	}
}
		
		