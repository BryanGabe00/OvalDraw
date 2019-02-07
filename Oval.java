import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Oval extends JPanel
{
  public Oval()
  {

  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = getWidth();
    int y = getHeight();

    g.setColor(Color.blue);
    g.fillRect(0, 0, x, y);

    g.setColor(Color.red);
    g.fillOval(0, 0, x, y);

  }
}
