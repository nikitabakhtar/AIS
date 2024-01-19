package DebtCollect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class DebtPaybackCalTest {

	@Test
	public void testMonthlyRate() 
	{
		assertEquals(875.0, DebtPaybackCal.calculateMonthlyRate(10000, 5, 12));
		
	}
	@Test
	public void testOverallDebt() 
	{
		assertEquals(10500.0, DebtPaybackCal.calculateOverallDebt(10000, 5, 12));
		
	}

}
