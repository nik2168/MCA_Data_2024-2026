

 class Counter{
    private int counter;

   public synchronized void incCounter(){
  
             counter++;
    }

    public int getCounter(){
          return counter; 
         }
}

class MyThread extends Thread{
    
    private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

   public void run(){
         for(int i = 0; i < 1000; i++){
            counter.incCounter();
         }
    }

}

public class SyncronizationExample {
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();
        MyThread a = new MyThread(c);
        MyThread b = new MyThread(c);

        a.start();
        b.start();

        a.join();
        b.join();

        System.out.println(c.getCounter());

    }
}


// output
// 2000