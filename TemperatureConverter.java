import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame {
	JButton b1, b2;
	JLabel l1, l2;
	JTextField t1;
	float i, k;
	String a;
	eHandler handler = new eHandler();

	public TemperatureConverter(String s){
		super(s);
		setLayout(new FlowLayout());
		l1 = new JLabel("Введите значение температуры: ");
		l2 = new JLabel("");
		b1 = new JButton("В Цельсиях");
		b2 = new JButton("В Фаренгейтах");
		t1 = new JTextField(10);
		add(l1);
		add(t1);
		add(b1);
		add(b2);
		add(l2);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				if(e.getSource()==b1){
					i = Float.parseFloat(t1.getText());
					k = i;
					a = "Ваше значение в Цельсиях составляет: " + k + " градусов.";
					l2.setText(a);
				}
				if(e.getSource()==b2){
					i = Float.parseFloat(t1.getText());
					k = (i*9/5 +32);
					a = "Ваше значение в Фаренгейтах составляет: " + k + " градусов.";
					l2.setText(a);
				}
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Введите в поле число !");
			}	
		} 
	}
}
