
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReadWriteCounter {

   private  int count = 0;
   private final  ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
   private final  Lock readLock = lock.readLock();
   private final  Lock writeLock = lock.writeLock();

   public void increment(){
    writeLock.lock();
    try{
      count++;
    }finally{
        writeLock.unlock();
    }
   }

   public int getCount(){
    readLock.lock();
    try{
    return count;
    }finally{
        readLock.unlock();
    }
   }

    public static void main(String[] args) throws InterruptedException {

        ReadWriteCounter counter = new ReadWriteCounter();

        Runnable readTask = new Runnable(){
            public void run(){
                for(int i = 0; i < 10; i++){
                    System.out.println(Thread.currentThread().getName() + " read : "+ counter.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable(){
            public void run(){
                for(int i = 0; i < 10; i++){
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " increment ");
                }
            }
        };

        Thread readThread1 = new Thread(readTask);
        Thread readThread2 = new Thread(readTask);
        Thread writeThread = new Thread(writeTask);
// read lock can only be accessable while write lock won't be aquired at that particular time by any other thread
        readThread1.start();
        readThread2.start();
        writeThread.start();
 // here the catch is that multiple thread can aquire read lock but only single thread at a 
 // time will be able to aquire write lock
        readThread1.join();
        readThread2.join();
        writeThread.join();

        System.out.println("Final count: " + counter.getCount());
        
    }
}
