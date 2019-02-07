import javax.swing.JFrame;
import java.awt.Container;



public class OvalFrame extends JFrame
{
  public OvalFrame()
  {
    setTitle("OvalDraw");
    setBounds(300, 300, 400, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Oval o = new Oval();
    Container contentPane = getContentPane();
    contentPane.add(o);
  }
}
