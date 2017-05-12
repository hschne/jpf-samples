//import static org.junit.Assert.*;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;
import org.junit.Test;

public class RingBufferTest extends TestJPF {

    public static void main(String[] args) {
        RingBuffer<Object> ringBuffer = new RingBuffer(Verify.getInt(1,10));
        while (true) {
            if (Verify.getBoolean()) {
                ringBuffer.enqueue(Verify.randomObject("String"));
            } else {
                ringBuffer.dequeue();
            }
        }
    }


    @Test
    public void test() {
        if (verifyNoPropertyViolation("search.multiple_errors=true")) {
            RingBuffer<Object> ringBuffer = new RingBuffer(Verify.random(10));
            while (true) {
                if (Verify.getBoolean()) {
                    ringBuffer.enqueue(Verify.randomObject("String"));
                } else {
                    ringBuffer.dequeue();
                }
            }
        }
    }
}
