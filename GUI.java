import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUI extends JFrame {

  private JPanel panel, panel1;
	private JRadioButton checkingRadioButton, savingsRadioButton;
	private JButton saveAccount, deposit, withdrawal, monthlyProcess, report, exit;
	private JLabel accountNumber, initialBalance, annualRate;
	private JTextField accNumField, initBalField, annRateField;
	
	public GUI()
	{
	
	  	setTitle("BankAccount");
		setSize(270, 250);
		buildPanel();
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	 
	private void  buildPanel()
	{
		
		panel = new JPanel();
		panel1 = new JPanel();
		new JPanel();
		accountNumber = new JLabel("Account Number");
		initialBalance = new JLabel("Initial Balance");
		annualRate = new JLabel("Annual Rate");
		accNumField = new JTextField(10);
		initBalField = new JTextField(10);
		annRateField = new JTextField(10);
	 	savingsRadioButton = new JRadioButton("Savings");
	 	checkingRadioButton = new JRadioButton("Checking");
		saveAccount = new JButton("Save Account");
		deposit = new JButton("Deposit");
		withdrawal = new JButton("Withdrawal");
		monthlyProcess = new JButton("Monthly Process");
		report = new JButton("Generate Report");
		exit = new JButton("Exit");
		
		savingsRadioButton.addActionListener( new RadioButtonListener());
		checkingRadioButton.addActionListener( new RadioButtonListener());
		saveAccount.addActionListener( new JButtonListener());
		deposit.addActionListener( new JButtonListener());
		withdrawal.addActionListener( new JButtonListener());
		monthlyProcess.addActionListener( new JButtonListener());
		report.addActionListener( new JButtonListener());
		exit. addActionListener( new JButtonListener());

		panel.add(savingsRadioButton);
		panel.add(checkingRadioButton);
		panel1.add(accountNumber);
		panel1.add(accNumField);
		panel1.add(initialBalance);
		panel1.add(initBalField);
		panel1.add(annualRate);
		panel1.add(annRateField);
		panel1.add(saveAccount);
		panel1.add(deposit);
		panel1.add(withdrawal);
		panel1.add(monthlyProcess);
		panel1.add(report);
		panel1.add(exit);
		add(panel, BorderLayout.NORTH);
		add(panel1, BorderLayout.CENTER);
		
		
	}
	 
	 
	private class RadioButtonListener  implements ActionListener
	{
		
		public void actionPerformed (ActionEvent e)
		
		{
			String actionCommand = e.getActionCommand();
			if ( actionCommand.equals("Checking"))
			{
				annualRate.setVisible(false);
				annRateField.setVisible(false);
			}
			else if (actionCommand.equals("Savings"))
			{
				annualRate.setVisible(true);
				annRateField.setVisible(true);
			}
		}
	}
	private class JButtonListener implements ActionListener
	{
		
		public void actionPerformed (ActionEvent e)
		{
			String actionCommand = e.getActionCommand();
			if (actionCommand.equals("Save Account"))
			{
				
			}
			else if (actionCommand.equals("Deposit"))
			{
				
			}
			else if (actionCommand.equals("Withdrawal"))
			{
				
			}
			else if (actionCommand.equals("Monthly Process"))
			{
				
			}
			else if (actionCommand.equals("Generate Report"))
			{
				
			}
			else if (actionCommand.equals("Exit"))
			{
				System.exit(0);
			}
		}
	}
}

