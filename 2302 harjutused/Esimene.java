import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Esimene{
    public static void main(String[] arg) throws Exception{
        BufferedImage pilt=new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics g=pilt.createGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 100, 100);
        g.setColor(Color.BLACK);

        //g.fillRect(50, 10, 20, 30); //x, y, laius, kÃµrgus. y Ã¼lalt alla
        g.fillRect(10, 50, 80, 50);
        g.setColor(Color.RED);
        g.fillPolygon(new int[] {5, 50, 95}, new int[] {50, 0, 50}, 3);
        //g.drawRect(10, 10, 30, 40);
        g.setColor(Color.BLUE);
        g.fillRect(15, 60, 15, 20);
        //g.setColor(Color.YELLOW);
        g.fillRect(70, 60, 15, 20);
        //g.fillOval(10, 60, 30, 40);
        g.setColor(Color.GRAY);
        g.fillRect(40, 70, 20, 35);
        g.setColor(Color.GREEN);
        g.drawLine(22, 80, 10, 80);
        g.fillOval(55, 85, 3, 3);
        //g.fillOval(50, 60, 30, 40);
        //g.drawLine(10, 80, 90, 80);
        //g.drawString("Tere", 40, 70);
        ImageIO.write(pilt, "png", new File("pilt1.png"));
    }
}