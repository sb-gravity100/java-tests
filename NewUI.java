import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

class NewUI extends JFrame {
   JFrame f;

   NewUI() {
      JButton b1 = new JButton("CLICK ME!");
      b1.setBounds(130, 100, 100, 100);

      add(b1);
      setSize(400, 500);
      setLayout(null);
      setVisible(true);
   }

   public static void main(String[] args) {
      new NewUI();
   }
}
