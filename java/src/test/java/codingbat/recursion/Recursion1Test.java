package codingbat.recursion;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Recursion1Test {

	@Test
	public void testCigarParty() {
		assertThat( Recursion1.factorial( 1 ), is( 1 ) );
		assertThat( Recursion1.factorial( 2 ), is( 2 ) );
		assertThat( Recursion1.factorial( 3 ), is( 6 ) );
		assertThat( Recursion1.factorial( 4 ), is( 24 ) );
		assertThat( Recursion1.factorial( 5 ), is( 120 ) );
	}

	@Test
	public void testBunnyEars() {
		assertThat( Recursion1.bunnyEars( 0 ), is( 0 ) );
		assertThat( Recursion1.bunnyEars( 1 ), is( 2 ) );
		assertThat( Recursion1.bunnyEars( 2 ), is( 4 ) );
		assertThat( Recursion1.bunnyEars( 3 ), is( 6 ) );
		assertThat( Recursion1.bunnyEars( 4 ), is( 8 ) );
		assertThat( Recursion1.bunnyEars( 5 ), is( 10 ) );
		assertThat( Recursion1.bunnyEars( 6 ), is( 12 ) );
	}

	@Test
	public void testFibonacci() {
		assertThat( Recursion1.fibonacci( 0 ), is( 0 ) );
		assertThat( Recursion1.fibonacci( 1 ), is( 1 ) );
		assertThat( Recursion1.fibonacci( 2 ), is( 1 ) );
		assertThat( Recursion1.fibonacci( 3 ), is( 2 ) );
		assertThat( Recursion1.fibonacci( 4 ), is( 3 ) );
		assertThat( Recursion1.fibonacci( 5 ), is( 5 ) );
	}

	@Test
	public void testBunnyEars2() {
		assertThat( Recursion1.bunnyEars2( 0 ), is( 0 ) );
		assertThat( Recursion1.bunnyEars2( 1 ), is( 2 ) );
		assertThat( Recursion1.bunnyEars2( 2 ), is( 5 ) );
		assertThat( Recursion1.bunnyEars2( 3 ), is( 7 ) );
		assertThat( Recursion1.bunnyEars2( 4 ), is( 10 ) );
		assertThat( Recursion1.bunnyEars2( 5 ), is( 12 ) );
		assertThat( Recursion1.bunnyEars2( 6 ), is( 15 ) );
	}

	@Test
	public void testTriangle() {
		assertThat( Recursion1.triangle( 0 ), is( 0 ) );
		assertThat( Recursion1.triangle( 1 ), is( 1 ) );
		assertThat( Recursion1.triangle( 2 ), is( 3 ) );
		assertThat( Recursion1.triangle( 3 ), is( 6 ) );
		assertThat( Recursion1.triangle( 4 ), is( 10 ) );
		assertThat( Recursion1.triangle( 5 ), is( 15 ) );
	}

	@Test
	public void testSumDigits() {
		assertThat( Recursion1.sumDigits( 126 ), is( 9 ) );
		assertThat( Recursion1.sumDigits( 49 ), is( 13 ) );
		assertThat( Recursion1.sumDigits( 12 ), is( 3 ) );
	}

	@Test
	public void testCount7() {
		assertThat( Recursion1.count7( 717 ), is( 2 ) );
		assertThat( Recursion1.count7( 7 ), is( 1 ) );
		assertThat( Recursion1.count7( 123 ), is( 0 ) );
	}

	@Test
	public void testCount8() {
		assertThat( Recursion1.count8( 10 ), is( 0 ) );
		assertThat( Recursion1.count8( 8 ), is( 1 ) );
		assertThat( Recursion1.count8( 818 ), is( 2 ) );
		assertThat( Recursion1.count8( 8818 ), is( 4 ) );
	}

	@Test
	public void testPowerN() {
		assertThat( Recursion1.powerN( 3, 1 ), is( 3 ) );
		assertThat( Recursion1.powerN( 3, 2 ), is( 9 ) );
		assertThat( Recursion1.powerN( 3, 3 ), is( 27 ) );
		assertThat( Recursion1.powerN( 4, 3 ), is( 64 ) );
		assertThat( Recursion1.powerN( 4, 4 ), is( 256 ) );
	}

	@Test
	public void testCountX() {
		assertThat( Recursion1.countX( "xxhixx" ), is( 4 ) );
		assertThat( Recursion1.countX( "xhixhix" ), is( 3 ) );
		assertThat( Recursion1.countX( "hi" ), is( 0 ) );
		assertThat( Recursion1.countX( "xyouxarexcooxx" ), is( 5 ) );
	}

	@Test
	public void testCountHi() {
		assertThat( Recursion1.countHi( "xxhixx" ), is( 1 ) );
		assertThat( Recursion1.countHi( "xhixhix" ), is( 2 ) );
		assertThat( Recursion1.countHi( "hi" ), is( 1 ) );
		assertThat( Recursion1.countHi( "xyouxarexcooxx" ), is( 0 ) );
	}

	@Test
	public void testChangeXY() {
		assertThat( Recursion1.changeXY( "codex" ), is( "codey" ) );
		assertThat( Recursion1.changeXY( "xxhixx" ), is( "yyhiyy" ) );
		assertThat( Recursion1.changeXY( "xhixhix" ), is( "yhiyhiy" ) );
	}

	@Test
	public void testChangePi() {
		assertThat( Recursion1.changePi( "xpix" ), is( "x3.14x" ) );
		assertThat( Recursion1.changePi( "pipi" ), is( "3.143.14" ) );
		assertThat( Recursion1.changePi( "pip" ), is( "3.14p" ) );
	}

	@Test
	public void testNoX() {
		assertThat( Recursion1.noX( "xaxb" ), is( "ab" ) );
		assertThat( Recursion1.noX( "abc" ), is( "abc" ) );
		assertThat( Recursion1.noX( "xx" ), is( "" ) );
	}

	@Test
	public void testArray6() {
		assertThat( Recursion1.array6( new int[] { 1, 6, 4 }, 0 ), is( true ) );
		assertThat( Recursion1.array6( new int[] { 1, 4 }, 0 ), is( false ) );
		assertThat( Recursion1.array6( new int[] { 6 }, 0 ), is( true ) );
	}

	@Test
	public void testArray11() {
		assertThat( Recursion1.array11( new int[] { 1, 2, 11 }, 0 ), is( 1 ) );
		assertThat( Recursion1.array11( new int[] { 11, 11 }, 0 ), is( 2 ) );
		assertThat( Recursion1.array11( new int[] { 1, 2, 3, 4 }, 0 ), is( 0 ) );
	}

	@Test
	public void testArray220() {
		assertThat( Recursion1.array220( new int[] { 1, 2, 20 }, 0 ), is( true ) );
		assertThat( Recursion1.array220( new int[] { 3, 30 }, 0 ), is( true ) );
		assertThat( Recursion1.array220( new int[] { 3 }, 0 ), is( false ) );
	}

	@Test
	public void testAllStar() {
		assertThat( Recursion1.allStar( "hello" ), is( "h*e*l*l*o" ) );
		assertThat( Recursion1.allStar( "abc" ), is( "a*b*c" ) );
		assertThat( Recursion1.allStar( "ab" ), is( "a*b" ) );
	}

	@Test
	public void testPairStar() {
		assertThat( Recursion1.pairStar( "hello" ), is( "hel*lo" ) );
		assertThat( Recursion1.pairStar( "xxyy" ), is( "x*xy*y" ) );
		assertThat( Recursion1.pairStar( "aaaa" ), is( "a*a*a*a" ) );
	}

	@Test
	public void testEndX() {
		assertThat( Recursion1.endX( "xxre" ), is( "rexx" ) );
		assertThat( Recursion1.endX( "xxhixx" ), is( "hixxxx" ) );
		assertThat( Recursion1.endX( "xhixhix" ), is( "hihixxx" ) );
	}

	@Test
	public void testCountPairs() {
		assertThat( Recursion1.countPairs( "axa" ), is( 1 ) );
		assertThat( Recursion1.countPairs( "axax" ), is( 2 ) );
		assertThat( Recursion1.countPairs( "axbx" ), is( 1 ) );
	}

	@Test
	public void testCountAbc() {
		assertThat( Recursion1.countAbc( "abc" ), is( 1 ) );
		assertThat( Recursion1.countAbc( "abcxxabc" ), is( 2 ) );
		assertThat( Recursion1.countAbc( "abaxxaba" ), is( 2 ) );
	}

	@Test
	public void testCount11() {
		assertThat( Recursion1.count11( "11abc11" ), is( 2 ) );
		assertThat( Recursion1.count11( "abc11x11x11" ), is( 3 ) );
		assertThat( Recursion1.count11( "111" ), is( 1 ) );
	}

	@Test
	public void testStringClean() {
		assertThat( Recursion1.stringClean( "yyzzza" ), is( "yza" ) );
		assertThat( Recursion1.stringClean( "abbbcdd" ), is( "abcd" ) );
		assertThat( Recursion1.stringClean( "Hello" ), is( "Helo" ) );

	}

	@Test
	public void testCountHi2() {
		assertThat( Recursion1.countHi2( "ahixhi" ), is( 1 ) );
		assertThat( Recursion1.countHi2( "ahibhi" ), is( 2 ) );
		assertThat( Recursion1.countHi2( "xhixhi" ), is( 0 ) );
	}

	@Test
	public void testParenBit() {
		assertThat( Recursion1.parenBit( "xyz(abc)123" ), is( "(abc)" ) );
		assertThat( Recursion1.parenBit( "x(hello)" ), is( "(hello)" ) );
		assertThat( Recursion1.parenBit( "(xy)1" ), is( "(xy)" ) );
	}

	@Test
	public void testNestParen() {
		assertThat( Recursion1.nestParen( "(())" ), is( true ) );
		assertThat( Recursion1.nestParen( "((()))" ), is( true ) );
		assertThat( Recursion1.nestParen( "(((x))" ), is( false ) );
	}

	@Test
	public void testStrCount() {
		assertThat( Recursion1.strCount( "catcowcat", "cat" ), is( 2 ) );
		assertThat( Recursion1.strCount( "catcowcat", "cow" ), is( 1 ) );
		assertThat( Recursion1.strCount( "catcowcat", "dog" ), is( 0 ) );
	}

	@Test
	public void testStrCopies() {
		assertThat( Recursion1.strCopies( "catcowcat", "cat", 2 ), is( true ) );
		assertThat( Recursion1.strCopies( "catcowcat", "cow", 2 ), is( false ) );
		assertThat( Recursion1.strCopies( "catcowcat", "cow", 1 ), is( true ) );
	}

	@Test
	public void testStrDist() {
		assertThat( Recursion1.strDist( "catcowcat", "cat" ), is( 9 ) );
		assertThat( Recursion1.strDist( "catcowcat", "cow" ), is( 3 ) );
		assertThat( Recursion1.strDist( "cccatcowcatxx", "cat" ), is( 9 ) );
	}
}
