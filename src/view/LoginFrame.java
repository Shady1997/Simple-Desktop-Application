package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginFrame {

	public static void main(String[] args) {
		LoginFrame login = new LoginFrame();
	}

	DrawLoginForm frame;

	public LoginFrame() {
		frame = new DrawLoginForm();
		frame.setTitle("Login");
		frame.setVisible(true);
		frame.setBounds(10, 10, 370, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		ImageIcon img = new ImageIcon(System.getProperty("user.dir") + "\\resources\\images\\idemia.jpg");
		frame.setIconImage(img.getImage());
	}

	public class DrawLoginForm extends JFrame implements ActionListener {
		private static final long serialVersionUID = 1L;
		Container container = getContentPane();
		ImageIcon icon = new ImageIcon(System.getProperty("user.dir") + "\\resources\\images\\idemia.jpg");
		JLabel label = new JLabel(icon);
		JLabel labe2 = new JLabel("QC TEAM");
		JLabel userLabel = new JLabel("USERNAME");
		JLabel passwordLabel = new JLabel("PASSWORD");
		JTextField userTextField = new JTextField();
		JPasswordField passwordField = new JPasswordField();
		JButton loginButton = new JButton("LOGIN");
		JButton resetButton = new JButton("RESET");
		JCheckBox showPassword = new JCheckBox("Show Password");

		public DrawLoginForm() {
			// calling layout manager
			setLayoutManager();
			setLocationAndSize();
			addComponentsToContainer();
			addActionEvent();// calling add action event method

		}

		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// Coding Part of LOGIN button
			if (e.getSource() == loginButton) {
				String userText;
				String pwdText;
				userText = userTextField.getText();
				pwdText = passwordField.getText();
				if (userText.equalsIgnoreCase("shady") && pwdText.equalsIgnoreCase("shady")) {
					frame.dispose();
//					ChooseSystem chooseSystemframe = new ChooseSystem();
				} else {
					JOptionPane.showMessageDialog(this, "Invalid Username or Password");
				}

			}
			// Coding Part of RESET button
			if (e.getSource() == resetButton) {
				userTextField.setText("");
				passwordField.setText("");
			}
			// Coding Part of showPassword JCheckBox
			if (e.getSource() == showPassword) {
				if (showPassword.isSelected()) {
					passwordField.setEchoChar((char) 0);
				} else {
					passwordField.setEchoChar('*');
				}

			}
		}

		public void setLayoutManager() {
			container.setLayout(null);
		}

		public void setLocationAndSize() {
			// Setting location and Size of each components using setBounds() method.
			label.setBounds(120, 0, 130, 130);
			labe2.setBounds(155, 125, 100, 30);
			userLabel.setBounds(50, 150, 100, 30);
			passwordLabel.setBounds(50, 220, 100, 30);
			userTextField.setBounds(150, 150, 150, 30);
			passwordField.setBounds(150, 220, 150, 30);
			showPassword.setBounds(150, 250, 150, 30);
			loginButton.setBounds(50, 300, 100, 30);
			resetButton.setBounds(200, 300, 100, 30);
		}

		public void addComponentsToContainer() {
			// Adding each components to the Container
			container.add(label);
			container.add(labe2);
			container.add(userLabel);
			container.add(passwordLabel);
			container.add(userTextField);
			container.add(passwordField);
			container.add(showPassword);
			container.add(loginButton);
			container.add(resetButton);
		}

		public void addActionEvent() {
			// adding Action listener to components
			loginButton.addActionListener(this);
			resetButton.addActionListener(this);
			showPassword.addActionListener(this);
		}

	}
}