package codingbat.logic;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Logic1Test {

	@Test
	public void testCigarParty() {
		assertThat(Logic1.cigarParty(30, false), is(false));
		assertThat(Logic1.cigarParty(50, false), is(true));
		assertThat(Logic1.cigarParty(70, true), is(true));
	}

	@Test
	public void testDateFashion() {
		assertThat(Logic1.dateFashion(5, 10), is(2));
		assertThat(Logic1.dateFashion(5, 2), is(0));
		assertThat(Logic1.dateFashion(5, 5), is(1));
	}

	@Test
	public void testSquirrelPlay() {
		assertThat(Logic1.squirrelPlay(70, false), is(true));
		assertThat(Logic1.squirrelPlay(95, false), is(false));
		assertThat(Logic1.squirrelPlay(95, true), is(true));
	}

	@Test
	public void testCaughtSpeeding() {
		assertThat(Logic1.caughtSpeeding(60, false), is(0));
		assertThat(Logic1.caughtSpeeding(65, false), is(1));
		assertThat(Logic1.caughtSpeeding(65, true), is(0));
	}

	@Test
	public void testAlarmClock() {
		assertThat(Logic1.alarmClock(1, false), is("7:00"));
		assertThat(Logic1.alarmClock(5, false), is("7:00"));
		assertThat(Logic1.alarmClock(0, false), is("10:00"));
		assertThat(Logic1.alarmClock(1, true), is("10:00"));
		assertThat(Logic1.alarmClock(0, true), is("off"));
	}

	@Test
	public void testSortaSum() {
		assertThat(Logic1.sortaSum(3, 4), is(7));
		assertThat(Logic1.sortaSum(9, 4), is(20));
		assertThat(Logic1.sortaSum(10, 11), is(21));
	}

	@Test
	public void testLove6() {
		assertThat(Logic1.love6(6, 4), is(true));
		assertThat(Logic1.love6(4, 5), is(false));
		assertThat(Logic1.love6(1, 5), is(true));
	}

	@Test
	public void testIn1To10() {
		assertThat(Logic1.in1To10(5, false), is(true));
		assertThat(Logic1.in1To10(11, false), is(false));
		assertThat(Logic1.in1To10(11, true), is(true));
	}

	@Test
	public void testSpecialEleven() {
		assertThat(Logic1.specialEleven(22), is(true));
		assertThat(Logic1.specialEleven(23), is(true));
		assertThat(Logic1.specialEleven(24), is(false));
	}

	@Test
	public void testMore20() {
		assertThat(Logic1.more20(20), is(false));
		assertThat(Logic1.more20(21), is(true));
		assertThat(Logic1.more20(22), is(true));
	}

	@Test
	public void testOld35() {
		assertThat(Logic1.old35(3), is(true));
		assertThat(Logic1.old35(10), is(true));
		assertThat(Logic1.old35(15), is(false));
	}

	@Test
	public void testLess20() {
		assertThat(Logic1.less20(18), is(true));
		assertThat(Logic1.less20(19), is(true));
		assertThat(Logic1.less20(20), is(false));
	}

	@Test
	public void testNearTen() {
		assertThat(Logic1.nearTen(12), is(true));
		assertThat(Logic1.nearTen(17), is(false));
		assertThat(Logic1.nearTen(19), is(true));
	}

	@Test
	public void testTeenSum() {
		assertThat(Logic1.teenSum(3, 4), is(7));
		assertThat(Logic1.teenSum(10, 13), is(19));
		assertThat(Logic1.teenSum(13, 2), is(19));
	}

	@Test
	public void testAnswerCell() {
		assertThat(Logic1.answerCell(false, false, false), is(true));
		assertThat(Logic1.answerCell(false, false, true), is(false));
		assertThat(Logic1.answerCell(true, false, false), is(false));
	}

	@Test
	public void testTeaParty() {
		assertThat(Logic1.teaParty(6, 8), is(1));
		assertThat(Logic1.teaParty(3, 8), is(0));
		assertThat(Logic1.teaParty(20, 6), is(2));
	}

	@Test
	public void testFizzString() {
		assertThat(Logic1.fizzString("fig"), is("Fizz"));
		assertThat(Logic1.fizzString("dib"), is("Buzz"));
		assertThat(Logic1.fizzString("fib"), is("FizzBuzz"));
	}

	@Test
	public void testFizzString2() {
		assertThat(Logic1.fizzString2(1), is("1!"));
		assertThat(Logic1.fizzString2(2), is("2!"));
		assertThat(Logic1.fizzString2(3), is("Fizz!"));
	}

	@Test
	public void testTwoAsOne() {
		assertThat(Logic1.twoAsOne(1, 2, 3), is(true));
		assertThat(Logic1.twoAsOne(3, 1, 2), is(true));
		assertThat(Logic1.twoAsOne(3, 2, 2), is(false));
	}

	@Test
	public void testInOrder() {
		assertThat(Logic1.inOrder(1, 2, 4, false), is(true));
		assertThat(Logic1.inOrder(1, 2, 1, false), is(false));
		assertThat(Logic1.inOrder(1, 1, 2, true), is(true));
	}

	@Test
	public void testInOrderEqual() {
		assertThat(Logic1.inOrderEqual(2, 5, 11, false), is(true));
		assertThat(Logic1.inOrderEqual(5, 7, 6, false), is(false));
		assertThat(Logic1.inOrderEqual(5, 5, 7, true), is(true));
	}

	@Test
	public void testLastDigit() {
		assertThat(Logic1.lastDigit(23, 19, 13), is(true));
		assertThat(Logic1.lastDigit(23, 19, 12), is(false));
		assertThat(Logic1.lastDigit(23, 19, 3), is(true));
	}

	@Test
	public void testLessBy10() {
		assertThat(Logic1.lessBy10(1, 7, 11), is(true));
		assertThat(Logic1.lessBy10(1, 7, 10), is(false));
		assertThat(Logic1.lessBy10(11, 1, 7), is(true));
	}

	@Test
	public void testWithoutDoubles() {
		assertThat(Logic1.withoutDoubles(2, 3, true), is(5));
		assertThat(Logic1.withoutDoubles(3, 3, true), is(7));
		assertThat(Logic1.withoutDoubles(3, 3, false), is(6));
	}

	@Test
	public void testMaxMod5() {
		assertThat(Logic1.maxMod5(2, 3), is(3));
		assertThat(Logic1.maxMod5(6, 3), is(6));
		assertThat(Logic1.maxMod5(3, 2), is(3));
	}

	@Test
	public void testRedTicket() {
		assertThat(Logic1.redTicket(2, 2, 2), is(10));
		assertThat(Logic1.redTicket(2, 2, 1), is(0));
		assertThat(Logic1.redTicket(0, 0, 0), is(5));
	}

	@Test
	public void testGreenTicket() {
		assertThat(Logic1.greenTicket(1, 2, 3), is(0));
		assertThat(Logic1.greenTicket(2, 2, 2), is(20));
		assertThat(Logic1.greenTicket(1, 1, 2), is(10));
	}

	@Test
	public void testBlueTicket() {
		assertThat(Logic1.blueTicket(9, 1, 0), is(10));
		assertThat(Logic1.blueTicket(9, 2, 0), is(0));
		assertThat(Logic1.blueTicket(6, 1, 4), is(10));
	}

	@Test
	public void testShareDigit() {
		assertThat(Logic1.shareDigit(12, 23), is(true));
		assertThat(Logic1.shareDigit(19, 99), is(true));
		assertThat(Logic1.shareDigit(43, 74), is(true));
		assertThat(Logic1.shareDigit(12, 12), is(true));
		assertThat(Logic1.shareDigit(12, 43), is(false));
		assertThat(Logic1.shareDigit(12, 44), is(false));
		assertThat(Logic1.shareDigit(99, 88), is(false));
		assertThat(Logic1.shareDigit(27, 54), is(false));
		assertThat(Logic1.shareDigit(39, 12), is(false));
	}

	@Test
	public void testSumLimit() {
		assertThat(Logic1.sumLimit(2, 3), is(5));
		assertThat(Logic1.sumLimit(8, 3), is(8));
		assertThat(Logic1.sumLimit(8, 1), is(9));
	}
}
