import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Shape{


}
class Four extends Shape{
    Random random=new Random();
    float r = random.nextFloat();
    float g = random.nextFloat();
    float b = random.nextFloat();
    Color c = new Color(r,g,b);
    int x1= random.nextInt(250);
    int x2=random.nextInt(250);
    int x3=random.nextInt(250);
    int x4=random.nextInt(250);

    
}
class Three extends Shape{
    Random random=new Random();
    float r = random.nextFloat();
    float g = random.nextFloat();
    float b = random.nextFloat();
    Color c = new Color(r,g,b);
    int x1= random.nextInt(250);
    int x2=random.nextInt(250);
    int y1=random.nextInt(250);
    int y2=random.nextInt(250);
    int x3=random.nextInt(250);
    int y3=random.nextInt(250);
}
class Circle extends Shape{
    Random random=new Random();
    float r = random.nextFloat();
    float g = random.nextFloat();
    float b = random.nextFloat();
    Color c = new Color(r,g,b);
    int x1=random.nextInt(250);
    int x2=random.nextInt(250);
    int x3=random.nextInt(250);
    int x4=random.nextInt(250);
}



public class Test extends JFrame {
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < 5; i++) {
            Three rect = new Three();
            int x1 = rect.x1 + 250 * i + 50;
            int x2 = rect.x2 + 250 * i + 50;
            int x3 = rect.x3 + 250 * i + 50;
            int y1 = rect.y1 + 300;
            int y2 = rect.y2 + 300;
            int y3 = rect.y3 + 300;
            g.setColor(rect.c);
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x2, y2, x3, y3);
            g.drawLine(x3, y3, x1, y1);
        }
        for (int i = 0; i < 5; i++) {
            Four rect = new Four();
            int x1 = rect.x1 + 250 * i;
            int x2 = rect.x2;
            int x3 = rect.x3;
            int x4 = rect.x4;
            g.setColor(rect.c);
            g.drawRect(x1, x2, x3, x4);

        }
        for (int i = 0; i < 10; i++) {
            Circle rect = new Circle();
            int x1 = rect.x1 + 250 * i;
            int x2 = rect.x2+600;
            int x3 = rect.x3;
            int x4 = rect.x4;
            g.setColor(rect.c);
            g.drawOval(x1, x2, x3, x4);

        }

    }

    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        super("Test");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(800, 600);
        setVisible(true);
    }
}