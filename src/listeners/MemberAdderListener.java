package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Members.BeginnerMember;
import Members.MemberInput;
import Members.MembersKind;
import exception.PTFormatException;
import manager.MembersManager;

public class MemberAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldPhone;
	JTextField fieldPT;
	JTextField fieldRegistration;
	JTextField fieldLocker;
	MembersManager memberManager;
	
	
	public MemberAdderListener(
			JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldPhone, 
			JTextField fieldPT,
			JTextField fieldRegistration, 
			JTextField fieldLocker,
			MembersManager memberManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldPhone = fieldPhone;
		this.fieldPT = fieldPT;
		this.fieldRegistration = fieldRegistration;
		this.fieldLocker = fieldLocker;
		this.memberManager = memberManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		MemberInput member = new BeginnerMember(MembersKind.Beginner);
		
		try {
			member.setId(Integer.parseInt(fieldID.getText()));
			member.setName(fieldName.getText());
			member.setPhone(Integer.parseInt(fieldPhone.getText()));
			member.setPt(fieldPT.getText());
			member.setRegistration(Integer.parseInt(fieldRegistration.getText()));
			member.setLocker(Integer.parseInt(fieldLocker.getText()));
			memberManager.AddMembers(member);
			putObject(memberManager, "membermanager.ser");
			member.printInfo();
		} catch (PTFormatException e1) {
			e1.printStackTrace();
		}
	}
	public static void putObject(MembersManager memberManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(memberManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
