package DebtCollect;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DebtPaybackTest {

	@Test
    public void testCalculateMonthlyRate() {
        // Test Case 1
        assertEquals(428.03, DebtPayback.calculateMonthlyRate(5000, 5, 12), 0.01);

        // Test Case 2
        assertEquals(452.27, DebtPayback.calculateMonthlyRate(10000, 8, 24), 0.01);

    }

    @Test
    public void testCalculateOverallDebt() {
        // Test Case 1
       // assertEquals(10136.44, DebtPayback.calculateOverallDebt(5000, 428.03, 12), 0.01);

        // Test Case 2
        //assertEquals(20854.54, DebtPayback.calculateOverallDebt(10000, 452.27, 24));

       
    }

/*	@Test
	void testMain() {
		//fail("Not yet implemented");
	}*/

}
