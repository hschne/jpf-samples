import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RacerTest {

    @Test
    public void RaceConditionsAreEvil() throws Exception {
        Racer racer = new Racer();
        Thread t = new Thread(racer);
        t.start();

        racer.doSomething(1000);
        int c = 420 / racer.d;
        assertThat(c, is(10));
    }

    @Test
    public void RaceConditionsAreVeryEvil() throws Exception {
        Racer racer = new Racer();
        Thread t = new Thread(racer);
        t.start();

        racer.doSomething(1000);
        int c = 420 / racer.d;
        assertThat(c, is(10));
    }

    @Test
    public void AndUnitTestsWontSaveYou() throws Exception {
        Racer racer = new Racer();
        Thread t = new Thread(racer);
        t.start();

        racer.doSomething(1000);
        int c = 420 / racer.d;
        assertThat(c, is(10));
    }
}
