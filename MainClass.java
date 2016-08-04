package game;
import java.awt.Dimension;
import javax.swing.JFrame;
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JFrame form = new JFrame("Змейка 0.1.0");
       form.setContentPane(new GamePanel());
       form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       form.setResizable(false);
       form.pack();
       form.setPreferredSize(new Dimension(GamePanel.WIDTH, GamePanel.HEIGHT));
       form.setLocationRelativeTo(null);
       form.setVisible(true);
       
	}

}
