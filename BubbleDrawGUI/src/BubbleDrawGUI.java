import javax.swing.JFrame;

public class BubbleDrawGUI extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("BubbleDraw GUI App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new BubblePanelGUI());
		frame.setSize(new java.awt.Dimension(600, 400));
		frame.setVisible(true);

	}

}
