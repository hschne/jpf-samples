//import static org.junit.Assert.*;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

public class RingBufferTest extends TestJPF {

//	public static void main(String[] args) {
//		runTestsOfThisClass(args);
//	}


	@Test
	public void test() {
		if (verifyNoPropertyViolation()) {
			int lowerBound = Verify.getInt(0, 10);
			int upperBound = Verify.getInt(0,10);
			assertTrue(true);
		}
	}

}
