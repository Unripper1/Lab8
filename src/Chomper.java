import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

class Chomper {

    public static void main(String[] args) throws Exception {

        Image[] frames = {
                ImageIO.read(new URL("https://www.promarinetrade.com/cache/promarine/public/shop_product_picture/_1200x800x0/4602_A.jpg")),
                ImageIO.read(new URL("https://detskiychas.ru/wp-content/uploads/2012/10/bukva-be.jpg")),
                ImageIO.read(new URL("https://www.securitylab.ru/upload/iblock/f16/f16049b5eef91e5acc492f504ffc0324.png")),
                ImageIO.read(new URL("https://i.pinimg.com/474x/af/68/dc/af68dc6591cf2abd8b1086d9ff733cbe.jpg"))
        };
        frames[0]=frames[0].getScaledInstance(300,300,0);
        frames[1]=frames[1].getScaledInstance(300,300,0);
        frames[2]=frames[2].getScaledInstance(300,300,0);
        frames[3]=frames[3].getScaledInstance(300,300,0);
        Runnable r = new Runnable() {

            @Override
            public void run() {
                JPanel gui = new JPanel(new BorderLayout());
                gui.setPreferredSize(new Dimension(400,400));

                final JLabel animation = new JLabel(new ImageIcon(frames[0]));
                gui.add(animation, BorderLayout.CENTER);


                ActionListener animate = new ActionListener(){

                    private int index = 0;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (index<frames.length-1) {
                            index++;
                        } else {
                            index = 0;
                        }
                        animation.setIcon(new ImageIcon(frames[index]));
                    }
                };
                final Timer timer = new Timer(200,animate);

                final JToggleButton b = new JToggleButton("Start/Stop");
                ActionListener startStop = new ActionListener()
                {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (b.isSelected()) {
                            timer.start();
                        } else {
                            timer.stop();
                        }
                    }
                };
                b.addActionListener(startStop);
                gui.add(b, BorderLayout.PAGE_END);

                JOptionPane.showMessageDialog(null, gui);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}