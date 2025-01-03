import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public  class Test extends JPanel {

     protected void paintComponent(Graphics g){
               g.drawString("Nik", 50, 50);

               g.drawLine(50, 40, 79, 68);
               g.draw3DRect(200, 200, 500, 500,true);
   }
    public static void main(String[] args) {
      Test t = new Test();
        JFrame f = new JFrame();
        f.add(t);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
