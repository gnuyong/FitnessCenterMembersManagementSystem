package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.MemberAdderCancelListener;
import listeners.MemberAdderListener;
import manager.MembersManager;

public class MemberAdder extends JPanel{
	
	WindowFrame frame;
	
	MembersManager memberManager;
	
	public MemberAdder(WindowFrame frame, MembersManager memberManager) {
		this.frame = frame;
		this.memberManager = memberManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPhone = new JLabel("Phone: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		JLabel labelPT = new JLabel("PT: ", JLabel.TRAILING);
		JTextField fieldPT = new JTextField(10);
		labelPT.setLabelFor(fieldPT);
		panel.add(labelPT);
		panel.add(fieldPT);
		
		JLabel labelRegistration = new JLabel("Registration: ", JLabel.TRAILING);
		JTextField fieldRegistration = new JTextField(10);
		labelRegistration.setLabelFor(fieldRegistration);
		panel.add(labelRegistration);
		panel.add(fieldRegistration);
		
		JLabel labelLocker = new JLabel("Locker: ", JLabel.TRAILING);
		JTextField fieldLocker = new JTextField(10);
		labelLocker.setLabelFor(fieldLocker);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new MemberAdderListener(fieldID, fieldName, fieldPhone, fieldPT, fieldRegistration, fieldLocker, memberManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new MemberAdderCancelListener(frame));
		
		panel.add(labelLocker);
		panel.add(fieldLocker);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);	
		
		this.add(panel);
		this.setVisible(true);
	}
}
