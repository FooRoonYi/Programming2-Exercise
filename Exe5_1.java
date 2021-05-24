package exercise5_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exe5_1 {

	private JFrame frame;
	private JTextField XtextField;
	private JTextField YtextField;
	private JTextField TotalAnswerTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exe5_1 window = new Exe5_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exe5_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 240, 245));
		frame.setBounds(200, 200, 878, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton AddLabel = new JButton("ADD");
		AddLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int m = Integer.parseInt(XtextField.getText());
					int n = Integer.parseInt(YtextField.getText());
					
					int answer = m + n;
					
					TotalAnswerTextField.setText(Integer.toString(answer));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter number in whole number!");
				}
			}
		});
		AddLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		AddLabel.setBounds(191, 281, 160, 66);
		frame.getContentPane().add(AddLabel);
		
		JButton MinusLabel = new JButton("MINUS");
		MinusLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int m = Integer.parseInt(XtextField.getText());
					int n = Integer.parseInt(YtextField.getText());
					
					int answer = m - n;
					
					TotalAnswerTextField.setText(Integer.toString(answer));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter number in whole number!");
				}
			}
		});
		MinusLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		MinusLabel.setBounds(483, 281, 160, 66);
		frame.getContentPane().add(MinusLabel);
		
		XtextField = new JTextField();
		XtextField.setBackground(new Color(255, 248, 220));
		XtextField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		XtextField.setBounds(191, 115, 160, 66);
		frame.getContentPane().add(XtextField);
		XtextField.setColumns(10);
		
		YtextField = new JTextField();
		YtextField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		YtextField.setBackground(new Color(255, 248, 220));
		YtextField.setBounds(483, 115, 160, 66);
		frame.getContentPane().add(YtextField);
		YtextField.setColumns(10);
		
		JLabel AnswerLabel = new JLabel("The answer is: ");
		AnswerLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		AnswerLabel.setBounds(240, 454, 187, 42);
		frame.getContentPane().add(AnswerLabel);
		
		TotalAnswerTextField = new JTextField();
		TotalAnswerTextField.setBounds(437, 446, 169, 58);
		frame.getContentPane().add(TotalAnswerTextField);
		TotalAnswerTextField.setColumns(10);
	}

}
