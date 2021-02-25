import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class ImageTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {

                ImageFrame frame = new ImageFrame(args[0]);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}
class ImageFrame extends JFrame
{

    public ImageFrame(String s)
    {
        ImageComponent component = new ImageComponent(s);
        setTitle("ImageTest");
        //setSize(1000,800);
        setSize(component.getW()+15, component.getH()+36);
        add(component);
    }
}
class ImageComponent extends JComponent {

    public ImageComponent(String path) {
        // Получаем изображения.
        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getH(){
        int imageHeight = image.getHeight(this);

        return  imageHeight;
    }
    public int getW(){
        int imageWidth = image.getWidth(this);
        return  imageWidth;
    }
    public void paintComponent(Graphics g) {
        if (image == null) return;
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);
        // Отображение рисунка в левом верхнем углу.
        g.drawImage(image, 0, 0, null);

    }

    private Image image;
}







