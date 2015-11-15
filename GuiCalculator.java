import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiCalculator implements ActionListener{
	private JFrame frame;
	private JLabel label;
	private JTextField textfield,textfield2;
	private JButton btn;
	private JPanel panel;
	public GuiCalculator()
	{
		frame = new JFrame();
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		label =new JLabel();
		label.setText("Enter number");
		
		textfield =new JTextField(5);
		textfield2 =new JTextField(5);
	
		btn =new JButton("Calculate");
		btn.addActionListener(this);
		panel= new JPanel();
		
		panel.add(label);
		panel.add(textfield);
		panel.add(textfield2);
		panel.add(btn);
		panel.setBackground(Color.GREEN);
		frame.add(panel);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int a,b;
		a= Integer.parseInt(textfield.getText());
		b=Integer.parseInt(textfield2.getText());
		JOptionPane.showMessageDialog(null, "The result is: "+(a+b));
	}
}
