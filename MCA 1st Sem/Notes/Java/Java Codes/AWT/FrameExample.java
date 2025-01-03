import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class FrameExample {
    public static void main(String[] args) {
        Frame f = new Frame("My Frame with Components");
        Button b = new Button("Click Me");
        TextField t1 = new TextField("Hello", 20);
        
        f.add(t1);
        f.add(b);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}


 