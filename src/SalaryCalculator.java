import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
public class SalaryCalculator 
{

	public static void main(String[] args) 
	{
		
		JFrame salCal = new JFrame("Salary Calculator");
		salCal.setBounds(400, 400, 350, 250);
		salCal.setLayout(null);
		
		JTextField rate = new JTextField();
		rate.setSize(new Dimension(100,30));
		rate.setLocation(new Point(100,30));
		salCal.add(rate);
		
		JTextField hours = new JTextField();
		hours.setSize(new Dimension(100,30));
		hours.setLocation(new Point(100,80));
		salCal.add(hours);
		
		JLabel hrate = new JLabel("Hourly Rate");
		hrate.setBounds(20, 30, 100, 30);
		salCal.add(hrate);
		
		JLabel hweek = new JLabel("Hours/Week");
		hweek.setBounds(20, 80, 100, 30);
		salCal.add(hweek);
		
		JLabel amount = new JLabel("Annual Salary: $ ");
		amount.setBounds(140, 160, 300, 30);
		salCal.add(amount);
		
		JLabel fullT = new JLabel("Full Time");
		fullT.setBounds(20,120, 100, 30);
		salCal.add(fullT);
		
		JCheckBox fullTime = new JCheckBox();
		fullTime.setBounds(100, 120, 30, 30);
		salCal.add(fullTime);
		
		JButton calculate = new JButton("Calculate");
		calculate.setSize(new Dimension(100,30));
		calculate.setLocation(new Point(20,160));
		calculate.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						if(fullTime.isSelected())
						{
							hours.setText(null);
							amount.setText("Annual Salary: $ " + Double.parseDouble(rate.getText()) * 40 * 52);
						}
						else
						{
							amount.setText("Annual Salary: $ " + Double.parseDouble(hours.getText()) * Double.parseDouble(rate.getText()) * 52);
						}
						
					}
				});
		salCal.add(calculate);
		
		salCal.setVisible(true);
		salCal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
