package recursion;

public class Recursion1 {

	public static int factorial( int n ) {
		return n < 2 ? n : n * factorial( n - 1 );
	}

	public static int bunnyEars( int n ) {
		return n < 1 ? 0 : 2 + bunnyEars( n - 1 );
	}

	public static int fibonacciLoop( int n ) {
		int a = 0, b = 1, temp;
		for ( int i = 1; i < n; i++ ) {
			temp = b;
			b = a + b;
			a = temp;
		}
		return n < 2 ? n : b;
	}

	public static int fibonacci( int n ) {
		int a = 0, b = 1, temp;
		for ( int i = 1; i < n; i++ ) {
			temp = b;
			b = a + b;
			a = temp;
		}
		return n < 2 ? n : fibonacci( n - 1 ) + fibonacci( n - 2 );
	}

	public static int bunnyEars2( int n ) {
		if ( n < 1 )
			return 0;
		return determineEars( n ) + bunnyEars2( n - 1 );
	}

	private static int determineEars( int n ) {
		return isEven( n ) ? 3 : 2;
	}

	private static boolean isEven( int n ) {
		return n % 2 == 0;
	}

	public static int triangle( int n ) {
		return n < 2 ? n : n + triangle( n - 1 );
	}

	public static int sumDigits( int n ) {
		return n < 1 ? 0 : n % 10 + sumDigits( n / 10 );
	}

	public static int count7( int n ) {
		return n < 1 ? 0 : containsSeven( n ) + count7( n / 10 );
	}

	private static int containsSeven( int n ) {
		return n % 10 == 7 ? 1 : 0;
	}

}
