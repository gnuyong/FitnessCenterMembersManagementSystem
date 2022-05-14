import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Members.AdvancedMember;
import Members.BeginnerMember;
import Members.MemberInput;
import Members.Members;
import Members.MembersKind;
import Members.ProMember;

public class MembersManager {
	ArrayList<MemberInput> members = new ArrayList<MemberInput>();
	Scanner input;
	
	MembersManager(Scanner input){
		this.input = input;
	}
	
	public void AddMembers(){
		int kind =0;
		MemberInput memberinput;
		try {
			while(kind != 1 && kind != 2 && kind !=3) {
				System.out.println("1.Beginner ");
				System.out.println("2.Advanced ");
				System.out.println("3.Pr0 ");
				System.out.print(" ����� ��޿� �´� 1~3 ������ ���ڸ� ������: ");
				kind = input.nextInt();
				if(kind==1) {
					memberinput = new BeginnerMember(MembersKind.Beginner);
					memberinput.getUserInput(input);
					members.add(memberinput);
					break;
				}
				else if(kind==2) {
					memberinput = new AdvancedMember(MembersKind.Advanced);
					memberinput.getUserInput(input);
					members.add(memberinput);
					break;
				}
				else if(kind==3) {
					memberinput = new ProMember(MembersKind.Pro);
					memberinput.getUserInput(input);
					members.add(memberinput);
					break;
				}
				else{
					System.out.print("����� ��޿� �´� 1~3 ������ ���ڸ� ������: ");
				}
			}
		}
		catch(InputMismatchException e) {
			System.out.println("1 ~ 3 ������ ������ �Է��ϼ���!");
			if(input.hasNext()) {
				input.next();
			}
			kind = -1;
		}
	}
	
	public void DeleteMembers() {
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
		int memberId = input.nextInt();
		int index = findIndex(memberId);
		removefromMembers(index, memberId);
	}
	
	public int removefromMembers(int index,int memberId) {
		if(index>=0) {
			members.remove(index);
			System.out.println(memberId+"ȸ�� ������ �Ϸ�Ǿ����ϴ�.");
			return 1;
		}
		else {
			System.out.println("��ϵ��� ���� ȸ���Դϴ�.");
			return -1;
		}
	}
	
	public int findIndex(int memberId) {
		int index = -1;
		for(int i=0;i<members.size();i++) {
			if(members.get(i).getId()==memberId) {
				index = i;
			    break;
			}
		}
		return index;
	}
	
	public void EditMembers() {
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
		int memberId = input.nextInt();
		for(int i=0;i<members.size();i++) {
			MemberInput member = members.get(i);
			if(member.getId()==memberId) {
				int num = -1;
				while(num!=7) {
					showEditMenu();
				    num = input.nextInt();
				    switch(num) {
				    case 1:
				    	member.setMemberID(input);
				    	break;
				    case 2:
				    	member.setMemberName(input);
				    	break;
				    case 3:
				    	member.setMemberPhone(input);
				    	break;
				    case 4:
				    	member.setMemberPT(input);
				    	break;
				    case 5:
				    	member.setMemberRegistration(input);
				    	break;
				    case 6:
				    	member.setMemberLocker(input);
				    	break;
				    default:
				    	continue;
				    }
				}
				break;
		     }
		}
		
		
	}
	public void ViewMembers() {
		System.out.println("��ϵ� ȸ���� ��: "+members.size());
		for(int i=0;i<members.size();i++) {
			members.get(i).printInfo();
		}
	}
	public void showEditMenu() {
		System.out.println("-----Fiteness center members Info Edit Menu-----");
	    System.out.println("1.Edit Id");
	    System.out.println("2.Edit Name");
	    System.out.println("3.Edit Phone");
	    System.out.println("4.Edit Pt");
	    System.out.println("5.Edit registration");
	    System.out.println("6.Edit Locker");
	    System.out.println("7.Exit");
	    System.out.print("1 ~ 5�� �޴���ȣ �� �ϳ��� �����ϼ���: " );
	}
}
