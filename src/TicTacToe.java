import java.awt.Graphics;

import javax.swing.JApplet;

public class TicTacToe extends JApplet {
    public void paint(Graphics canvas) {
        canvas.drawLine(150, 0, 150, 300);
        canvas.drawLine(250, 0, 250, 300);
        canvas.drawLine(50, 100, 350, 100);
        canvas.drawLine(50, 200, 350, 200);
        canvas.drawOval(50, 100, 100, 100);
        canvas.drawOval(50, 0, 100, 100);
        canvas.drawOval(150, 200, 100, 100);
        canvas.drawOval(150, 0, 100, 100);
        canvas.drawLine(150, 100, 250, 200);
        canvas.drawLine(250,100,150,200);
        canvas.drawLine(250,0, 350,100);
        canvas.drawLine(350, 0,250,100);
        canvas.drawLine(250, 100, 350, 200);
        canvas.drawLine(350, 100, 250, 200);
        canvas.drawLine(250, 200, 350, 300);
        canvas.drawLine(350, 200, 250, 300);
        canvas.drawLine(300,0, 300, 300);
    }
}
