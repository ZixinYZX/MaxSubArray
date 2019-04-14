package zixinyang;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaxArrayTest {

	@Test
	public void testMaxSubArray() {
		int[]  arr={1,2,-3,2};
		assertEquals(3,MaxArray.maxSubArray(arr));
	}
	
}
