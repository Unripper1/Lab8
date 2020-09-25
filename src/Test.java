import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Shape{

}
class Rectangle extends Shape{
    Random random=new Random(0);
    int x1= random.nextInt(500);
    int x2=random.nextInt(500);
    int y1=random.nextInt(500);
    int y2=random.nextInt(500);
    int x3=random.nextInt(500);
    int x4=random.nextInt(500);
    int y3=random.nextInt(500);
    int y4=random.nextInt(500);
}



public class Test extends JFrame
{
    Rectangle rect=new Rectangle();
    public void paint(Graphics g/*,int x1,int x2,int y1,int y2,int x3,int x4,int y3,int y4*/)
    {
        Rectangle rect=new Rectangle();
        int x1=rect.x1;
        int x2=rect.x2;
        int x3=rect.x3;
        int x4=rect.x4;
        int y1=rect.y1;
        int y2=rect.y2;
        int y3=rect.y3;
        int y4=rect.y4;
        super.paint(g);
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x4, y4);
        g.drawLine(x4, y4, x1, y1);
    }

    public static void main(String[] args) {new Test();new Test();}

    public Test()
    {
        super("Test");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(800, 600);
        setVisible(true);
    }
}