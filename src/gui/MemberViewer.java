package gui;

import java.lang.reflect.Member;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import Members.MemberInput;
import manager.MembersManager;

public class MemberViewer extends JPanel{
	
	WindowFrame frame;
	
	MembersManager memberManager;
	
	public MembersManager getMemberManager() {
		return memberManager;
	}

	public void setMemberManager(MembersManager memberManager) {
		this.memberManager = memberManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("NAME");
		model.addColumn("PHONE");
		model.addColumn("PT");
		model.addColumn("REGISTRATION");
		model.addColumn("LOCKER");
		
		for(int i=0;i<memberManager.size();i++) {
			Vector row = new Vector();
			MemberInput mi = memberManager.get(i);
			row.add(mi.getId());
			row.add(mi.getName());
			row.add(mi.getPhone());
			row.add(mi.getPt());
			row.add(mi.getRegistration());
			row.add(mi.getLocker());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public MemberViewer(WindowFrame frame, MembersManager memberManager) {
		this.frame = frame;
		this.memberManager = memberManager;
		
		System.out.println("***"+memberManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("NAME");
		model.addColumn("PHONE");
		model.addColumn("PT");
		model.addColumn("REGISTRATION");
		model.addColumn("LOCKER");
		
		for(int i=0;i<memberManager.size();i++) {
			Vector row = new Vector();
			MemberInput mi = memberManager.get(i);
			row.add(mi.getId());
			row.add(mi.getName());
			row.add(mi.getPhone());
			row.add(mi.getPt());
			row.add(mi.getRegistration());
			row.add(mi.getLocker());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}

