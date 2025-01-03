
class Pen{
public synchronized  void writeWithPenAndPaper(Paper paper){
    System.out.println(Thread.currentThread().getName() + " is using pen "+ this + " and trying");
    paper.finishWriting();
}
public synchronized void finishWriting(){
    System.out.println(Thread.currentThread().getName() + " finished using pen "+ this);
}
}

class Paper{
    public synchronized  void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using paper "+ this + " and trying");
        pen.finishWriting();
    }

    public synchronized  void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}

class Task1 implements  Runnable{
private Pen pen;
private Paper paper;

public Task1(Pen pen, Paper paper){
    this.pen = pen;
    this.paper = paper;
}

    public void run(){ // to resolve deadlock will make sure this task have access on paper lock before locking the pen
        synchronized (paper) {
                    pen.writeWithPenAndPaper(paper);
        }
    }

}

class Task2 implements  Runnable{
private Pen pen;
private Paper paper;

public Task2(Pen pen, Paper paper){
    this.pen = pen;
    this.paper = paper;
}

    public void run(){ // to resolve deadlock will make sure this task have access on pen lock before locking the paper
        synchronized (pen) {
           paper.writeWithPaperAndPen(pen);
        }
    }

}

public class Deadlock{
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();
    }
}