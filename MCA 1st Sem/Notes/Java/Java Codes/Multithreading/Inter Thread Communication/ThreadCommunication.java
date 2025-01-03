// here we have 2 thread communicated or working in syc with each other one will only produce when other is end up consuming.

class SharedResource{
   private int data;
   private boolean hasData; 



   public synchronized  void produce(int value){
   while(hasData){
    try {
        wait();
    } catch (Exception e) {
        Thread.currentThread().interrupt();
    }
   }
   data = value;
   hasData = true;
   System.out.println("Produced: " + value);
   notify(); // notify other thread that data is ready to consume
   }



   public synchronized  int consume(){
     while(!hasData){
        try {
            wait();
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
     }
     hasData = false;
     System.out.println("Consumed: " + data);
     notify(); // notify to thread that data is consumed produce new data
     return data;
   }



}

class Producer implements Runnable {
    private SharedResource resource;

    Producer(SharedResource resource){
        this.resource = resource;
    }

    public void run (){
        for(int i = 0; i < 10; i++){
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    Consumer(SharedResource resource){
        this.resource = resource;
    }

    public void run (){
        for(int i = 0; i < 10; i++){
            int val = resource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    

    }

}
