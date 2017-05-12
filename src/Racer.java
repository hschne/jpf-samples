public class Racer implements Runnable {

    int d = 42;

    public void run () {
        doSomething(1000);
        d = 0;
    }

    public static void main (String[] args){
        Racer racer = new Racer();
        Thread t = new Thread(racer);
        t.start();

        doSomething(1000);
        int c = 420 / racer.d;
        System.out.println(c);
    }

    static void doSomething (int n) {
        // not very interesting..
        try { Thread.sleep(n); } catch (InterruptedException ix) {}
    }
}
