import javax.swing.JButton;
import javax.swing.JFrame;

public class NewUI extends JFrame {
   JFrame f;

   NewUI() {
      JButton b1 = new JButton("click");
      b1.setBounds(130, 100, 100, 40);

      add(b1);
      setSize(400, 500);
      setLayout(null);
      setVisible(true);
   }

   public static void main() {
      new NewUI();
   }
}
