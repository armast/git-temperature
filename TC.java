import javax.swing.JFrame;

public class TC {
	public static void main(String[] args){
		TemperatureConverter Tc = new TemperatureConverter("Конвертор температуры");
		Tc.setVisible(true);
		Tc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tc.setSize(400, 150);
		Tc.setResizable(false);
		Tc.setLocationRelativeTo(null);
	}
}
