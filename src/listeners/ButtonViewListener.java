package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.MemberViewer;
import gui.WindowFrame;
import manager.MembersManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MemberViewer memberviewer = frame.getMemberviewer();
		MembersManager memberManager = getObject("membermanager.ser"); 
		memberviewer.setMemberManager(memberManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(memberviewer);
		frame.revalidate();
		frame.repaint();
		
//		JButton b = (JButton) e.getSource();
//		MemberViewer viewer = frame.getMemberviewer();
//		frame.setupPanel(viewer);
	}
	
	public static MembersManager getObject(String filename) {
		MembersManager memberManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			memberManager = (MembersManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return memberManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memberManager;
	}

}
