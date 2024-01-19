package DebtCollect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class DebtPaybackCalTest {

	@Test
	public void testMonthlyRate() 
	{
		assertEquals(875.0, DebtPaybackCal.calculateMonthlyRate(10000, 5, 12));
		assertEquals(0.0, DebtPaybackCal.calculateMonthlyRate(0.0, 0.0, 0));
		assertEquals(0.0, DebtPaybackCal.calculateMonthlyRate(-444.0, 5.0, 0));
		
	}
	@Test
	public void testOverallDebt() 
	{
		assertEquals(10500.0, DebtPaybackCal.calculateOverallDebt(10000, 5, 12));
		assertEquals(0.0, DebtPaybackCal.calculateOverallDebt(0.0, 0.0, 0));
		assertEquals(0.0, DebtPaybackCal.calculateOverallDebt(-444.0, 5.0, 0));
	}

}
