class MyThread extends Thread {
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
        try {
            Thread.sleep(500); // Sleep for 0.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadMethodsExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("Thread-1"); // Set the thread name
        t1.setPriority(Thread.MAX_PRIORITY); // Set priority to the highest (10)

        MyThread t2 = new MyThread();
        t2.setName("Thread-2"); // Set the thread name
        t2.setPriority(Thread.MIN_PRIORITY); // Set priority to the lowest (1)

        System.out.println("Is t1 alive? " + t1.isAlive()); // Check if thread t1 is alive
        
        t1.start(); // Start the thread
        t2.start(); // Start the thread

        System.out.println("Is t1 alive after start? " + t1.isAlive()); // Check again after starting

        // Yield the main thread to give other threads a chance to run
        Thread.yield();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// output
// Is t1 alive? false
// Is t1 alive after start? true
// Thread-2 is running with priority 1
// Thread-1 is running with priority 10